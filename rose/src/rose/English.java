package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class English extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					English frame = new English();
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
	public English() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(116, 38, 1284, 687);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(20, 24, 1236, 653);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Definition of Fictional Text\r\n\r\n- Fictional text refers to literature created from the author's imagination rather than being on real events or people. It\r\n\r\n\r\n\r\n\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(135, 96, 1028, 34);
		panel_1.add(lblNewLabel);
		
		JLabel lblIncludesNovelsshortStories = new JLabel("includes novels,short stories, and other narratives that explore invented worlds,characteristics, and situations.\r\n");
		lblIncludesNovelsshortStories.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIncludesNovelsshortStories.setBounds(262, 123, 822, 34);
		panel_1.add(lblIncludesNovelsshortStories);
		
		JLabel lblNewLabel_1 = new JLabel("Examples:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(22, 123, 91, 34);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("1.) Harry Potter and the Sorcerers Stone by J.K Rowling-  This is the first book in the Harry Potter series, ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(318, 221, 750, 19);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("which follows the adventure of a young wizard named Harry Potter.");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(334, 250, 560, 19);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("2.)To kill a Mockingbird by Harper Lee- This classic novel explores themes of racial injustice and morality");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(175, 350, 750, 19);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("through the eyes of a young girl named Scout Finch in the 1930s American South.");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1.setBounds(294, 393, 600, 19);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("3.) The Great Gatsby by F.Scott Fitzgerald- Set in the 1920s,this novel tells the story of Jay Gatsby and ");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_2_1.setBounds(318, 558, 750, 19);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("his pursuit of the American Dream,as seen through the eyes of the narrator,Nick carraway.");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1_1_1.setBounds(316, 587, 664, 19);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\364441088_1225849494835583_8184430998954300396_n(1)(1).jpg"));
		lblNewLabel_3.setBounds(135, 185, 106, 128);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\383620649_216427064775009_3657977774454856204_n(1)(1)(1).jpg"));
		lblNewLabel_4.setBounds(136, 477, 135, 150);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\370337792_1702104986934134_5085253746106330967_n(1)(1).jpg"));
		lblNewLabel_5.setBounds(961, 261, 170, 165);
		panel_1.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBorder(null);
		btnNewButton.setOpaque(false);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\left-arrow.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				English2 math=new English2();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setBounds(1078, 565, 85, 62);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_6 = new JLabel("English");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(548, 26, 162, 34);
		panel_1.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("");
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
		btnNewButton_1.setBounds(42, 26, 85, 51);
		panel_1.add(btnNewButton_1);
	}
}
