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

public class Math2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math2 frame = new Math2();
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
	public Math2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(154, 66, 1179, 618);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 11, 1141, 597);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("Mathematics");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(474, 47, 300, 29);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Algebra is a fundamental tool in various branches of mathematics and has practical applications  in fields such as\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(145, 128, 959, 22);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblAlgebra = new JLabel("Algebra-");
		lblAlgebra.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAlgebra.setBounds(54, 124, 121, 29);
		panel_1.add(lblAlgebra);
		
		JLabel lblNewLabel_2_1 = new JLabel(" physics, engineering, computer science, economics, and many others. It provides a powerful framework for");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1.setBounds(145, 150, 943, 22);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" representing and solving mathematical problems involving unknowns and relationships between quantities.\r\n\r\n\r\n\r\n\r\n\r\n");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBounds(164, 170, 893, 22);
		panel_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Some of the key branches of algebra :");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(10, 202, 412, 22);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Focuses on vector spaces and linear mappings between these spaces. It includes the study of matrices,");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1.setBounds(164, 250, 844, 22);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblLinearAlgebra = new JLabel("Linear Algebra:");
		lblLinearAlgebra.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblLinearAlgebra.setBounds(18, 246, 191, 29);
		panel_1.add(lblLinearAlgebra);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("determinants, eigenvalues, and eigenvectors. Linear algebra has applications in various fields, including physics, \r\n");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_1.setBounds(145, 281, 863, 22);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("computer science, and engineering.");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_1_1.setBounds(293, 302, 365, 22);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblAbstractAlgebra = new JLabel("Abstract Algebra:\r\n");
		lblAbstractAlgebra.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAbstractAlgebra.setBounds(20, 330, 166, 29);
		panel_1.add(lblAbstractAlgebra);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel(" Also known as modern algebra, this branch deals with algebraic structures in a more abstract and general ");
		lblNewLabel_2_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_2.setBounds(186, 334, 844, 22);
		panel_1.add(lblNewLabel_2_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel(" way. It includes the study of groups, rings, fields, and other algebraic structures. Abstract algebra is ");
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_2_1.setBounds(185, 366, 845, 22);
		panel_1.add(lblNewLabel_2_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_2_2 = new JLabel("undamental in advanced mathematics and has applications in diverse areas.");
		lblNewLabel_2_1_1_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_2_2.setBounds(217, 383, 813, 22);
		panel_1.add(lblNewLabel_2_1_1_1_2_2);
		
		JLabel lblBooleanAlgebra = new JLabel("Boolean Algebra: ");
		lblBooleanAlgebra.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBooleanAlgebra.setBounds(10, 414, 165, 22);
		panel_1.add(lblBooleanAlgebra);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel(" A specialized branch of algebra that deals with logical operations and binary variables.. It is widely used in");
		lblNewLabel_2_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_3.setBounds(204, 415, 853, 22);
		panel_1.add(lblNewLabel_2_1_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_3_1 = new JLabel("computer science, especially in the design of digital circuits and computer algorithms.");
		lblNewLabel_2_1_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_3_1.setBounds(185, 446, 648, 22);
		panel_1.add(lblNewLabel_2_1_1_1_3_1);
		
		JLabel lblAlgebraicGeometry = new JLabel("Algebraic Geometry: ");
		lblAlgebraicGeometry.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblAlgebraicGeometry.setBounds(10, 478, 186, 22);
		panel_1.add(lblAlgebraicGeometry);
		
		JLabel lblNewLabel_2_1_1_1_3_2 = new JLabel("Explores the relationship between algebra and geometry, focusing on the study of algebraic varieties");
		lblNewLabel_2_1_1_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_3_2.setBounds(206, 478, 851, 22);
		panel_1.add(lblNewLabel_2_1_1_1_3_2);
		
		JLabel lblNewLabel_2_1_1_1_3_2_1 = new JLabel(" (sets of solutions to systems of polynomial equations). Algebraic geometry has  connections to both ");
		lblNewLabel_2_1_1_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_3_2_1.setBounds(179, 510, 767, 22);
		panel_1.add(lblNewLabel_2_1_1_1_3_2_1);
		
		JLabel lblNewLabel_2_1_1_1_3_2_1_1 = new JLabel("number theory and theoretical physics.");
		lblNewLabel_2_1_1_1_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_2_1_1_1_3_2_1_1.setBounds(248, 542, 444, 22);
		panel_1.add(lblNewLabel_2_1_1_1_3_2_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Math math=new Math();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setBounds(10, 10, 89, 51);
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
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(1042, 10, 89, 51);
		panel_1.add(btnNewButton_1);
	}

}