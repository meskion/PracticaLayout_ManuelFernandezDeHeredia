package ejercicio3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTextPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmpresaDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private final JTextPane txtpnFitnessappEsUna = new JTextPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EmpresaDialog dialog = new EmpresaDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EmpresaDialog() {
		setResizable(false);
		txtpnFitnessappEsUna.setEditable(false);
		txtpnFitnessappEsUna.setText("FitnessApp es una aplicaci\u00F3n sin animo de lucro desarrollada en 2021\r\n\r\nVersion: 0.1\r\nDesarrollador: Manuel Fernandez de Heredia\r\nContacto: manufdh@hotmail.com\r\n");
		txtpnFitnessappEsUna.setBackground(SystemColor.menu);
		setTitle("About us");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EmpresaDialog.class.getResource("/org/eclipse/jface/fieldassist/images/info_ovr@2x.png")));
		setModal(true);
		setBounds(100, 100, 453, 191);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnFitnessappEsUna, GroupLayout.PREFERRED_SIZE, 392, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(24, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(5)
					.addComponent(txtpnFitnessappEsUna, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(115, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JDialog current = this;
				JButton cancelButton = new JButton("cerrar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					current.setVisible(false);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
