package lab1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MenuLab1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuLab1 frame = new MenuLab1();
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
	public MenuLab1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArreglosDesordenados = new JLabel("Arreglos Desordenados");
		lblArreglosDesordenados.setHorizontalAlignment(SwingConstants.CENTER);
		lblArreglosDesordenados.setBounds(26, 113, 188, 26);
		contentPane.add(lblArreglosDesordenados);
		
		JLabel lblArreglosOrdenados = new JLabel("Arreglos Ordenados");
		lblArreglosOrdenados.setHorizontalAlignment(SwingConstants.CENTER);
		lblArreglosOrdenados.setBounds(322, 113, 188, 26);
		contentPane.add(lblArreglosOrdenados);
		
		JButton btnEscuela = new JButton("Escuela");
		btnEscuela.setBounds(56, 151, 117, 25);
		contentPane.add(btnEscuela);
		
		JButton btnEmpresa = new JButton("Empresa");
		btnEmpresa.setBounds(56, 197, 117, 25);
		contentPane.add(btnEmpresa);
		
		JButton btnPersonal = new JButton("Personal");
		btnPersonal.setBounds(56, 246, 117, 25);
		contentPane.add(btnPersonal);
		
		JButton btnCompa = new JButton("Compañia");
		btnCompa.setBounds(366, 151, 117, 25);
		contentPane.add(btnCompa);
		
		JButton btnInmoviliaria = new JButton("Inmoviliaria");
		btnInmoviliaria.setBounds(366, 197, 117, 25);
		contentPane.add(btnInmoviliaria);
		
		JButton btnVendedor = new JButton("Vendedor");
		btnVendedor.setBounds(366, 246, 117, 25);
		contentPane.add(btnVendedor);
	}
}
