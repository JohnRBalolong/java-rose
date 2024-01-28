package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Firstpage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Firstpage frame = new Firstpage();
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
	public Firstpage() {
		setBackground(Color.BLACK);
	//	setIconImage(Toolkit.getDefaultToolkit().getImage(Firstpage.class.getResource("/eye/eye.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(36, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(46, 26, 741, 670);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_2.setBounds(33, 10, 659, 635);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(21, 28, 609, 579);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(69, 67, 45, 13);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\iloveu.jpg"));
		lblNewLabel_2.setBounds(-112, -31, 721, 600);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 500, 609, 79);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Firstpage.class.getResource("/book/415501366_1061767794881887_1262119374596891382_n.jpg")));
		lblNewLabel_3.setBounds(511, 108, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(788, 26, 679, 670);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.window);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_4.setBounds(28, 20, 625, 629);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_5.setBackground(Color.ORANGE);
		panel_5.setBounds(32, 141, 569, 478);
		panel_4.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Reader");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Homepage read =new Homepage();
			read.setVisible(true);
			dispose();
				}
		});
		
		btnNewButton.setBounds(277, 103, 187, 48);
		panel_5.add(btnNewButton);
		
		JButton btnAdmin = new JButton("Admin");
		btnAdmin.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		btnAdmin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminlogin ad=new adminlogin();
				ad.setVisible(true);
				dispose();
			}
		});
		btnAdmin.setBounds(277, 315, 187, 48);
		panel_5.add(btnAdmin);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBackground(new Color(255, 255, 255));
		lblNewLabel_6.setBorder(null);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\baho.png"));
		lblNewLabel_6.setBounds(92, 286, 99, 100);
		panel_5.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setIcon(new ImageIcon(Firstpage.class.getResource("/reader/reader(1).png")));
		lblNewLabel_6_1.setBounds(93, 57, 120, 120);
		panel_5.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Firstpage.class.getResource("/readme/412722362_3689088684704132_5393668054873303344_n.jpg")));
		lblNewLabel_5.setBounds(-16, 0, 641, 131);
		panel_4.add(lblNewLabel_5);
	}
}
