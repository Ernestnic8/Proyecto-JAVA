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

public class Personal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNom;
	private JTextField txtEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personal frame = new Personal();
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
	public Personal() {
		setTitle("Departamento de Personal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(26, 12, 83, 20);
		contentPane.add(lblNombre);
		
		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(26, 44, 83, 20);
		contentPane.add(lblSexo);
		
		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setBounds(26, 76, 83, 20);
		contentPane.add(lblEdad);
		
		txtNom = new JTextField();
		txtNom.setBounds(105, 13, 114, 19);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		JComboBox cbSexo = new JComboBox();
		cbSexo.setBounds(105, 42, 114, 22);
		contentPane.add(cbSexo);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(105, 77, 114, 19);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
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
		btnBuscar.setBounds(407, 108, 117, 25);
		contentPane.add(btnBuscar);
		
		JTextArea txtrImp = new JTextArea();
		txtrImp.setBounds(12, 142, 512, 211);
		contentPane.add(txtrImp);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(12, 365, 117, 25);
		contentPane.add(btnRegresar);
		
		JButton btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(421, 365, 117, 25);
		contentPane.add(btnAyuda);
	}
}
