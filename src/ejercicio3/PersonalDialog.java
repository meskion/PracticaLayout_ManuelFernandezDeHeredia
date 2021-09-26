package ejercicio3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PersonalDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable usersTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PersonalDialog dialog = new PersonalDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PersonalDialog() {
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 415, 415);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			GridBagLayout gbl_contentPanel = new GridBagLayout();
			gbl_contentPanel.columnWidths = new int[]{437, 0};
			gbl_contentPanel.rowHeights = new int[]{162, 209, 0};
			gbl_contentPanel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
			gbl_contentPanel.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
			contentPanel.setLayout(gbl_contentPanel);
			usersTable = new JTable();
			usersTable.setFillsViewportHeight(true);
			usersTable.setBackground(Color.WHITE);
			usersTable.setCellSelectionEnabled(true);
			usersTable.setColumnSelectionAllowed(true);
			usersTable.setModel(new DefaultTableModel(
				new Object[][] {
					{"usuario", "Altura(m)", "Peso(kg)", "Edad"},
					{"Manu", "1.80", "70", "27"},
					{"lou", "1.57", "54", "21"},
					{"Wario", "1.30", "80", "40"},
					{"Mario", "1.40", "60", "35"},
					{"Luigi", "1.60", "60", "34"},
					{"Waluigi", "1.70", "50", "38"},
				},
				new String[] {
					"usuario", "Altura", "Peso", "Edad"
				}
			) {
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
			});
			usersTable.getColumnModel().getColumn(0).setResizable(false);
			usersTable.getColumnModel().getColumn(0).setPreferredWidth(55);
			usersTable.getColumnModel().getColumn(1).setResizable(false);
			usersTable.getColumnModel().getColumn(1).setPreferredWidth(57);
			usersTable.getColumnModel().getColumn(2).setResizable(false);
			usersTable.getColumnModel().getColumn(2).setPreferredWidth(48);
			usersTable.getColumnModel().getColumn(3).setResizable(false);
			usersTable.getColumnModel().getColumn(3).setPreferredWidth(30);
			{
				JPanel panel = new JPanel();
				GridBagConstraints gbc_panel = new GridBagConstraints();
				gbc_panel.anchor = GridBagConstraints.WEST;
				gbc_panel.insets = new Insets(0, 0, 5, 0);
				gbc_panel.fill = GridBagConstraints.VERTICAL;
				gbc_panel.gridx = 0;
				gbc_panel.gridy = 0;
				contentPanel.add(panel, gbc_panel);
				JLabel userNameLabel = new JLabel("Nombre: Manuel");
				userNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				JLabel userLabel = new JLabel("Usuario: Manu");
				userLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				JLabel userAdressLabel = new JLabel("direcci\u00F3n: plaza Roc\u00EDo 1");
				userAdressLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				JLabel userSurnameLabel = new JLabel("Apellidos: Fdez de Heredia");
				userSurnameLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				JLabel userEmailLabel = new JLabel("email: manufdh@hotmail.com");
				userEmailLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				JLabel userPhoneLabel = new JLabel("telefono: 677000111");
				userPhoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
				JLabel titleLabel = new JLabel("datos personales");
				titleLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
				
				JSeparator separator = new JSeparator();
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addContainerGap()
									.addComponent(separator, GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(29)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
										.addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_panel.createSequentialGroup()
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(userNameLabel, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
												.addComponent(userSurnameLabel, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
											.addGap(2)
											.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
												.addComponent(userEmailLabel, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
												.addComponent(userAdressLabel, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
												.addComponent(userPhoneLabel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))))))
							.addContainerGap())
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(titleLabel)
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(userNameLabel)
								.addComponent(userEmailLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(userSurnameLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(userAdressLabel))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(userLabel)
								.addComponent(userPhoneLabel))
							.addGap(90)
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE))
				);
				panel.setLayout(gl_panel);
			}
			GridBagConstraints gbc_usersTable = new GridBagConstraints();
			gbc_usersTable.fill = GridBagConstraints.BOTH;
			gbc_usersTable.gridx = 0;
			gbc_usersTable.gridy = 1;
			contentPanel.add(usersTable, gbc_usersTable);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JDialog current = this;
				JButton cancelButton = new JButton("Cerrar");
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
