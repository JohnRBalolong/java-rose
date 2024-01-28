package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.sql.*;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;

public class adminlogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminlogin frame = new adminlogin();
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
	public adminlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new LineBorder(new Color(0, 0, 255), 2));
		panel.setBounds(833, 63, 597, 603);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_3.setBounds(33, 200, 534, 332);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel user = new JLabel("Username :");
		user.setFont(new Font("Tahoma", Font.BOLD, 18));
		user.setBounds(48, 75, 109, 20);
		panel_3.add(user);
		

		user.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Component pass = null;
					pass.requestFocus();
                }
		
            }
        });
		
		
		JLabel password = new JLabel("Password :");
		password.setFont(new Font("Tahoma", Font.BOLD, 18));
		password.setBounds(48, 179, 109, 20);
		panel_3.add(password);
		
		textField = new JTextField();
		textField.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		textField.setBounds(167, 70, 249, 37);
		panel_3.add(textField);
		textField.setColumns(10);
		
		pass = new JPasswordField();
		pass.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pass.setBounds(167, 174, 249, 37);
		panel_3.add(pass);
		
		JButton btnNewButton = new JButton("Log in");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		btnNewButton.setSelectedIcon(new ImageIcon(adminlogin.class.getResource("/login/login(1).jpg")));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					library database= new library();
					Connection con=database.getCon();
					
					String sql ="SELECT * FROM acc_log WHERE Username =? AND Password=?";
					try (PreparedStatement psmt=con.prepareStatement(sql)){
						psmt.setString(1, textField.getText());
						psmt.setString(2,pass.getText());
						try (ResultSet rs = psmt.executeQuery()){	
							if (rs.next()) {
								database.closecon();
								JOptionPane.showMessageDialog(btnNewButton, "Login Successfully");
								setVisible(false);
								new Addbooks().setVisible(true);
								
								}
							else {JOptionPane.showMessageDialog(btnNewButton, "Login Failed");}
						}
					}

				} catch (SQLException e2) {
					e2.printStackTrace();
				}

				
			}
			
		});

				
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(362, 267, 126, 37);
		panel_3.add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(177, 217, 159, 23);
		panel_3.add(chckbxNewCheckBox);
		
		JLabel user_1 = new JLabel("");
		user_1.setBorder(null);
		user_1.setBackground(new Color(255, 255, 255));
		user_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\padlock1.png"));
		user_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		user_1.setBounds(426, 174, 66, 37);
		panel_3.add(user_1);
		
		JLabel user_1_1 = new JLabel("");
		user_1_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\user(2)3.png"));
		user_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		user_1_1.setBorder(null);
		user_1_1.setBackground(Color.WHITE);
		user_1_1.setBounds(426, 70, 49, 37);
		panel_3.add(user_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(273, 43, 125, 108);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(adminlogin.class.getResource("/log/728843-200(1).png")));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstpage math=new Firstpage();
				  math.show();
				  dispose();
				
			}
		});
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton_1.setBounds(10, 10, 85, 55);
		panel.add(btnNewButton_1);
		chckbxNewCheckBox.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JCheckBox check = (JCheckBox) e.getSource();
            pass.setEchoChar(check.isSelected() ? '\u0000' : '•');
		}
	});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(104, 63, 719, 603);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setBounds(20, 10, 676, 583);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(adminlogin.class.getResource("/c/Book+Icon.jpg")));
		lblNewLabel_2.setBounds(24, 10, 666, 559);
		panel_2.add(lblNewLabel_2);
		
		setLocationRelativeTo(null);
	}
}
