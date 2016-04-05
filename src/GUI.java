import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class GUI {
	static RandomAlphaNum ran;
	static Num num;
	static PrintAllNum allNum;

	private JFrame frmPasswords;
	private JTextField numOfDigits;
	private JTextField ranDigits;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frmPasswords.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswords = new JFrame();
		frmPasswords.setTitle("Passwords...");
		frmPasswords.setBounds(100, 100, 1036, 528);
		frmPasswords.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswords.getContentPane().setLayout(null);
		
		
		
		
		
		JButton btn1 = new JButton("Random 4 dgit #");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = new Num();
				
				JOptionPane.showMessageDialog(null, num.toString(), "Your Password", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		ranDigits = new JTextField();
		ranDigits.setToolTipText("Number of digits?");
		ranDigits.setText("4");
		ranDigits.setHorizontalAlignment(SwingConstants.CENTER);
		ranDigits.setForeground(Color.YELLOW);
		ranDigits.setColumns(10);
		ranDigits.setBackground(Color.RED);
		ranDigits.setBounds(756, 456, 236, 22);
		frmPasswords.getContentPane().add(ranDigits);
		
		numOfDigits = new JTextField();
		numOfDigits.setHorizontalAlignment(SwingConstants.CENTER);
		numOfDigits.setForeground(Color.YELLOW);
		numOfDigits.setBackground(Color.RED);
		numOfDigits.setText("4");
		numOfDigits.setToolTipText("Number of digits?");
		numOfDigits.setBounds(10, 456, 213, 22);
		frmPasswords.getContentPane().add(numOfDigits);
		numOfDigits.setColumns(10);
		btn1.setForeground(Color.MAGENTA);
		btn1.setBackground(Color.CYAN);
		btn1.setBounds(10, 63, 193, 158);
		frmPasswords.getContentPane().add(btn1);
		
		JLabel lblL = new JLabel("Click which type of password you want!");
		lblL.setBackground(Color.CYAN);
		lblL.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblL.setHorizontalAlignment(SwingConstants.CENTER);
		lblL.setForeground(Color.MAGENTA);
		lblL.setBounds(10, 11, 1000, 41);
		frmPasswords.getContentPane().add(lblL);
		
		JButton btn2 = new JButton("Random______digit #");
		btn2.setForeground(Color.MAGENTA);
		btn2.setBackground(Color.CYAN);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int y = Integer.parseInt(numOfDigits.getText());
				num = new Num(y);
				JOptionPane.showMessageDialog(null, num.toString(), "Your Password", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btn2.setBounds(10, 275, 213, 181);
		frmPasswords.getContentPane().add(btn2);
		
		JButton btnRandomDgit = new JButton("Random 13 dgit AlphaNumChar");
		btnRandomDgit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ran = new RandomAlphaNum();
				JOptionPane.showMessageDialog(null, ran.toString(), "Your Password", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnRandomDgit.setForeground(Color.MAGENTA);
		btnRandomDgit.setBackground(Color.CYAN);
		btnRandomDgit.setBounds(762, 63, 236, 165);
		frmPasswords.getContentPane().add(btnRandomDgit);
		
		JButton btnRandomdigitAlphanumchar = new JButton("Random______digit AlphaNumChar");
		btnRandomdigitAlphanumchar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(ranDigits.getText());
				ran = new RandomAlphaNum(x);
				JOptionPane.showMessageDialog(null, ran.toString(), "Your Password", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnRandomdigitAlphanumchar.setForeground(Color.MAGENTA);
		btnRandomdigitAlphanumchar.setBackground(Color.CYAN);
		btnRandomdigitAlphanumchar.setBounds(756, 275, 236, 181);
		frmPasswords.getContentPane().add(btnRandomdigitAlphanumchar);
		
		JButton btnAllDigits = new JButton("All Digits 0000 - 9999");
		btnAllDigits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				allNum = new PrintAllNum();
				JOptionPane.showMessageDialog(null, allNum.toString(), "Your Password", JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		btnAllDigits.setForeground(Color.MAGENTA);
		btnAllDigits.setBackground(Color.CYAN);
		btnAllDigits.setBounds(389, 63, 193, 158);
		frmPasswords.getContentPane().add(btnAllDigits);
	}
}
