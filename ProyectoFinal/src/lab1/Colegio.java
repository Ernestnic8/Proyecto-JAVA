package lab1;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Colegio extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtNoSem;
	private JTextField txtCal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colegio frame = new Colegio();
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
	public Colegio() {
		setTitle("Registro de Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombreCompleto = new JLabel("Nombre Completo");
		lblNombreCompleto.setBounds(12, 12, 137, 20);
		contentPane.add(lblNombreCompleto);
		
		txtNom = new JTextField();
		txtNom.setBounds(155, 13, 205, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("No. Semestres Cursados");
		lblNewLabel.setBounds(12, 44, 185, 20);
		contentPane.add(lblNewLabel);
		
		txtNoSem = new JTextField();
		txtNoSem.setBounds(204, 44, 114, 19);
		contentPane.add(txtNoSem);
		txtNoSem.setColumns(10);
		
		JLabel lblNotas = new JLabel("Calificacion Promedio total");
		lblNotas.setBounds(12, 76, 205, 20);
		contentPane.add(lblNotas);
		
		txtCal = new JTextField();
		txtCal.setBounds(214, 77, 114, 19);
		contentPane.add(txtCal);
		txtCal.setColumns(10);
		
		JButton btnDarAlta = new JButton("Dar Alta");
		btnDarAlta.setBounds(12, 108, 117, 25);
		contentPane.add(btnDarAlta);
		
		JButton btnDarBaja = new JButton("Dar Baja");
		btnDarBaja.setBounds(142, 108, 117, 25);
		contentPane.add(btnDarBaja);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(271, 108, 117, 25);
		contentPane.add(btnBuscar);
		
		JTextArea txtrImp = new JTextArea();
		txtrImp.setBounds(12, 145, 511, 208);
		contentPane.add(txtrImp);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(406, 108, 117, 25);
		contentPane.add(btnModificar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 365, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(421, 365, 117, 25);
		contentPane.add(btnAyuda);
	}
}
