package SimpleInterest;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField principal;
	private JTextField time;
	private JTextField rate;
	private JTextField SimpleInterest;
	private JTextField Amount;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setBackground(new Color(255, 235, 205));
		setTitle("Simple Interest Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 848, 597);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter P");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(39, 42, 106, 50);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterT = new JLabel("Enter T");
		lblEnterT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnterT.setBounds(39, 114, 106, 50);
		contentPane.add(lblEnterT);
		
		JLabel lblEnterR = new JLabel("Enter R");
		lblEnterR.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblEnterR.setBounds(39, 174, 106, 50);
		contentPane.add(lblEnterR);
		
		principal = new JTextField();
		principal.setBounds(123, 52, 119, 38);
		contentPane.add(principal);
		principal.setColumns(10);
		
		time = new JTextField();
		time.setColumns(10);
		time.setBounds(123, 124, 119, 38);
		contentPane.add(time);
		
		rate = new JTextField();
		rate.setColumns(10);
		rate.setBounds(123, 193, 119, 38);
		contentPane.add(rate);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				String pr = principal.getText();
				int p = Integer.parseInt(pr);
				String ti = time.getText();
				int t = Integer.parseInt(ti);
				String ra = rate.getText();
				int r = Integer.parseInt(ra);
	
				double si = ((p * t * r)/100.0);
				double a = (p + si);
				
				SimpleInterest.setText(String.valueOf(si));
				Amount.setText(String.valueOf(a));
				
//				SimpleInterest.setText(Integer.toString(si));
//				Amount.setText(Integer.toString(a));
			}catch (NumberFormatException ex) {
				SimpleInterest.setText("Invalid input");
				Amount.setText("Invalid input");
			}

			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(73, 260, 119, 38);
		contentPane.add(btnNewButton);
		
		SimpleInterest = new JTextField();
		SimpleInterest.setBounds(146, 329, 128, 30);
//		-----------------------------------------------------------
		SimpleInterest.setEditable(false);
		contentPane.add(SimpleInterest);
		SimpleInterest.setColumns(10);
		
		Amount = new JTextField();
		Amount.setBounds(146, 380, 128, 30);
//	----------------------------------------------	
		Amount.setEditable(false);
		contentPane.add(Amount);
		Amount.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Simple Interest");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(37, 331, 108, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Amount");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(39, 382, 108, 22);
		contentPane.add(lblNewLabel_1_1);
	}
}
