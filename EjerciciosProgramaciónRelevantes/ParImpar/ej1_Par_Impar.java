package ParImpar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ej1_Par_Impar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ej1_Par_Impar frame = new ej1_Par_Impar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//Método
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

	/**
	 * Create the frame.
	 */
	public ej1_Par_Impar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbl_texto = new JLabel("New label");
		contentPane.add(lbl_texto);
		
		JButton btn_par_impar = new JButton("¿Par o Impar?");
		btn_par_impar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				int numero = Integer.parseInt(textField.getText());
				if(esPar(numero)) {
					lbl_texto.setText("Es par");
				}
				else lbl_texto.setText("Es impar");	
				}
				catch(Exception exc) {
					System.out.println("Formato de número incorrecto");
				}
			}
		});
		contentPane.add(btn_par_impar);
	}

}
