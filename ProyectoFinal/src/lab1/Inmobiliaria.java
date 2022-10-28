package lab1;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Inmobiliaria extends JFrame {

	private JPanel contentPane;
	private JTextField txtExtencion;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inmobiliaria frame = new Inmobiliaria();
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
	public Inmobiliaria() {
		setTitle("Inmobiliaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUbicacion = new JLabel("Departamento");
		lblUbicacion.setBounds(27, 12, 108, 15);
		contentPane.add(lblUbicacion);
		
		JLabel lblExtencionEnM = new JLabel("Extencion en m^2");
		lblExtencionEnM.setBounds(27, 39, 133, 15);
		contentPane.add(lblExtencionEnM);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(27, 66, 108, 15);
		contentPane.add(lblPrecio);
		
		txtExtencion = new JTextField();
		txtExtencion.setBounds(178, 37, 114, 19);
		contentPane.add(txtExtencion);
		txtExtencion.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(179, 64, 114, 19);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JButton btnDarAlta = new JButton("Dar Alta");
		btnDarAlta.setBounds(12, 108, 117, 25);
		contentPane.add(btnDarAlta);
		
		JButton btnDarBaja = new JButton("Dar Baja");
		btnDarBaja.setBounds(141, 108, 117, 25);
		contentPane.add(btnDarBaja);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(270, 108, 117, 25);
		contentPane.add(btnModificar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(399, 108, 117, 25);
		contentPane.add(btnBuscar);
		
		JComboBox cbDepartamento = new JComboBox();
		cbDepartamento.setBounds(178, 10, 114, 19);
		contentPane.add(cbDepartamento);
		
		JTextArea txtrImp = new JTextArea();
		txtrImp.setBounds(12, 150, 505, 203);
		contentPane.add(txtrImp);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 365, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(399, 365, 117, 25);
		contentPane.add(btnAyuda);
	}

}
