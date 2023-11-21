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
import java.awt.Rectangle;

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
	public String[] comunidadesAutonomas = { "Andalucia", "Aragon", "Asturias", "Islas Baleares", "Canarias",
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
	public JLabel lbl_Badajoz;
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

			lblOviedo, lblAsturias;

	public JPanel panelExtremadura, panelValencia, panelCatalunia, panelCyL, panelCLM, panelCantabria, panelCanarias,
			panelBaleares, panelAsturias;
	public JLabel lbl_ACorunia;
	public JLabel lbl_Guipuzcoa;
	public JLabel tempMinLleida;
	public JLabel tempMaxLleida;
	public JLabel tempMinBarcelona;
	public JLabel tempMaxBarcelona;
	public JLabel tempMinGirona;
	public JLabel tempMaxGirona;
	public JLabel tempMaxTarragona;
	public JLabel tempMinTarragona;
	public JLabel tempMinPontevedra;
	public JLabel tempMaxPontevedra;
	public JLabel tempMinOurense;
	public JLabel tempMaxOurense;
	public JLabel tempMaxACorunia;
	public JLabel tempMinACorunia;
	public JLabel tempMaxLugo;
	public JLabel tempMinLugo;
	public JLabel temMinHuelva;
	public JLabel tempMaxHuelva;
	public JLabel tempMaxCadiz;
	public JLabel temMinCadiz;
	public JLabel temMinSevilla;
	public JLabel tempMaxSevilla;
	public JLabel tempMinMalaga;
	public JLabel tempMaxMalaga;
	public JLabel tempMinCordoba;
	public JLabel tempMaxCordoba;
	public JLabel tempMaxGranada;
	public JLabel tempMinGranada;
	public JLabel tempMaxJaen;
	public JLabel tempMinJaen;
	public JLabel tempMaxAlmeria;
	public JLabel tempMinAlmeria;
	public JLabel tempMaxCiudadReal;
	public JLabel tempMinCiudadReal;
	public JLabel tempMaxAlbacete;
	public JLabel tempMinAlbacete;
	public JLabel tempMaxCuenca;
	public JLabel tempMinCuenca;
	public JLabel tempMaxGuadalajara;
	public JLabel tempMinGuadalajara;
	public JLabel tempMaxToledo;
	public JLabel tempMinToledo;
	public JLabel tempMaxSalamanca;
	public JLabel tempMinSalamanca;
	public JLabel tempMaxZamoza;
	public JLabel tempMinZamoza;
	public JLabel tempMaxLeon;
	public JLabel tempMinLeon;
	public JLabel tempMaxAvila;
	public JLabel tempMinAvila;
	public JLabel tempMaxValladolid;
	public JLabel tempMinValladolid;
	public JLabel tempMaxPalencia;
	public JLabel tempMinPalencia;
	public JLabel tempMaxSegovia;
	public JLabel tempMinSegovia;
	public JLabel tempMaxBurgos;
	public JLabel tempMinBurgos;
	public JLabel tempMinSoria;
	public JLabel tempMaxSoria;
	public JLabel tempMinBadajoz;
	public JLabel tempMaxBadajoz;
	public JLabel tempMaxCaceres;
	public JLabel tempMinCaceres;
	public JLabel tempMaxPamplona;
	public JLabel tempMinPamplona;
	public JLabel tempMaxMurcia;
	public JLabel tempMinMurcia;
	public JLabel tempMaxMadrid;
	public JLabel tempMInMadrid;
	public JLabel tempMaxAlicante;
	public JLabel tempMinAlicante;
	public JLabel tempMaxValencia;
	public JLabel tempMinValencia;
	public JLabel tempMaxCastellon;
	public JLabel tempMinCastellon;
	public JLabel tempMaxLogronio;
	public JLabel tempMinLogronio;
	public JLabel tempMaxSantander;
	public JLabel tempMinSantander;
	public JLabel tempMaxTenerife;
	public JLabel tempMinTenerife;
	public JLabel tempMaxMayorca;
	public JLabel tempMinMayorca;
	public JLabel tempMaxOviedo;
	public JLabel TempMinOviedo;
	public JLabel tempMaxHuesca;
	public JLabel tempMinHuesco;
	public JLabel tempMaxTeruel;
	public JLabel tempMinTeruel;
	public JLabel tempMinZaragoza;
	public JLabel tempMaxZaragoza;
	public JLabel lblPaisVasco;
	public JLabel lblVizcaya;
	public JLabel tempMaxVizcaya;
	public JLabel tempMinVizcaya;
	public JLabel lblAlava;
	public JLabel tempMaxAlava;
	public JLabel tempMinAlava;
	public JLabel lblGuipuzcua;
	public JLabel tempMaxGuipuzcua;
	public JLabel tempMinGuipuzcua;

	 public JPanel panelMelilla;
	    public JLabel lblMelilla;
	    public JLabel tempMaxMelilla;
	    public JLabel tempMinMelilla;
	    public JLabel lblMelillaF;

	    public JPanel panelCeuta;
	    public JLabel lblCeuta;
	    public JLabel tempMaxCeuta;
	    public JLabel tempMinCeuta;
	    public JLabel lblCeutaF;

	    public JPanel panelPaisVasco;
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

		panelCatalunia = new JPanel();
		panelCatalunia.setBounds(0, 58, 894, 655);
		panelCatalunia.setVisible(false);

		panelGalicia = new JPanel();
		panelGalicia.setBounds(0, 58, 894, 634);
		panelGalicia.setVisible(false);

		panelAndalucia = new JPanel();
		panelAndalucia.setBounds(0, 58, 894, 655);
		panelAndalucia.setVisible(false);

		panelCLM = new JPanel();
		panelCLM.setBounds(0, 58, 894, 655);
		panelCLM.setVisible(false);

		panelCyL = new JPanel();
		panelCyL.setBounds(0, 58, 894, 655);
		panelCyL.setVisible(false);

		panelExtremadura = new JPanel();
		panelExtremadura.setBounds(0, 58, 894, 655);
		panelExtremadura.setVisible(false);

		panelNavarra = new JPanel();
		panelNavarra.setVisible(false);

		panelMurcia = new JPanel();
		panelMurcia.setBounds(0, 58, 894, 655);
		panelMurcia.setVisible(false);

		panelMadrid = new JPanel();
		panelMadrid.setBounds(0, 58, 894, 655);
		panelMadrid.setVisible(false);
		panelMadrid.setVisible(false);

		panelValencia = new JPanel();
		panelValencia.setBounds(0, 58, 894, 655);
		panelValencia.setVisible(false);

		panelLaRioja = new JPanel();
		panelLaRioja.setBounds(0, 58, 894, 655);
		panelLaRioja.setVisible(false);

		panelCantabria = new JPanel();
		panelCantabria.setBounds(0, 58, 894, 655);
		panelCantabria.setVisible(false);

		panelCanarias = new JPanel();
		panelCanarias.setBounds(0, 58, 894, 655);
		panelCanarias.setVisible(false);

		panelBaleares = new JPanel();
		panelBaleares.setBounds(0, 58, 894, 655);
		panelBaleares.setVisible(false);

		panelAsturias = new JPanel();
		panelAsturias.setBounds(0, 58, 894, 655);
		panelAsturias.setVisible(false);

		panelAragon = new JPanel();
		panelAragon.setBounds(0, 58, 894, 655);
		panelAragon.setVisible(false);
		
		panelMelilla = new JPanel();
		panelMelilla.setBounds(0, 58, 894, 655);
		panelMelilla.setVisible(false);
		
		panelPaisVasco = new JPanel();
		panelPaisVasco.setBounds(0, 58, 894, 655);
		panelPaisVasco.setVisible(false);
		contentPane.add(panelPaisVasco);
		panelPaisVasco.setLayout(null);
		
		lblVizcaya = new JLabel("");
		lblVizcaya.setBounds(229, 187, 31, 31);
		panelPaisVasco.add(lblVizcaya);
		
		tempMaxVizcaya = new JLabel("");
		tempMaxVizcaya.setForeground(new Color(255, 0, 0));
		tempMaxVizcaya.setBounds(205, 224, 31, 31);
		panelPaisVasco.add(tempMaxVizcaya);
		
		tempMinVizcaya = new JLabel("");
		tempMinVizcaya.setForeground(new Color(0, 128, 255));
		tempMinVizcaya.setBounds(246, 224, 31, 31);
		panelPaisVasco.add(tempMinVizcaya);
		
		lblAlava = new JLabel("");
		lblAlava.setBounds(246, 331, 31, 31);
		panelPaisVasco.add(lblAlava);
		
		tempMaxAlava = new JLabel("");
		tempMaxAlava.setForeground(new Color(255, 0, 0));
		tempMaxAlava.setBounds(297, 389, 31, 31);
		panelPaisVasco.add(tempMaxAlava);
		
		tempMinAlava = new JLabel("");
		tempMinAlava.setForeground(new Color(0, 128, 255));
		tempMinAlava.setBounds(217, 376, 31, 31);
		panelPaisVasco.add(tempMinAlava);
		
		lblGuipuzcua = new JLabel("");
		lblGuipuzcua.setBounds(382, 206, 31, 31);
		panelPaisVasco.add(lblGuipuzcua);
		
		tempMaxGuipuzcua = new JLabel("");
		tempMaxGuipuzcua.setForeground(new Color(255, 0, 0));
		tempMaxGuipuzcua.setBounds(344, 262, 31, 31);
		panelPaisVasco.add(tempMaxGuipuzcua);
		
		tempMinGuipuzcua = new JLabel("");
		tempMinGuipuzcua.setForeground(new Color(0, 128, 255));
		tempMinGuipuzcua.setBounds(404, 262, 31, 31);
		panelPaisVasco.add(tempMinGuipuzcua);
		
		lblPaisVasco = new JLabel("");
		lblPaisVasco.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/PaisVascoBueno.png"));
		panelPaisVasco.add(lblPaisVasco);
		lblPaisVasco.setBounds(new Rectangle(0, 0, 894, 655));
		contentPane.add(panelMelilla);
		panelMelilla.setLayout(null);
		
		lblMelilla = new JLabel("");
		lblMelilla.setBounds(174, 288, 31, 31);
		panelMelilla.add(lblMelilla);
		
		tempMaxMelilla = new JLabel("");
		tempMaxMelilla.setForeground(new Color(255, 0, 0));
		tempMaxMelilla.setBounds(158, 360, 31, 31);
		panelMelilla.add(tempMaxMelilla);
		
		tempMinMelilla = new JLabel("");
		tempMinMelilla.setForeground(new Color(0, 128, 255));
		tempMinMelilla.setBounds(229, 340, 31, 31);
		panelMelilla.add(tempMinMelilla);
		
		lblMelillaF = new JLabel("");
		lblMelillaF.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/MelillaBueno.png"));
		lblMelillaF.setBounds(0, 0, 894, 655);
		panelMelilla.add(lblMelillaF);
		
		panelCeuta = new JPanel();
		panelCeuta.setBounds(0, 58, 894, 655);
		panelCeuta.setVisible(false);
		contentPane.add(panelCeuta);
		panelCeuta.setLayout(null);
		
		lblCeuta = new JLabel("");
		lblCeuta.setBounds(218, 375, 31, 31);
		panelCeuta.add(lblCeuta);
		
		tempMaxCeuta = new JLabel("");
		tempMaxCeuta.setForeground(new Color(255, 0, 0));
		tempMaxCeuta.setBounds(187, 421, 31, 31);
		panelCeuta.add(tempMaxCeuta);
		
		tempMinCeuta = new JLabel("");
		tempMinCeuta.setForeground(new Color(0, 128, 255));
		tempMinCeuta.setBounds(249, 421, 31, 31);
		panelCeuta.add(tempMinCeuta);
		
		lblCeutaF = new JLabel("");
		lblCeutaF.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/CeutaBueno.png"));
		lblCeutaF.setBounds(0, 0, 894, 655);
		panelCeuta.add(lblCeutaF);
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

		tempMaxHuesca = new JLabel("");
		tempMaxHuesca.setForeground(new Color(255, 0, 0));
		tempMaxHuesca.setBounds(267, 222, 31, 31);
		panelAragon.add(tempMaxHuesca);

		tempMinHuesco = new JLabel("");
		tempMinHuesco.setForeground(new Color(0, 128, 255));
		tempMinHuesco.setBounds(335, 222, 31, 31);
		panelAragon.add(tempMinHuesco);

		tempMaxTeruel = new JLabel("");
		tempMaxTeruel.setForeground(new Color(255, 0, 0));
		tempMaxTeruel.setBounds(127, 540, 31, 31);
		panelAragon.add(tempMaxTeruel);

		tempMinTeruel = new JLabel("");
		tempMinTeruel.setForeground(new Color(0, 128, 255));
		tempMinTeruel.setBounds(201, 540, 31, 31);
		panelAragon.add(tempMinTeruel);

		tempMinZaragoza = new JLabel("");
		tempMinZaragoza.setForeground(new Color(0, 128, 255));
		tempMinZaragoza.setBounds(68, 303, 31, 31);
		panelAragon.add(tempMinZaragoza);

		tempMaxZaragoza = new JLabel("");
		tempMaxZaragoza.setForeground(new Color(255, 0, 0));
		tempMaxZaragoza.setBounds(78, 350, 31, 31);
		panelAragon.add(tempMaxZaragoza);

		lblAragon = new JLabel("");
		lblAragon.setIcon(new ImageIcon(
				"Imagenes/Comunidades autonomas/AragonSF.png"));
		lblAragon.setBounds(0, 23, 894, 690);
		panelAragon.add(lblAragon);
		contentPane.add(panelAsturias);
		panelAsturias.setLayout(null);

		lblOviedo = new JLabel("");
		lblOviedo.setBounds(344, 321, 31, 31);
		panelAsturias.add(lblOviedo);

		tempMaxOviedo = new JLabel("");
		tempMaxOviedo.setForeground(new Color(255, 0, 0));
		tempMaxOviedo.setBounds(257, 271, 31, 31);
		panelAsturias.add(tempMaxOviedo);

		TempMinOviedo = new JLabel("");
		TempMinOviedo.setForeground(new Color(0, 128, 255));
		TempMinOviedo.setBounds(360, 271, 31, 31);
		panelAsturias.add(TempMinOviedo);
		
				lblAsturias = new JLabel("");
				lblAsturias.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/AsturiasSF.png"));
				lblAsturias.setBounds(0, 23, 894, 690);
				panelAsturias.add(lblAsturias);
		contentPane.add(panelBaleares);
		panelBaleares.setLayout(null);

		lblMayorca = new JLabel("");
		lblMayorca.setBounds(362, 262, 31, 31);
		panelBaleares.add(lblMayorca);

		tempMaxMayorca = new JLabel("");
		tempMaxMayorca.setForeground(new Color(255, 0, 0));
		tempMaxMayorca.setBounds(334, 316, 31, 31);
		panelBaleares.add(tempMaxMayorca);

		tempMinMayorca = new JLabel("");
		tempMinMayorca.setForeground(new Color(0, 128, 255));
		tempMinMayorca.setBounds(394, 304, 31, 31);
		panelBaleares.add(tempMinMayorca);


		lblBaleares = new JLabel("");
		lblBaleares.setIcon(new ImageIcon(
				"Imagenes/Comunidades autonomas/BalearesSF.png"));
		lblBaleares.setBounds(0, 23, 894, 690);
		panelBaleares.add(lblBaleares);
		contentPane.add(panelCanarias);
		panelCanarias.setLayout(null);

		lblTenerife = new JLabel("");
		lblTenerife.setBounds(215, 382, 31, 31);
		panelCanarias.add(lblTenerife);

		tempMaxTenerife = new JLabel("");
		tempMaxTenerife.setForeground(new Color(255, 0, 0));
		tempMaxTenerife.setBounds(188, 423, 31, 31);
		panelCanarias.add(tempMaxTenerife);

		tempMinTenerife = new JLabel("");
		tempMinTenerife.setForeground(new Color(0, 128, 255));
		tempMinTenerife.setBounds(243, 423, 31, 31);
		panelCanarias.add(tempMinTenerife);

		lblCanarias = new JLabel("");
		lblCanarias.setIcon(new ImageIcon(
				"Imagenes/Comunidades autonomas/CanariasSF.png"));
		lblCanarias.setBounds(0, 23, 894, 690);
		panelCanarias.add(lblCanarias);
		contentPane.add(panelCantabria);
		panelCantabria.setLayout(null);

		lblSantander = new JLabel("");
		lblSantander.setBounds(405, 304, 31, 31);
		panelCantabria.add(lblSantander);

		tempMaxSantander = new JLabel("");
		tempMaxSantander.setForeground(new Color(255, 0, 0));
		tempMaxSantander.setBounds(349, 246, 31, 31);
		panelCantabria.add(tempMaxSantander);

		tempMinSantander = new JLabel("");
		tempMinSantander.setForeground(new Color(0, 128, 255));
		tempMinSantander.setBounds(427, 246, 31, 31);
		panelCantabria.add(tempMinSantander);

		lblCantabria = new JLabel("");
		lblCantabria.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/CantabriaSF.png"));
		lblCantabria.setBounds(0, 23, 894, 690);
		panelCantabria.add(lblCantabria);
		contentPane.add(panelLaRioja);
		panelLaRioja.setLayout(null);

		lblLogronio = new JLabel("");
		lblLogronio.setBounds(336, 258, 31, 31);
		panelLaRioja.add(lblLogronio);

		tempMaxLogronio = new JLabel("");
		tempMaxLogronio.setForeground(new Color(255, 0, 0));
		tempMaxLogronio.setBounds(276, 201, 31, 31);
		panelLaRioja.add(tempMaxLogronio);

		tempMinLogronio = new JLabel("");
		tempMinLogronio.setForeground(new Color(0, 128, 255));
		tempMinLogronio.setBounds(370, 201, 31, 31);
		panelLaRioja.add(tempMinLogronio);

		lblLaRioja = new JLabel("");
		lblLaRioja.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/LaRiojaSF.png")));
		lblLaRioja.setBounds(0, 23, 894, 690);
		panelLaRioja.add(lblLaRioja);
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

		tempMaxAlicante = new JLabel("");
		tempMaxAlicante.setForeground(new Color(255, 0, 0));
		tempMaxAlicante.setBounds(282, 436, 31, 31);
		panelValencia.add(tempMaxAlicante);

		tempMinAlicante = new JLabel("");
		tempMinAlicante.setForeground(new Color(0, 128, 255));
		tempMinAlicante.setBounds(292, 477, 31, 31);
		panelValencia.add(tempMinAlicante);

		tempMaxValencia = new JLabel("");
		tempMaxValencia.setForeground(new Color(255, 0, 0));
		tempMaxValencia.setBounds(204, 365, 31, 31);
		panelValencia.add(tempMaxValencia);

		tempMinValencia = new JLabel("");
		tempMinValencia.setForeground(new Color(0, 128, 255));
		tempMinValencia.setBounds(268, 365, 31, 31);
		panelValencia.add(tempMinValencia);

		tempMaxCastellon = new JLabel("");
		tempMaxCastellon.setForeground(new Color(255, 0, 0));
		tempMaxCastellon.setBounds(250, 239, 31, 31);
		panelValencia.add(tempMaxCastellon);

		tempMinCastellon = new JLabel("");
		tempMinCastellon.setForeground(new Color(0, 128, 255));
		tempMinCastellon.setBounds(309, 239, 31, 31);
		panelValencia.add(tempMinCastellon);

		lblValenciaF = new JLabel("");
		lblValenciaF.setIcon(new ImageIcon(
				"Imagenes/Comunidades autonomas/ComunidadValencianaSF.png"));
		lblValenciaF.setBounds(0, 23, 894, 690);
		panelValencia.add(lblValenciaF);
		contentPane.add(panelMadrid);
		panelMadrid.setLayout(null);

		lblMadridd = new JLabel("");
		lblMadridd.setBounds(339, 342, 31, 31);
		panelMadrid.add(lblMadridd);

		tempMaxMadrid = new JLabel("");
		tempMaxMadrid.setForeground(new Color(255, 0, 0));
		tempMaxMadrid.setBounds(296, 274, 31, 31);
		panelMadrid.add(tempMaxMadrid);

		tempMInMadrid = new JLabel("");
		tempMInMadrid.setForeground(new Color(0, 128, 255));
		tempMInMadrid.setBounds(369, 274, 31, 31);
		panelMadrid.add(tempMInMadrid);

		lblMadrid = new JLabel("");
		lblMadrid.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/MadridSF.png")));
		lblMadrid.setBounds(0, 23, 894, 690);
		panelMadrid.add(lblMadrid);
		contentPane.add(panelMurcia);
		panelMurcia.setLayout(null);

		lblMurciaa = new JLabel("");
		lblMurciaa.setBounds(313, 355, 31, 31);
		panelMurcia.add(lblMurciaa);

		tempMaxMurcia = new JLabel("");
		tempMaxMurcia.setForeground(new Color(255, 0, 0));
		tempMaxMurcia.setBounds(258, 293, 31, 31);
		panelMurcia.add(tempMaxMurcia);

		tempMinMurcia = new JLabel("");
		tempMinMurcia.setForeground(new Color(0, 128, 255));
		tempMinMurcia.setBounds(354, 293, 31, 31);
		panelMurcia.add(tempMinMurcia);

		lblMurcia = new JLabel("");
		lblMurcia.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/MurciaSF.png")));
		lblMurcia.setBounds(0, 23, 894, 690);
		panelMurcia.add(lblMurcia);
		panelNavarra.setBounds(0, 58, 894, 655);
		contentPane.add(panelNavarra);
		panelNavarra.setLayout(null);

		lblPamplona = new JLabel("");
		lblPamplona.setBounds(280, 320, 31, 31);
		panelNavarra.add(lblPamplona);

		tempMaxPamplona = new JLabel("");
		tempMaxPamplona.setForeground(new Color(255, 0, 0));
		tempMaxPamplona.setBounds(230, 261, 31, 31);
		panelNavarra.add(tempMaxPamplona);

		tempMinPamplona = new JLabel("");
		tempMinPamplona.setForeground(new Color(0, 128, 255));
		tempMinPamplona.setBounds(317, 261, 31, 31);
		panelNavarra.add(tempMinPamplona);

		lblNavarra = new JLabel("");
		lblNavarra.setIcon((new ImageIcon("Imagenes/Comunidades autonomas/NavarraSF.png")));
		lblNavarra.setBounds(0, 23, 894, 690);
		panelNavarra.add(lblNavarra);
		contentPane.add(panelExtremadura);
		panelExtremadura.setLayout(null);

		lblCaceres = new JLabel("");
		lblCaceres.setBounds(188, 209, 31, 31);
		panelExtremadura.add(lblCaceres);

		lblBadajoz = new JLabel("");
		lblBadajoz.setBounds(193, 428, 31, 31);
		panelExtremadura.add(lblBadajoz);

		tempMinBadajoz = new JLabel("");
		tempMinBadajoz.setForeground(new Color(0, 128, 255));
		tempMinBadajoz.setBounds(153, 478, 31, 31);
		panelExtremadura.add(tempMinBadajoz);

		tempMaxBadajoz = new JLabel("");
		tempMaxBadajoz.setForeground(new Color(255, 0, 0));
		tempMaxBadajoz.setBounds(232, 478, 31, 31);
		panelExtremadura.add(tempMaxBadajoz);

		tempMaxCaceres = new JLabel("");
		tempMaxCaceres.setForeground(new Color(255, 0, 0));
		tempMaxCaceres.setBounds(153, 254, 31, 31);
		panelExtremadura.add(tempMaxCaceres);

		tempMinCaceres = new JLabel("");
		tempMinCaceres.setForeground(new Color(0, 128, 255));
		tempMinCaceres.setBounds(220, 254, 31, 31);
		panelExtremadura.add(tempMinCaceres);

		lblExtremadura = new JLabel("");
		lblExtremadura.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/ExtremaduraSF.png"));
		lblExtremadura.setBounds(0, 23, 894, 690);
		panelExtremadura.add(lblExtremadura);
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

		tempMaxSalamanca = new JLabel("");
		tempMaxSalamanca.setForeground(new Color(255, 0, 0));
		tempMaxSalamanca.setBounds(76, 540, 31, 31);
		panelCyL.add(tempMaxSalamanca);

		tempMinSalamanca = new JLabel("");
		tempMinSalamanca.setForeground(new Color(0, 128, 255));
		tempMinSalamanca.setBounds(141, 540, 31, 31);
		panelCyL.add(tempMinSalamanca);

		tempMaxZamoza = new JLabel("");
		tempMaxZamoza.setForeground(new Color(255, 0, 0));
		tempMaxZamoza.setBounds(131, 372, 31, 31);
		panelCyL.add(tempMaxZamoza);

		tempMinZamoza = new JLabel("");
		tempMinZamoza.setForeground(new Color(0, 128, 255));
		tempMinZamoza.setBounds(185, 372, 31, 31);
		panelCyL.add(tempMinZamoza);

		tempMaxLeon = new JLabel("");
		tempMaxLeon.setForeground(new Color(255, 0, 0));
		tempMaxLeon.setBounds(110, 110, 31, 31);
		panelCyL.add(tempMaxLeon);

		tempMinLeon = new JLabel("");
		tempMinLeon.setForeground(new Color(0, 128, 255));
		tempMinLeon.setBounds(110, 161, 31, 31);
		panelCyL.add(tempMinLeon);

		tempMaxAvila = new JLabel("");
		tempMaxAvila.setForeground(new Color(255, 0, 0));
		tempMaxAvila.setBounds(278, 515, 31, 31);
		panelCyL.add(tempMaxAvila);

		tempMinAvila = new JLabel("");
		tempMinAvila.setForeground(new Color(0, 128, 255));
		tempMinAvila.setBounds(326, 515, 31, 31);
		panelCyL.add(tempMinAvila);

		tempMaxValladolid = new JLabel("");
		tempMaxValladolid.setForeground(new Color(255, 0, 0));
		tempMaxValladolid.setBounds(278, 387, 31, 31);
		panelCyL.add(tempMaxValladolid);

		tempMinValladolid = new JLabel("");
		tempMinValladolid.setForeground(new Color(0, 128, 255));
		tempMinValladolid.setBounds(344, 387, 31, 31);
		panelCyL.add(tempMinValladolid);

		tempMaxPalencia = new JLabel("");
		tempMaxPalencia.setForeground(new Color(255, 0, 0));
		tempMaxPalencia.setBounds(344, 122, 31, 31);
		panelCyL.add(tempMaxPalencia);

		tempMinPalencia = new JLabel("");
		tempMinPalencia.setForeground(new Color(0, 128, 255));
		tempMinPalencia.setBounds(385, 122, 31, 31);
		panelCyL.add(tempMinPalencia);

		tempMaxSegovia = new JLabel("");
		tempMaxSegovia.setForeground(new Color(255, 0, 0));
		tempMaxSegovia.setBounds(385, 421, 31, 31);
		panelCyL.add(tempMaxSegovia);

		tempMinSegovia = new JLabel("");
		tempMinSegovia.setForeground(new Color(0, 128, 255));
		tempMinSegovia.setBounds(385, 473, 31, 31);
		panelCyL.add(tempMinSegovia);

		tempMaxBurgos = new JLabel("");
		tempMaxBurgos.setForeground(new Color(255, 0, 0));
		tempMaxBurgos.setBounds(478, 139, 31, 31);
		panelCyL.add(tempMaxBurgos);

		tempMinBurgos = new JLabel("");
		tempMinBurgos.setForeground(new Color(0, 128, 255));
		tempMinBurgos.setBounds(538, 139, 31, 31);
		panelCyL.add(tempMinBurgos);

		tempMinSoria = new JLabel("");
		tempMinSoria.setForeground(new Color(0, 128, 255));
		tempMinSoria.setBounds(625, 372, 31, 31);
		panelCyL.add(tempMinSoria);

		tempMaxSoria = new JLabel("");
		tempMaxSoria.setForeground(new Color(255, 0, 0));
		tempMaxSoria.setBounds(702, 372, 31, 31);
		panelCyL.add(tempMaxSoria);

		lblCyL = new JLabel("");
		lblCyL.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/CastillaYLeonSF.png"));
		lblCyL.setBounds(0, 23, 894, 690);
		panelCyL.add(lblCyL);
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

		tempMaxCiudadReal = new JLabel("");
		tempMaxCiudadReal.setForeground(new Color(255, 0, 0));
		tempMaxCiudadReal.setBounds(269, 447, 31, 31);
		panelCLM.add(tempMaxCiudadReal);

		tempMinCiudadReal = new JLabel("");
		tempMinCiudadReal.setForeground(new Color(0, 128, 255));
		tempMinCiudadReal.setBounds(269, 497, 31, 31);
		panelCLM.add(tempMinCiudadReal);

		tempMaxAlbacete = new JLabel("");
		tempMaxAlbacete.setForeground(new Color(255, 0, 0));
		tempMaxAlbacete.setBounds(522, 447, 31, 31);
		panelCLM.add(tempMaxAlbacete);

		tempMinAlbacete = new JLabel("");
		tempMinAlbacete.setForeground(new Color(0, 128, 255));
		tempMinAlbacete.setBounds(532, 497, 31, 31);
		panelCLM.add(tempMinAlbacete);

		tempMaxCuenca = new JLabel("");
		tempMaxCuenca.setForeground(new Color(255, 0, 0));
		tempMaxCuenca.setBounds(494, 263, 31, 31);
		panelCLM.add(tempMaxCuenca);

		tempMinCuenca = new JLabel("");
		tempMinCuenca.setForeground(new Color(0, 128, 255));
		tempMinCuenca.setBounds(494, 324, 31, 31);
		panelCLM.add(tempMinCuenca);

		tempMaxGuadalajara = new JLabel("");
		tempMaxGuadalajara.setForeground(new Color(255, 0, 0));
		tempMaxGuadalajara.setBounds(419, 82, 31, 31);
		panelCLM.add(tempMaxGuadalajara);

		tempMinGuadalajara = new JLabel("");
		tempMinGuadalajara.setForeground(new Color(0, 128, 255));
		tempMinGuadalajara.setBounds(422, 127, 31, 31);
		panelCLM.add(tempMinGuadalajara);

		tempMaxToledo = new JLabel("");
		tempMaxToledo.setForeground(new Color(255, 0, 0));
		tempMaxToledo.setBounds(221, 275, 31, 31);
		panelCLM.add(tempMaxToledo);

		tempMinToledo = new JLabel("");
		tempMinToledo.setForeground(new Color(0, 128, 255));
		tempMinToledo.setBounds(221, 324, 31, 31);
		panelCLM.add(tempMinToledo);

		lblCLM = new JLabel("");
		lblCLM.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/Castilla-la-Mancha_SF.png"));
		lblCLM.setBounds(0, 23, 894, 650);
		panelCLM.add(lblCLM);
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

		temMinHuelva = new JLabel("");
		temMinHuelva.setForeground(new Color(0, 128, 255));
		temMinHuelva.setBounds(57, 276, 31, 31);
		panelAndalucia.add(temMinHuelva);

		tempMaxHuelva = new JLabel("");
		tempMaxHuelva.setForeground(new Color(255, 0, 0));
		tempMaxHuelva.setBounds(104, 276, 31, 31);
		panelAndalucia.add(tempMaxHuelva);

		tempMaxCadiz = new JLabel("");
		tempMaxCadiz.setForeground(new Color(255, 0, 0));
		tempMaxCadiz.setBounds(214, 517, 31, 31);
		panelAndalucia.add(tempMaxCadiz);

		temMinCadiz = new JLabel("");
		temMinCadiz.setForeground(new Color(0, 128, 255));
		temMinCadiz.setBounds(264, 517, 31, 31);
		panelAndalucia.add(temMinCadiz);

		temMinSevilla = new JLabel("");
		temMinSevilla.setForeground(new Color(0, 128, 255));
		temMinSevilla.setBounds(232, 301, 31, 31);
		panelAndalucia.add(temMinSevilla);

		tempMaxSevilla = new JLabel("");
		tempMaxSevilla.setForeground(new Color(255, 0, 0));
		tempMaxSevilla.setBounds(285, 301, 31, 31);
		panelAndalucia.add(tempMaxSevilla);

		tempMinMalaga = new JLabel("");
		tempMinMalaga.setForeground(new Color(0, 128, 255));
		tempMinMalaga.setBounds(439, 399, 31, 31);
		panelAndalucia.add(tempMinMalaga);

		tempMaxMalaga = new JLabel("");
		tempMaxMalaga.setForeground(new Color(255, 0, 0));
		tempMaxMalaga.setBounds(439, 437, 31, 31);
		panelAndalucia.add(tempMaxMalaga);

		tempMinCordoba = new JLabel("");
		tempMinCordoba.setForeground(new Color(0, 128, 255));
		tempMinCordoba.setBounds(365, 203, 31, 31);
		panelAndalucia.add(tempMinCordoba);

		tempMaxCordoba = new JLabel("");
		tempMaxCordoba.setForeground(new Color(255, 0, 0));
		tempMaxCordoba.setBounds(419, 203, 31, 31);
		panelAndalucia.add(tempMaxCordoba);

		tempMaxGranada = new JLabel("");
		tempMaxGranada.setForeground(new Color(255, 0, 0));
		tempMaxGranada.setBounds(526, 357, 31, 31);
		panelAndalucia.add(tempMaxGranada);

		tempMinGranada = new JLabel("");
		tempMinGranada.setForeground(new Color(0, 128, 255));
		tempMinGranada.setBounds(526, 410, 31, 31);
		panelAndalucia.add(tempMinGranada);

		tempMaxJaen = new JLabel("");
		tempMaxJaen.setForeground(new Color(255, 0, 0));
		tempMaxJaen.setBounds(613, 189, 31, 31);
		panelAndalucia.add(tempMaxJaen);

		tempMinJaen = new JLabel("");
		tempMinJaen.setForeground(new Color(0, 128, 255));
		tempMinJaen.setBounds(608, 240, 31, 31);
		panelAndalucia.add(tempMinJaen);

		tempMaxAlmeria = new JLabel("");
		tempMaxAlmeria.setForeground(new Color(255, 0, 0));
		tempMaxAlmeria.setBounds(769, 342, 31, 31);
		panelAndalucia.add(tempMaxAlmeria);

		tempMinAlmeria = new JLabel("");
		tempMinAlmeria.setForeground(new Color(0, 128, 255));
		tempMinAlmeria.setBounds(769, 399, 31, 31);
		panelAndalucia.add(tempMinAlmeria);

		lbl_Andalucia = new JLabel("");
		lbl_Andalucia.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/AndaluciaSF.png"));
		lbl_Andalucia.setBounds(0, 23, 894, 690);
		panelAndalucia.add(lbl_Andalucia);
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

		tempMinPontevedra = new JLabel("");
		tempMinPontevedra.setForeground(new Color(0, 128, 255));
		tempMinPontevedra.setBounds(154, 405, 31, 31);
		panelGalicia.add(tempMinPontevedra);

		tempMaxPontevedra = new JLabel("");
		tempMaxPontevedra.setForeground(new Color(255, 0, 0));
		tempMaxPontevedra.setBounds(207, 405, 31, 31);
		panelGalicia.add(tempMaxPontevedra);

		tempMinOurense = new JLabel("");
		tempMinOurense.setForeground(new Color(0, 128, 255));
		tempMinOurense.setBounds(357, 574, 31, 31);
		panelGalicia.add(tempMinOurense);

		tempMaxOurense = new JLabel("");
		tempMaxOurense.setForeground(new Color(255, 0, 0));
		tempMaxOurense.setBounds(423, 574, 31, 31);
		panelGalicia.add(tempMaxOurense);

		tempMaxACorunia = new JLabel("");
		tempMaxACorunia.setForeground(new Color(255, 0, 0));
		tempMaxACorunia.setBounds(229, 242, 31, 31);
		panelGalicia.add(tempMaxACorunia);

		tempMinACorunia = new JLabel("");
		tempMinACorunia.setForeground(new Color(0, 128, 255));
		tempMinACorunia.setBounds(229, 301, 31, 31);
		panelGalicia.add(tempMinACorunia);

		tempMaxLugo = new JLabel("");
		tempMaxLugo.setForeground(new Color(255, 0, 0));
		tempMaxLugo.setBounds(384, 301, 31, 31);
		panelGalicia.add(tempMaxLugo);

		tempMinLugo = new JLabel("");
		tempMinLugo.setForeground(new Color(0, 128, 255));
		tempMinLugo.setBounds(458, 301, 31, 31);
		panelGalicia.add(tempMinLugo);

		lblGalicia = new JLabel("");
		lblGalicia.setIcon(new ImageIcon("Imagenes/Comunidades autonomas/GaliciaSF.png"));
		lblGalicia.setBounds(0, 23, 894, 690);
		panelGalicia.add(lblGalicia);
		contentPane.add(panelCatalunia);
		panelCatalunia.setLayout(null);

		tempMinTarragona = new JLabel("");
		tempMinTarragona.setForeground(new Color(0, 128, 255));
		tempMinTarragona.setBounds(187, 491, 31, 31);
		panelCatalunia.add(tempMinTarragona);

		tempMaxTarragona = new JLabel("");
		tempMaxTarragona.setForeground(new Color(255, 0, 0));
		tempMaxTarragona.setBounds(187, 454, 31, 31);
		panelCatalunia.add(tempMaxTarragona);

		tempMaxGirona = new JLabel("");
		tempMaxGirona.setForeground(new Color(255, 0, 0));
		tempMaxGirona.setBounds(550, 195, 31, 31);
		panelCatalunia.add(tempMaxGirona);

		tempMinGirona = new JLabel("");
		tempMinGirona.setForeground(new Color(0, 128, 255));
		tempMinGirona.setBounds(492, 195, 31, 31);
		panelCatalunia.add(tempMinGirona);

		tempMaxBarcelona = new JLabel("");
		tempMaxBarcelona.setForeground(new Color(255, 0, 0));
		tempMaxBarcelona.setBounds(392, 368, 31, 31);
		panelCatalunia.add(tempMaxBarcelona);

		tempMinBarcelona = new JLabel("");
		tempMinBarcelona.setForeground(new Color(0, 128, 255));
		tempMinBarcelona.setBounds(341, 368, 31, 31);
		panelCatalunia.add(tempMinBarcelona);

		tempMaxLleida = new JLabel("");
		tempMaxLleida.setForeground(new Color(255, 0, 0));
		tempMaxLleida.setBounds(211, 182, 31, 31);
		panelCatalunia.add(tempMaxLleida);

		tempMinLleida = new JLabel("");
		tempMinLleida.setForeground(new Color(0, 128, 255));
		tempMinLleida.setBounds(170, 184, 31, 31);
		panelCatalunia.add(tempMinLleida);

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

		panelMapa = new JPanel();
		panelMapa.setBounds(0, 58, 894, 655);
		contentPane.add(panelMapa);
		panelMapa.setLayout(null);

		lbl_Toledo = new JLabel("");
		lbl_Toledo.setBounds(410, 304, 31, 31);
		panelMapa.add(lbl_Toledo);

		lblRetroalimentacion = new JLabel("");
		lblRetroalimentacion.setBounds(682, 418, 202, 249);
		lblRetroalimentacion.setForeground(Color.RED);
		panelMapa.add(lblRetroalimentacion);

		lbl_Badajoz = new JLabel("");
		lbl_Badajoz.setBounds(328, 370, 31, 31);
		panelMapa.add(lbl_Badajoz);

		lbl_ACorunia = new JLabel("");
		lbl_ACorunia.setBounds(223, 100, 31, 31);
		panelMapa.add(lbl_ACorunia);

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

		lbl_Caceres = new JLabel("");
		lbl_Caceres.setBounds(328, 304, 31, 31);
		panelMapa.add(lbl_Caceres);

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
				"Imagenes/spain_prov Buena.png"));
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

		

		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 151, 206, 13);
		panelMapa.add(lblNewLabel);

		lbl_Guipuzcoa = new JLabel("");
		lbl_Guipuzcoa.setBounds(515, 100, 31, 31);
		panelMapa.add(lbl_Guipuzcoa);

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