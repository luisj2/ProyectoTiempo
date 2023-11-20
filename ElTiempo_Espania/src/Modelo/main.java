package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class main {

	public static void main(String[] args) {

		accederValorPorperties();

	}

	public static void elegirClima(String clima) {

		switch (clima) {
		case "Soleado":
			System.out.println("Se ha cambiado el clima a Soleado");
			break;
		case "Periodos de sol":
			System.out.println("Se ha cambiado el clima a nublado");
			break;
		case "Chubascos debiles":
			System.out.println("Se ha cambiado el clima a lluvioso");
			break;

		case "Chubascos":
			System.out.println("Se ha cambiado el clima a lluvia");
			break;
			default:
				System.out.println("El clima:"+clima+" no esta en el switch");
				break;

		}

	}

	public static void accederValorPorperties() {
	    

		Properties configuracion = null;
		InputStream entrada = null;
		String link = "";

		try {
			configuracion = new Properties();
			configuracion.load(new FileReader("config.properties"));
			// Cargar el archivo de propiedades
			// entrada = new FileInputStream("config.properties");

			Set<String> ciudades = configuracion.stringPropertyNames();
			
			/*
			for (String ciudad : ciudades) {
				System.out.println(ciudad);
			}
			*/
			
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
					 //obtener los datos necesarios
				    String nomCiudad = jsonObject.getAsJsonObject("city").get("cityName").getAsString();
					String fecha = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast").getAsJsonArray("forecastDay")
							.get(0).getAsJsonObject().get("forecastDate").getAsString();
					String clima = "";
					String maxTemp = "";
					String minTemp = "";
					//comprobamos de que fecha quiere los datos el usuario y cogemos el elemento del JsonArray segun esto
					//el 0 para hoy,el 1 para mañana...
					
						clima = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
						        .getAsJsonArray("forecastDay").get(0).getAsJsonObject().get("weather").getAsString();
						maxTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
				                .getAsJsonArray("forecastDay").get(0)
				                .getAsJsonObject().get("maxTemp").getAsString();
						minTemp = jsonObject.getAsJsonObject("city").getAsJsonObject("forecast")
				                .getAsJsonArray("forecastDay").get(0)
				                .getAsJsonObject().get("minTemp").getAsString();
						
						System.out.println(
								"fecha:" + fecha + " clima:" + clima + " maxTemp:" + maxTemp + " minTemp:" + minTemp);
					
					CambiarImagen(clima,ciudad);
					

				
					// comprobar que las fechas son del dia indicado
					 
					 
					//String fechaEs = deCuandoFecha(fecha);
					// comparamos del dia que es el objeto que hemos sacado con el dia que hay
					// introducido
					// if (fechaEs.equalsIgnoreCase(vista.comboDias.toString())) {
				

					
				} else {
					System.out.println("Error en la solicitud. Código de respuesta:" + codigoRespuesta);
					
				}
				
			} else {
				System.out.println("El link es null");
			}
			
			}
			 }

		 catch (Exception e) {
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
	        
	
	       
	    
	    
	
	private String deCuandoFecha(String fecha) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date date = sdf.parse(fecha);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);

		Calendar hoy = Calendar.getInstance();

		String resultado = sacarFechaString(calendar, hoy);
		return resultado;
	}

	private String sacarFechaString(Calendar fecha, Calendar hoy) {
		String resultado = "";
		Calendar maniana = hoy;
		maniana.add(Calendar.DAY_OF_MONTH, 1);
		Calendar en2Dias = maniana;
		en2Dias.add(Calendar.DAY_OF_MONTH, 1);
		Calendar en3Dias = en2Dias;
		en3Dias.add(Calendar.DAY_OF_MONTH, 1);
		if (fecha.get(Calendar.YEAR) == hoy.get(Calendar.YEAR) && fecha.get(Calendar.MONTH) == hoy.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == hoy.get(Calendar.DAY_OF_MONTH)) {
			resultado = "Hoy";
		} else if (fecha.get(Calendar.YEAR) == maniana.get(Calendar.YEAR)
				&& fecha.get(Calendar.MONTH) == maniana.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == maniana.get(Calendar.DAY_OF_MONTH)) {
			resultado = "Mañana";
		} else if (fecha.get(Calendar.YEAR) == en2Dias.get(Calendar.YEAR)
				&& fecha.get(Calendar.MONTH) == en2Dias.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == en2Dias.get(Calendar.DAY_OF_MONTH)) {
			resultado = "En2Dias";
		} else if (fecha.get(Calendar.YEAR) == en3Dias.get(Calendar.YEAR)
				&& fecha.get(Calendar.MONTH) == en3Dias.get(Calendar.MONTH)
				&& fecha.get(Calendar.DAY_OF_MONTH) == en3Dias.get(Calendar.DAY_OF_MONTH)) {
			resultado = "En3Dias";
		}
		return resultado;
	}

	// cambiar label segun el tiempo
	private static void CambiarImagen(String clima, String ciudad) {

		switch (ciudad) {
		case "Lugo":
			System.out.println("El clima de Lugo es: " + clima);
			break;
		case "Ourense":
			System.out.println("El clima de Ourense es: " + clima);
			break;
		case "ACorunia":
			System.out.println("El clima de A Coruña es: " + clima);
			break;
		case "Pontevedra":
			System.out.println("El clima de Pontevedra es: " + clima);
			break;
		case "Oviedo":
			System.out.println("El clima de Oviedo es: " + clima);
			break;
		case "Soria":
			System.out.println("El clima de Soria es: " + clima);
			break;
		case "Burgos":
			System.out.println("El clima de Burgos es: " + clima);
			break;
		case "Segovia":
			System.out.println("El clima de Segovia es: " + clima);
			break;
		case "Palencia":
			System.out.println("El clima de Palencia es: " + clima);
			break;
		case "Valladolid":
			System.out.println("El clima de Valladolid es: " + clima);
			break;
		case "Avila":
			System.out.println("El clima de Avila es: " + clima);
			break;
		case "Leon":
			System.out.println("El clima de Leon es: " + clima);
			break;
		case "Zamora":
			System.out.println("El clima de Zamora es: " + clima);
			break;
		case "Salamanca":
			System.out.println("El clima de Salamanca es: " + clima);
			break;
		case "Santander":
			System.out.println("El clima de Santander es: " + clima);
			break;
		case "Alava":
			System.out.println("El clima de Alava es: " + clima);
			break;
		case "Pamplona":
			System.out.println("El clima de Pamplona es: " + clima);
			break;
		case "Logronio":
			System.out.println("El clima de Logroño es: " + clima);
			break;
		case "Huesca":
			System.out.println("El clima de Huesca es: " + clima);
			break;
		case "Zaragoza":
			System.out.println("El clima de Zaragoza es: " + clima);
			break;
		case "Teruel":
			System.out.println("El clima de Teruel es: " + clima);
			break;
		case "Lleida":
			System.out.println("El clima de Lleida es: " + clima);
			break;
		case "Girona":
			System.out.println("El clima de Girona es: " + clima);
			break;
		case "Barcelona":
			System.out.println("El clima de Barcelona es: " + clima);
			break;
		case "Tarragona":
			System.out.println("El clima de Tarragona es: " + clima);
			break;
		case "Madrid":
			System.out.println("El clima de Madrid es: " + clima);
			break;
		case "Caceres":
			System.out.println("El clima de Caceres es: " + clima);
			break;
		case "Badajoz":
			System.out.println("El clima de Badajoz es: " + clima);
			break;
		case "Toledo":
			System.out.println("El clima de Toledo es: " + clima);
			break;
		case "Cuenca":
			System.out.println("El clima de Cuenca es: " + clima);
			break;
		case "Guadalajara":
			System.out.println("El clima de Guadalajara es: " + clima);
			break;
		case "Albacete":
			System.out.println("El clima de Albacete es: " + clima);
			break;
		case "Ciudad_Real":
			System.out.println("El clima de Ciudad Real es: " + clima);
			break;
		case "Valencia":
			System.out.println("El clima de Valencia es: " + clima);
			break;
		case "Castellon":
			System.out.println("El clima de Castellon es: " + clima);
			break;
		case "Alicante":
			System.out.println("El clima de Alicante es: " + clima);
			break;
		case "Murcia":
			System.out.println("El clima de Murcia es: " + clima);
			break;
		case "Palma_de_Mallorca":
			System.out.println("El clima de Palma de Mallorca es: " + clima);
			break;
		case "Tenerife":
			System.out.println("El clima de Tenerife es: " + clima);
			break;
		case "Almeria":
			System.out.println("El clima de Almeria es: " + clima);
			break;
		case "Jaen":
			System.out.println("El clima de Jaen es: " + clima);
			break;
		case "Granada":
			System.out.println("El clima de Granada es: " + clima);
			break;
		case "Cordoba":
			System.out.println("El clima de Córdoba es: " + clima);
			break;
		case "Malaga":
			System.out.println("El clima de Málaga es: " + clima);
			break;
		case "Sevilla":
			System.out.println("El clima de Sevilla es: " + clima);
			break;
		case "Cadiz":
			System.out.println("El clima de Cádiz es: " + clima);
			break;
		case "Huelva":
			System.out.println("El clima de Huelva es: " + clima);
			break;
		case "Ceuta":
			System.out.println("El clima de Ceuta es: " + clima);
			break;
		case "Melilla":
			System.out.println("El clima de Melilla es: " + clima);
			break;
		default:
			System.out.println("No es ninguno del switch");
			break;
		}

	}

}
