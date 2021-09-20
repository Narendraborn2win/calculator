package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPanel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class calculator  {

	private JFrame frmCalculator;
	private JTextField textField;
	
	double first;
	double second;
	String operator;
	String answer;
    double result;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.getContentPane().setBackground(SystemColor.textHighlight);
		frmCalculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Narendra\\Desktop\\crown_icon.jpg"));
		frmCalculator.setBounds(100, 100, 450, 501);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		textField.setBounds(10, 27, 416, 66);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(255);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 114, 416, 340);
		frmCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(89, 0, 89, 330);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btn = new JButton("2");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn.getText();
				textField.setText(number);
				
			}
		});
		btn.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn.setBackground(SystemColor.activeCaption);
		btn.setBounds(10, 10, 69, 47);
		panel_2.add(btn);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBackground(SystemColor.activeCaption);
		btnNewButton_4.setBounds(10, 86, 69, 47);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5.getText();
				textField.setText(number);
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_5.setBackground(SystemColor.activeCaption);
		btnNewButton_5.setBounds(10, 163, 69, 47);
		panel_2.add(btnNewButton_5);
		
		JButton btnNewButton_10_1 = new JButton("CLR");
		btnNewButton_10_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButton_10_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_10_1.setBounds(10, 236, 69, 54);
		panel_2.add(btnNewButton_10_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(174, 0, 89, 330);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton_6 = new JButton("3");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_6.setBackground(SystemColor.activeCaption);
		btnNewButton_6.setBounds(10, 10, 69, 47);
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("6");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_7.getText();
				textField.setText(number);
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_7.setBackground(SystemColor.activeCaption);
		btnNewButton_7.setBounds(10, 87, 69, 47);
		panel_3.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_8.getText();
				textField.setText(number);
			}
		});
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_8.setBackground(SystemColor.activeCaption);
		btnNewButton_8.setBounds(10, 162, 69, 47);
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_10_2 = new JButton("=");
		btnNewButton_10_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operator=="+") {
					 result=first+second;
					answer=String.format("%2f", result);
				}
				else if(operator=="-") {
					result=first-second;
					answer=String.format("%2f", result);
				}
				else if(operator=="x") {
					result=first*second;
					answer=String.format("%2f", result);
				}
				else if(operator=="/") {
					result=first/second;
					answer=String.format("%2f", result);
				}
				textField.setText(answer);
			}
		});
		btnNewButton_10_2.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
		btnNewButton_10_2.setBounds(10, 238, 69, 54);
		panel_3.add(btnNewButton_10_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(262, 0, 127, 330);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton add_btn = new JButton("+");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator="+";
			}
		});
		add_btn.setFont(new Font("Tahoma", Font.BOLD, 26));
		add_btn.setBounds(10, 10, 107, 38);
		panel_4.add(add_btn);
		
		JButton mul_btn = new JButton("x");
		mul_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator="x";
			}
		});
		mul_btn.setFont(new Font("Tahoma", Font.BOLD, 26));
		mul_btn.setBounds(10, 83, 107, 38);
		panel_4.add(mul_btn);
		
		JButton div_btn = new JButton("/");
		div_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator="/";
			}
		});
		div_btn.setFont(new Font("Tahoma", Font.BOLD, 26));
		div_btn.setBounds(10, 159, 107, 38);
		panel_4.add(div_btn);
		
		JButton min_btn = new JButton("-");
		min_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText(" ");
				operator="-";
			}
		});
		min_btn.setFont(new Font("Tahoma", Font.BOLD, 26));
		min_btn.setBounds(10, 221, 107, 38);
		panel_4.add(min_btn);
		
		JButton decimal_btn = new JButton(".");
		decimal_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+decimal_btn.getText();
				textField.setText(number);
			}
		});
		decimal_btn.setBackground(SystemColor.inactiveCaption);
		decimal_btn.setFont(new Font("Sitka Subheading", Font.BOLD, 30));
		decimal_btn.setBounds(10, 282, 107, 38);
		panel_4.add(decimal_btn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(0, 0, 89, 330);
		panel.add(panel_1);
		
		JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn_1.getText();
				textField.setText(number);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn_1.setBackground(SystemColor.activeCaption);
		btn_1.setBounds(10, 10, 69, 47);
		panel_1.add(btn_1);
		
		JButton btnNewButton_1 = new JButton("4");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setBounds(10, 87, 69, 47);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_2.setBackground(SystemColor.activeCaption);
		btnNewButton_2.setBounds(10, 163, 69, 47);
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_10 = new JButton("Del");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			     String b = null;
			     if(textField.getText().length()>0) {
			    	 StringBuilder str=new StringBuilder(textField.getText());
			    	 str.deleteCharAt(textField.getText().length()-1);
			    	 b=str.toString();
			    	 textField.setText(b);
			     }
			     
			}
		});
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_10.setBounds(10, 236, 69, 54);
		panel_1.add(btnNewButton_10);
	}
}
