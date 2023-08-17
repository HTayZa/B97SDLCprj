package Sayargyi;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecSayargyi extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordfield;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SecSayargyi frame = new SecSayargyi();
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
	public SecSayargyi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Sayagyi Name?");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(58, 88, 109, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Sayargyis' Log In");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(173, 10, 140, 24);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JTextArea textuser = new JTextArea();
		textuser.setBounds(192, 86, 154, 24);
		contentPane.add(textuser);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sayagyi Password?");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(58, 131, 124, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("LogIn>>");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textuser.getText().equals("Sayargyi2.0")&&(passwordfield.getText().equals("12345"))) {
				JOptionPane.showInternalMessageDialog(null,"Congratulation!!! Sayargyi");
				
			}
			else if(!textuser.getText().equals("Sayargyi2.0")&&(passwordfield.getText().equals("12345"))) {
					JOptionPane.showInternalMessageDialog(null, "Invalid name-,-");
					textuser.setText("");
					
			}
			else if(!textuser.getText().equals("Sayargyi2.0")&&(!passwordfield.getText().equals("12345"))) {
				JOptionPane.showInternalMessageDialog(null, "Aren't Sayargyi?-,-");
				passwordfield.setText("");
				textuser.setText("");
				
		}
			
			
			}
			
		
		});
		btnNewButton.setBounds(264, 182, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("<<Back");
		btnNewButton_1.setBounds(264, 209, 85, 21);
		contentPane.add(btnNewButton_1);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(192, 132, 154, 24);
		contentPane.add(passwordfield);
		
		JButton btnNewButton_2 = new JButton("Create Acc?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrtSayargyi ca=new CrtSayargyi();
				ca.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(58, 182, 124, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Forgot Password?");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ForgSayargyi ca=new ForgSayargyi();
				ca.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton_2_1.setBounds(58, 209, 124, 21);
		contentPane.add(btnNewButton_2_1);
	}
}