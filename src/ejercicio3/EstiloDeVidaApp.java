package ejercicio3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EstiloDeVidaApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstiloDeVidaApp frame = new EstiloDeVidaApp();
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
	public EstiloDeVidaApp() {
		JDialog login = new LoginDialog();
		JDialog personal = new PersonalDialog();
		JDialog menu = new MenuDialog();
		JDialog info = new EmpresaDialog();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 392);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JButton loginButton = new JButton("Iniciar Sesi\u00F3n");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login.setVisible(true);
			}
		});
		loginButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(loginButton);
		
		JButton personalButton = new JButton("Datos Personales");
		personalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personal.setVisible(true);
			}
		});
		personalButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(personalButton);
		
		JButton menuButton = new JButton("Menu");
		menuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
			}
		});
		menuButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(menuButton);
		
		JButton infoButton = new JButton("Informacion de la App");
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				info.setVisible(true);
			}
		});
		infoButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(infoButton);
	}

}
