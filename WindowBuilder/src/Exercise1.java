import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercise1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercise1 window = new Exercise1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercise1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 946, 624);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(39, 26, 346, 82);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField_1.setBounds(532, 26, 354, 82);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
					
					ans = num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				} catch(Exception e) {
					JOptionPane.showMessageDialog(null,  "Please enter a valid number.");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(74, 189, 164, 82);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Minus");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
				
					ans = num1-num2;
					textFieldAns.setText(Integer.toString(ans));
			} catch(Exception e1) {
				JOptionPane.showMessageDialog(null,  "Please enter a valid number.");
						
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.setBounds(272, 189, 164, 82);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textFieldAns.setBounds(403, 313, 309, 82);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The answer is");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(215, 312, 175, 82);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,ans;
				try {num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
				
					ans = num1*num2;
					textFieldAns.setText(Integer.toString(ans));
			}catch(Exception e2) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number.");
			}
				}
			});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.setBounds(477, 189, 154, 83);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1,num2,ans;
				try {num1 = Integer.parseInt(textField.getText());
					num2 = Integer.parseInt(textField_1.getText());
				
					ans = num1/num2;
					textFieldAns.setText(Integer.toString(ans));
			}catch(Exception e3) {
				JOptionPane.showMessageDialog(null, "Please enter a valid number.");
			}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_3.setBounds(674, 189, 164, 82);
		frame.getContentPane().add(btnNewButton_3);
	}
}
