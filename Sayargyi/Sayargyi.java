package Sayargyi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sayargyi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sayargyi frame = new Sayargyi();
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
	public Sayargyi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Sayargyi");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(179, 10, 77, 26);
		lblNewLabel.setFont(new Font("Sitka Subheading", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnSayargyi = new JRadioButton("Are you Sayargyi?");
		rdbtnSayargyi.setBackground(new Color(0, 0, 0));
		rdbtnSayargyi.setForeground(new Color(255, 255, 255));
		rdbtnSayargyi.setFont(new Font("Microsoft JhengHei UI Light", Font.BOLD, 12));
		rdbtnSayargyi.setBounds(153, 129, 181, 49);
		contentPane.add(rdbtnSayargyi);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "You are ‌စောက်ပေါ!!");
				SecSayargyi ca=new SecSayargyi();
				ca.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(311, 208, 85, 21);
		contentPane.add(btnNewButton);
	}

}
