package ejercicio2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculadora extends JDialog {

	private final JPanel digitsPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Calculadora dialog = new Calculadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Calculadora() {
		setBounds(100, 100, 387, 384);
		BorderLayout borderLayout = new BorderLayout();
		borderLayout.setVgap(5);
		borderLayout.setHgap(5);
		getContentPane().setLayout(borderLayout);
		digitsPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(digitsPanel, BorderLayout.CENTER);
		digitsPanel.setLayout(new GridLayout(4, 3, 0, 0));
		{
			JButton nineButton = new JButton("9");
			nineButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(nineButton);
		}
		{
			JButton eightButton = new JButton("8");
			eightButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(eightButton);
		}
		{
			JButton sevenButton = new JButton("7");
			sevenButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(sevenButton);
		}
		{
			JButton sixButton = new JButton("6");
			sixButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(sixButton);
		}
		{
			JButton fiveButton = new JButton("5");
			fiveButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(fiveButton);
		}
		{
			JButton fourButton = new JButton("4");
			fourButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(fourButton);
		}
		{
			JButton threeButton = new JButton("3");
			threeButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(threeButton);
		}
		{
			JButton twoButton = new JButton("2");
			twoButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(twoButton);
		}
		{
			JButton oneButton = new JButton("1");
			oneButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(oneButton);
		}
		{
			JButton zeroButton = new JButton("0");
			zeroButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
			digitsPanel.add(zeroButton);
		}
		{
			JButton dotButton = new JButton(".");
			dotButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
			digitsPanel.add(dotButton);
		}
		{
			JPanel operationsPanel = new JPanel();
			getContentPane().add(operationsPanel, BorderLayout.EAST);
			operationsPanel.setLayout(new GridLayout(6, 0, 0, 0));
			{
				JButton plusButton = new JButton("+");
				plusButton.setForeground(Color.RED);
				plusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				operationsPanel.add(plusButton);
			}
			{
				JButton minusButton = new JButton("-");
				minusButton.setForeground(Color.RED);
				minusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				operationsPanel.add(minusButton);
			}
			{
				JButton productButton = new JButton("*");
				productButton.setForeground(Color.RED);
				productButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				operationsPanel.add(productButton);
			}
			{
				JButton CocientButton = new JButton("/");
				CocientButton.setForeground(Color.RED);
				CocientButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				operationsPanel.add(CocientButton);
			}
			{
				JButton equalsButton = new JButton("=");
				equalsButton.setForeground(Color.RED);
				equalsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				operationsPanel.add(equalsButton);
			}
			{
				JButton CEButton = new JButton("CE");
				CEButton.setForeground(Color.RED);
				CEButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				operationsPanel.add(CEButton);
			}
		}
		{
			JPanel resultPanel = new JPanel();
			getContentPane().add(resultPanel, BorderLayout.NORTH);
			resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.X_AXIS));
			{
				textField = new JTextField();
				textField.setHorizontalAlignment(SwingConstants.RIGHT);
				textField.setText("16.0");
				textField.setFont(new Font("Tahoma", Font.PLAIN, 28));
				resultPanel.add(textField);
				textField.setColumns(10);
			}
		}
	}

}
