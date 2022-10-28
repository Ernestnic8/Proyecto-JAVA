package base;

import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLaboratorio = new JButton("Laboratorio 1");
		btnLaboratorio.setBounds(34, 110, 144, 25);
		contentPane.add(btnLaboratorio);
		
		JButton btnLab2 = new JButton("Laboratorio 2");
		btnLab2.setBounds(317, 110, 144, 25);
		contentPane.add(btnLab2);
		
		JButton btnLab3 = new JButton("Laboratorio 3");
		btnLab3.setBounds(34, 158, 144, 25);
		contentPane.add(btnLab3);
		
		JButton btnLab4 = new JButton("Laboratorio 4");
		btnLab4.setBounds(317, 158, 144, 25);
		contentPane.add(btnLab4);
		
		JButton btnLab5 = new JButton("Laboratorio 5");
		btnLab5.setBounds(34, 212, 144, 25);
		contentPane.add(btnLab5);
		
		JButton btnLab6 = new JButton("Laboratorio 6");
		btnLab6.setBounds(317, 212, 144, 25);
		contentPane.add(btnLab6);
	}
}
