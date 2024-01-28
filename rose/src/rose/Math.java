package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Math extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math frame = new Math();
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
	public Math() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(Color.ORANGE);
		panel.setBounds(80, 53, 1300, 637);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(24, 26, 1247, 590);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mathematics");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(551, 10, 126, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Geometry -");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(145, 63, 119, 29);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Geometry is a branch of mathematics that deals with the study of shapes, sizes, properties, and dimensions \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(252, 67, 824, 21);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel(" of objects and spaces. It explores the relationships and properties of points, lines, angles, surfaces, and solids.");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(274, 84, 863, 23);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Two branches of geometry:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(30, 104, 273, 29);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Plane geometry-");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(30, 143, 189, 23);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("which deals with two-dimensional figures like points, lines, and polygons on a flat surface.\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(182, 143, 748, 23);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Solid Geometry -\r\n");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2_2_1.setBounds(30, 347, 208, 23);
		panel_1.add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel(" which involves three-dimensional shapes such as cubes, spheres, and pyramids.");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1.setBounds(199, 348, 785, 23);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Examples:\r\n");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(30, 164, 169, 29);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Points: Basic entities with no size or dimension.");
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2.setBounds(49, 203, 505, 23);
		panel_1.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Lines: Straight or curved paths with no thickness or width.");
		lblNewLabel_2_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_1.setBounds(44, 236, 465, 23);
		panel_1.add(lblNewLabel_2_1_2_1);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Line Segments: Parts of lines with two endpoints.");
		lblNewLabel_2_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_2.setBounds(47, 271, 615, 23);
		panel_1.add(lblNewLabel_2_1_2_2);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("Angles: The figure formed by two rays with a common endpoint (vertex).");
		lblNewLabel_2_1_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_3.setBounds(47, 304, 630, 23);
		panel_1.add(lblNewLabel_2_1_2_3);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Examples:\r\n");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_2_1.setBounds(30, 380, 143, 29);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_2_1_2_4 = new JLabel("Prisms: Polyhedra with two parallel and congruent polygonal faces (bases) and rectangular faces connecting corresponding \r\n");
		lblNewLabel_2_1_2_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_4.setBounds(47, 441, 766, 23);
		panel_1.add(lblNewLabel_2_1_2_4);
		
		JLabel lblNewLabel_2_1_2_4_1 = new JLabel("Cylinders: Three-dimensional figures with two parallel circular bases connected by a curved surface.");
		lblNewLabel_2_1_2_4_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_4_1.setBounds(47, 474, 766, 23);
		panel_1.add(lblNewLabel_2_1_2_4_1);
		
		JLabel lblNewLabel_2_1_2_4_1_1 = new JLabel("Cones: Three-dimensional figures with a circular base and a curved surface that converges to a point (apex).");
		lblNewLabel_2_1_2_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_4_1_1.setBounds(47, 540, 958, 23);
		panel_1.add(lblNewLabel_2_1_2_4_1_1);
		
		JLabel lblNewLabel_2_1_2_4_1_1_1 = new JLabel("Pyramids: Polyhedra with a polygonal base and triangular faces that meet at a common vertex.\r\n");
		lblNewLabel_2_1_2_4_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_2_4_1_1_1.setBounds(47, 507, 883, 23);
		panel_1.add(lblNewLabel_2_1_2_4_1_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\left-arrow.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Math2 math=new Math2();
			  math.show();
			  dispose();
			}
				
		});
		btnNewButton.setBounds(1133, 507, 89, 73);
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
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton_1.setBounds(32, 10, 85, 60);
		panel_1.add(btnNewButton_1);
	}
}
