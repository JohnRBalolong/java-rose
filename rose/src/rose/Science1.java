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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Science1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Science1 frame = new Science1();
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
	public Science1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_1.setBounds(41, 13, 85, 13);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBounds(81, 69, 1352, 638);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(10, 10, 1314, 618);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PHYSICS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(121, 83, 102, 23);
		panel_1.add(lblNewLabel);
		
		JLabel lblTheBranchOf = new JLabel("- The branch of science concerned with the nature and properties of matter and energy. The subject matter of physics, ");
		lblTheBranchOf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTheBranchOf.setBounds(222, 71, 921, 23);
		panel_1.add(lblTheBranchOf);
		
		JLabel lblDistinguishedFromThat = new JLabel("distinguished from that of chemistry and biology, includes mechanics, heat, light and other radiation, sound, electricity");
		lblDistinguishedFromThat.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDistinguishedFromThat.setBounds(232, 98, 921, 23);
		panel_1.add(lblDistinguishedFromThat);
		
		JLabel lblMagnetismAndThe = new JLabel("magnetism, and the structure of atoms.");
		lblMagnetismAndThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMagnetismAndThe.setBounds(315, 120, 921, 23);
		panel_1.add(lblMagnetismAndThe);
		
		JLabel lblBranchesOfPhysics = new JLabel("Branches of Physics:");
		lblBranchesOfPhysics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblBranchesOfPhysics.setBounds(26, 139, 193, 23);
		panel_1.add(lblBranchesOfPhysics);
		
		JLabel lblAcoustics = new JLabel("ACOUSTICS ");
		lblAcoustics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAcoustics.setBounds(68, 176, 95, 23);
		panel_1.add(lblAcoustics);
		
		JLabel lblAcousticsThe = new JLabel("- acoustics, the science concerned with the production, control, transmission, reception, and effects of sound. The term is");
		lblAcousticsThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAcousticsThe.setBounds(189, 176, 921, 23);
		panel_1.add(lblAcousticsThe);
		
		JLabel lblDerivedFromThe = new JLabel("derived from the greek akoustos, meaning \"heard\", acoustics.");
		lblDerivedFromThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDerivedFromThe.setBounds(199, 195, 921, 23);
		panel_1.add(lblDerivedFromThe);
		
		JLabel lblElectromagnetism = new JLabel("ELECTROMAGNETISM");
		lblElectromagnetism.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblElectromagnetism.setBounds(10, 222, 173, 23);
		panel_1.add(lblElectromagnetism);
		
		JLabel lblDealsWwthThe = new JLabel("- deals with the study of electromagnetic force like electromagnetic force like electric fields , lights, magnetic fields, etc.");
		lblDealsWwthThe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDealsWwthThe.setBounds(182, 222, 864, 23);
		panel_1.add(lblDealsWwthThe);
		
		JLabel lblThereAreTwo = new JLabel("There are two aspects of electromagnetism which are \"electricity\" and \"magnetism\".");
		lblThereAreTwo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThereAreTwo.setBounds(177, 255, 864, 23);
		panel_1.add(lblThereAreTwo);
		
		JLabel lblRelativity = new JLabel("RELATIVITY");
		lblRelativity.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRelativity.setBounds(57, 288, 95, 23);
		panel_1.add(lblRelativity);
		
		JLabel lblThisBranch = new JLabel("- This branch of physics deals with the theorem that was formulated by Albert Einstien. The theory of relativity states that ");
		lblThisBranch.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch.setBounds(151, 288, 935, 23);
		panel_1.add(lblThisBranch);
		
		JLabel lblSpaceAndTime = new JLabel("space and time are relative and all the motion must be relative to a frame of reference.");
		lblSpaceAndTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSpaceAndTime.setBounds(201, 321, 961, 23);
		panel_1.add(lblSpaceAndTime);
		
		JLabel lblThermodynamics = new JLabel("THERMODYNAMICS");
		lblThermodynamics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblThermodynamics.setBounds(68, 354, 153, 23);
		panel_1.add(lblThermodynamics);
		
		JLabel lblThermodynamicsDeals = new JLabel("- Thermodynamics deals with the study of heat and its relation its relation with work and energy. Thermodynamics ");
		lblThermodynamicsDeals.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThermodynamicsDeals.setBounds(222, 354, 864, 23);
		panel_1.add(lblThermodynamicsDeals);
		
		JLabel lblAlsoDealsWith = new JLabel("also deals with the transmission of heat energy by means of convection, conduction, and radiation.");
		lblAlsoDealsWith.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlsoDealsWith.setBounds(182, 387, 961, 23);
		panel_1.add(lblAlsoDealsWith);
		
		JLabel lblOptics = new JLabel("OPTICS ");
		lblOptics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblOptics.setBounds(68, 420, 95, 23);
		panel_1.add(lblOptics);
		
		JLabel lblThisBranch_1 = new JLabel("- This branch of physics deals with behavior, propagation, and properties of light. Optics can be simply describes as the");
		lblThisBranch_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch_1.setBounds(163, 420, 947, 23);
		panel_1.add(lblThisBranch_1);
		
		JLabel lblThisBranch_1_1 = new JLabel("the study of the behavior of infrared light, visible light, and ultraviolet.");
		lblThisBranch_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch_1_1.setBounds(154, 453, 966, 23);
		panel_1.add(lblThisBranch_1_1);
		
		JLabel lblMechanics = new JLabel("MECHANICS");
		lblMechanics.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMechanics.setBounds(1, 486, 95, 23);
		panel_1.add(lblMechanics);
		
		JLabel lblThisBranch_1_2 = new JLabel("Mechanics is the branch of physics that deals with the motion of an object without or with the reference of force.");
		lblThisBranch_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch_1_2.setBounds(156, 486, 947, 23);
		panel_1.add(lblThisBranch_1_2);
		
		JLabel lblThisBranch_1_2_1 = new JLabel("Mechanics can further divided into two brances, namely quantum mechanics and classical mechanics. Quantum mechanics");
		lblThisBranch_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch_1_2_1.setBounds(139, 519, 947, 23);
		panel_1.add(lblThisBranch_1_2_1);
		
		JLabel lblThisBranch_1_2_1_1 = new JLabel("deals with behavior of the smallest particles like neutrons, protons, and electrons, while classical mechanics is the branch that deals");
		lblThisBranch_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch_1_2_1_1.setBounds(149, 552, 947, 23);
		panel_1.add(lblThisBranch_1_2_1_1);
		
		JLabel lblThisBranch_1_2_1_1_1 = new JLabel("with laws of motion of forces and physicsal objects.");
		lblThisBranch_1_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblThisBranch_1_2_1_1_1.setBounds(156, 585, 947, 23);
		panel_1.add(lblThisBranch_1_2_1_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SCIENCE2 math=new SCIENCE2 ();
				  math.show();
				  dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\next-button.png"));
		btnNewButton.setBounds(1141, 536, 85, 49);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage read =new Homepage();
				read.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton_1.setBounds(26, 19, 95, 59);
		panel_1.add(btnNewButton_1);
	}

}
