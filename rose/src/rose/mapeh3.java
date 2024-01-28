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

public class mapeh3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapeh3 frame = new mapeh3();
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
	public mapeh3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(43, 32, 1358, 665);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(48, 36, 1272, 598);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Example of Arts :");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(24, 72, 168, 50);
		panel_1.add(lblNewLabel);
		
		JLabel lblVisualArts = new JLabel("Visual Arts:");
		lblVisualArts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblVisualArts.setBounds(24, 104, 117, 50);
		panel_1.add(lblVisualArts);
		
		JLabel lblReferToA = new JLabel("refer to a broad category of artistic expressions that primarily rely on visual elements, such as form, color, line, shape, texture, and space. \r\n");
		lblReferToA.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblReferToA.setBounds(141, 104, 1069, 50);
		panel_1.add(lblReferToA);
		
		JLabel lblPerformingArts = new JLabel("Performing Arts:");
		lblPerformingArts.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPerformingArts.setBounds(10, 150, 179, 50);
		panel_1.add(lblPerformingArts);
		
		JLabel lblReferToForms = new JLabel("refer to forms of art in which artists use their voices, bodies, or inanimate objects to convey artistic expression to an audience.");
		lblReferToForms.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblReferToForms.setBounds(170, 150, 1069, 50);
		panel_1.add(lblReferToForms);
		
		JLabel lblExampleOfPhysical = new JLabel("Example of Physical Education");
		lblExampleOfPhysical.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblExampleOfPhysical.setBounds(47, 222, 282, 50);
		panel_1.add(lblExampleOfPhysical);
		
		JLabel lblTeamSports = new JLabel("Team Sports:");
		lblTeamSports.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeamSports.setBounds(47, 262, 123, 50);
		panel_1.add(lblTeamSports);
		
		JLabel lblAreAthleticActivities = new JLabel("are athletic activities where players work together to achieve a common goal. ");
		lblAreAthleticActivities.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAreAthleticActivities.setBounds(170, 262, 606, 50);
		panel_1.add(lblAreAthleticActivities);
		
		JLabel lblIndividualSports = new JLabel("Individual Sports:");
		lblIndividualSports.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblIndividualSports.setBounds(21, 308, 168, 50);
		panel_1.add(lblIndividualSports);
		
		JLabel lblTeamSports_1_1 = new JLabel("Physical Health:");
		lblTeamSports_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeamSports_1_1.setBounds(24, 428, 168, 50);
		panel_1.add(lblTeamSports_1_1);
		
		JLabel lblAreAthleticActivities_1 = new JLabel("are athletic activities in which athletes compete on their own, rather than as part of a team. In these sports, the emphasis is on an individual's performance");
		lblAreAthleticActivities_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAreAthleticActivities_1.setBounds(34, 335, 1238, 50);
		panel_1.add(lblAreAthleticActivities_1);
		
		JLabel lblSkillsAndAchievements = new JLabel(" skills, and achievements");
		lblSkillsAndAchievements.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSkillsAndAchievements.setBounds(137, 368, 211, 50);
		panel_1.add(lblSkillsAndAchievements);
		
		JLabel lblTeamSports_1_1_1 = new JLabel("Mental Health:");
		lblTeamSports_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTeamSports_1_1_1.setBounds(24, 488, 168, 50);
		panel_1.add(lblTeamSports_1_1_1);
		
		JLabel lblExampleOfHealth = new JLabel("Example of Health :");
		lblExampleOfHealth.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblExampleOfHealth.setBounds(21, 395, 219, 50);
		panel_1.add(lblExampleOfHealth);
		
		JLabel lblRefersToThe = new JLabel("refers to the overall well-being and functioning of an individual's body. ");
		lblRefersToThe.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRefersToThe.setBounds(34, 455, 1069, 50);
		panel_1.add(lblRefersToThe);
		
		JLabel lblRefersToA = new JLabel(" refers to a person's emotional, psychological, and social well-being—the state of their mind and how they cope with the various stresses of life.");
		lblRefersToA.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRefersToA.setBounds(10, 515, 1089, 50);
		panel_1.add(lblRefersToA);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mapeh2 math=new Mapeh2();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.setBounds(32, 10, 85, 50);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage math=new Homepage();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\no1.png"));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(1177, 10, 85, 50);
		panel_1.add(btnNewButton_1);
	}
}
