package ParImpar;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ej2_miniCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField_num1;
	private JTextField textField_num2;
	private String resultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej2_miniCalculadora frame = new ej2_miniCalculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	//Métodos:
	
	public void suma() {
		double n1=Double.parseDouble(textField_num1.getText());
		double n2=Double.parseDouble(textField_num2.getText());
		double r=n1+n2;
		resultado="Resultado: " + r;
	}
	public void resta() {
		double n1=Double.parseDouble(textField_num1.getText());
		double n2=Double.parseDouble(textField_num2.getText());
		double r=n1-n2;
		resultado="Resultado: " + r;
	}
	public void division() {
		try{
		double n1=Double.parseDouble(textField_num1.getText());
		double n2=Double.parseDouble(textField_num2.getText());
		double r=n1/n2;
		resultado="Resultado: " + r;
		}
		catch(Exception exce) {
			System.err.println("error:"+exce.getMessage());
		}
	}
	public void multiplicacion() {
		double n1=Double.parseDouble(textField_num1.getText());
		double n2=Double.parseDouble(textField_num2.getText());
		double r=n1*n2;
		resultado="Resultado: " + r;
	}
	/**
	 * Create the frame.
	 */
	public ej2_miniCalculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(new GridLayout(5,1));

		setContentPane(contentPane);
		
		textField_num1 = new JTextField();
		contentPane.add(textField_num1);
		textField_num1.setColumns(10);
		
		textField_num2 = new JTextField();
		contentPane.add(textField_num2);
		textField_num2.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		contentPane.add(lblResultado);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				suma();
				lblResultado.setText(resultado);
			}
		});
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resta();
				lblResultado.setText(resultado);
			}
		});
		contentPane.add(btnResta);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				multiplicacion();
				lblResultado.setText(resultado);
			}
		});
		contentPane.add(btnMulti);
		
		JButton btnDivi = new JButton("/");
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				division();
				lblResultado.setText(resultado);
			}
		});
		contentPane.add(btnDivi);	
		
	}

}
