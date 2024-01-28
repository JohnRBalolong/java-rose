package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class mapeh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapeh frame = new mapeh();
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
	public mapeh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(138, 64, 1199, 651);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(20, 10, 1149, 636);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\r\n\r\n\"MAPEH\" stands for Music, Arts, Physical Education, and Health. It is an acronym commonly used in the educational context, particularly in the Philippines ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(30, 94, 1129, 50);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("and some other countries. MAPEH refers to a set of subjects or disciplines that are often ntegrated into one curriculum.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(64, 136, 904, 50);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("MAPEH");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(546, 24, 92, 33);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblEachLetter = new JLabel("Each letter in MAPEH represents a specific subject area:");
		lblEachLetter.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEachLetter.setBounds(301, 176, 422, 50);
		panel_1.add(lblEachLetter);
		
		JLabel lblNewLabel_3 = new JLabel(" This subject typically includes the study of music theory, appreciation, history, and practical aspects such as playing musical instruments or singing.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(75, 215, 1064, 50);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Music");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(10, 224, 68, 33);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Arts");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(19, 271, 46, 33);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("This subject encompasses visual arts, including drawing, painting, sculpture, and other forms of artistic expression. It may also cover art history and ");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(75, 262, 1064, 50);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblAppreciation = new JLabel("appreciation.");
		lblAppreciation.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAppreciation.setBounds(84, 298, 106, 50);
		panel_1.add(lblAppreciation);
		
		JLabel lblNewLabel_2_3 = new JLabel("Physical Education (PE)");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_3.setBounds(9, 343, 202, 33);
		panel_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("is a formalized and structured educational process that involves the teaching and learning of physical activities and skills.");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(221, 334, 938, 50);
		panel_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("The primary objective of physical education is to promote the overall health and well-being of individuals through physical activity,exercise, and the");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(75, 376, 1064, 50);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblDevelopmentOfMotor = new JLabel("development of motor skills.");
		lblDevelopmentOfMotor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDevelopmentOfMotor.setBounds(87, 415, 218, 50);
		panel_1.add(lblDevelopmentOfMotor);
		
		JLabel lblNewLabel_2_4 = new JLabel("Health ");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_4.setBounds(20, 467, 58, 33);
		panel_1.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("is a state of complete physical, mental, and social well-being, and not merely the absence of disease or infirmity. This definition was provided ");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_1_1.setBounds(95, 458, 1064, 50);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("by the World Health Organization (WHO) and is widely accepted. It reflects a holistic understanding of health that goes beyond the absence of ");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1_1_1_1.setBounds(77, 500, 1037, 50);
		panel_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblIllnessAndEncompasses = new JLabel(" illness and encompasses various dimensions:");
		lblIllnessAndEncompasses.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIllnessAndEncompasses.setBounds(75, 542, 337, 50);
		panel_1.add(lblIllnessAndEncompasses);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage math=new Homepage();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.setBounds(30, 10, 85, 60);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Mapeh2 math=new Mapeh2();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\left-arrow.png"));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(1033, 560, 85, 60);
		panel_1.add(btnNewButton_1);
	}
}
