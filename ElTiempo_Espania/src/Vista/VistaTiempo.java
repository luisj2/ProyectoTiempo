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
	public String[] dias = { "Hoy", "Maniana", "En 2 dias", "En 3 dias" };
	public String[] comunidadesAutonomas = { "Espania", "Andalucia", "Aragon", "Asturias", "Islas Baleares", "Canarias",
			"Cantabria", "Castilla y Leon", "Castilla-La Mancha", "Catalunia", "Extremadura", "Galicia", "Madrid",
			"Murcia", "Navarra", "Pais-Vasco", "La Rioja", "Comunidad Valenciana", "Ceuta", "Melilla" };

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
	public JPanel panelNavarra;
	public JLabel lblPamplona;
	public JLabel lblNavarra;
	public JPanel panelGalicia;
	public JPanel panelAndalucia;
	public JLabel lblACorunia;
	public JLabel lblLugo;
	public JLabel lblOurense;
	public JLabel lblPontevedra;
	public JLabel lblGalicia;
	public JPanel panelMurcia;
	public JLabel lblMurciaa;
	public JLabel lblMurcia;
	public JPanel panelMadrid;
	public JLabel lblMadridd;
	public JLabel lblMadrid;
	public JPanel panelLaRioja;
	public JLabel lblZaragoza;
	public JLabel lblTeruel;
	public JButton btnMostrarClima;
	public JComboBox comboProvincias;
	public JButton btnVolver;
	public JLabel
	// La Rioja
	lblLogronio, lblLaRioja,

			// Extremadura
			lblCaceres, lblBadajoz, lblExtremadura,

			// Valencia
			lblCastellon, lblValencia, lblAlicante, lblValenciaF,

			// Cataluña
			lblLleida, lblTarragona, lblGirona, lblBarcelona, lblCataluna,

			// Castilla y León
			lblSoria, lblBurgos, lblSegovia, lblPalencia, lblValladolid, lblAvila, lblLeon, lblZamora, lblSalamanca,
			lblCyL,

			// Castilla-La Mancha
			lblToledo, lblGuadalajara, lblCuenca, lblAlbacete, lblCiudadReal, lblCLM,

			// Cantabria
			lblSantander, lblCantabria,

			// Canarias
			lblTenerife, lblCanarias,

			// Baleares
			lblMayorca, lblBaleares,

			// Asturias
			lblOviedo, lblAsturias;

	public JPanel panelExtremadura, panelValencia, panelCatalunia, panelCyL, panelCLM, panelCantabria, panelCanarias,
			panelBaleares, panelAsturias;

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

		panelGalicia = new JPanel();
		panelGalicia.setBounds(0, 58, 894, 634);
		panelGalicia.setVisible(false);

		panelNavarra = new JPanel();
		panelNavarra.setVisible(false);

		panelCyL = new JPanel();
		panelCyL.setBounds(0, 58, 894, 655);
		panelCyL.setVisible(false);

		panelMapa = new JPanel();
		panelMapa.setBounds(0, 58, 894, 655);
		contentPane.add(panelMapa);
		panelMapa.setLayout(null);

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

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon(
				"C:\\Users\\Equipo\\git\\ElTiempo_Interfaces_accDatos\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(-1, 44, 894, 634);
		panelMapa.add(lblFondoMapa);

		btnMostrarClima = new JButton("Mostrar");
		btnMostrarClima.setBounds(33, 222, 78, 21);
		panelMapa.add(btnMostrarClima);

		JLabel lblNewLabel = new JLabel("Selecciona un lugar");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);

		comboProvincias = new JComboBox();
		comboProvincias.setBounds(10, 174, 116, 21);
		panelMapa.add(comboProvincias);

		lblFondoMapa = new JLabel("");
		lblFondoMapa.setIcon(new ImageIcon(
				"C:\\Users\\Luis Jesus\\git\\ElTiempo\\ElTiempo_Espania\\Imagenes\\spain_prov Buena.png"));
		lblFondoMapa.setBounds(-1, 44, 894, 634);
		panelMapa.add(lblFondoMapa);

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);

		lblRetroalimentacion = new JLabel("");
		lblRetroalimentacion.setBounds(682, 418, 202, 249);
		lblRetroalimentacion.setForeground(Color.RED);
		panelMapa.add(lblRetroalimentacion);
		contentPane.add(panelCyL);
		panelCyL.setLayout(null);

		lblSoria = new JLabel("");
		lblSoria.setBounds(671, 338, 31, 31);
		panelCyL.add(lblSoria);

		lblBurgos = new JLabel("");
		lblBurgos.setBounds(510, 200, 31, 31);
		panelCyL.add(lblBurgos);

		lblSegovia = new JLabel("");
		lblSegovia.setBounds(443, 432, 31, 31);
		panelCyL.add(lblSegovia);

		lblPalencia = new JLabel("");
		lblPalencia.setBounds(359, 187, 31, 31);
		panelCyL.add(lblPalencia);

		lblValladolid = new JLabel("");
		lblValladolid.setBounds(308, 346, 31, 31);
		panelCyL.add(lblValladolid);

		lblAvila = new JLabel("");
		lblAvila.setBounds(295, 560, 31, 31);
		panelCyL.add(lblAvila);

		lblLeon = new JLabel("");
		lblLeon.setBounds(174, 139, 31, 31);
		panelCyL.add(lblLeon);

		lblZamora = new JLabel("");
		lblZamora.setBounds(165, 329, 31, 31);
		panelCyL.add(lblZamora);

		lblSalamanca = new JLabel("");
		lblSalamanca.setBounds(131, 501, 31, 31);
		panelCyL.add(lblSalamanca);

		lblCyL = new JLabel("");
		lblCyL.setIcon(new ImageIcon(
				"C:\\Users\\Luis Jesus\\git\\repoTiempo\\ElTiempo_Espania\\Imagenes\\Comunidades autonomas\\CastillaYLeonSF.png"));
		lblCyL.setBounds(0, 23, 894, 690);
		panelCyL.add(lblCyL);
		panelNavarra.setBounds(0, 58, 894, 655);
		contentPane.add(panelNavarra);
		panelNavarra.setLayout(null);

		lblPamplona = new JLabel("");
		lblPamplona.setBounds(280, 320, 31, 31);
		panelNavarra.add(lblPamplona);

		lblNavarra = new JLabel("");
		lblNavarra.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/NavarraSF.png")));
		lblNavarra.setBounds(0, 23, 894, 690);
		panelNavarra.add(lblNavarra);
		contentPane.add(panelGalicia);
		panelGalicia.setLayout(null);

		lblACorunia = new JLabel("");
		lblACorunia.setBounds(179, 260, 31, 31);
		panelGalicia.add(lblACorunia);

		lblLugo = new JLabel("");
		lblLugo.setBounds(423, 242, 31, 31);
		panelGalicia.add(lblLugo);

		lblOurense = new JLabel("");
		lblOurense.setBounds(384, 525, 31, 31);
		panelGalicia.add(lblOurense);

		lblPontevedra = new JLabel("");
		lblPontevedra.setBounds(176, 446, 31, 31);
		panelGalicia.add(lblPontevedra);

		lblGalicia = new JLabel("");
		lblGalicia.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/GaliciaSF.png"));
		lblGalicia.setBounds(0, 23, 894, 690);
		panelGalicia.add(lblGalicia);

		

		/*
		 * JComboBox comboBox = new JComboBox(); comboBox.setBounds(10, 174, 146, 21);
		 * panelMapa.add(comboBox);
		 */
		for (int i = 0; i < comunidadesAutonomas.length; i++) {
			comboProvincias.addItem(comunidadesAutonomas[i]);
		}
		comboDias = new JComboBox();
		comboDias.setBounds(241, 27, 80, 21);
		contentPane.add(comboDias);
		for (int i = 0; i < dias.length; i++) {
			comboDias.addItem(dias[i]);
		}

		panelAndalucia = new JPanel();
		panelAndalucia.setBounds(0, 58, 894, 655);
		panelAndalucia.setVisible(false);
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
		lbl_Andalucia.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/AndaluciaSF.png"));
		lbl_Andalucia.setBounds(0, 23, 894, 690);
		panelAndalucia.add(lbl_Andalucia);

		panelMurcia = new JPanel();
		panelMurcia.setBounds(0, 58, 894, 655);
		panelMurcia.setVisible(false);
		contentPane.add(panelMurcia);
		panelMurcia.setLayout(null);

		lblMurciaa = new JLabel("");
		lblMurciaa.setBounds(313, 355, 31, 31);
		panelMurcia.add(lblMurciaa);

		lblMurcia = new JLabel("");
		lblMurcia.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/MurciaSF.png")));
		lblMurcia.setBounds(0, 23, 894, 690);
		panelMurcia.add(lblMurcia);

		panelMadrid = new JPanel();
		panelMadrid.setBounds(0, 58, 894, 655);
		panelMadrid.setVisible(false);
		panelMadrid.setVisible(false);
		contentPane.add(panelMadrid);
		panelMadrid.setLayout(null);

		lblMadridd = new JLabel("");
		lblMadridd.setBounds(339, 342, 31, 31);
		panelMadrid.add(lblMadridd);

		lblMadrid = new JLabel("");
		lblMadrid.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/MadridSF.png")));
		lblMadrid.setBounds(0, 23, 894, 690);
		panelMadrid.add(lblMadrid);

		panelLaRioja = new JPanel();
		panelLaRioja.setBounds(0, 58, 894, 655);
		panelLaRioja.setVisible(false);
		contentPane.add(panelLaRioja);
		panelLaRioja.setLayout(null);

		lblLogronio = new JLabel("");
		lblLogronio.setBounds(336, 258, 31, 31);
		panelLaRioja.add(lblLogronio);

		lblLaRioja = new JLabel("");
		lblLaRioja.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/LaRiojaSF.png")));
		lblLaRioja.setBounds(0, 23, 894, 690);
		panelLaRioja.add(lblLaRioja);

		panelExtremadura = new JPanel();
		panelExtremadura.setBounds(0, 58, 894, 655);
		panelExtremadura.setVisible(false);
		contentPane.add(panelExtremadura);
		panelExtremadura.setLayout(null);

		lblCaceres = new JLabel("");
		lblCaceres.setBounds(188, 209, 31, 31);
		panelExtremadura.add(lblCaceres);

		lblBadajoz = new JLabel("");
		lblBadajoz.setBounds(193, 428, 31, 31);
		panelExtremadura.add(lblBadajoz);

		lblExtremadura = new JLabel("");
		lblExtremadura.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/ExtremaduraSF.png"));
		lblExtremadura.setBounds(0, 23, 894, 690);
		panelExtremadura.add(lblExtremadura);

		panelValencia = new JPanel();
		panelValencia.setBounds(0, 58, 894, 655);
		panelValencia.setVisible(false);
		contentPane.add(panelValencia);
		panelValencia.setLayout(null);

		lblCastellon = new JLabel("");
		lblCastellon.setBounds(299, 207, 31, 31);
		panelValencia.add(lblCastellon);

		lblValencia = new JLabel("");
		lblValencia.setBounds(230, 324, 31, 31);
		panelValencia.add(lblValencia);

		lblAlicante = new JLabel("");
		lblAlicante.setBounds(230, 465, 31, 31);
		panelValencia.add(lblAlicante);

		lblValenciaF = new JLabel("");
		lblValenciaF.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/ComunidadValencianaSF.png"));
		lblValenciaF.setBounds(0, 23, 894, 690);
		panelValencia.add(lblValenciaF);

		panelCatalunia = new JPanel();
		panelCatalunia.setBounds(0, 58, 894, 655);
		panelCatalunia.setVisible(false);
		contentPane.add(panelCatalunia);
		panelCatalunia.setLayout(null);

		lblLleida = new JLabel("");
		lblLleida.setBounds(187, 225, 31, 31);
		panelCatalunia.add(lblLleida);

		lblTarragona = new JLabel("");
		lblTarragona.setBounds(127, 491, 31, 31);
		panelCatalunia.add(lblTarragona);

		lblGirona = new JLabel("");
		lblGirona.setBounds(539, 230, 31, 31);
		panelCatalunia.add(lblGirona);

		lblBarcelona = new JLabel("");
		lblBarcelona.setBounds(364, 327, 31, 31);
		panelCatalunia.add(lblBarcelona);

		lblCataluna = new JLabel("");
		lblCataluna.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/CatalunaSF.png"));
		lblCataluna.setBounds(0, 23, 894, 690);
		panelCatalunia.add(lblCataluna);

		panelCLM = new JPanel();
		panelCLM.setBounds(0, 58, 894, 655);
		panelCLM.setVisible(false);
		contentPane.add(panelCLM);
		panelCLM.setLayout(null);

		lblToledo = new JLabel("");
		lblToledo.setBounds(168, 301, 31, 31);
		panelCLM.add(lblToledo);

		lblGuadalajara = new JLabel("");
		lblGuadalajara.setBounds(381, 127, 31, 31);
		panelCLM.add(lblGuadalajara);

		lblCuenca = new JLabel("");
		lblCuenca.setBounds(446, 298, 31, 31);
		panelCLM.add(lblCuenca);

		lblAlbacete = new JLabel("");
		lblAlbacete.setBounds(470, 478, 31, 31);
		panelCLM.add(lblAlbacete);

		lblCiudadReal = new JLabel("");
		lblCiudadReal.setBounds(210, 469, 31, 31);
		panelCLM.add(lblCiudadReal);

		lblCLM = new JLabel("");
		lblCLM.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/Castilla-la-Mancha_SF.png"));
		lblCLM.setBounds(0, 23, 894, 650);
		panelCLM.add(lblCLM);

		panelCantabria = new JPanel();
		panelCantabria.setBounds(0, 58, 894, 655);
		panelCantabria.setVisible(false);
		contentPane.add(panelCantabria);
		panelCantabria.setLayout(null);

		lblSantander = new JLabel("");
		lblSantander.setBounds(405, 304, 31, 31);
		panelCantabria.add(lblSantander);

		lblCantabria = new JLabel("");
		lblCantabria.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/CantabriaSF.png"));
		lblCantabria.setBounds(0, 23, 894, 690);
		panelCantabria.add(lblCantabria);

		panelCanarias = new JPanel();
		panelCanarias.setBounds(0, 58, 894, 655);
		panelCanarias.setVisible(false);
		contentPane.add(panelCanarias);
		panelCanarias.setLayout(null);

		lblTenerife = new JLabel("");
		lblTenerife.setBounds(215, 382, 31, 31);
		panelCanarias.add(lblTenerife);

		lblCanarias = new JLabel("");
		lblCanarias.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/CanariasSF.png"));
		lblCanarias.setBounds(0, 23, 894, 690);
		panelCanarias.add(lblCanarias);

		panelBaleares = new JPanel();
		panelBaleares.setBounds(0, 58, 894, 655);
		panelBaleares.setVisible(false);
		contentPane.add(panelBaleares);
		panelBaleares.setLayout(null);

		lblMayorca = new JLabel("");
		lblMayorca.setBounds(362, 262, 31, 31);
		panelBaleares.add(lblMayorca);
		// branch 'master' of https://github.com/luisj2/ElTiempo_Interfaces_accDatos.git

		lblBaleares = new JLabel("");
		lblBaleares.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/BalearesSF.png"));
		lblBaleares.setBounds(0, 23, 894, 690);
		panelBaleares.add(lblBaleares);

		panelAsturias = new JPanel();
		panelAsturias.setBounds(0, 58, 894, 655);
		panelAsturias.setVisible(false);
		contentPane.add(panelAsturias);
		panelAsturias.setLayout(null);

		lblOviedo = new JLabel("");
		lblOviedo.setBounds(344, 321, 31, 31);
		panelAsturias.add(lblOviedo);

		lblAsturias = new JLabel("");
		lblAsturias.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/AsturiasSF.png"));
		lblAsturias.setBounds(0, 23, 894, 690);
		panelAsturias.add(lblAsturias);

		panelAragon = new JPanel();
		panelAragon.setBounds(0, 58, 894, 655);
		panelAragon.setVisible(false);
		contentPane.add(panelAragon);
		panelAragon.setLayout(null);

		lblHuesca = new JLabel("");
		lblHuesca.setBounds(305, 165, 31, 31);
		panelAragon.add(lblHuesca);

		lblZaragoza = new JLabel("");
		lblZaragoza.setBounds(153, 303, 31, 31);
		panelAragon.add(lblZaragoza);

		lblTeruel = new JLabel("");
		lblTeruel.setBounds(176, 492, 31, 31);
		panelAragon.add(lblTeruel);

		lblAragon = new JLabel("");
		lblAragon.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/AragonSF.png"));
		lblAragon.setBounds(0, 23, 894, 690);
		panelAragon.add(lblAragon);

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(452, 27, 85, 21);
		contentPane.add(btnVolver);

		btnClimaEspania = new JButton("Ver Clima");
		btnClimaEspania.setBounds(20, 27, 127, 21);
		contentPane.add(btnClimaEspania);
		
		JLabel lblNewLabel_1 = new JLabel("Dia:");
		lblNewLabel_1.setBounds(186, 31, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		

	}
}