package lab1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Empresa extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtTel;
	private JTextField txtSaldo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empresa frame = new Empresa();
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
	public Empresa() {
		setTitle("Registro de Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(26, 12, 99, 21);
		contentPane.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setBounds(26, 45, 99, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setBounds(26, 78, 99, 21);
		contentPane.add(lblSaldo);
		
		JLabel lblEstadoMoroso = new JLabel("Estado Moroso");
		lblEstadoMoroso.setBounds(26, 111, 111, 21);
		contentPane.add(lblEstadoMoroso);
		
		txtNom = new JTextField();
		txtNom.setBounds(150, 13, 114, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JComboBox cbMoroso = new JComboBox();
		cbMoroso.setBounds(150, 110, 114, 23);
		contentPane.add(cbMoroso);
		
		txtTel = new JTextField();
		txtTel.setBounds(150, 46, 114, 19);
		contentPane.add(txtTel);
		txtTel.setColumns(10);
		
		txtSaldo = new JTextField();
		txtSaldo.setBounds(150, 79, 114, 19);
		contentPane.add(txtSaldo);
		txtSaldo.setColumns(10);
		
		JButton btnDarAlta = new JButton("Dar Alta");
		btnDarAlta.setBounds(26, 144, 117, 25);
		contentPane.add(btnDarAlta);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(150, 145, 117, 25);
		contentPane.add(btnModificar);
		
		JButton btnDarBaja = new JButton("Dar Baja");
		btnDarBaja.setBounds(279, 144, 117, 25);
		contentPane.add(btnDarBaja);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(408, 144, 117, 25);
		contentPane.add(btnBuscar);
		
		JTextArea txtrImp = new JTextArea();
		txtrImp.setBounds(12, 181, 526, 172);
		contentPane.add(txtrImp);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 365, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(407, 365, 117, 25);
		contentPane.add(btnAyuda);
	}
}
