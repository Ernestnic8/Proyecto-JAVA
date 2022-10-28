package lab1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Vendedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendedor frame = new Vendedor();
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
	public Vendedor() {
		setTitle("Compañia-Vendedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(25, 12, 113, 15);
		contentPane.add(lblNombre);
		
		JLabel lblTotalVentas = new JLabel("Total Ventas");
		lblTotalVentas.setBounds(25, 39, 113, 15);
		contentPane.add(lblTotalVentas);
		
		txtNom = new JTextField();
		txtNom.setBounds(156, 10, 114, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtVentas = new JTextField();
		txtVentas.setBounds(156, 37, 114, 19);
		contentPane.add(txtVentas);
		txtVentas.setColumns(10);
		
		JButton btnDarAlta = new JButton("Dar Alta");
		btnDarAlta.setBounds(12, 98, 117, 25);
		contentPane.add(btnDarAlta);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(141, 98, 117, 25);
		contentPane.add(btnModificar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(270, 98, 117, 25);
		contentPane.add(btnBuscar);
		
		JTextArea txtrImp = new JTextArea();
		txtrImp.setBounds(12, 136, 383, 206);
		contentPane.add(txtrImp);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 365, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(411, 365, 117, 25);
		contentPane.add(btnAyuda);
	}

}
