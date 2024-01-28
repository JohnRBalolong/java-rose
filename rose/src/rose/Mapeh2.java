package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mapeh2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mapeh2 frame = new Mapeh2();
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
	public Mapeh2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(92, 60, 1253, 625);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(21, 23, 1198, 572);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mapeh");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(597, 23, 79, 35);
		panel_1.add(lblNewLabel);
		
		JLabel lblExamplesOfMusic = new JLabel("Examples of Music :");
		lblExamplesOfMusic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblExamplesOfMusic.setBounds(37, 78, 212, 35);
		panel_1.add(lblExamplesOfMusic);
		
		JLabel lblClassicalMusic = new JLabel("Classical Music");
		lblClassicalMusic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblClassicalMusic.setBounds(61, 123, 151, 35);
		panel_1.add(lblClassicalMusic);
		
		JLabel lblPopMusic = new JLabel("Pop Music:");
		lblPopMusic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPopMusic.setBounds(26, 151, 114, 35);
		panel_1.add(lblPopMusic);
		
		JLabel lblRockMusic = new JLabel("Rock Music:");
		lblRockMusic.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRockMusic.setBounds(26, 215, 114, 35);
		panel_1.add(lblRockMusic);
		
		JLabel lblJazz = new JLabel("Jazz:");
		lblJazz.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblJazz.setBounds(38, 306, 53, 35);
		panel_1.add(lblJazz);
		
		JLabel lblBlues = new JLabel("Blues:");
		lblBlues.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBlues.setBounds(21, 427, 58, 35);
		panel_1.add(lblBlues);
		
		JLabel lblNewLabel_1 = new JLabel("refers to a broad term that encompasses a long tradition of Western music that spans several centuries.");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(222, 123, 865, 35);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("short for popular music, is a genre that encompasses a broad and diverse range of music that is widely appealing to a large audience.\r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(94, 180, 1102, 35);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("is a genre of popular music that originated in the United States in the late 1940s and early 1950s.\r\n It has since evolved into a diverse ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(67, 248, 1102, 35);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("and influential style with numerous subgenres. ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(331, 279, 419, 35);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel(" is a musical genre that originated in the United States in the late 19th to early 20th century. It is characterized by its improvisational");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(72, 351, 1102, 35);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("and expressive nature, often featuring complex harmony, syncopated rhythms, and a wide range of instrumental techniques. ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(67, 382, 1059, 35);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel(" is a musical genre that originated in the African American communities of the southern United States in the late 19th century.");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1.setBounds(94, 427, 1102, 35);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Rooted in African musical traditions, work songs, and spirituals, the blues genre has had a profound influence on the ");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1_1_1.setBounds(86, 455, 962, 35);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("development of various other musical styles, including jazz, rock, and soul.");
		lblNewLabel_1_1_1_1_1_1_1.setBounds(89, 488, 630, 35);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapeh math=new mapeh();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.setBounds(33, 12, 85, 56);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mapeh3 math=new mapeh3();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\left-arrow.png"));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(1072, 472, 85, 66);
		panel_1.add(btnNewButton_1);
	}
}
