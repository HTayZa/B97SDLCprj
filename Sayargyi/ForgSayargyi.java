package Sayargyi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgSayargyi extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ForgSayargyi frame = new ForgSayargyi();
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
	public ForgSayargyi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnfin = new JButton("");
		btnfin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				CrtSayargyi ca=new CrtSayargyi();
				ca.setVisible(true);
				dispose();
				
			}
		});
		btnfin.setIcon(new ImageIcon("F:\\For KNA\\download.png"));
		btnfin.setBounds(10, 10, 416, 243);
		contentPane.add(btnfin);
	}

}
