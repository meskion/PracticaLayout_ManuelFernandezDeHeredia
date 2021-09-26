package ejercicio1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.Box;
import java.awt.Insets;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class DialogClientes extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JButton EraseFieldButton;
	private JButton ConfirmSearchButton;
	private JTextField IdField;
	private JTextField direccionfield;
	private JTextField emailField;
	private JTextField telefonoField;
	private JTextField nombreField;
	private JTextField apellidosField;
	private JButton newFileButton;
	private JButton goBackButton;
	private JButton DeleteButton;
	private JButton saveButton;
	private JButton lastButton_1;
	private JButton previousButton;
	private JButton nextButton;
	private JButton lastButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogClientes dialog = new DialogClientes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DialogClientes() {
		setResizable(false);
		setBounds(100, 100, 390, 401);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(10);
		getContentPane().setLayout(borderLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);
		contentPanel.setLayout(new GridLayout(6, 2, 0, 0));
		{
			JPanel panelID = new JPanel();
			contentPanel.add(panelID);
			panelID.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
			{
				JLabel TagID = new JLabel("CLIENTE_ID");
				TagID.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelID.add(TagID);
			}
		}
		{
			JPanel panelIDField = new JPanel();
			contentPanel.add(panelIDField);
			panelIDField.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
			{
				IdField = new JTextField();
				IdField.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelIDField.add(IdField);
				IdField.setHorizontalAlignment(SwingConstants.RIGHT);
				IdField.setEditable(false);
				IdField.setText("5");
				IdField.setColumns(10);
			}
		}
		{
			JPanel panelNombre = new JPanel();
			FlowLayout fl_panelNombre = (FlowLayout) panelNombre.getLayout();
			contentPanel.add(panelNombre);
			{
				JLabel labelNombre = new JLabel("NOMBRE");
				labelNombre.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelNombre.add(labelNombre);
			}
		}
		{
			JPanel panelNombreField = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelNombreField.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			contentPanel.add(panelNombreField);
			{
				nombreField = new JTextField();
				nombreField.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelNombreField.add(nombreField);
				nombreField.setText("RICARDO");
				nombreField.setColumns(15);
			}
		}
		{
			JPanel panelApellidos = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelApellidos.getLayout();
			contentPanel.add(panelApellidos);
			{
				JLabel labelApellidos = new JLabel("APELLIDOS");
				labelApellidos.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelApellidos.add(labelApellidos);
			}
		}
		{
			JPanel panelApellidosField = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelApellidosField.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			contentPanel.add(panelApellidosField);
			{
				apellidosField = new JTextField();
				apellidosField.setFont(new Font("Tahoma", Font.PLAIN, 11));
				apellidosField.setText("MARTINEZ JUAREZ");
				apellidosField.setColumns(15);
				panelApellidosField.add(apellidosField);
			}
		}
		{
			JPanel panelDireccion = new JPanel();
			contentPanel.add(panelDireccion);
			{
				JLabel labelDireccion = new JLabel("DIRECCION");
				labelDireccion.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelDireccion.add(labelDireccion);
			}
		}
		{
			JPanel panelDireccionField = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelDireccionField.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			contentPanel.add(panelDireccionField);
			{
				direccionfield = new JTextField();
				direccionfield.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelDireccionField.add(direccionfield);
				direccionfield.setText("EJIDO NVO AMANECER");
				direccionfield.setColumns(15);
			}
		}
		{
			JPanel panelEmail = new JPanel();
			contentPanel.add(panelEmail);
			{
				JLabel labelEmail = new JLabel("EMAIL");
				labelEmail.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelEmail.add(labelEmail);
			}
		}
		{
			JPanel panelEmailfield = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelEmailfield.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			contentPanel.add(panelEmailfield);
			{
				emailField = new JTextField();
				emailField.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelEmailfield.add(emailField);
				emailField.setText("RICA8656@GMAIL.COM");
				emailField.setColumns(15);
			}
		}
		{
			JPanel panelTelefono = new JPanel();
			contentPanel.add(panelTelefono);
			{
				JLabel labelTelefono = new JLabel("TELEFONO");
				labelTelefono.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelTelefono.add(labelTelefono);
			}
		}
		{
			JPanel panelTelefonoField = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panelTelefonoField.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			contentPanel.add(panelTelefonoField);
			{
				telefonoField = new JTextField();
				telefonoField.setFont(new Font("Tahoma", Font.PLAIN, 11));
				panelTelefonoField.add(telefonoField);
				telefonoField.setText("(898)-254-3698");
				telefonoField.setColumns(15);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				newFileButton = new JButton("");
				newFileButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				newFileButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-new-copy-30.png"));
				newFileButton.setActionCommand("OK");
				getRootPane().setDefaultButton(newFileButton);
			}
			{
				goBackButton = new JButton("");
				goBackButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				goBackButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-back-arrow-30.png"));
				goBackButton.setActionCommand("OK");
			}
			{
				DeleteButton = new JButton("");
				DeleteButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				DeleteButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-delete-30.png"));
				DeleteButton.setActionCommand("OK");
			}
			{
				saveButton = new JButton("");
				saveButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				saveButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-save-30.png"));
				saveButton.setActionCommand("OK");
			}
			{
				lastButton_1 = new JButton("");
				lastButton_1.setBorder(new EmptyBorder(0, 0, 0, 0));
				lastButton_1.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-back-end-30.png"));
				lastButton_1.setActionCommand("OK");
			}
			{
				previousButton = new JButton("");
				previousButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				previousButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-back-30.png"));
				previousButton.setActionCommand("OK");
			}
			{
				nextButton = new JButton("");
				nextButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				nextButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-forward-30.png"));
				nextButton.setActionCommand("OK");
			}
			{
				lastButton = new JButton("");
				lastButton.setBorder(new EmptyBorder(0, 0, 0, 0));
				lastButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-end-30.png"));
				lastButton.setActionCommand("OK");
			}
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
			buttonPane.add(newFileButton);
			buttonPane.add(goBackButton);
			buttonPane.add(DeleteButton);
			buttonPane.add(saveButton);
			buttonPane.add(lastButton_1);
			buttonPane.add(previousButton);
			buttonPane.add(nextButton);
			buttonPane.add(lastButton);
		}
		{
			JPanel header = new JPanel();
			header.setBackground(new Color(173, 216, 230));
			getContentPane().add(header, BorderLayout.NORTH);
			header.setLayout(new GridLayout(0, 2, 0, 0));
			{
				JPanel headerLeft = new JPanel();
				headerLeft.setOpaque(false);
				FlowLayout fl_headerLeft = (FlowLayout) headerLeft.getLayout();
				fl_headerLeft.setHgap(10);
				fl_headerLeft.setAlignment(FlowLayout.LEFT);
				headerLeft.setBackground(SystemColor.inactiveCaption);
				header.add(headerLeft);
				{
					JLabel topIcon = new JLabel("");
					topIcon.setIcon(new ImageIcon(DialogClientes.class.getResource("/icons/full/message_info@2x.png")));
					topIcon.setHorizontalAlignment(SwingConstants.CENTER);
					headerLeft.add(topIcon);
				}
				{
					JLabel title = new JLabel("Clientes");
					title.setForeground(new Color(30, 144, 255));
					title.setFont(new Font("Tahoma", Font.BOLD, 23));
					headerLeft.add(title);
				}
			}
			{
				JPanel headerRight = new JPanel();
				headerRight.setOpaque(false);
				headerRight.setBackground(SystemColor.inactiveCaption);
				header.add(headerRight);
				headerRight.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 11));
				{
					JPanel searchContainer = new JPanel();
					headerRight.add(searchContainer);
					{
						textField = new JTextField();
						textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
						textField.setAlignmentX(Component.LEFT_ALIGNMENT);
						textField.setText("RICARDO");
						textField.setColumns(10);
					}
					{
						EraseFieldButton = new JButton("");
						EraseFieldButton.setOpaque(false);
						EraseFieldButton.setContentAreaFilled(false);
						EraseFieldButton.setIcon(new ImageIcon(DialogClientes.class.getResource("/org/eclipse/jface/fieldassist/images/error_ovr@2x.png")));
						EraseFieldButton.setPreferredSize(new Dimension(15, 15));
					}
					{
						ConfirmSearchButton = new JButton("");
						ConfirmSearchButton.setIcon(new ImageIcon("C:\\dev\\JavaWorkspace\\interfaceTest\\icons\\icons8-search-16.png"));
						ConfirmSearchButton.setBorder(new EmptyBorder(0, 0, 0, 0));
						ConfirmSearchButton.setContentAreaFilled(false);
						ConfirmSearchButton.setBackground(SystemColor.window);
					}
					searchContainer.setLayout(new BoxLayout(searchContainer, BoxLayout.X_AXIS));
					searchContainer.add(textField);
					searchContainer.add(EraseFieldButton);
					searchContainer.add(ConfirmSearchButton);
				}
			}
		}
	}

}
