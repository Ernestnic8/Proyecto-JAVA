package lab1;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Compañia extends JFrame {

	private JPanel contentPane;
	private JTextField txtAnt;
	private JTextField txtDir;
	private JTextField txtEdad;
	private JTextField txtNom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compañia frame = new Compañia();
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
	public Compañia() {
		setTitle("Compañia-Registro de Empleado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(32, 12, 108, 15);
		contentPane.add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(32, 36, 108, 15);
		contentPane.add(lblEdad);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(32, 63, 108, 15);
		contentPane.add(lblDireccion);
		
		JLabel lblAosDeAntguedad = new JLabel("Años de Antiguedad");
		lblAosDeAntguedad.setBounds(32, 115, 152, 15);
		contentPane.add(lblAosDeAntguedad);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(32, 88, 152, 15);
		contentPane.add(lblSexo);
		
		txtAnt = new JTextField();
		txtAnt.setBounds(190, 113, 114, 19);
		contentPane.add(txtAnt);
		txtAnt.setColumns(10);
		
		txtDir = new JTextField();
		txtDir.setBounds(190, 61, 114, 19);
		contentPane.add(txtDir);
		txtDir.setColumns(10);
		
		JComboBox cbSexo = new JComboBox();
		cbSexo.setBounds(190, 86, 114, 19);
		contentPane.add(cbSexo);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(190, 34, 114, 19);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtNom = new JTextField();
		txtNom.setBounds(190, 10, 114, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JButton btnDarAlta = new JButton("Dar Alta");
		btnDarAlta.setBounds(12, 142, 117, 25);
		contentPane.add(btnDarAlta);
		
		JButton btnDarBaja = new JButton("Dar Baja");
		btnDarBaja.setBounds(141, 142, 117, 25);
		contentPane.add(btnDarBaja);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(270, 142, 117, 25);
		contentPane.add(btnModificar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(399, 142, 117, 25);
		contentPane.add(btnBuscar);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 365, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(399, 365, 117, 25);
		contentPane.add(btnAyuda);
		
		JTextArea txtrImp = new JTextArea();
		txtrImp.setBounds(12, 173, 526, 181);
		contentPane.add(txtrImp);
	}
}
