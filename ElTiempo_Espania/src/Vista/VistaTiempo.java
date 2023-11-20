package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorTiempo;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.JTextArea;

public class VistaTiempo extends JFrame {

	// Elementos inicializados
	public JPanel contentPane;
	public JPanel panelMapa;
	public JLabel lbl_Madrid;
	public JLabel lbl_ACorunia;
	public JLabel lbl_Pontevedra;
	public JLabel lbl_Lugo;
	public JLabel lbl_Ourense;
	public JLabel lbl_Asturias;
	public JLabel lbl_Cantabria;
	public JLabel lblFondoMapa;
	public JTextArea textRetroalimentacion;
	public JButton btnClimaEspania;
	public JComboBox comboDias;
	private String [] dias = {"Hoy","Mañana","En 2 dias","En 3 dias"};
	private  String[] comunidadesAutonomas = {
            "Andalucía", "Aragón", "Asturias", "Islas Baleares", "Canarias", "Cantabria", "Castilla y León",
            "Castilla-La Mancha", "Cataluña", "Extremadura", "Galicia", "Madrid", "Murcia", "Navarra", 
            "País Vasco", "La Rioja", "Comunidad Valenciana", "Ceuta", "Melilla"
        };

	private JLabel lblNewLabel_3;

	public JLabel lbl_Alava;
	public JLabel lbl_Navarra;
	public JLabel lbl_LaRioja;
	public JLabel lbl_Huesca;
	public JLabel lbl_Zaragoza;
	public JLabel lbl_Teruel;
	public JLabel lbl_Lleida;
	public JLabel lbl_Tarragona;
	public JLabel lbl_Barcelona;
	public JLabel lbl_Girona;
	public JLabel lbl_Leon;
	public JLabel lbl_Zamora;
	public JLabel lbl_Salamanca;
	public JLabel lbl_Palencia;
	public JLabel lbl_Valladolid;
	public JLabel lbl_Avila;
	public JLabel lbl_Burgos;
	public JLabel lbl_Soria;
	public JLabel lbl_Segovia;
	public JLabel lbl_Castellon;
	public JLabel lbl_Valencia;
	public JLabel lbl_Alicante;
	public JLabel lbl_Guadalajara;
	public JLabel lbl_Cuenca;
	public JLabel lbl_Albacete;
	public JLabel lbl_CiudadReal;
	public JLabel lbl_Toledo;
	public JLabel lbl_Caceres;
	public JLabel lbl_Badajoz;
	public JLabel lbl_Murcia;
	public JLabel lbl_Almeria;
	public JLabel lbl_Jaen;
	public JLabel lbl_Granada;
	public JLabel lbl_Cordoba;
	public JLabel lbl_Malaga;
	public JLabel lbl_Sevilla;
	public JLabel lbl_Cadiz;
	public JLabel lbl_Huelva;
	public JLabel lbl_Tenerife;
	public JLabel lbl_GranCanaria;
	public JLabel lbl_PalmaMallorca;
	public JLabel lbl_Ceuta;
	public JLabel lbl_Melilla;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaTiempo frame = new VistaTiempo();
					frame.setVisible(true);
					ControladorTiempo controlador = new ControladorTiempo(frame);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VistaTiempo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 896);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMapa = new JPanel();
		panelMapa.setBounds(0, 23, 894, 690);
		contentPane.add(panelMapa);
		panelMapa.setLayout(null);
		
		textRetroalimentacion = new JTextArea();
		textRetroalimentacion.setBounds(851, 402, -167, 144);
		textRetroalimentacion.setForeground(Color.red);
		panelMapa.add(textRetroalimentacion);
		
		btnClimaEspania = new JButton("Ver Clima");
		btnClimaEspania.setBounds(-1, 0, 127, 21);
		panelMapa.add(btnClimaEspania);

		lbl_Madrid = new JLabel("");
		lbl_Madrid.setBounds(449, 271, 31, 31);
		panelMapa.add(lbl_Madrid);

		lbl_ACorunia = new JLabel("");
		lbl_ACorunia.setBounds(221, 83, 31, 31);
		panelMapa.add(lbl_ACorunia);

		lbl_Pontevedra = new JLabel("");
		lbl_Pontevedra.setBounds(208, 146, 31, 31);
		panelMapa.add(lbl_Pontevedra);

		lbl_Lugo = new JLabel("");
		lbl_Lugo.setBounds(277, 100, 31, 31);
		panelMapa.add(lbl_Lugo);

		lbl_Ourense = new JLabel("");
		lbl_Ourense.setBounds(267, 164, 31, 31);
		panelMapa.add(lbl_Ourense);

		lbl_Asturias = new JLabel("");
		lbl_Asturias.setBounds(349, 83, 31, 31);
		panelMapa.add(lbl_Asturias);

		lbl_Cantabria = new JLabel("");
		lbl_Cantabria.setBounds(430, 83, 31, 31);
		panelMapa.add(lbl_Cantabria);
		
		lbl_Alava = new JLabel("");
		lbl_Alava.setBounds(497, 111, 31, 31);
		panelMapa.add(lbl_Alava);
		
		lbl_Navarra = new JLabel("");
		lbl_Navarra.setBounds(541, 122, 31, 31);
		panelMapa.add(lbl_Navarra);
		
		lbl_LaRioja = new JLabel("");
		lbl_LaRioja.setBounds(496, 146, 31, 31);
		panelMapa.add(lbl_LaRioja);
		
		lbl_Huesca = new JLabel("");
		lbl_Huesca.setBounds(620, 146, 31, 31);
		panelMapa.add(lbl_Huesca);
		
		lbl_Zaragoza = new JLabel("");
		lbl_Zaragoza.setBounds(563, 196, 31, 31);
		panelMapa.add(lbl_Zaragoza);
		
		lbl_Teruel = new JLabel("");
		lbl_Teruel.setBounds(576, 258, 31, 31);
		panelMapa.add(lbl_Teruel);
		
		lbl_Lleida = new JLabel("");
		lbl_Lleida.setBounds(673, 164, 31, 31);
		panelMapa.add(lbl_Lleida);
		
		lbl_Tarragona = new JLabel("");
		lbl_Tarragona.setBounds(670, 232, 31, 31);
		panelMapa.add(lbl_Tarragona);
		
		lbl_Barcelona = new JLabel("");
		lbl_Barcelona.setBounds(715, 193, 31, 31);
		panelMapa.add(lbl_Barcelona);
		
		lbl_Girona = new JLabel("");
		lbl_Girona.setBounds(756, 164, 31, 31);
		panelMapa.add(lbl_Girona);
		
		lbl_Leon = new JLabel("");
		lbl_Leon.setBounds(349, 133, 31, 31);
		panelMapa.add(lbl_Leon);
		
		lbl_Zamora = new JLabel("");
		lbl_Zamora.setBounds(349, 196, 31, 31);
		panelMapa.add(lbl_Zamora);
		
		lbl_Salamanca = new JLabel("");
		lbl_Salamanca.setBounds(328, 242, 31, 31);
		panelMapa.add(lbl_Salamanca);
		
		lbl_Palencia = new JLabel("");
		lbl_Palencia.setBounds(410, 146, 31, 31);
		panelMapa.add(lbl_Palencia);
		
		lbl_Avila = new JLabel("");
		lbl_Avila.setBounds(390, 258, 31, 31);
		panelMapa.add(lbl_Avila);
		
		lbl_Valladolid = new JLabel("");
		lbl_Valladolid.setBounds(394, 196, 31, 31);
		panelMapa.add(lbl_Valladolid);
		
		lbl_Burgos = new JLabel("");
		lbl_Burgos.setBounds(455, 164, 31, 31);
		panelMapa.add(lbl_Burgos);
		
		lbl_Soria = new JLabel("");
		lbl_Soria.setBounds(497, 196, 31, 31);
		panelMapa.add(lbl_Soria);
		
		lbl_Segovia = new JLabel("");
		lbl_Segovia.setBounds(430, 232, 31, 31);
		panelMapa.add(lbl_Segovia);
		
		lbl_Castellon = new JLabel("");
		lbl_Castellon.setBounds(620, 290, 31, 31);
		panelMapa.add(lbl_Castellon);
		
		lbl_Valencia = new JLabel("");
		lbl_Valencia.setBounds(604, 340, 31, 31);
		panelMapa.add(lbl_Valencia);
		
		lbl_Alicante = new JLabel("");
		lbl_Alicante.setBounds(606, 402, 31, 31);
		panelMapa.add(lbl_Alicante);
		
		lbl_Guadalajara = new JLabel("");
		lbl_Guadalajara.setBounds(497, 242, 31, 31);
		panelMapa.add(lbl_Guadalajara);
		
		lbl_Cuenca = new JLabel("");
		lbl_Cuenca.setBounds(515, 312, 31, 31);
		panelMapa.add(lbl_Cuenca);
		
		lbl_Albacete = new JLabel("");
		lbl_Albacete.setBounds(523, 370, 31, 31);
		panelMapa.add(lbl_Albacete);
		
		lbl_CiudadReal = new JLabel("");
		lbl_CiudadReal.setBounds(449, 369, 31, 31);
		panelMapa.add(lbl_CiudadReal);
		
		lbl_Toledo = new JLabel("");
		lbl_Toledo.setBounds(410, 304, 31, 31);
		panelMapa.add(lbl_Toledo);
		
		lbl_Caceres = new JLabel("");
		lbl_Caceres.setBounds(328, 242, 31, 31);
		panelMapa.add(lbl_Caceres);
		
		lbl_Badajoz = new JLabel("");
		lbl_Badajoz.setBounds(328, 312, 31, 31);
		panelMapa.add(lbl_Badajoz);
		
		lbl_Murcia = new JLabel("");
		lbl_Murcia.setBounds(563, 427, 31, 31);
		panelMapa.add(lbl_Murcia);
		
		lbl_Almeria = new JLabel("");
		lbl_Almeria.setBounds(523, 487, 31, 31);
		panelMapa.add(lbl_Almeria);
		
		lbl_Jaen = new JLabel("");
		lbl_Jaen.setBounds(471, 421, 31, 31);
		panelMapa.add(lbl_Jaen);
		
		lbl_Granada = new JLabel("");
		lbl_Granada.setBounds(455, 475, 31, 31);
		panelMapa.add(lbl_Granada);
		
		lbl_Cordoba = new JLabel("");
		lbl_Cordoba.setBounds(390, 416, 31, 31);
		panelMapa.add(lbl_Cordoba);
		
		lbl_Malaga = new JLabel("");
		lbl_Malaga.setBounds(390, 502, 31, 31);
		panelMapa.add(lbl_Malaga);
		
		lbl_Sevilla = new JLabel("");
		lbl_Sevilla.setBounds(349, 457, 31, 31);
		panelMapa.add(lbl_Sevilla);
		
		lbl_Cadiz = new JLabel("");
		lbl_Cadiz.setBounds(338, 515, 31, 31);
		panelMapa.add(lbl_Cadiz);
		
		lbl_Huelva = new JLabel("");
		lbl_Huelva.setBounds(287, 450, 31, 31);
		panelMapa.add(lbl_Huelva);
		
		lbl_Tenerife = new JLabel("");
		lbl_Tenerife.setBounds(96, 605, 31, 31);
		panelMapa.add(lbl_Tenerife);
		
		lbl_GranCanaria = new JLabel("");
		lbl_GranCanaria.setBounds(151, 627, 31, 31);
		panelMapa.add(lbl_GranCanaria);
		
		lbl_PalmaMallorca = new JLabel("");
		lbl_PalmaMallorca.setBounds(767, 318, 31, 31);
		panelMapa.add(lbl_PalmaMallorca);
		
		lbl_Ceuta = new JLabel("");
		lbl_Ceuta.setBounds(366, 559, 31, 31);
		panelMapa.add(lbl_Ceuta);
		
		lbl_Melilla = new JLabel("");
		lbl_Melilla.setBounds(483, 586, 31, 31);
		panelMapa.add(lbl_Melilla);
		
		JComboBox comboProvincias = new JComboBox();
		comboProvincias.setBounds(10, 174, 116, 21);
		panelMapa.add(comboProvincias);

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon("C:\\Users\\Luis Jesus\\git\\ElTiempo\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(-1, 44, 894, 634);
		panelMapa.add(lblFondoMapa);
		
		JButton btnMostrarClima = new JButton("Mostrar");
		btnMostrarClima.setBounds(33, 222, 78, 21);
		panelMapa.add(btnMostrarClima);
		
		JLabel lblNewLabel = new JLabel("Selecciona la comunidad autonoma");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);
		
		comboDias = new JComboBox();
		comboDias.setBounds(269, 0, 101, 21);
		panelMapa.add(comboDias);
		
		lblNewLabel_3 = new JLabel("Dia:");
		lblNewLabel_3.setBounds(214, 4, 45, 13);
		panelMapa.add(lblNewLabel_3);
		
		
		for (int i = 0; i < dias.length; i++) {
			comboDias.addItem(dias[i]);
		}
		
		
		for(int i =0 ;i < comunidadesAutonomas.length;i++) {
			comboProvincias.addItem(comunidadesAutonomas[i]);
		}
		
		
	}
}
