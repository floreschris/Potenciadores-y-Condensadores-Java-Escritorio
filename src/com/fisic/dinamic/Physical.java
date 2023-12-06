package com.fisic.dinamic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Physical extends JFrame {

	private JPanel contentPane;
	private JTextField txtV;
	private JTextField txtK;
	private JTextField txtq;
	private JTextField txtr;
	private JTextField txtE;
	private JTextField txtCapacitancia;
	private JTextField txtQ;
	private JTextField txtVoltaje;
	private JTextField txtArea;
	private JTextField txtF;
	private JTextField txtRpta;
	private JTextField txtdistancia;
	private JTextField txtEC;
	private JTextField txtEo;
	private JTextField txtRptaC;
	private JTextField txtKC;
	private JTextField txtqq;
	private JLabel lblImg1;

	public void LimpiarDatos() {

		txtArea.setText("");
		txtCapacitancia.setText("");
		txtdistancia.setText("");
		txtE.setText("");
		txtEC.setText("");
		txtEo.setText("");
		txtF.setText("");
		txtK.setText("");
		txtq.setText("");
		txtQ.setText("");
		txtr.setText("");
		txtV.setText("");
		txtVoltaje.setText("");
		txtRpta.setText("");
		txtRptaC.setText("");
		txtqq.setText("");
		txtKC.setText("");

	}

	public Physical() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1369, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnResultado_1_1 = new JButton("Resultado K");
		btnResultado_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnResultado_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double E, eo, resultado;

				E = Double.parseDouble(txtEC.getText());
				eo = Double.parseDouble(txtEo.getText());

				resultado = E / eo;
				txtRptaC.setText(String.valueOf(resultado));

			}
		});

		JButton btnResultado_2_1 = new JButton("Resultado V (lll)");
		btnResultado_2_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnResultado_2_1.setBackground(new Color(0, 128, 0));
		btnResultado_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double f, r, qq, resultado;

				f = Double.parseDouble(txtF.getText());
				r = Double.parseDouble(txtr.getText());
				qq = Double.parseDouble(txtqq.getText());

				resultado = f * r / qq;

				txtRpta.setText(String.valueOf(resultado));

			}
		});
		btnResultado_2_1.setBounds(453, 486, 154, 41);
		contentPane.add(btnResultado_2_1);

		JButton btnResultadoV = new JButton("Resultado V");
		btnResultadoV.setFont(new Font("Arial", Font.BOLD, 16));
		btnResultadoV.setBackground(new Color(0, 128, 0));
		btnResultadoV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double k, q, r, resultado;
				k = Double.parseDouble(txtK.getText());
				q = Double.parseDouble(txtq.getText());
				r = Double.parseDouble(txtr.getText());

				resultado = k * q / r;

				txtRpta.setText(String.valueOf(resultado));

			}
		});
		btnResultadoV.setBounds(453, 377, 154, 41);
		contentPane.add(btnResultadoV);

		txtqq = new JTextField();
		txtqq.setBackground(new Color(192, 192, 192));
		txtqq.setHorizontalAlignment(SwingConstants.CENTER);
		txtqq.setFont(new Font("Calibri", Font.BOLD, 18));
		txtqq.setColumns(10);
		txtqq.setBounds(273, 571, 154, 31);
		contentPane.add(txtqq);

		JLabel lblIngresaQ_1 = new JLabel("Ingresa q'");
		lblIngresaQ_1.setForeground(Color.WHITE);
		lblIngresaQ_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaQ_1.setBounds(273, 534, 154, 41);
		contentPane.add(lblIngresaQ_1);

		JLabel lblIngresaE_1_1_1 = new JLabel("Ingresa K");
		lblIngresaE_1_1_1.setForeground(Color.BLACK);
		lblIngresaE_1_1_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaE_1_1_1.setBounds(967, 603, 153, 41);
		contentPane.add(lblIngresaE_1_1_1);

		txtKC = new JTextField();
		txtKC.setBackground(new Color(192, 192, 192));
		txtKC.setHorizontalAlignment(SwingConstants.CENTER);
		txtKC.setText("\r\n");
		txtKC.setFont(new Font("Calibri", Font.BOLD, 18));
		txtKC.setColumns(10);
		txtKC.setBounds(966, 640, 154, 31);
		contentPane.add(txtKC);
		btnResultado_1_1.setBackground(new Color(188, 143, 143));
		btnResultado_1_1.setBounds(1189, 576, 154, 41);
		contentPane.add(btnResultado_1_1);

		JButton btnResultado_1_2 = new JButton("Resultado C (ll)");
		btnResultado_1_2.setFont(new Font("Arial", Font.BOLD, 16));
		btnResultado_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double k, eo, A, d, resultado;

				k = Double.parseDouble(txtKC.getText());
				eo = Double.parseDouble(txtEo.getText());
				A = Double.parseDouble(txtArea.getText());
				d = Double.parseDouble(txtdistancia.getText());

				resultado = (k * eo * A) / d;

				txtRptaC.setText(String.valueOf(resultado));

			}
		});
		btnResultado_1_2.setBackground(new Color(188, 143, 143));
		btnResultado_1_2.setBounds(1189, 630, 154, 41);
		contentPane.add(btnResultado_1_2);

		JLabel lblResultado_1 = new JLabel("Resultado");
		lblResultado_1.setForeground(Color.BLACK);
		lblResultado_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblResultado_1.setBounds(968, 672, 127, 41);
		contentPane.add(lblResultado_1);

		txtRptaC = new JTextField();
		txtRptaC.setBackground(new Color(192, 192, 192));
		txtRptaC.setHorizontalAlignment(SwingConstants.CENTER);
		txtRptaC.setFont(new Font("Calibri", Font.BOLD, 18));
		txtRptaC.setColumns(10);
		txtRptaC.setBounds(966, 713, 154, 31);
		contentPane.add(txtRptaC);

		JButton btnResultado_1 = new JButton("Resultado C");
		btnResultado_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnResultado_1.setBackground(new Color(188, 143, 143));
		btnResultado_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double q, v, resultado;
				q = Double.parseDouble(txtQ.getText());
				v = Double.parseDouble(txtVoltaje.getText());

				resultado = q / v;

				txtRptaC.setText(String.valueOf(resultado));

			}
		});
		btnResultado_1.setBounds(1189, 525, 154, 41);
		contentPane.add(btnResultado_1);

		JLabel lblIngresaE_1_1 = new JLabel("Ingresa E0");
		lblIngresaE_1_1.setForeground(Color.BLACK);
		lblIngresaE_1_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaE_1_1.setBounds(967, 534, 153, 41);
		contentPane.add(lblIngresaE_1_1);

		txtEo = new JTextField();
		txtEo.setBackground(new Color(192, 192, 192));
		txtEo.setHorizontalAlignment(SwingConstants.CENTER);
		txtEo.setText("\r\n");
		txtEo.setFont(new Font("Calibri", Font.BOLD, 18));
		txtEo.setColumns(10);
		txtEo.setBounds(966, 571, 154, 31);
		contentPane.add(txtEo);

		JLabel lblIngresaD = new JLabel("Ingresa d");
		lblIngresaD.setForeground(Color.BLACK);
		lblIngresaD.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaD.setBounds(967, 367, 127, 41);
		contentPane.add(lblIngresaD);

		txtdistancia = new JTextField();
		txtdistancia.setBackground(new Color(192, 192, 192));
		txtdistancia.setHorizontalAlignment(SwingConstants.CENTER);
		txtdistancia.setText("\r\n");
		txtdistancia.setFont(new Font("Calibri", Font.BOLD, 18));
		txtdistancia.setColumns(10);
		txtdistancia.setBounds(966, 404, 154, 31);
		contentPane.add(txtdistancia);

		JLabel lblIngresaE_1 = new JLabel("Ingresa E");
		lblIngresaE_1.setForeground(Color.BLACK);
		lblIngresaE_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaE_1.setBounds(968, 448, 127, 41);
		contentPane.add(lblIngresaE_1);

		txtEC = new JTextField();
		txtEC.setBackground(new Color(192, 192, 192));
		txtEC.setHorizontalAlignment(SwingConstants.CENTER);
		txtEC.setText("\r\n");
		txtEC.setFont(new Font("Calibri", Font.BOLD, 18));
		txtEC.setColumns(10);
		txtEC.setBounds(967, 485, 154, 31);
		contentPane.add(txtEC);

		JLabel lblIngresaV_1 = new JLabel("Ingresa V");
		lblIngresaV_1.setForeground(Color.BLACK);
		lblIngresaV_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaV_1.setBounds(776, 521, 127, 41);
		contentPane.add(lblIngresaV_1);

		JLabel lblIngresaA = new JLabel("Ingresa A");
		lblIngresaA.setForeground(Color.BLACK);
		lblIngresaA.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaA.setBounds(777, 593, 127, 41);
		contentPane.add(lblIngresaA);

		JLabel lblIngresaC = new JLabel("Ingresa C");
		lblIngresaC.setForeground(Color.BLACK);
		lblIngresaC.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaC.setBounds(776, 367, 127, 41);
		contentPane.add(lblIngresaC);

		JLabel lblIngresaQ = new JLabel("Ingresa Q");
		lblIngresaQ.setForeground(Color.BLACK);
		lblIngresaQ.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaQ.setBounds(776, 441, 127, 41);
		contentPane.add(lblIngresaQ);

		JButton btnResultado = new JButton("Resultado V (ll)");
		btnResultado.setFont(new Font("Arial", Font.BOLD, 16));
		btnResultado.setBackground(new Color(0, 128, 0));
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double E, r, resultado;

				E = Double.parseDouble(txtE.getText());
				r = Double.parseDouble(txtr.getText());

				resultado = E * r;

				txtRpta.setText(String.valueOf(resultado));

			}
		});
		btnResultado.setBounds(453, 429, 154, 41);
		contentPane.add(btnResultado);

		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimpiarDatos();
			}
		});
		btnNewButton.setBounds(173, 709, 154, 41);
		contentPane.add(btnNewButton);

		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setForeground(Color.WHITE);
		lblResultado.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblResultado.setBounds(273, 603, 127, 41);
		contentPane.add(lblResultado);

		txtRpta = new JTextField();
		txtRpta.setBackground(new Color(192, 192, 192));
		txtRpta.setHorizontalAlignment(SwingConstants.CENTER);
		txtRpta.setFont(new Font("Calibri", Font.BOLD, 18));
		txtRpta.setColumns(10);
		txtRpta.setBounds(273, 640, 154, 31);
		contentPane.add(txtRpta);

		JLabel lblIngresaF = new JLabel("Ingresa F");
		lblIngresaF.setForeground(Color.WHITE);
		lblIngresaF.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaF.setBounds(273, 448, 127, 41);
		contentPane.add(lblIngresaF);

		txtF = new JTextField();
		txtF.setBackground(new Color(192, 192, 192));
		txtF.setHorizontalAlignment(SwingConstants.CENTER);
		txtF.setFont(new Font("Calibri", Font.BOLD, 18));
		txtF.setColumns(10);
		txtF.setBounds(273, 485, 154, 31);
		contentPane.add(txtF);

		JLabel lblIngresaE = new JLabel("Ingresa E");
		lblIngresaE.setForeground(Color.WHITE);
		lblIngresaE.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaE.setBounds(273, 367, 127, 41);
		contentPane.add(lblIngresaE);

		JLabel lblIngresaV_1_2 = new JLabel("Ingresa r");
		lblIngresaV_1_2.setForeground(Color.WHITE);
		lblIngresaV_1_2.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaV_1_2.setBounds(61, 603, 127, 41);
		contentPane.add(lblIngresaV_1_2);

		JLabel lblIngresaV_1_1 = new JLabel("Ingresa q");
		lblIngresaV_1_1.setForeground(Color.WHITE);
		lblIngresaV_1_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaV_1_1.setBounds(61, 521, 127, 41);
		contentPane.add(lblIngresaV_1_1);

		JLabel lblIngresaK = new JLabel("Ingresa K");
		lblIngresaK.setForeground(Color.WHITE);
		lblIngresaK.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaK.setBounds(61, 445, 127, 41);
		contentPane.add(lblIngresaK);

		JLabel lblIngresaV = new JLabel("Ingresa V\r\n");
		lblIngresaV.setForeground(Color.WHITE);
		lblIngresaV.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblIngresaV.setBounds(61, 367, 127, 41);
		contentPane.add(lblIngresaV);

		txtCapacitancia = new JTextField();
		txtCapacitancia.setBackground(new Color(192, 192, 192));
		txtCapacitancia.setHorizontalAlignment(SwingConstants.CENTER);
		txtCapacitancia.setText("\r\n");
		txtCapacitancia.setFont(new Font("Calibri", Font.BOLD, 18));
		txtCapacitancia.setColumns(10);
		txtCapacitancia.setBounds(776, 406, 154, 31);
		contentPane.add(txtCapacitancia);

		txtArea = new JTextField();
		txtArea.setBackground(new Color(192, 192, 192));
		txtArea.setHorizontalAlignment(SwingConstants.CENTER);
		txtArea.setText("\r\n");
		txtArea.setFont(new Font("Calibri", Font.BOLD, 18));
		txtArea.setColumns(10);
		txtArea.setBounds(776, 630, 154, 31);
		contentPane.add(txtArea);

		txtQ = new JTextField();
		txtQ.setBackground(new Color(192, 192, 192));
		txtQ.setHorizontalAlignment(SwingConstants.CENTER);
		txtQ.setText("\r\n");
		txtQ.setFont(new Font("Calibri", Font.BOLD, 18));
		txtQ.setColumns(10);
		txtQ.setBounds(776, 485, 154, 31);
		contentPane.add(txtQ);

		txtVoltaje = new JTextField();
		txtVoltaje.setBackground(new Color(192, 192, 192));
		txtVoltaje.setHorizontalAlignment(SwingConstants.CENTER);
		txtVoltaje.setText("\r\n");
		txtVoltaje.setFont(new Font("Calibri", Font.BOLD, 18));
		txtVoltaje.setColumns(10);
		txtVoltaje.setBounds(776, 561, 154, 31);
		contentPane.add(txtVoltaje);

		JLabel lblimg12 = new JLabel("");
		lblimg12.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono12.png"));
		lblimg12.setBounds(841, 674, 93, 87);
		contentPane.add(lblimg12);

		JLabel lblimg11 = new JLabel("");
		lblimg11.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono11.gif"));
		lblimg11.setBounds(145, 63, 58, 76);
		contentPane.add(lblimg11);

		JLabel lblimg4 = new JLabel("");
		lblimg4.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono4.png"));
		lblimg4.setBounds(10, 11, 64, 61);
		contentPane.add(lblimg4);

		JLabel lblimg9 = new JLabel("");
		lblimg9.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono9.png"));
		lblimg9.setBounds(403, 674, 93, 87);
		contentPane.add(lblimg9);

		JLabel lblimg10 = new JLabel("");
		lblimg10.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono10.png"));
		lblimg10.setBounds(1247, 661, 106, 100);
		contentPane.add(lblimg10);

		JLabel lblimg6 = new JLabel("");
		lblimg6.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono6.png"));
		lblimg6.setBounds(539, 63, 93, 87);
		contentPane.add(lblimg6);

		JLabel lblimg8 = new JLabel("");
		lblimg8.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono8.png"));
		lblimg8.setBounds(1221, 50, 93, 100);
		contentPane.add(lblimg8);

		JLabel lblimg5 = new JLabel("");
		lblimg5.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono5.png"));
		lblimg5.setBounds(649, 367, 93, 87);
		contentPane.add(lblimg5);

		JLabel lblimg3 = new JLabel("");
		lblimg3.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono3.png"));
		lblimg3.setBounds(244, 63, 79, 74);
		contentPane.add(lblimg3);

		JLabel lblimg7 = new JLabel("");
		lblimg7.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono7.png"));
		lblimg7.setBounds(526, 213, 79, 87);
		contentPane.add(lblimg7);

		JLabel lblimg2 = new JLabel("");
		lblimg2.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono2.png"));
		lblimg2.setBounds(776, 50, 93, 87);
		contentPane.add(lblimg2);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1
				.setIcon(new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\gif.png"));
		lblNewLabel_1.setBounds(496, 538, 335, 243);
		contentPane.add(lblNewLabel_1);

		lblImg1 = new JLabel("");
		lblImg1.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\icono1.png"));
		lblImg1.setBounds(-14, 674, 93, 87);
		contentPane.add(lblImg1);

		JLabel lblCQvf = new JLabel("C= Q/v (Farad)");
		lblCQvf.setForeground(Color.BLACK);
		lblCQvf.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblCQvf.setBounds(1008, 136, 345, 76);
		contentPane.add(lblCQvf);

		JLabel lblFormulas_1 = new JLabel("Formulas:");
		lblFormulas_1.setForeground(Color.BLACK);
		lblFormulas_1.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblFormulas_1.setBounds(998, 82, 213, 41);
		contentPane.add(lblFormulas_1);

		JLabel lblKeeo = new JLabel("K =E/Eo\r\n");
		lblKeeo.setForeground(Color.BLACK);
		lblKeeo.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblKeeo.setBackground(Color.BLACK);
		lblKeeo.setBounds(1008, 290, 233, 76);
		contentPane.add(lblKeeo);

		JLabel lblCKeoad = new JLabel("C= K*Eo*A/d");
		lblCKeoad.setForeground(Color.BLACK);
		lblCKeoad.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblCKeoad.setBackground(SystemColor.controlDkShadow);
		lblCKeoad.setBounds(947, 203, 335, 76);
		contentPane.add(lblCKeoad);

		JLabel lblDate_1 = new JLabel("Donde:\r\n");
		lblDate_1.setForeground(Color.BLACK);
		lblDate_1.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblDate_1.setBounds(629, 82, 148, 41);
		contentPane.add(lblDate_1);

		JLabel lblq_1 = new JLabel("A = Area de la placa\r\n");
		lblq_1.setForeground(Color.BLACK);
		lblq_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblq_1.setBounds(629, 244, 308, 41);
		contentPane.add(lblq_1);

		JLabel lblr_1 = new JLabel("K = constante");
		lblr_1.setForeground(Color.BLACK);
		lblr_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblr_1.setBounds(629, 203, 229, 41);
		contentPane.add(lblr_1);

		JLabel lblqq_1 = new JLabel("d= Distancia entre placas");
		lblqq_1.setForeground(Color.BLACK);
		lblqq_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblqq_1.setBounds(629, 284, 335, 41);
		contentPane.add(lblqq_1);

		JLabel lblV_1 = new JLabel("C= Capacitancia (Coulombs)\r\n");
		lblV_1.setForeground(Color.BLACK);
		lblV_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblV_1.setBounds(629, 122, 359, 41);
		contentPane.add(lblV_1);

		JLabel lblK_1 = new JLabel("K: Contante de Coulomb");
		lblK_1.setForeground(Color.BLACK);
		lblK_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblK_1.setBounds(629, 325, 308, 41);
		contentPane.add(lblK_1);

		JLabel lblE_1 = new JLabel("V= Voltaje (Voltio)");
		lblE_1.setForeground(Color.BLACK);
		lblE_1.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblE_1.setBounds(629, 161, 292, 41);
		contentPane.add(lblE_1);

		txtr = new JTextField();
		txtr.setBackground(new Color(192, 192, 192));
		txtr.setHorizontalAlignment(SwingConstants.CENTER);
		txtr.setFont(new Font("Calibri", Font.BOLD, 18));
		txtr.setColumns(10);
		txtr.setBounds(61, 655, 154, 31);
		contentPane.add(txtr);

		txtK = new JTextField();
		txtK.setBackground(new Color(192, 192, 192));
		txtK.setHorizontalAlignment(SwingConstants.CENTER);
		txtK.setFont(new Font("Calibri", Font.BOLD, 18));
		txtK.setColumns(10);
		txtK.setBounds(61, 485, 154, 31);
		contentPane.add(txtK);

		txtV = new JTextField();
		txtV.setBackground(new Color(192, 192, 192));
		txtV.setHorizontalAlignment(SwingConstants.CENTER);
		txtV.setFont(new Font("Calibri", Font.BOLD, 18));
		txtV.setBounds(61, 404, 154, 31);
		contentPane.add(txtV);
		txtV.setColumns(10);

		txtq = new JTextField();
		txtq.setBackground(new Color(192, 192, 192));
		txtq.setHorizontalAlignment(SwingConstants.CENTER);
		txtq.setFont(new Font("Calibri", Font.BOLD, 18));
		txtq.setColumns(10);
		txtq.setBounds(61, 561, 154, 31);
		contentPane.add(txtq);

		txtE = new JTextField();
		txtE.setBackground(new Color(192, 192, 192));
		txtE.setHorizontalAlignment(SwingConstants.CENTER);
		txtE.setFont(new Font("Calibri", Font.BOLD, 18));
		txtE.setColumns(10);
		txtE.setBounds(273, 404, 154, 31);
		contentPane.add(txtE);

		JLabel lblFormulas = new JLabel("Formulas:");
		lblFormulas.setForeground(Color.WHITE);
		lblFormulas.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblFormulas.setBounds(369, 82, 213, 41);
		contentPane.add(lblFormulas);

		JLabel lblTItulo = new JLabel("CAPACITANCIA Y DIELECTRICOS");
		lblTItulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTItulo.setForeground(Color.BLACK);
		lblTItulo.setFont(new Font("Monospaced", Font.BOLD, 44));
		lblTItulo.setBounds(619, 0, 734, 71);
		contentPane.add(lblTItulo);

		JLabel lblCeleste = new JLabel("");
		lblCeleste.setBackground(new Color(192, 192, 192));
		lblCeleste.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\fondoceleste.jpg"));
		lblCeleste.setBounds(612, 0, 759, 761);
		contentPane.add(lblCeleste);

		JLabel lblTitul = new JLabel("POTENCIAL ELECTRICO");
		lblTitul.setForeground(Color.WHITE);
		lblTitul.setFont(new Font("Monospaced", Font.BOLD, 44));
		lblTitul.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitul.setBounds(0, 0, 619, 71);
		contentPane.add(lblTitul);

		JLabel lblVFrq = new JLabel("V= F.r/q'");
		lblVFrq.setBackground(UIManager.getColor("CheckBox.focus"));
		lblVFrq.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblVFrq.setForeground(Color.WHITE);
		lblVFrq.setBounds(379, 290, 233, 76);
		contentPane.add(lblVFrq);

		JLabel lblVEr = new JLabel("V= E.r");
		lblVEr.setBackground(UIManager.getColor("CheckBox.darkShadow"));
		lblVEr.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblVEr.setForeground(Color.WHITE);
		lblVEr.setBounds(357, 219, 210, 76);
		contentPane.add(lblVEr);

		JLabel lblFormula1 = new JLabel("V= K*q/r");
		lblFormula1.setFont(new Font("Monospaced", Font.BOLD, 40));
		lblFormula1.setForeground(Color.WHITE);
		lblFormula1.setBounds(379, 136, 210, 76);
		contentPane.add(lblFormula1);

		JLabel lblDate = new JLabel("Donde:\r\n");
		lblDate.setForeground(Color.WHITE);
		lblDate.setFont(new Font("Monospaced", Font.BOLD, 30));
		lblDate.setBounds(10, 82, 148, 41);
		contentPane.add(lblDate);

		JLabel lblV = new JLabel("V: Potencial el\u00E9ctrico (V)\r\n");
		lblV.setForeground(Color.WHITE);
		lblV.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblV.setBounds(10, 122, 359, 41);
		contentPane.add(lblV);

		JLabel lblE = new JLabel("E: Magnitud del campo");
		lblE.setForeground(Color.WHITE);
		lblE.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblE.setBounds(10, 161, 292, 41);
		contentPane.add(lblE);

		JLabel lblr = new JLabel("r: Distancia (m)\r\n");
		lblr.setForeground(Color.WHITE);
		lblr.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblr.setBounds(10, 203, 229, 41);
		contentPane.add(lblr);

		JLabel lblq = new JLabel("q: Carga el\u00E9ctrica (C)\r\n");
		lblq.setForeground(Color.WHITE);
		lblq.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblq.setBounds(10, 244, 308, 41);
		contentPane.add(lblq);

		JLabel lblqq = new JLabel("q\u2019: Carga de prueba (C)\r\n");
		lblqq.setForeground(Color.WHITE);
		lblqq.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblqq.setBounds(10, 284, 308, 41);
		contentPane.add(lblqq);

		JLabel lblK = new JLabel("K: Contante de Coulomb");
		lblK.setForeground(Color.WHITE);
		lblK.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblK.setBounds(10, 325, 308, 41);
		contentPane.add(lblK);

		JLabel lblMarron = new JLabel("");
		lblMarron.setForeground(Color.WHITE);
		lblMarron.setFont(new Font("Monospaced", Font.BOLD, 22));
		lblMarron.setIcon(
				new ImageIcon("C:\\Users\\Usuario\\eclipse-workspace\\PEyCD\\src\\com\\fisic\\img\\fondomarron.png"));
		lblMarron.setBounds(0, 0, 619, 761);
		contentPane.add(lblMarron);
	}
}
