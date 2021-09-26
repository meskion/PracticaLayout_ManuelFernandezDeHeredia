package ejercicio1;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
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
	public FormularioPrincipal() {
		DialogClientes formulario = new DialogClientes();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 333, 166);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] {20};
		gbl_contentPane.rowHeights = new int[] {10};
		gbl_contentPane.columnWeights = new double[]{0.0};
		gbl_contentPane.rowWeights = new double[]{0.0};
		contentPane.setLayout(gbl_contentPane);
		
		
		
		JButton buttonAcceso = new JButton("Acceder al Formulario");
		buttonAcceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				formulario.setVisible(true);
			}
		});
		buttonAcceso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints buttonsCostraints = new GridBagConstraints();
		buttonsCostraints.fill = GridBagConstraints.VERTICAL;
		buttonsCostraints.gridx = 0;
		buttonsCostraints.gridy = 0;
		contentPane.add(buttonAcceso, buttonsCostraints);
	}

}
