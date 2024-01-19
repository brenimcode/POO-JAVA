import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JToggleButton;

public class kkkk {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kkkk window = new kkkk();
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
	public kkkk() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 7));
		passwordField.setBounds(116, 118, 227, 31);
		frame.getContentPane().add(passwordField);
		
		JFormattedTextField frmtdtxtfldUsername = new JFormattedTextField();
		frmtdtxtfldUsername.setFont(new Font("JetBrains Mono Light", Font.PLAIN, 7));
		frmtdtxtfldUsername.setBounds(116, 80, 227, 31);
		frame.getContentPane().add(frmtdtxtfldUsername);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("JetBrains Mono Light", Font.BOLD, 16));
		btnNewButton.setBounds(170, 191, 146, 31);
		frame.getContentPane().add(btnNewButton);
		
	}
}
