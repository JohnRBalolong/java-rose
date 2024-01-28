package rose;

import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

import rose.Firstpage;

import java.awt.SystemColor;

public class Homepage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_3;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setDoubleBuffered(false);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(27, 0, 1521, 758);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 291, 801);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\71s+0YxWL020.jpg"));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(351, 201, 215, 227);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Educsp math=new Educsp();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\kani.jpg"));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(692, 201, 215, 227);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\science2.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Science1 math=new Science1 ();
				  math.show();
				  dispose();
			}
		});
		btnNewButton_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setBounds(997, 224, 215, 199);
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\english.jpg2.jpg"));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				English math=new English();
				  math.show();
				  dispose();
			}
		});
		btnNewButton_1_1.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_1.setOpaque(false);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.WHITE);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setBounds(321, 521, 215, 227);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				history math=new history();
				  math.show();
				  dispose();
			}
		});
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\huhu.jpg"));
		btnNewButton_1_2.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_2.setOpaque(false);
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_2.setBorder(null);
		btnNewButton_1_2.setBackground(Color.WHITE);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setBounds(671, 496, 215, 227);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapeh math=new mapeh();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\haha.jpg"));
		btnNewButton_1_3.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_3.setOpaque(false);
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_3.setBorder(null);
		btnNewButton_1_3.setBackground(Color.WHITE);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.setBounds(997, 524, 215, 212);
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Math math=new Math();
				  math.show();
				  dispose();
			}
		});
		btnNewButton_1_4.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\math2.jpg"));
		btnNewButton_1_4.setVerticalAlignment(SwingConstants.TOP);
		btnNewButton_1_4.setOpaque(false);
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_4.setBorder(null);
		btnNewButton_1_4.setBackground(Color.WHITE);
		panel.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(1224, 21, 297, 792);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\71s+0YxWL020.jpg"));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\11518620(1).jpg"));
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_9.setBounds(278, 184, 975, 273);
		panel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\11518620(1).jpg"));
		lblNewLabel_10.setBounds(278, 479, 950, 269);
		panel.add(lblNewLabel_10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBorder(null);
		lblNewLabel_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\Screenshot 2024-01-22 at 19-49-40 Fiverr Logo Maker1.png"));
		lblNewLabel_3.setBounds(692, 21, 187, 116);
		panel.add(lblNewLabel_3);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(1143, 13, 85, 57);
		panel.add(btnNewButton_3);
		btnNewButton_3.setOpaque(false);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
				
			        // Your program logic goes here...

			        int userChoice = JOptionPane.showConfirmDialog(null, "Do you want to exit the program?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

			        if (userChoice == JOptionPane.YES_OPTION) {
			            // User chose 'Yes,' exit the program
			        	setVisible(false);	
						new Firstpage().setVisible(true);

			        } else {
			            // User chose 'No,' continue with the program
			            System.out.println("Program continues...");
			        }
			    }
			
			
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\exit1.png"));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(278, 13, 90, 53);
		panel.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Firstpage math=new Firstpage();
				  math.show();
				  dispose();
				
			}
		});
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		
		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(605, 10, 336, 140);
		panel.add(panel_1);
		panel_1.setLayout(null);
	}
}
