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

public class SCIENCE2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SCIENCE2 frame = new SCIENCE2();
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
	public SCIENCE2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(184, 79, 1173, 613);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(10, 10, 1132, 593);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BIOLOGY");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(29, 87, 105, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("- Biology is natural science discipline that suplies living things. It is a very large and broad field due the wide variety");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(125, 88, 909, 20);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("of  life found on earth, so individual biologists normally focus on specific fields.These field are eihter categorized by the ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(74, 129, 909, 20);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("scale of life or by the types of organism studied.");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(86, 159, 909, 20);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("There are moments in the history of all sciences when remarkable progress is made in relatively short periods of time.");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(86, 189, 909, 20);
		panel_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Such leaps in knolegde result in great part from two factors. one is the pressence of a creative mind a mind sufficiently perspective");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(74, 219, 951, 20);
		panel_1.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("and original two discard hitherto accepted ideas and formulate new hypotheses. The second is the technological ability to test the");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1.setBounds(86, 249, 951, 20);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("hypotheses by apropriate experiments.");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(74, 279, 951, 20);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JLabel lblWhyIsBiology = new JLabel("WHY IS BIOLOGY IS IMPORTANT?");
		lblWhyIsBiology.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblWhyIsBiology.setBounds(28, 309, 372, 23);
		panel_1.add(lblWhyIsBiology);
		
		JLabel lblNewLabel_1_2 = new JLabel("As a field of science , biology helps understand the living world and the ways it many species (including humans) function");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(99, 342, 909, 20);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("evolve, interact. Advances in medicine , agriculture, biotechnology , and many other areas of biology have brought improvement ");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_2.setBounds(86, 372, 951, 20);
		panel_1.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("in the quality of life. Fields such as genetic and evolution give insight into the past and can help shape the future ,and reseach ");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_1.setBounds(74, 402, 951, 20);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("in ecology and conservation inform how we can protect this planet's precious biodiversity.");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_1_1.setBounds(86, 432, 951, 20);
		panel_1.add(lblNewLabel_1_2_1_1);
		
		JLabel lblMajorPartsOf = new JLabel("Major Parts of Biology:");
		lblMajorPartsOf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMajorPartsOf.setBounds(28, 480, 372, 23);
		panel_1.add(lblMajorPartsOf);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("This article introduces you to many of the main fields of biology : zoology and biochemistry and ecology.");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_2.setBounds(74, 513, 909, 20);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Fields of biology such as zoology and genetics can be very broad topics and contain many specializations within each field.");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2_2_1.setBounds(60, 543, 909, 20);
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Science1 math=new Science1();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.setBounds(10, 10, 105, 52);
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
		btnNewButton_1.setBounds(1027, 10, 105, 52);
		panel_1.add(btnNewButton_1);
	}

}
