package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.Transito;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela frame = new Tela();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Tela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCar1 = new JLabel("C1");
		lblCar1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCar1.setBackground(Color.RED);
		lblCar1.setBounds(175, 52, 32, 45);
		lblCar1.setOpaque(true);
		contentPane.add(lblCar1);
		
		JLabel lblCar2 = new JLabel("C2");
		lblCar2.setOpaque(true);
		lblCar2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCar2.setBackground(Color.YELLOW);
		lblCar2.setBounds(211, 187, 32, 45);
		contentPane.add(lblCar2);
		
		JLabel lblCar3 = new JLabel("C3");
		lblCar3.setOpaque(true);
		lblCar3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCar3.setBackground(Color.GREEN);
		lblCar3.setBounds(112, 106, 45, 32);
		contentPane.add(lblCar3);
		
		JLabel lblCar4 = new JLabel("C4");
		lblCar4.setOpaque(true);
		lblCar4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCar4.setBackground(Color.CYAN);
		lblCar4.setBounds(255, 147, 45, 32);
		contentPane.add(lblCar4);
		
		Transito transito = new Transito(lblCar1, lblCar2, lblCar3, lblCar4);
		transito.invocaCarros();
	}
}
