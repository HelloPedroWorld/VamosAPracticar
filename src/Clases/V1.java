package Clases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class V1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField txtNumero;
	private JButton btnPotencia;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V1 frame = new V1();
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
	public V1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Nmerro");
		lblNewLabel.setBounds(22, 25, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(113, 22, 86, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		btnPotencia = new JButton("New button");
		btnPotencia.setBounds(255, 21, 89, 23);
		contentPane.add(btnPotencia);
		
		txtS = new JTextArea();
		txtS.setBounds(10, 80, 380, 136);
		contentPane.add(txtS);

	}
}
