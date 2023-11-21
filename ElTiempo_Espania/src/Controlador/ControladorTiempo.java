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
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
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
	String[] catalunia = { "Lerida,Tarragona,Barcelona,Gerona" };
	String[] extremadura = { "Caceres,Badajoz" };
	String[] galicia = { "ACorunia", "Lugo", "Pontevedra", "Orense" };
	String[] madrid = { "Madrid" };
	String[] murcia = { "Murcia" };
	String[] navarra = { "Pamplona" };
	String[] paisVasco = { "Alava,Vizcaya,Guipuzcoa" };
	 String[] andalucia 	 = {"Huelva","Almeria","Sevilla","Cadiz","Malaga","Granada","Jaen","Cordoba"};
	 String[] aragon 		 = {"Huesca","Zaragoza","Teruel"};
	 String[] asturias 		 = {"Asturias"};
	 String[] baleares 		 = {"Baleares"};
	 String[] canarias 		 = {"Tenerife"};
	 String[] cantabria 	 = {"Cantabria"};
	 String[] castillaleon   = {"Leon","Zamora","Salamanca","Palencia","Valladolid","Avila","Segovia","Burgos", "Soria"};
	 String[] castillamancha = {"Cuenca","Guadalajara","Ciudad_Real","Toledo","Albacete"};

	VistaTiempo vista;

	public ControladorTiempo(VistaTiempo frame) {
		this.vista = frame;
		vista.btnClimaEspania.addActionListener(this);
		vista.btnMostrarClima.addActionListener(this);
		vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == vista.btnClimaEspania) {
	        String prov = vista.comboProvincias.getSelectedItem().toString();
	        if (vista.panelMapa.isVisible()) {
	            accederValorPorperties();
	        } else if (prov.equalsIgnoreCase("galicia")) {
	            accederValorPorpertiesComAutonoma(galicia, "galicia");
	        } else if (prov.equalsIgnoreCase("catalunia")) {
	            accederValorPorpertiesComAutonoma(catalunia, "catalunia");
	        } else if (prov.equalsIgnoreCase("extremadura")) {
	            accederValorPorpertiesComAutonoma(extremadura, "extremadura");
	        } else if (prov.equalsIgnoreCase("madrid")) {
	            accederValorPorpertiesComAutonoma(madrid, "madrid");
	        } else if (prov.equalsIgnoreCase("murcia")) {
	            accederValorPorpertiesComAutonoma(murcia, "murcia");
	        } else if (prov.equalsIgnoreCase("navarra")) {
	            accederValorPorpertiesComAutonoma(navarra, "navarra");
	        } else if (prov.equalsIgnoreCase("pais-Vasco")) {
	            accederValorPorpertiesComAutonoma(paisVasco, "paisVasco");
	        }
	    }

	    if (e.getSource() == vista.btnMostrarClima) {
	        String prov = vista.comboProvincias.getSelectedItem().toString();
	        hacerPanelesInvisibles();
	        mostrarPanelProvincia(prov);
	    }

	    if (e.getSource() == vista.btnVolver) {
	        hacerPanelesInvisibles();
	        vista.panelMapa.setVisible(true);
	    }
	}


		

	

	public void mostrarPanelProvincia(String provincia) {

		// Muestra el panel seg�n la provincia proporcionada
		switch (provincia) {
		
		

		
		case "Andalucia":
			vista.panelAndalucia.setVisible(true);
			break;
		case "Aragon":
			vista.panelAragon.setVisible(true);
			break;
		case "Asturias":
			vista.panelAsturias.setVisible(true);
			break;
		case "Islas Baleares":
			vista.panelBaleares.setVisible(true);
			break;
		case "Canarias":
			vista.panelCanarias.setVisible(true);
			break;
		case "Cantabria":
			vista.panelCantabria.setVisible(true);
			break;
		case "Catalunia":
			vista.panelCatalunia.setVisible(true);
			break;
		case "Castilla-La Mancha":
			vista.panelCLM.setVisible(true);
			break;
		case "Castilla y Leon":
			vista.panelCyL.setVisible(true);
			break;
		case "Extremadura":
			vista.panelExtremadura.setVisible(true);
			break;
		case "Galicia":
			vista.panelGalicia.setVisible(true);
			break;
		case "La Rioja":
			vista.panelLaRioja.setVisible(true);
			break;
		case "Madrid":
			vista.panelMadrid.setVisible(true);
			break;
		case "Murcia":
			vista.panelMurcia.setVisible(true);
			break;
		case "Navarra":
			vista.panelNavarra.setVisible(true);
			break;
		case "Comunidad Valenciana":
			vista.panelValencia.setVisible(true);
			break;
		default:
			// Manejo para cualquier otro caso o provincia no reconocida
			break;
		}
	}

	private void hacerPanelesInvisibles() {
		vista.panelAndalucia.setVisible(false);
		vista.panelAragon.setVisible(false);
		vista.panelAsturias.setVisible(false);
		vista.panelBaleares.setVisible(false);
		vista.panelCanarias.setVisible(false);
		vista.panelCantabria.setVisible(false);
		vista.panelCatalunia.setVisible(false);
		vista.panelCLM.setVisible(false);
		vista.panelCyL.setVisible(false);
		vista.panelExtremadura.setVisible(false);
		vista.panelGalicia.setVisible(false);
		vista.panelLaRioja.setVisible(false);
		vista.panelMadrid.setVisible(false);
		vista.panelMurcia.setVisible(false);
		vista.panelNavarra.setVisible(false);
		vista.panelValencia.setVisible(false);
		vista.panelMapa.setVisible(false);
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
		case "Lluvia d�bil":
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
			System.out.println("No ha entrado en " + clima);
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

					// Abrir conexi�n HTTP
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
						// el 0 para hoy,el 1 para ma�ana...
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
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Ma�ana")) {
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
						// vista.lblRetroalimentacion.setText("Error en la solicitud. C�digo de
						// respuesta:" + codigoRespuesta);

					}

				} else {
					// vista.lblRetroalimentacion.setText("El link es null");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar la conexi�n en el bloque finally

			if (entrada != null) {
				try {
					entrada.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void accederValorPorpertiesComAutonoma(String[] provincias, String provincia) {
		Properties configuracion = null;
		InputStream entrada = null;
		String link = "";

		try {
			configuracion = new Properties();
			configuracion.load(new FileReader("config.properties"));
			// Cargar el archivo de propiedades
			// entrada = new FileInputStream("config.properties");

			Set<String> ciudades = new HashSet<>(Arrays.asList(provincias));

			Gson gson = new Gson();

			for (String ciudad : ciudades) {
				link = configuracion.getProperty(ciudad);

				if (link != null) {
					URL url = new URL(link);

					// Abrir conexi�n HTTP
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
						// el 0 para hoy,el 1 para ma�ana...
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
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Ma�ana")) {
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

						if (provincia.equalsIgnoreCase("galicia")) {
							cambiarImagenGalicia(clima, ciudad);
						} else if (provincia.equalsIgnoreCase("navarra")) {
							cambiarImagenNavarra(clima, ciudad);
						} else if (provincia.equalsIgnoreCase("murcia")) {
							cambiarImagenMurcia(clima, ciudad);
						}else if(provincia.equalsIgnoreCase("paisvasco")) {
							cambiarImagenPaisVasco(clima,ciudad);
						}else if(provincia.equalsIgnoreCase("extremadura")) {
							cambiarImagenCatalunia(clima,ciudad);
						}else if(provincia.equalsIgnoreCase("catalunia")) {
							
						}

						// vista.textRetroalimentacion.setText(
						// "fecha:" + fecha + " clima:" + clima + " maxTemp:" + maxTemp + " minTemp:" +
						// minTemp);
						// comprobar que las fechas son del dia indicado

						// String fechaEs = deCuandoFecha(fecha);
						// comparamos del dia que es el objeto que hemos sacado con el dia que hay
						// introducido
						// if (fechaEs.equalsIgnoreCase(vista.comboDias.toString())) {

					} else {
						// vista.lblRetroalimentacion.setText("Error en la solicitud. C�digo de
						// respuesta:" + codigoRespuesta);

					}

				} else {
					// vista.lblRetroalimentacion.setText("El link es null");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Cerrar la conexi�n en el bloque finally

			if (entrada != null) {
				try {
					entrada.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void cambiarImagenCatalunia(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);
		switch (ciudad) {
	    case "Lerida":
	        vista.lbl_Lleida.setIcon(imagen);
	        break;
	    case "Tarragona":
	    	vista.lblBadajoz.setIcon(imagen);
	    	break;
	    case "Barcelona":
	    	vista.lblBarcelona.setIcon(imagen);
	    	break;
	    case "Gerona":
	    	vista.lbl_Girona.setIcon(imagen);
	    	break;
	    	
	    	default:
	    		System.out.println("No se ha metido en "+ciudad);
	    		break;
		}
		
	}

	private void cambiarImagenPaisVasco(String clima, String ciudad) {
	
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
	    case "Alava":
	        vista.lbl_Alava.setIcon(imagen);
	        break;
	    case "Vizcaya":
	       // vista.lbl.setIcon(imagen);
	        break;
	    case "Guipuzcoa":
	       // vista.lblg.setIcon(imagen);
	        break;
	    default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}
	}


	private void cambiarImagenMurcia(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Murcia":
			vista.lblMurcia.setIcon(imagen);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}

	}

	private void cambiarImagenNavarra(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Pamplona":
			vista.lblPamplona.setIcon(imagen);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
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
			// vista.lbl_A_Corunia.setIcon(imagen);
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
			System.out.println("No ha entrado en el switch de " + ciudad);
			break;
		}
		vista.revalidate();
		vista.repaint();
	}

	public void cambiarImagenGalicia(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Lugo":
			vista.lblLugo.setIcon(imagen);
			break;
		case "ACorunia":
			vista.lblACorunia.setIcon(imagen);
			break;

		case "Pontevedra":
			vista.lblPontevedra.setIcon(imagen);
			break;

		case "Ourense":
			vista.lblOurense.setIcon(imagen);
			break;
		case "Oviedo":
			vista.lblOviedo.setIcon(imagen);
			break;

		default:
			System.out.println("No ha entrado en " + ciudad);
			break;
		}
	}
	
	public void cambiarImagenAndalucia(String clima, String ciudad) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Huelva":
			vista.lblHuelva.setIcon(imagen);
			break;
		case "Almeria":
			vista.lblAlmeria.setIcon(imagen);
			break;
		case "Sevilla":
			vista.lblSevilla.setIcon(imagen);
			break;
		case "Cadiz":
			vista.lblCadiz.setIcon(imagen);
			break;
		case "Malaga":
			vista.lblMalaga.setIcon(imagen);
			break;
		case "Granada":
			vista.lblGranada.setIcon(imagen);
			break;
		case "Jaen":
			vista.lblJaen.setIcon(imagen);
			break;
		case "Cordoba":
			vista.lblCordoba.setIcon(imagen);
			break;

		default:
			break;
		}
		
	}
	

}
