package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;

public class VistaTiempo extends JFrame {

	// Elementos inicializados
	public JPanel contentPane;
	public JPanel panelMapa;
	public JLabel lbl_Madrid;
	public JLabel lbl_Pontevedra;
	public JLabel lbl_Lugo;
	public JLabel lbl_Ourense;
	public JLabel lbl_Asturias;
	public JLabel lbl_Cantabria;
	public JLabel lblFondoMapa;
	public JButton btnClimaEspania;
	public JComboBox comboDias;
	public JLabel lblRetroalimentacion;
	public String[] dias = { "Hoy", "Mañana", "En 2 dias", "En 3 dias" };
	public String[] comunidadesAutonomas = { "Andalucía", "Aragón", "Asturias", "Islas Baleares", "Canarias",
			"Cantabria", "Castilla y León", "Castilla-La Mancha", "Cataluña", "Extremadura", "Galicia", "Madrid",
			"Murcia", "Navarra", "País Vasco", "La Rioja", "Comunidad Valenciana", "Ceuta", "Melilla" };

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
	public JLabel lbl_Andalucia;
	public JLabel lblAlmeria;
	public JLabel lblJaen;
	public JLabel lblGranada;
	public JLabel lblCordoba;
	public JLabel lblMalaga;
	public JLabel lblSevilla;
	public JLabel lblCadiz;
	public JLabel lblHuelva;
	public JPanel panelAragon;
	public JLabel lblAragon;
	public JLabel lblHuesca;

	public JLabel lblNewLabel_3;

	// branch'master' of https:// github.com/luisj2/ElTiempo_Interfaces_accDatos.git

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaTiempo frame = new VistaTiempo();
					frame.setVisible(true);
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

		btnClimaEspania = new JButton("Ver Clima");
		btnClimaEspania.setBounds(-1, 0, 127, 21);
		panelMapa.add(btnClimaEspania);

		lbl_Madrid = new JLabel("");
		lbl_Madrid.setBounds(449, 271, 31, 31);
		panelMapa.add(lbl_Madrid);

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

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 174, 116, 21);
		panelMapa.add(comboBox);

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(-1, 44, 894, 634);
		panelMapa.add(lblFondoMapa);

		JButton btnMostrarClima = new JButton("Mostrar");
		btnMostrarClima.setBounds(33, 222, 78, 21);
		panelMapa.add(btnMostrarClima);

		JLabel lblNewLabel = new JLabel("Selecciona la comunidad autonoma");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);

		JComboBox comboProvincias = new JComboBox();
		comboProvincias.setBounds(10, 174, 116, 21);
		panelMapa.add(comboProvincias);

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon(
				"C:\\Users\\Luis Jesus\\git\\ElTiempo\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(-1, 44, 894, 634);
		panelMapa.add(lblFondoMapa);

		btnMostrarClima = new JButton("Mostrar");
		btnMostrarClima.setBounds(33, 222, 78, 21);
		panelMapa.add(btnMostrarClima);

		lblNewLabel = new JLabel("Selecciona la comunidad autonoma");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);
		// branch 'master' of https://github.com/luisj2/ElTiempo_Interfaces_accDatos.git

		comboDias = new JComboBox();
		comboDias.setBounds(269, 0, 101, 21);
		panelMapa.add(comboDias);

		lblNewLabel_3 = new JLabel("DIa:");
		lblNewLabel_3.setBounds(214, 4, 45, 13);
		panelMapa.add(lblNewLabel_3);

		JPanel panelNavarra = new JPanel();
		panelNavarra.setBounds(0, 23, 894, 690);
		contentPane.add(panelNavarra);
		panelNavarra.setLayout(null);

		JLabel lblPamplona = new JLabel("");
		lblPamplona.setBounds(280, 320, 31, 31);
		panelNavarra.add(lblPamplona);

		JLabel lblNavarra = new JLabel("");
		lblNavarra.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\NavarraSF.png"));
		lblNavarra.setBounds(0, 23, 894, 690);
		panelNavarra.add(lblNavarra);

		JPanel panelAndalucia = new JPanel();
		panelAndalucia.setBounds(0, 23, 894, 690);
		contentPane.add(panelAndalucia);
		panelAndalucia.setLayout(null);

		lblAlmeria = new JLabel("");
		lblAlmeria.setBounds(728, 369, 31, 31);
		panelAndalucia.add(lblAlmeria);

		lblJaen = new JLabel("");
		lblJaen.setBounds(567, 220, 31, 31);
		panelAndalucia.add(lblJaen);

		lblGranada = new JLabel("");
		lblGranada.setBounds(577, 369, 31, 31);
		panelAndalucia.add(lblGranada);

		lblCordoba = new JLabel("");
		lblCordoba.setBounds(398, 252, 31, 31);
		panelAndalucia.add(lblCordoba);

		lblMalaga = new JLabel("");
		lblMalaga.setBounds(398, 427, 31, 31);
		panelAndalucia.add(lblMalaga);

		lblSevilla = new JLabel("");
		lblSevilla.setBounds(264, 342, 31, 31);
		panelAndalucia.add(lblSevilla);

		lblCadiz = new JLabel("");
		lblCadiz.setBounds(232, 471, 31, 31);
		panelAndalucia.add(lblCadiz);

		lblHuelva = new JLabel("");
		lblHuelva.setBounds(93, 317, 31, 31);
		panelAndalucia.add(lblHuelva);

		lbl_Andalucia = new JLabel("");
		lbl_Andalucia.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\AndaluciaSF.png"));
		lbl_Andalucia.setBounds(0, 23, 894, 690);
		panelAndalucia.add(lbl_Andalucia);

		JPanel panelGalicia = new JPanel();
		panelGalicia.setBounds(0, 23, 894, 690);
		contentPane.add(panelGalicia);
		panelGalicia.setLayout(null);

		JLabel lblACoruñaa = new JLabel("");
		lblACoruñaa.setBounds(179, 260, 31, 31);
		panelGalicia.add(lblACoruñaa);

		JLabel lblLugo = new JLabel("");
		lblLugo.setBounds(423, 242, 31, 31);
		panelGalicia.add(lblLugo);

		JLabel lblOurense = new JLabel("");
		lblOurense.setBounds(384, 525, 31, 31);
		panelGalicia.add(lblOurense);

		JLabel lblPontevedra = new JLabel("");
		lblPontevedra.setBounds(176, 446, 31, 31);
		panelGalicia.add(lblPontevedra);

		JLabel lblGalicia = new JLabel("");
		lblGalicia.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\GaliciaSF.png"));
		lblGalicia.setBounds(0, 23, 894, 690);
		panelGalicia.add(lblGalicia);

		JPanel panelMurcia = new JPanel();
		panelMurcia.setBounds(0, 23, 894, 690);
		contentPane.add(panelMurcia);
		panelMurcia.setLayout(null);

		JLabel lblMurciaa = new JLabel("");
		lblMurciaa.setBounds(313, 355, 31, 31);
		panelMurcia.add(lblMurciaa);

		JLabel lblMurcia = new JLabel("");
		lblMurcia.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\MurciaSF.png"));
		lblMurcia.setBounds(0, 23, 894, 690);
		panelMurcia.add(lblMurcia);

		JPanel panelMadrid = new JPanel();
		panelMadrid.setBounds(0, 23, 894, 690);
		contentPane.add(panelMadrid);
		panelMadrid.setLayout(null);

		JLabel lblMadridd = new JLabel("");
		lblMadridd.setBounds(339, 342, 31, 31);
		panelMadrid.add(lblMadridd);

		JLabel lblMadrid = new JLabel("");
		lblMadrid.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\MadridSF.png"));
		lblMadrid.setBounds(0, 23, 894, 690);
		panelMadrid.add(lblMadrid);

		JPanel panelLaRioja = new JPanel();
		panelLaRioja.setBounds(0, 23, 894, 690);
		contentPane.add(panelLaRioja);
		panelLaRioja.setLayout(null);

		JLabel lblLogroño = new JLabel("");
		lblLogroño.setBounds(336, 258, 31, 31);
		panelLaRioja.add(lblLogroño);

		JLabel lblLaRioja = new JLabel("");
		lblLaRioja.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\LaRiojaSF.png"));
		lblLaRioja.setBounds(0, 23, 894, 690);
		panelLaRioja.add(lblLaRioja);

		JPanel panelExtremadura = new JPanel();
		panelExtremadura.setBounds(0, 23, 894, 690);
		contentPane.add(panelExtremadura);
		panelExtremadura.setLayout(null);

		JLabel lblCaceres = new JLabel("");
		lblCaceres.setBounds(188, 209, 31, 31);
		panelExtremadura.add(lblCaceres);

		JLabel lblBadajoz = new JLabel("");
		lblBadajoz.setBounds(193, 428, 31, 31);
		panelExtremadura.add(lblBadajoz);

		JLabel lblExtremadura = new JLabel("");
		lblExtremadura.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\ExtremaduraSF.png"));
		lblExtremadura.setBounds(0, 23, 894, 690);
		panelExtremadura.add(lblExtremadura);

		JPanel panelValencia = new JPanel();
		panelValencia.setBounds(0, 23, 894, 690);
		contentPane.add(panelValencia);
		panelValencia.setLayout(null);

		JLabel lblCastellon = new JLabel("");
		lblCastellon.setBounds(299, 207, 31, 31);
		panelValencia.add(lblCastellon);

		JLabel lblValencia = new JLabel("");
		lblValencia.setBounds(230, 324, 31, 31);
		panelValencia.add(lblValencia);

		JLabel lblAlicante = new JLabel("");
		lblAlicante.setBounds(230, 465, 31, 31);
		panelValencia.add(lblAlicante);

		JLabel lblValenciaF = new JLabel("");
		lblValenciaF.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\ComunidadValencianaSF.png"));
		lblValenciaF.setBounds(0, 23, 894, 690);
		panelValencia.add(lblValenciaF);

		JPanel panelCataluna = new JPanel();
		panelCataluna.setBounds(0, 23, 894, 690);
		contentPane.add(panelCataluna);
		panelCataluna.setLayout(null);

		JLabel lblLleida = new JLabel("");
		lblLleida.setBounds(187, 225, 31, 31);
		panelCataluna.add(lblLleida);

		JLabel lblTarragona = new JLabel("");
		lblTarragona.setBounds(127, 491, 31, 31);
		panelCataluna.add(lblTarragona);

		JLabel lblGirona = new JLabel("");
		lblGirona.setBounds(539, 230, 31, 31);
		panelCataluna.add(lblGirona);

		JLabel lblBarcelona = new JLabel("");
		lblBarcelona.setBounds(364, 327, 31, 31);
		panelCataluna.add(lblBarcelona);

		JLabel lblCataluna = new JLabel("");
		lblCataluna.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\CatalunaSF.png"));
		lblCataluna.setBounds(0, 23, 894, 690);
		panelCataluna.add(lblCataluna);

		JPanel panelCyL = new JPanel();
		panelCyL.setBounds(0, 23, 894, 690);
		contentPane.add(panelCyL);
		panelCyL.setLayout(null);

		JLabel lblSoria = new JLabel("");
		lblSoria.setBounds(671, 338, 31, 31);
		panelCyL.add(lblSoria);

		JLabel lblBurgos = new JLabel("");
		lblBurgos.setBounds(510, 200, 31, 31);
		panelCyL.add(lblBurgos);

		JLabel lblSegovia = new JLabel("");
		lblSegovia.setBounds(443, 432, 31, 31);
		panelCyL.add(lblSegovia);

		JLabel lblPalencia = new JLabel("");
		lblPalencia.setBounds(359, 187, 31, 31);
		panelCyL.add(lblPalencia);

		JLabel lblValladolid = new JLabel("");
		lblValladolid.setBounds(308, 346, 31, 31);
		panelCyL.add(lblValladolid);

		JLabel lblAvila = new JLabel("");
		lblAvila.setBounds(295, 560, 31, 31);
		panelCyL.add(lblAvila);

		JLabel lblLeon = new JLabel("");
		lblLeon.setBounds(174, 139, 31, 31);
		panelCyL.add(lblLeon);

		JLabel lblZamora = new JLabel("");
		lblZamora.setBounds(165, 329, 31, 31);
		panelCyL.add(lblZamora);

		JLabel lblSalamanca = new JLabel("");
		lblSalamanca.setBounds(131, 501, 31, 31);
		panelCyL.add(lblSalamanca);

		JLabel lblCyL = new JLabel("");
		lblCyL.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\CastillaYLeonSF.png"));
		lblCyL.setBounds(0, 23, 894, 690);
		panelCyL.add(lblCyL);

		JPanel panelCLM = new JPanel();
		panelCLM.setBounds(0, 23, 894, 690);
		contentPane.add(panelCLM);
		panelCLM.setLayout(null);

		JLabel lblToledo = new JLabel("");
		lblToledo.setBounds(168, 301, 31, 31);
		panelCLM.add(lblToledo);

		JLabel lblGuadalajara = new JLabel("");
		lblGuadalajara.setBounds(381, 127, 31, 31);
		panelCLM.add(lblGuadalajara);

		JLabel lblCuenca = new JLabel("");
		lblCuenca.setBounds(446, 298, 31, 31);
		panelCLM.add(lblCuenca);

		JLabel lblAlbacete = new JLabel("");
		lblAlbacete.setBounds(470, 478, 31, 31);
		panelCLM.add(lblAlbacete);

		JLabel lblCiudadReal = new JLabel("");
		lblCiudadReal.setBounds(210, 469, 31, 31);
		panelCLM.add(lblCiudadReal);

		JLabel lblCLM = new JLabel("");
		lblCLM.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\Castilla-la-Mancha_SF.png"));
		lblCLM.setBounds(0, 23, 894, 650);
		panelCLM.add(lblCLM);

		JPanel panelCantabria = new JPanel();
		panelCantabria.setBounds(0, 23, 894, 690);
		contentPane.add(panelCantabria);
		panelCantabria.setLayout(null);

		JLabel lblSantander = new JLabel("");
		lblSantander.setBounds(405, 304, 31, 31);
		panelCantabria.add(lblSantander);

		JLabel lblCantabria = new JLabel("");
		lblCantabria.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\CantabriaSF.png"));
		lblCantabria.setBounds(0, 23, 894, 690);
		panelCantabria.add(lblCantabria);

		JPanel panelCanarias = new JPanel();
		panelCanarias.setBounds(0, 23, 894, 690);
		contentPane.add(panelCanarias);
		panelCanarias.setLayout(null);

		JLabel lblTenerife = new JLabel("");
		lblTenerife.setBounds(215, 382, 31, 31);
		panelCanarias.add(lblTenerife);

		JLabel lblCanarias = new JLabel("");
		lblCanarias.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\CanariasSF.png"));
		lblCanarias.setBounds(0, 23, 894, 690);
		panelCanarias.add(lblCanarias);

		JPanel panelBaleares = new JPanel();
		panelBaleares.setBounds(0, 23, 894, 690);
		contentPane.add(panelBaleares);
		panelBaleares.setLayout(null);

		JLabel lblMayorca = new JLabel("");
		lblMayorca.setBounds(362, 262, 31, 31);
		panelBaleares.add(lblMayorca);
		// branch 'master' of https://github.com/luisj2/ElTiempo_Interfaces_accDatos.git

		JLabel lblBaleares = new JLabel("");
		lblBaleares.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\BalearesSF.png"));
		lblBaleares.setBounds(0, 23, 894, 690);
		panelBaleares.add(lblBaleares);

		JPanel panelAsturias = new JPanel();
		panelAsturias.setBounds(0, 23, 894, 690);
		contentPane.add(panelAsturias);
		panelAsturias.setLayout(null);

		JLabel lblOviedo = new JLabel("");
		lblOviedo.setBounds(344, 321, 31, 31);
		panelAsturias.add(lblOviedo);

		JLabel lblAsturias = new JLabel("");
		lblAsturias.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\AsturiasSF.png"));
		lblAsturias.setBounds(0, 23, 894, 690);
		panelAsturias.add(lblAsturias);

		lblRetroalimentacion = new JLabel("");
		lblRetroalimentacion.setBounds(682, 418, 202, 249);
		lblRetroalimentacion.setForeground(Color.RED);
		panelMapa.add(lblRetroalimentacion);

		btnClimaEspania = new JButton("Ver Clima");
		btnClimaEspania.setBounds(-1, 0, 127, 21);
		panelMapa.add(btnClimaEspania);

		panelAragon = new JPanel();
		panelAragon.setBounds(0, 23, 894, 690);
		contentPane.add(panelAragon);
		panelAragon.setLayout(null);

		lblHuesca = new JLabel("");
		lblHuesca.setBounds(305, 165, 31, 31);
		panelAragon.add(lblHuesca);

		JLabel lblZaragoza = new JLabel("");
		lblZaragoza.setBounds(153, 303, 31, 31);
		panelAragon.add(lblZaragoza);

		JLabel lblTeruel = new JLabel("");
		lblTeruel.setBounds(176, 492, 31, 31);
		panelAragon.add(lblTeruel);

		lblAragon = new JLabel("");
		lblAragon.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\Comunidades_Redimensionadas\\AragonSF.png"));
		lblAragon.setBounds(0, 23, 894, 690);
		panelAragon.add(lblAragon);

		for (int i = 0; i < dias.length; i++) {
			comboDias.addItem(dias[i]);
		}

		for (int i = 0; i < comunidadesAutonomas.length; i++) {
			comboProvincias.addItem(comunidadesAutonomas[i]);
		}

	}
}