package ejercicio3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import java.awt.GridLayout;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			MenuDialog dialog = new MenuDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MenuDialog() {
		setModal(true);
		setBounds(100, 100, 583, 235);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(SystemColor.window);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(2, 7, 0, 0));
		{
			JLabel mondayLabel = new JLabel("lunes");
			mondayLabel.setBackground(SystemColor.activeCaption);
			mondayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			mondayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			mondayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(mondayLabel);
		}
		{
			JLabel tuesdayLabel = new JLabel("Martes");
			tuesdayLabel.setBackground(SystemColor.activeCaption);
			tuesdayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			tuesdayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			tuesdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(tuesdayLabel);
		}
		{
			JLabel wednesdayLabel = new JLabel("Miercoles");
			wednesdayLabel.setBackground(SystemColor.activeCaption);
			wednesdayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			wednesdayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			wednesdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(wednesdayLabel);
		}
		{
			JLabel thursdayLabel = new JLabel("Jueves");
			thursdayLabel.setBackground(SystemColor.activeCaption);
			thursdayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			thursdayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			thursdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(thursdayLabel);
		}
		{
			JLabel fridayLabel = new JLabel("Viernes");
			fridayLabel.setBackground(SystemColor.activeCaption);
			fridayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			fridayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			fridayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(fridayLabel);
		}
		{
			JLabel saturdayLabel = new JLabel("Sabado");
			saturdayLabel.setBackground(SystemColor.activeCaption);
			saturdayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			saturdayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			saturdayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(saturdayLabel);
		}
		{
			JLabel sundayLabel = new JLabel("Domingo");
			sundayLabel.setBackground(SystemColor.activeCaption);
			sundayLabel.setHorizontalAlignment(SwingConstants.CENTER);
			sundayLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
			sundayLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(sundayLabel);
		}
		{
			JLabel mondayMenu = new JLabel("Lentejas!");
			mondayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			mondayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			mondayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(mondayMenu);
		}
		{
			JLabel tuesdayMenu = new JLabel("Guisantes!");
			tuesdayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			tuesdayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			tuesdayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(tuesdayMenu);
		}
		{
			JLabel wednesdayMenu = new JLabel("Lenguado");
			wednesdayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			wednesdayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			wednesdayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(wednesdayMenu);
		}
		{
			JLabel thursdayMenu = new JLabel("pollo!");
			thursdayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			thursdayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			thursdayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(thursdayMenu);
		}
		{
			JLabel fridayMenu = new JLabel("Arroz!");
			fridayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			fridayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			fridayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(fridayMenu);
		}
		{
			JLabel saturdayMenu = new JLabel("Espinacas!");
			saturdayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			saturdayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			saturdayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(saturdayMenu);
		}
		{
			JLabel sundayMenu = new JLabel("Menestra..");
			sundayMenu.setHorizontalAlignment(SwingConstants.CENTER);
			sundayMenu.setBorder(new LineBorder(new Color(0, 0, 0)));
			sundayMenu.setFont(new Font("Tahoma", Font.PLAIN, 15));
			contentPanel.add(sundayMenu);
		}
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
		{
			JPanel panel = new JPanel();
			FlowLayout flowLayout = (FlowLayout) panel.getLayout();
			flowLayout.setAlignment(FlowLayout.LEFT);
			getContentPane().add(panel, BorderLayout.NORTH);
			{
				JLabel lblNewLabel = new JLabel("Menu de la semana(para tener una vida sana!)  ");
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
				panel.add(lblNewLabel);
			}
		}
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
