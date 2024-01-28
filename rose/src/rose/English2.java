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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class English2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					English2 frame = new English2();
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
	public English2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(102, 30, 1320, 678);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 5, 1287, 663);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Definition of Creative Writing - is a form of expression that goes beyond conveying information or facts. It involves using imagination,");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(100, 67, 1014, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblOri = new JLabel("originality, and artistic language to produce works such as fiction, poetry, plays, or non-fiction narratives.");
		lblOri.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOri.setBounds(290, 91, 755, 29);
		panel_1.add(lblOri);
		
		JLabel lblTheGoalOf = new JLabel("The goal of creative writing is often to entertain, evoke emotion, or convey a unique perspective, allowing");
		lblTheGoalOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTheGoalOf.setBounds(290, 119, 798, 29);
		panel_1.add(lblTheGoalOf);
		
		JLabel lblWritersToExplore = new JLabel("writers to explore and communicate ideas in inventive and imaginative ways. ");
		lblWritersToExplore.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWritersToExplore.setBounds(334, 143, 576, 29);
		panel_1.add(lblWritersToExplore);
		
		JLabel lblExample = new JLabel("Examples :");
		lblExample.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblExample.setBounds(27, 162, 162, 29);
		panel_1.add(lblExample);
		
		JLabel lblShortStory = new JLabel("Short story - ");
		lblShortStory.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblShortStory.setBounds(48, 201, 114, 29);
		panel_1.add(lblShortStory);
		
		JLabel lbltheLastSunset = new JLabel("\"The Last Sunset \" - A tale of an unexpected  friendship during a dystopian era.");
		lbltheLastSunset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltheLastSunset.setBounds(161, 201, 576, 29);
		panel_1.add(lbltheLastSunset);
		
		JLabel lblPoetry = new JLabel(" Poetry -");
		lblPoetry.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPoetry.setBounds(48, 240, 81, 29);
		panel_1.add(lblPoetry);
		
		JLabel lblwhispersOfThe = new JLabel("\"Whispers of the Wind\" - A poem capturing the ephemeral beauty of nature's whispers.");
		lblwhispersOfThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblwhispersOfThe.setBounds(133, 240, 626, 29);
		panel_1.add(lblwhispersOfThe);
		
		JLabel lblFlashFiction = new JLabel("Flash Fiction - ");
		lblFlashFiction.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFlashFiction.setBounds(48, 279, 125, 29);
		panel_1.add(lblFlashFiction);
		
		JLabel lbltheForgottenKey = new JLabel("\"The Forgotten Key\" - A  brief story about a mysterious key that unlocks memories.");
		lbltheForgottenKey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltheForgottenKey.setBounds(186, 279, 626, 29);
		panel_1.add(lbltheForgottenKey);
		
		JLabel lblPlay = new JLabel("Play -");
		lblPlay.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPlay.setBounds(48, 318, 64, 29);
		panel_1.add(lblPlay);
		
		JLabel lblechoesInTime = new JLabel("\"Echoes in Time\" - A theatrical piece exploring the consequences of time travel on relationships.");
		lblechoesInTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblechoesInTime.setBounds(115, 318, 697, 29);
		panel_1.add(lblechoesInTime);
		
		JLabel lblCreativeNonfiction = new JLabel("Creative Non-Fiction -");
		lblCreativeNonfiction.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCreativeNonfiction.setBounds(48, 357, 187, 29);
		panel_1.add(lblCreativeNonfiction);
		
		JLabel lblaGlimpseOf = new JLabel("\"A Glimpse of Everest\" - An account of apersonal journey to Mount Everest, blending facts with personal reflections.");
		lblaGlimpseOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblaGlimpseOf.setBounds(245, 357, 827, 29);
		panel_1.add(lblaGlimpseOf);
		
		JLabel lblScienceFiction = new JLabel("Science Fiction - ");
		lblScienceFiction.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblScienceFiction.setBounds(51, 396, 138, 29);
		panel_1.add(lblScienceFiction);
		
		JLabel lblgalaticOdyssey = new JLabel("\"Galatic Odyssey\" - A sci- fi narrative following a space explorer's quest for a mythical cosmic artifact.");
		lblgalaticOdyssey.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblgalaticOdyssey.setBounds(198, 396, 734, 29);
		panel_1.add(lblgalaticOdyssey);
		
		JLabel lblHistoricalFiction = new JLabel("Historical Fiction - ");
		lblHistoricalFiction.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblHistoricalFiction.setBounds(48, 443, 162, 29);
		panel_1.add(lblHistoricalFiction);
		
		JLabel lblshadowsOfRe = new JLabel("\"Shadows of Revolution\" - A story againts the backdrop of a historical event, intertwining fictional characters with ");
		lblshadowsOfRe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblshadowsOfRe.setBounds(204, 443, 858, 29);
		panel_1.add(lblshadowsOfRe);
		
		JLabel lblRealworldHistory = new JLabel("real-world history.");
		lblRealworldHistory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRealworldHistory.setBounds(213, 469, 145, 29);
		panel_1.add(lblRealworldHistory);
		
		JLabel lblFantasyNovel = new JLabel("Fantasy Novel - ");
		lblFantasyNovel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFantasyNovel.setBounds(48, 498, 162, 29);
		panel_1.add(lblFantasyNovel);
		
		JLabel lbltheCrystalKingdom = new JLabel("\"The Crystal Kingdom\" - A novel that intoduces readers to a magical realm facing an ancient prophecy.");
		lbltheCrystalKingdom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltheCrystalKingdom.setBounds(204, 498, 734, 29);
		panel_1.add(lbltheCrystalKingdom);
		
		JLabel lblChildrensStory = new JLabel("Children's Story -");
		lblChildrensStory.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblChildrensStory.setBounds(65, 551, 145, 29);
		panel_1.add(lblChildrensStory);
		
		JLabel lbltheAdventuresOf = new JLabel("\"The  Adventures of Luna and Friends\" - A whimsical tale of friendship and discovery for young readers.");
		lbltheAdventuresOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbltheAdventuresOf.setBounds(221, 551, 755, 29);
		panel_1.add(lbltheAdventuresOf);
		
		JLabel lblCreativeEssay = new JLabel("Creative Essay - ");
		lblCreativeEssay.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCreativeEssay.setBounds(65, 607, 145, 29);
		panel_1.add(lblCreativeEssay);
		
		JLabel lbljourneyToThe = new JLabel("\"Journey to the Unknwon\" - An essay exploring personal growth through unexpected experiences.");
		lbljourneyToThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbljourneyToThe.setBounds(220, 607, 712, 29);
		panel_1.add(lbljourneyToThe);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				English math=new English();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.setBounds(10, 10, 85, 60);
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
		btnNewButton_1.setBounds(1202, 0, 85, 60);
		panel_1.add(btnNewButton_1);
	}

}
