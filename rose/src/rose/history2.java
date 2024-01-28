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

public class history2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					history2 frame = new history2();
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
	public history2() {
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
		panel.setBounds(218, 10, 1202, 737);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(10, 35, 1169, 651);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("History");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(527, 10, 70, 50);
		panel_1.add(lblNewLabel);
		
		JLabel lblJapaneseOccupation = new JLabel("Japanese Occupation (1942-1945):");
		lblJapaneseOccupation.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblJapaneseOccupation.setBounds(25, 84, 352, 27);
		panel_1.add(lblJapaneseOccupation);
		
		JLabel lblNewLabel_1 = new JLabel("\"Dusk: A Novel\" by F. Sionil Jose (provides insights into the Japanese occupation).");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(214, 121, 669, 32);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblSources = new JLabel("sources :");
		lblSources.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSources.setBounds(134, 137, 70, 19);
		panel_1.add(lblSources);
		
		JLabel lblNewLabel_1_1 = new JLabel("\"The Japanese Occupation of the Philippines: A Pictorial History\" by Benito J. Legarda Jr.");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(202, 162, 772, 31);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblPostwarIndependenceAnd = new JLabel("Post-War Independence and Contemporary Period:");
		lblPostwarIndependenceAnd.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPostwarIndependenceAnd.setBounds(10, 203, 391, 27);
		panel_1.add(lblPostwarIndependenceAnd);
		
		JLabel lblNewLabel_1_2 = new JLabel("\"The Philippine Revolution: The Making of a Nation\" by Teodoro A. Agoncillo.");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(214, 240, 743, 21);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblSources_1 = new JLabel("sources :");
		lblSources_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSources_1.setBounds(134, 242, 70, 19);
		panel_1.add(lblSources_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("A History of the Philippines\" by Luis H. Francia.");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(214, 271, 405, 21);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblPeoplePowerRevolution = new JLabel("People Power Revolution (1986):");
		lblPeoplePowerRevolution.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblPeoplePowerRevolution.setBounds(25, 318, 253, 27);
		panel_1.add(lblPeoplePowerRevolution);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("\"The Power of the People: The Philippine Revolution of 1986\" by Affonso Niehues.");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2.setBounds(182, 373, 663, 21);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblSources_1_1 = new JLabel("sources :");
		lblSources_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSources_1_1.setBounds(107, 355, 70, 19);
		panel_1.add(lblSources_1_1);
		
		JLabel lblContemporaryIssuesSources = new JLabel("Contemporary Issues:\r\n\r\n");
		lblContemporaryIssuesSources.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblContemporaryIssuesSources.setBounds(26, 415, 253, 27);
		panel_1.add(lblContemporaryIssuesSources);
		
		JLabel lblSources_1_1_1 = new JLabel("sources :");
		lblSources_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSources_1_1_1.setBounds(119, 464, 70, 19);
		panel_1.add(lblSources_1_1_1);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("This Time of Writing\" by Carlos P. Romulo (reflections on contemporary Philippines.");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_1.setBounds(202, 484, 643, 21);
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Online news sources for up-to-date information on current events.");
		lblNewLabel_1_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_1_1.setBounds(202, 515, 681, 21);
		panel_1.add(lblNewLabel_1_2_2_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				history math=new history();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.setBounds(27, 10, 85, 50);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage math=new Homepage();
				  math.show();
				  dispose();
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\no1.png"));
		btnNewButton_1.setBounds(1074, 10, 85, 49);
		panel_1.add(btnNewButton_1);
	}

}