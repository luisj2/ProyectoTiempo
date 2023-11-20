package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import Modelo.Ciudad;
import Vista.VistaTiempo;

public class ControladorTiempo implements ActionListener {

	public String[] provincias = { "Lugo", "Ourense", "ACorunia", "Pontevedra", "Oviedo", "Soria", "Burgos", "Segovia",
			"Palencia", "Valladolid", "Avila", "Leon", "Zamora", "Salamanca", "Santander", "Alava", "Pamplona",
			"Logronio", "Huesca", "Zaragoza", "Teruel", "Lleida", "Girona", "Barcelona", "Tarragona", "Madrid",
			"Caceres", "Badajoz", "Toledo", "Cuenca", "Guadalajara", "Albacete", "CiudadReal", "Valencia", "Castellon",
			"Alicante", "Murcia", "PalmaDeMayorca", "Tenerife", "Almeria", "Jaen", "Granada", "Cordoba", "Malaga",
			"Sevilla", "Cadiz", "Huelva", "Ceuta", "Melilla" };
	String [] catalunia = {"Lerida,Tarragona,Barcelona,Gerona"};
	String [] extremadura = {"Caceres,Badajoz"};
	String [] galicia = {"ACorunia","Lugo","Pontevedra","Orense"};
	String madrid = "Madrid";
	String mucia = "Murcia";
	String navarra = "Navarra";
	String [] paisVasco = {"Alava,Vizcaya,Guipuzcoa"};
	
	VistaTiempo vista;

	public ControladorTiempo(VistaTiempo frame) {
		this.vista = frame;
		vista.btnClimaEspania.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == vista.btnClimaEspania) {

			accederValorPorperties();

		}

	}

	public ImageIcon elegirClima(String clima) {
		ImageIcon imagen = null;

		switch (clima) {
		case "Soleado":
			imagen = new ImageIcon("Imagenes/sol Buena.png");
			break;
		case "Periodos de sol":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Lluvia débil":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;

		case "Lluvia":
			imagen = new ImageIcon("Imagenes/lluvia-muy-fuerte_buena.png");
			break;
		case "Muy nuboso":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Cubierto":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Parcialmente nuboso":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Chubascos dispersos":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;
			default:
				System.out.println("No ha entrado en "+clima);
				break;

		}
		return imagen;

	}
	
	

	public void accederValorPorperties() {
		Properties configuracion = null;
		InputStream entrada = null;
		String link = "";

		try {
			configuracion = new Properties();
			configuracion.load(new FileReader("config.properties"));
			// Cargar el archivo de propiedades
			// entrada = new FileInputStream("config.properties");

			Set<String> ciudades = configuracion.stringPropertyNames();

			Gson gson = new Gson();

			for (String ciudad : ciudades) {
				link = configuracion.getProperty(ciudad);

				if (link != null) {
					URL url = new URL(link);

					// Abrir conexión HTTP
					HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
					// Configurar la solicitud como GET
					conexion.setRequestMethod("GET");

					// Obtener la respuesta
					int codigoRespuesta = conexion.getResponseCode();

					// Leer la respuesta
					if (codigoRespuesta == HttpURLConnection.HTTP_OK) {
						BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
						String linea;
						String respuesta = "";

						while ((linea = lector.readLine()) != null) {
							respuesta += linea;
						}

						lector.close();
						JsonObject jsonObject = new Gson().fromJson(respuesta, JsonObject.class);
						// obtener los datos necesarios
						String nomCiudad = jsonObject.getAsJsonObject("city").get("cityName").getAsString();
						String fecha = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
								.getAsJsonArray("forecastDay").get(0).getAsJsonObject().get("forecastDate")
								.getAsString();
						String clima = "";
						String maxTemp = "";
						String minTemp = "";
						// comprobamos de que fecha quiere los datos el usuario y cogemos el elemento
						// del JsonArray segun esto
						// el 0 para hoy,el 1 para mañana...
						if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Hoy")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(0).getAsJsonObject().get("weather")
									.getAsString();
							maxTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(0).getAsJsonObject().get("maxTemp")
									.getAsString();
							minTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(0).getAsJsonObject().get("minTemp")
									.getAsString();
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Mañana")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(1).getAsJsonObject().get("weather")
									.getAsString();
							maxTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(1).getAsJsonObject().get("maxTemp")
									.getAsString();
							minTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(1).getAsJsonObject().get("minTemp")
									.getAsString();
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("En 2 dias")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(2).getAsJsonObject().get("weather")
									.getAsString();
							maxTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(2).getAsJsonObject().get("maxTemp")
									.getAsString();
							minTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(2).getAsJsonObject().get("minTemp")
									.getAsString();
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("En 3 dias")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(3).getAsJsonObject().get("weather")
									.getAsString();
							maxTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(3).getAsJsonObject().get("maxTemp")
									.getAsString();
							minTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(3).getAsJsonObject().get("minTemp")
									.getAsString();
						}
						cambiarImagenEspania(clima, ciudad);

						// vista.textRetroalimentacion.setText(
						// "fecha:" + fecha + " clima:" + clima + " maxTemp:" + maxTemp + " minTemp:" +
						// minTemp);
						// comprobar que las fechas son del dia indicado

						// String fechaEs = deCuandoFecha(fecha);
						// comparamos del dia que es el objeto que hemos sacado con el dia que hay
						// introducido
						// if (fechaEs.equalsIgnoreCase(vista.comboDias.toString())) {

					} else {
						// vista.lblRetroalimentacion.setText("Error en la solicitud. Código de
						// respuesta:" + codigoRespuesta);

					}

				} else {
					// vista.lblRetroalimentacion.setText("El link es null");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar la conexión en el bloque finally

			if (entrada != null) {
				try {
					entrada.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	// cambiar label segun el tiempo
	private void cambiarImagenEspania(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);
		switch (ciudad) {
		case "Lugo":
			vista.lbl_Lugo.setIcon(imagen);
			break;
		case "Ourense":
			vista.lbl_Ourense.setIcon(imagen);
			break;
		case "ACorunia":
			vista.lbl_ACorunia.setIcon(imagen);
			break;
		case "Pontevedra":
			vista.lbl_Pontevedra.setIcon(imagen);
			break;
		case "Oviedo":
			// elegirClima(clima, vista.lbl_Oviedo);
			break;
		case "Soria":
			vista.lbl_Soria.setIcon(imagen);
			break;
		case "Burgos":
			vista.lbl_Burgos.setIcon(imagen);
			break;
		case "Segovia":
			vista.lbl_Segovia.setIcon(imagen);
			break;
		case "Palencia":
			vista.lbl_Palencia.setIcon(imagen);
			break;
		case "Valladolid":
			vista.lbl_Valladolid.setIcon(imagen);
			break;
		case "Avila":
			vista.lbl_Avila.setIcon(imagen);
			break;
		case "Leon":
			vista.lbl_Leon.setIcon(imagen);
			break;
		case "Zamora":
			vista.lbl_Zamora.setIcon(imagen);
			break;
		case "Salamanca":
			vista.lbl_Salamanca.setIcon(imagen);
			break;
		case "Santander":
			// elegirClima(clima, vista.lbl_Santander);
			break;
		case "Alava":
			vista.lbl_Alava.setIcon(imagen);
			break;
		case "Pamplona":
			// elegirClima(clima, vista.lbl_Pamplona);
			break;
		case "Logronio":
			// elegirClima(clima, vista.lbl_Logronio);
			break;
		case "Huesca":
			vista.lbl_Huesca.setIcon(imagen);
			break;
		case "Zaragoza":
			vista.lbl_Zaragoza.setIcon(imagen);
			break;
		case "Teruel":
			vista.lbl_Teruel.setIcon(imagen);
			break;
		case "Lerida":
			vista.lbl_Lleida.setIcon(imagen);
			break;
		case "Girona":
			vista.lbl_Girona.setIcon(imagen);
			break;
		case "Barcelona":
			vista.lbl_Barcelona.setIcon(imagen);
			break;
		case "Tarragona":
			vista.lbl_Tarragona.setIcon(imagen);
			break;
		case "Madrid":
			vista.lbl_Madrid.setIcon(imagen);
			break;
		case "Caceres":
			vista.lbl_Caceres.setIcon(imagen);
			break;
		case "Badajoz":
			vista.lbl_Badajoz.setIcon(imagen);
			break;
		case "Toledo":
			vista.lbl_Toledo.setIcon(imagen);
			break;
		case "Cuenca":
			vista.lbl_Cuenca.setIcon(imagen);
			break;
		case "Guadalajara":
			vista.lbl_Guadalajara.setIcon(imagen);
			break;
		case "Albacete":
			vista.lbl_Albacete.setIcon(imagen);
			break;
		case "Ciudad_Real":
			vista.lbl_CiudadReal.setIcon(imagen);
			break;
		case "Valencia":
			vista.lbl_Valencia.setIcon(imagen);
			break;
		case "Castellon_de_la_plana":
			vista.lbl_Castellon.setIcon(imagen);
			break;
		case "Alicante":
			vista.lbl_Alicante.setIcon(imagen);
			break;
		case "Murcia":
			vista.lbl_Murcia.setIcon(imagen);
			break;
		case "Palma_de_Mallorca":
			vista.lbl_PalmaMallorca.setIcon(imagen);
			break;
		case "Santa_Cruz_de_Tenerife":
			vista.lbl_Tenerife.setIcon(imagen);
			break;
		case "Almeria":
			vista.lbl_Almeria.setIcon(imagen);
			break;
		case "Jaen":
			vista.lbl_Jaen.setIcon(imagen);
			break;
		case "Granada":
			vista.lbl_Granada.setIcon(imagen);
			break;
		case "Cordoba":
			vista.lbl_Cordoba.setIcon(imagen);
			break;
		case "Malaga":
			vista.lbl_Malaga.setIcon(imagen);
			break;
		case "Sevilla":
			vista.lbl_Sevilla.setIcon(imagen);
			break;
		case "Cadiz":
			vista.lbl_Cadiz.setIcon(imagen);
			break;
		case "Huelva":
			vista.lbl_Huelva.setIcon(imagen);
			break;
		case "Ceuta":
			vista.lbl_Ceuta.setIcon(imagen);
			break;
		case "Melilla":
			vista.lbl_Melilla.setIcon(imagen);
			break;
		default:
			System.out.println("No ha entrado en el switch de "+ciudad);
			break;
		}
		vista.revalidate();
		vista.repaint();
	}

	public void cambiarImagenGalicia(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Lugo":
			vista.lbl_Lugo.setIcon(imagen);
			break;
		case "ACorunia":
			vista.lbl_ACorunia.setIcon(imagen);
			break;

		case "Pontevedra":
			vista.lbl_Pontevedra.setIcon(imagen);
			break;

		case "Ourense":
			vista.lbl_Ourense.setIcon(imagen);
			break;
		case "Oviedo":
			// vista.lbl_Oviedo.setIcon(imagen);
			break;

		default:
			break;
		}
	}

}
