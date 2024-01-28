package rose;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class history extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					history frame = new history();
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
	public history() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(169, 47, 1189, 691);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(29, 101, 46, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(10, 10, 1169, 651);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("History");
		lblNewLabel.setBounds(495, 27, 87, 25);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblHistoricalPeriodIn = new JLabel("Historical Period in the Philippines");
		lblHistoricalPeriodIn.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHistoricalPeriodIn.setBounds(8, 123, 358, 25);
		panel_1.add(lblHistoricalPeriodIn);
		
		JLabel lblPrecolonialPeriod = new JLabel("Pre-Colonial Period:");
		lblPrecolonialPeriod.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPrecolonialPeriod.setBounds(30, 158, 208, 25);
		panel_1.add(lblPrecolonialPeriod);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\"Barangay: Sixteenth-Century Philippine Culture and Society\" by William Henry Scott.");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(191, 193, 763, 25);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Sources :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(75, 193, 100, 25);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("\"Philippine History: Expanded and Updated\" by Teodoro A. Agoncillo and Fe B. Mangahas.\r\n");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1_1_1_1.setBounds(191, 228, 729, 17);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblSpanishColonialEra = new JLabel("Spanish Colonial Era (1521-1898):");
		lblSpanishColonialEra.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSpanishColonialEra.setBounds(26, 263, 333, 25);
		panel_1.add(lblSpanishColonialEra);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("\"The Philippines: A Unique Nation\" by Sonia M. Zaide.");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2.setBounds(174, 298, 636, 25);
		panel_1.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Sources :");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(91, 309, 87, 14);
		panel_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("\"A History of the Philippines\" by Renato Constantino.");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2_1.setBounds(174, 323, 441, 25);
		panel_1.add(lblNewLabel_1_1_1_1_2_1);
		
		JLabel lblPhilippineRevolution = new JLabel("Philippine Revolution (1896-1898):");
		lblPhilippineRevolution.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPhilippineRevolution.setBounds(31, 358, 342, 25);
		panel_1.add(lblPhilippineRevolution);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Sources :");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(49, 391, 89, 14);
		panel_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2_2 = new JLabel("\"The Philippine Revolution\" by Teodoro A. Agoncillo.");
		lblNewLabel_1_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2_2.setBounds(142, 390, 449, 17);
		panel_1.add(lblNewLabel_1_1_1_1_2_2);
		
		JLabel lblNewLabel_1_1_1_1_2_2_1 = new JLabel("The First Filipino: A Biography of Jose Rizal\" by Leon Ma. Guerrero.");
		lblNewLabel_1_1_1_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2_2_1.setBounds(154, 417, 586, 17);
		panel_1.add(lblNewLabel_1_1_1_1_2_2_1);
		
		JLabel lblAmericanColonialPeriod = new JLabel("American Colonial Period (1898-1946):");
		lblAmericanColonialPeriod.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAmericanColonialPeriod.setBounds(8, 468, 380, 25);
		panel_1.add(lblAmericanColonialPeriod);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Sources :");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(75, 523, 69, 14);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_2_2_2 = new JLabel("\"In Our Image: America's Empire in the Philippines\" by Stanley Karnow.");
		lblNewLabel_1_1_1_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2_2_2.setBounds(215, 512, 916, 25);
		panel_1.add(lblNewLabel_1_1_1_1_2_2_2);
		
		JLabel lblNewLabel_1_1_1_1_2_2_2_1 = new JLabel("The Philippines: Colonialism, Collaboration, and Resistance!\" by Renato Constantino.");
		lblNewLabel_1_1_1_1_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2_2_2_1.setBounds(215, 539, 763, 25);
		panel_1.add(lblNewLabel_1_1_1_1_2_2_2_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\left-arrow.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				history2 math=new history2();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setBounds(966, 558, 135, 69);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Spanish colonization, American rule, Japanese occupation, and the post-war era leading to the present. \r\n");
		lblNewLabel_1_1.setBounds(59, 96, 807, 17);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1 = new JLabel("The history of the Philippines is complex and spans thousands of years, encompassing various periods of  indigenous cultures,");
		lblNewLabel_1.setBounds(52, 69, 902, 17);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage math=new Homepage();
				  math.show();
				  dispose();
			}
		});
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton_1.setBounds(10, 10, 85, 60);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_4 = new JLabel("Music is an art form that involves the organized arrangement of sounds in a manner that is pleasant or meaningful to the listener. It encompasses a wide range of elements, including melody, harmony, rhythm, dynamics, and timbre. Here are some key aspects of music:\n\nMelody: A sequence of single pitches that are perceived as a single, cohesive entity. Melodies are often the \"tune\" or main musical idea in a piece.\n\nHarmony: The combination of different musical notes played or sung simultaneously to produce a pleasing sound. Harmony adds depth and richness to music.\n\nRhythm: The arrangement of sounds in time, creating patterns of duration and accentuation. Rhythm is a crucial element that gives music its sense of movement and pulse.\n\nDynamics: The variations in loudness and intensity within a musical piece. Dynamics add expressiveness and emotion to the music.");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setBounds(198, 541, 955, 297);
		panel.add(lblNewLabel_4);
	}
}