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

	//Inicializamos las provincias con la informacion de cada una 
	String[] catalunia = { "Lerida","Tarragona","Barcelona","Girona" };
	String[] extremadura = { "Caceres","Badajoz" };
	String[] galicia = { "ACorunia", "Lugo", "Pontevedra", "Ourense" };
	String[] madrid = { "Madrid" };
	String[] murcia = { "Murcia" };
	String[] navarra = { "Pamplona" };
	String[] paisVasco = { "Alava","Vizcaya","Guipuzcoa" };
	 String[] andalucia 	 = {"Huelva","Almeria","Sevilla","Cadiz","Malaga","Granada","Jaen","Cordoba"};
	 String[] aragon 		 = {"Huesca","Zaragoza","Teruel"};
	 String[] asturias 		 = {"Oviedo"};
	 String[] baleares 		 = {"Palma_de_Mallorca"};
	 String[] canarias 		 = {"Santa_Cruz_de_Tenerife"};
	 String[] cantabria 	 = {"Santander"};
	 String[] castillaleon   = {"Leon","Zamora","Salamanca","Palencia","Valladolid","Avila","Segovia","Burgos", "Soria"};
	 String[] castillamancha = {"Cuenca","Guadalajara","Ciudad_Real","Toledo","Albacete"};
	 String [] laRioja = {"Logronio"};
	 String [] valencia = {"Valencia","Castellon_de_la_plana","Alicante"};
	 String[] ceuta = {"Ceuta"};
	 String [] melilla = {"Melilla"};

	VistaTiempo vista;
	//constructor
	public ControladorTiempo(VistaTiempo frame) {
		this.vista = frame;
		vista.btnClimaEspania.addActionListener(this);
		vista.btnMostrarClima.addActionListener(this);
		vista.btnVolver.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Boton de ver clima
	    if (e.getSource() == vista.btnClimaEspania) {
	    
	    	//El String es lo que ha puesto el usuario en el desplegable y si el panel del mapa es visible se ejecuta el de españa
	        String prov = vista.comboProvincias.getSelectedItem().toString();
	        if (vista.panelMapa.isVisible()) {
	            accederValorPorperties();
	        } else if (prov.equalsIgnoreCase("galicia")) {
	            accederValorPorpertiesComAutonoma(galicia, "galicia");
	        } else if (prov.equalsIgnoreCase("catalunia")) {
	            accederValorPorpertiesComAutonoma(catalunia, "catalunia");
	        } else if (prov.equalsIgnoreCase("extremadura")) {
	            accederValorPorpertiesComAutonoma(extremadura, "extremadura");
	        } else if (prov.equalsIgnoreCase("Madrid")) {
	            accederValorPorpertiesComAutonoma(madrid, "madrid");
	        } else if (prov.equalsIgnoreCase("murcia")) {
	            accederValorPorpertiesComAutonoma(murcia, "murcia");
	        } else if (prov.equalsIgnoreCase("navarra")) {
	            accederValorPorpertiesComAutonoma(navarra, "navarra");
	        } else if (prov.equalsIgnoreCase("pais-Vasco")) {
	            accederValorPorpertiesComAutonoma(paisVasco, "paisVasco");
	        }else if (prov.equalsIgnoreCase("andalucia")) {
	            accederValorPorpertiesComAutonoma(andalucia, "andalucia");
	        }else if (prov.equalsIgnoreCase("aragon")) {
	        	accederValorPorpertiesComAutonoma(aragon, "aragon");
	        }else if (prov.equalsIgnoreCase("Asturias")) {
	            accederValorPorpertiesComAutonoma(asturias, "asturias");
	        }else if (prov.equalsIgnoreCase("Islas Baleares")) {
	            accederValorPorpertiesComAutonoma(baleares, "baleares");
	        }else if (prov.equalsIgnoreCase("Canarias")) {
	            accederValorPorpertiesComAutonoma(canarias, "canarias");
	        }else if (prov.equalsIgnoreCase("Cantabria")) {
	            accederValorPorpertiesComAutonoma(cantabria, "cantabria");
	        }else if (prov.equalsIgnoreCase("Castilla-La Mancha")) {
	            accederValorPorpertiesComAutonoma(castillamancha, "castillaMancha");
	        }else if (prov.equalsIgnoreCase("Castilla y Leon")) {
	            accederValorPorpertiesComAutonoma(castillaleon, "CastillaLeon");
	        
	        }else if(prov.equalsIgnoreCase("La Rioja")){
	        	accederValorPorpertiesComAutonoma(laRioja, "larioja");
	        }else if(prov.equalsIgnoreCase("Comunidad Valenciana")) {
	        	accederValorPorpertiesComAutonoma(valencia, "valencia");
	        }else if(prov.equalsIgnoreCase("Ceuta")) {
	        	accederValorPorpertiesComAutonoma(ceuta, "Ceuta");
	        }else if(prov.equalsIgnoreCase("Melilla")) {
	        	accederValorPorpertiesComAutonoma(melilla, "melilla");
	        }
	        
	    }

	    //Boton que muestra solo el panel que ha seleccionado el usuario para mostrar
	    if (e.getSource() == vista.btnMostrarClima) {
	        String prov = vista.comboProvincias.getSelectedItem().toString();
	        hacerPanelesInvisibles(); //hace todos los paneles invisibles
	        mostrarPanelProvincia(prov); // muestra el panel seleccionado
	    }

	    //Boton que solo hace visible el panel del mapa
	    if (e.getSource() == vista.btnVolver) {
	        hacerPanelesInvisibles();
	        vista.panelMapa.setVisible(true);
	    }
	}


		

	
//Muestra el panel de la provincia que se le pase por parametros
	public void mostrarPanelProvincia(String provincia) {

		// Muestra el panel según la provincia proporcionada
		switch (provincia) {
		
		case "Pais-Vasco":
			vista.panelPaisVasco.setVisible(true);
			break;
		case "Melilla":
			vista.panelMelilla.setVisible(true);
			break;
		case "Ceuta":
			vista.panelCeuta.setVisible(true);
			break;
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

	//hace todos los paneles invisibles
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
		vista.panelPaisVasco.setVisible(false);
		vista.panelMelilla.setVisible(false);
		vista.panelCeuta.setVisible(false);
	}

	//devuelve un imageIcon segun lo que reciba por parametros
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
		case "Tormentas":
			imagen = new ImageIcon("Imagenes/tormenta buena.png");
			break;
		case "Nublado":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Bruma":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Parcialmente nublado":
			imagen = new ImageIcon("Imagenes/nubes2-Buena.png");
			break;
		case "Intervalos soleados":
			imagen = new ImageIcon("Imagenes/sol Buena.png");
			break;
		case "Brillante":
			imagen = new ImageIcon("Imagenes/sol Buena.png");
			break;
			
			
			//conseguir para precipitaciones frias
		case "Granizo":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "Tormenta de nieve":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "ventisca":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "Aguanieve":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "Nieve":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "Nieve ligera":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "Escarcha":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
		case "Lluvia helada":
			imagen = new ImageIcon("Imagenes/nube-NieveBuenaSF.png");
			break;
			
			
			
		case "Duchas ligeras":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;
		case "Lluvias ocasionales":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;
		case "Duchas":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;
		case "Llovizna":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;
		case "Mojado":
			imagen = new ImageIcon("Imagenes/lluvia_buena.png");
			break;
			
			//conseguir para viento y posiblemente niebla
		case "Ventoso":
			imagen = new ImageIcon("Imagenes/VientoBuenaSF.png");
			break;
		case "Niebla":
			imagen = new ImageIcon("Imagenes/nieblaSF.png");
			break;
			
		default:
			System.out.println("No ha entrado ennnn " + clima);
			break;
		}
		return imagen;

	}

	//metodo para hacer toda la funcionalidad para que se modifiquen los labels del clima segun la informacion del JsonObject
	public void accederValorPorperties() {
		//creamos los recursos que vamos a utilizar y los inicializamos vacios
		Properties configuracion = null;
		InputStream entrada = null;
		String link = "";

		try {
			//creamos un objeto Properties y le cargamos config.properties en este
			configuracion = new Properties();
			configuracion.load(new FileReader("config.properties"));
			// Cargar el archivo de propiedades
			// entrada = new FileInputStream("config.properties");

			//hacemos un Set para cargar todos las claves del properties sin repeticiones
			Set<String> ciudades = configuracion.stringPropertyNames();

			Gson gson = new Gson();

			for (String ciudad : ciudades) {
				link = configuracion.getProperty(ciudad);

				if (link != null) {
					//creamos la URL y creamos conexion a partir del link que hemos sacado del valor de la ciudad que esta en el properties
					URL url = new URL(link);

					// Abrir conexión HTTP
					HttpURLConnection conexion = (HttpURLConnection) url.openConnection();
					// Configurar la solicitud como GET
					conexion.setRequestMethod("GET");

					// Obtener la respuesta
					int codigoRespuesta = conexion.getResponseCode();

					//hago que se repita hasta que saque una respuesta 
					while (conexion.getResponseCode() / 100 == 3) {
					    // Obtenemos la nueva URL a la que se está redirigiendo
					    String nuevaUrl = conexion.getHeaderField("Location");
					    	
					    // Abrimos una nueva conexión a la URL redirigida
					    conexion = (HttpURLConnection) new URL(nuevaUrl).openConnection();

					  
					}
					// Cuando establecemos la conexion con un bufferedReader guardamos la informacion en un String
					
						BufferedReader lector = new BufferedReader(new InputStreamReader(conexion.getInputStream()));
						String linea;
						String respuesta = "";

						while ((linea = lector.readLine()) != null) {
							respuesta += linea;
						}
						
						

						//cerramos el recurso despues de usarlo
						lector.close();
						
						//A partir de la informacion json que sacamos de la pagina la guardamos en un jsonObject para despues acceder a la informacion
						JsonObject jsonObject = new Gson().fromJson(respuesta, JsonObject.class);
						// obtener los datos necesarios
						String clima = "";
						String maxTemp = "";
						String minTemp = "";
						//sacamos la informacion segun el dia que elija el usuario simplemente cambiamos 
						//la posicion del jsonArray del que estamos cojiendo la informacion
						if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Hoy")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(0).getAsJsonObject().get("weather")
									.getAsString();
						
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Maniana")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(1).getAsJsonObject().get("weather")
									.getAsString();
						
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("En 2 dias")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(2).getAsJsonObject().get("weather")
									.getAsString();
						
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("En 3 dias")) {
							clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
									.getAsJsonArray("forecastDay").get(3).getAsJsonObject().get("weather")
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
		//recuperamos el ImageIcon segun el clima y se lo ponemos a la ciudad que corresponde
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
			vista.lbl_Asturias.setIcon(imagen);
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
		case "Guipuzcoa":
			vista.lbl_Guipuzcoa.setIcon(imagen);
			break;
		case "Santander":
			vista.lbl_Cantabria.setIcon(imagen);
			break;
		case "Alava":
			vista.lbl_Alava.setIcon(imagen);
			break;
		case "Pamplona":
			vista.lbl_Navarra.setIcon(imagen);
			break;
		case "Logronio":
			vista.lbl_LaRioja.setIcon(imagen);
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
			break;
		}
		vista.revalidate();
		vista.repaint();
	}
	//un metodo similar al anterior pero para cada comunidad autonoma
	public void accederValorPorpertiesComAutonoma(String[] provincias, String provincia) {
		Properties configuracion = null;
		InputStream entrada = null;
		String link = "";
		

		try {
			configuracion = new Properties();
			configuracion.load(new FileReader("config.properties"));
			int contadorRedirecciones = 0;
			// Cargar el archivo de propiedades
			// entrada = new FileInputStream("config.properties");

			//crea un set con el array de la comunidad autonoma correspondiente
			Set<String> ciudades = new HashSet<>(Arrays.asList(provincias));

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
					while (conexion.getResponseCode() / 100 == 3) {
					    // Obtenemos la nueva URL a la que se está redirigiendo
					    String nuevaUrl = conexion.getHeaderField("Location");
					    System.out.println(conexion.getHeaderField("Location"));
					    	
					    // Abrimos una nueva conexión a la URL redirigida
					    conexion = (HttpURLConnection) new URL(nuevaUrl).openConnection();

					    // Incrementamos el contador de redirecciones
					    
					}
					// Leer la respuesta
					
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
						} else if (vista.comboDias.getSelectedItem().toString().equalsIgnoreCase("Maniana")) {
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

						//Segun el String provincia que haya pasado el usuario por parametro se elije
						//que metodo se va a llamar, hay 1 por comunidad autonoma
						if (provincia.equalsIgnoreCase("galicia")) {
							cambiarImagenGalicia(clima, ciudad,minTemp,maxTemp);
						} else if (provincia.equalsIgnoreCase("navarra")) {
							cambiarImagenNavarra(clima, ciudad,minTemp,maxTemp);
						} else if (provincia.equalsIgnoreCase("murcia")) {
							cambiarImagenMurcia(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("paisvasco")) { 
							cambiarImagenPaisVasco(clima,ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("extremadura")) {
							cambiarImagenExtremadura(clima,ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("catalunia")) {
							cambiarImagenCatalunia(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("andalucia")) {
							cambiarImagenAndalucia(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("aragon")) {
							cambiarImagenAragon(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("Asturias")) {
							cambiarImagenAsturias(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("baleares")) {
							cambiarImagenBaleares(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("Canarias")) {
							cambiarImagenCanarias(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("Cantabria")) {
							cambiarImagenCantabria(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("CastillaLeon")) {
							cambiarImagenCLeon(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("CastillaMancha")) {
							cambiarImagenCLM(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("Madrid")){
							cambiarImagenMadrid(clima, ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("larioja")){
							cambiarImagenLaRioja(clima,ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("valencia")) {
							cambiarImagenValencia(clima,ciudad,minTemp,maxTemp);
						}else if(provincia.equalsIgnoreCase("Ceuta")) {
							cambiarImagenCiuta(clima, ciudad, minTemp, maxTemp);
						}else if(provincia.equalsIgnoreCase("Melilla")) {
							cambiarImagenMelilla(clima, ciudad, minTemp, maxTemp);
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
						// vista.lblRetroalimentacion.setText("Error en la solicitud. Código de
						// respuesta:" + codigoRespuesta);
					

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

	//Los metodos que vienen a continuacion son todos iguales pero cambian las ciudades que tiene cada 
	//uno de ellos, en el que se cambia el icono del label y se añada un texto de temperaturas maximas y minimas
	public void cambiarImagenCatalunia(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		switch (ciudad) {
	    case "Lerida":
	        vista.lblLleida.setIcon(imagen);
	        vista.tempMinLleida.setText(tempMin);
	        vista.tempMaxLleida.setText(tempMax);
	        break;
	    case "Tarragona":
	    	vista.lblTarragona.setIcon(imagen);
	    	 vista.tempMinTarragona.setText(tempMin);
		     vista.tempMaxTarragona.setText(tempMax);
	    	break;
	    case "Barcelona":
	    	vista.lblBarcelona.setIcon(imagen);
	    	 vista.tempMinBarcelona.setText(tempMin);
		     vista.tempMaxBarcelona.setText(tempMax);
	    	break;
	    case "Girona":
	    	vista.lblGirona.setIcon(imagen);
	    	 vista.tempMinGirona.setText(tempMin);
		     vista.tempMaxGirona.setText(tempMax);
	    	break;
	    	
	    	default:
	    		System.out.println("No se ha metido en "+ciudad);
	    		break;
		}
		
	}
	public void cambiarImagenGalicia(String clima, String ciudad, String tempMin, String tempMax) {
	    ImageIcon imagen = elegirClima(clima);

	    switch (ciudad) {
	        case "Lugo":
	            vista.lblLugo.setIcon(imagen);
	            vista.tempMaxLugo.setText(tempMax);  
	            vista.tempMinLugo.setText(tempMin);  
	            break;
	        case "ACorunia":
	            vista.lblACorunia.setIcon(imagen);
	            vista.tempMaxACorunia.setText(tempMax);
	            vista.tempMinACorunia.setText(tempMin);  
	            break;

	        case "Pontevedra":
	            vista.lblPontevedra.setIcon(imagen);
	            vista.tempMaxPontevedra.setText(tempMax);
	            vista.tempMinPontevedra.setText(tempMin);  
	            break;

	        case "Ourense":
	            vista.lblOurense.setIcon(imagen);
	            vista.tempMaxOurense.setText(tempMax);
	            vista.tempMinOurense.setText(tempMin);  
	            break;

	        default:
	            System.out.println("No ha entrado en " + ciudad);
	            break;
	    }
	}

	
	public void cambiarImagenAndalucia(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Huelva":
			vista.lblHuelva.setIcon(imagen);
			 vista.tempMaxHuelva.setText(tempMax);
	         vista.temMinHuelva.setText(tempMin);  
			break;
		case "Almeria":
			vista.lblAlmeria.setIcon(imagen);
			 vista.tempMaxAlmeria.setText(tempMax);
	         vista.tempMinAlmeria.setText(tempMin); 
			break;
		case "Sevilla":
			vista.lblSevilla.setIcon(imagen);
			 vista.tempMaxSevilla.setText(tempMax);
	         vista.temMinSevilla.setText(tempMin); 
			break;
		case "Cadiz":
			vista.lblCadiz.setIcon(imagen);
			 vista.tempMaxCadiz.setText(tempMax);
	         vista.temMinCadiz.setText(tempMin); 
			break;
		case "Malaga":
			vista.lblMalaga.setIcon(imagen);
			 vista.tempMaxMalaga.setText(tempMax);
	         vista.tempMinMalaga.setText(tempMin); 
			break;
		case "Granada":
			vista.lblGranada.setIcon(imagen);
			 vista.tempMaxGranada.setText(tempMax);
	         vista.tempMinGranada.setText(tempMin); 
			break;
		case "Jaen":
			vista.lblJaen.setIcon(imagen);
			 vista.tempMaxJaen.setText(tempMax);
	         vista.tempMinJaen.setText(tempMin); 
			break;
		case "Cordoba":
			vista.lblCordoba.setIcon(imagen);
			 vista.tempMaxCordoba.setText(tempMax);
	         vista.tempMinCordoba.setText(tempMin); 
			break;

		default:
			break;
		}
		
	}
	
	public void cambiarImagenAragon(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Huesca":
			vista.lblHuesca.setIcon(imagen);
			vista.tempMaxHuesca.setText(tempMax);
	        vista.tempMinHuesco.setText(tempMin);
			break;
		case "Zaragoza":
			vista.lblZaragoza.setIcon(imagen);
			vista.tempMaxZaragoza.setText(tempMax);
	        vista.tempMinZaragoza.setText(tempMin);
			break;
		case "Teruel":
			vista.lblTeruel.setIcon(imagen);
			vista.tempMaxTeruel.setText(tempMax);
	        vista.tempMinTeruel.setText(tempMin);
			break;

		default:
			break;
		}
		
	}
	public void cambiarImagenCLeon(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Leon":
			vista.lblLeon.setIcon(imagen);
			vista.tempMaxLeon.setText(tempMax);
	        vista.tempMinLeon.setText(tempMin);
			break;
		case "Zamora":
			vista.lblZamora.setIcon(imagen);
			vista.tempMaxZamoza.setText(tempMax);
	        vista.tempMinZamoza.setText(tempMin);
			break;
		case "Salamanca":
			vista.lblSalamanca.setIcon(imagen);
			vista.tempMaxSalamanca.setText(tempMax);
	        vista.tempMinSalamanca.setText(tempMin);
			break;
		case "Palencia":	
			vista.lblPalencia.setIcon(imagen);
			vista.tempMaxPalencia.setText(tempMax);
	        vista.tempMinPalencia.setText(tempMin);
			break;
		case "Valladolid":
			vista.lblValladolid.setIcon(imagen);
			vista.tempMaxValladolid.setText(tempMax);
	        vista.tempMinValladolid.setText(tempMin);
			break;
		case "Avila":
			vista.lblAvila.setIcon(imagen);
			vista.tempMaxAvila.setText(tempMax);
	        vista.tempMinAvila.setText(tempMin);
			break;
		case "Segovia":
			vista.lblSegovia.setIcon(imagen);
			vista.tempMaxSegovia.setText(tempMax);
	        vista.tempMinSegovia.setText(tempMin);
			break;
		case "Burgos":
			vista.lblBurgos.setIcon(imagen);
			vista.tempMaxBurgos.setText(tempMax);
	        vista.tempMinBurgos.setText(tempMin);
			break;
		case "Soria":
			vista.lblSoria.setIcon(imagen);
			vista.tempMaxSoria.setText(tempMax);
	        vista.tempMinSoria.setText(tempMin);
			break;

		default:
			break;
		}
		
	}
	public void cambiarImagenCLM(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Cuenca":
			vista.lblCuenca.setIcon(imagen);
			vista.tempMaxCuenca.setText(tempMax);
	        vista.tempMinCuenca.setText(tempMin); 
			break;
		case "Guadalajara":
			vista.lblGuadalajara.setIcon(imagen);
			vista.tempMaxGuadalajara.setText(tempMax);
	        vista.tempMinGuadalajara.setText(tempMin);
			break;
		case "Toledo":
			vista.lblToledo.setIcon(imagen);
			vista.tempMaxToledo.setText(tempMax);
	        vista.tempMinToledo.setText(tempMin);
			
			break;
		case "Ciudad_Real":
			vista.lblCiudadReal.setIcon(imagen);
			vista.tempMaxCiudadReal.setText(tempMax);
	        vista.tempMinCiudadReal.setText(tempMin);
			break;
		case "Albacete":
			vista.lblAlbacete.setIcon(imagen);
			vista.tempMaxAlbacete.setText(tempMax);
	        vista.tempMinAlbacete.setText(tempMin);
			break;

		default:
			break;
		}
		
	}
	
	public void cambiarImagenAsturias(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Oviedo":
			vista.lblOviedo.setIcon(imagen);
			vista.tempMaxOviedo.setText(tempMax);
	        vista.TempMinOviedo.setText(tempMin);
			break;

		default:
			System.out.println("No he entrado");
			break;
		}
		
	}
	
	public void cambiarImagenBaleares(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Palma_de_Mallorca":
			vista.lblMayorca.setIcon(imagen);
			vista.tempMaxMayorca.setText(tempMax);
	        vista.tempMinMayorca.setText(tempMin);
			break;

		default:
			break;
		}
		
	}
	public void cambiarImagenCantabria(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Santander":
			vista.lblSantander.setIcon(imagen);
			vista.tempMaxSantander.setText(tempMax);
	        vista.tempMinSantander.setText(tempMin);
			break;

		default:
			break;
		}
		
	}
	public void cambiarImagenCanarias(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		
		switch (ciudad) {
		case "Santa_Cruz_de_Tenerife":
			vista.lblTenerife.setIcon(imagen);
			vista.tempMaxTenerife.setText(tempMax);
	        vista.tempMinTenerife.setText(tempMin);
			break;

		default:
			System.out.println("No ha entrado en el switch de tenerife");
			break;
		}
		
	}
	public void cambiarImagenExtremadura(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);
		switch (ciudad) {
		case "Caceres":
			vista.lblCaceres.setIcon(imagen);
			vista.tempMaxCaceres.setText(tempMax);
	        vista.tempMinCaceres.setText(tempMin);
			break;
		case "Badajoz":
			vista.lblBadajoz.setIcon(imagen);
			vista.tempMaxBadajoz.setText(tempMax);
	        vista.tempMinBadajoz.setText(tempMin);
			break;
		}
		
	}

	

	public void cambiarImagenPaisVasco(String clima, String ciudad,String tempMin,String tempMax) {
	
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
	    case "Alava":
		       vista.lblAlava.setIcon(imagen);
		       vista.tempMinAlava.setText(tempMin);
		       vista.tempMaxAlava.setText(tempMax);
	        break;
	    case "Vizcaya":
	       vista.lblVizcaya.setIcon(imagen);
	       vista.tempMinVizcaya.setText(tempMin);
	       vista.tempMaxVizcaya.setText(tempMax);
	        break;
	    case "Guipuzcoa":
		       vista.lblGuipuzcua.setIcon(imagen);
		       vista.tempMinGuipuzcua.setText(tempMin);
		       vista.tempMaxGuipuzcua.setText(tempMax);
	        break;
	    default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}
	}
	
	public void cambiarImagenMelilla(String clima, String ciudad,String tempMin,String tempMax) {
		
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
	    case "Melilla":
		       vista.lblMelilla.setIcon(imagen);
		       vista.tempMinMelilla.setText(tempMin);
		       vista.tempMaxMelilla.setText(tempMax);
	        break;
	    
		}
	}
	public void cambiarImagenCiuta(String clima, String ciudad,String tempMin,String tempMax) {
		
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
	    case "Ceuta":
		       vista.lblCeuta.setIcon(imagen);
		       vista.tempMinCeuta.setText(tempMin);
		       vista.tempMaxCeuta.setText(tempMax);
	        break;
		}
	}


	public void cambiarImagenMurcia(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Murcia":
			vista.lblMurciaa.setIcon(imagen);
			vista.tempMaxMurcia.setText(tempMax);
	        vista.tempMinMurcia.setText(tempMin);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}

	}

	public void cambiarImagenNavarra(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Pamplona":
			vista.lblPamplona.setIcon(imagen);
			vista.tempMaxPamplona.setText(tempMax);
	        vista.tempMinPamplona.setText(tempMin);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}

	}
	public void cambiarImagenMadrid(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Madrid":
			vista.lblMadridd.setIcon(imagen);
			vista.tempMaxMadrid.setText(tempMax);
	        vista.tempMInMadrid.setText(tempMin);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}

	}
	public void cambiarImagenLaRioja(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Logronio":
			vista.lblLogronio.setIcon(imagen);
			vista.tempMaxLogronio.setText(tempMax);
	        vista.tempMinLogronio.setText(tempMin);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}

	}
	public void cambiarImagenValencia(String clima, String ciudad,String tempMin,String tempMax) {
		ImageIcon imagen = elegirClima(clima);

		switch (ciudad) {
		case "Valencia":
			vista.lblValencia.setIcon(imagen);
			vista.tempMaxValencia.setText(tempMax);
	        vista.tempMinValencia.setText(tempMin);
			break;
		case "Castellon_de_la_plana":
			vista.lblCastellon.setIcon(imagen);
			vista.tempMaxCastellon.setText(tempMax);
	        vista.tempMinCastellon.setText(tempMin);
			break;
		case "Alicante":
			vista.lblAlicante.setIcon(imagen);
			vista.tempMaxAlicante.setText(tempMax);
	        vista.tempMinAlicante.setText(tempMin);
			break;

		default:
    		System.out.println("No se ha metido en "+ciudad);
    		break;
		}

	}
	
	

	}


