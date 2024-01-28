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

public class Educsp extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Educsp frame = new Educsp();
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
	public Educsp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(-7,0, 1551, 825);
		contentPane = new JPanel();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(72, 78, 1342, 624);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(29, 22, 1282, 581);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Edukasyon sa Pagpapakatao");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(501, 27, 303, 26);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ay isang bahagi ng kurikulum sa maraming paaralan na naglalayong turuan ang mga mag-aaral tungkol sa tamang asal,");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(156, 63, 1001, 26);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("etika, moralidad, at pag-unlad ng kanilang personal na pagkatao. Ito ay isang ntegral na bahagi ng edukasyon sa Pilipinas \r\n");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(195, 85, 1032, 26);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("at iba't ibang bansa.");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(466, 112, 285, 26);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblMgaLayuninSa = new JLabel("Mga layunin sa Pagpapakatao :");
		lblMgaLayuninSa.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMgaLayuninSa.setBounds(23, 143, 351, 26);
		panel_1.add(lblMgaLayuninSa);
		
		JLabel lblNewLabel_1_2 = new JLabel("ay isang bahagi ng kurikulum sa maraming paaralan na naglalayong turuan ang mga mag-aaral ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(276, 190, 766, 26);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblPagbuoNgTamang = new JLabel("Pagbuo ng Tamang Asal:");
		lblPagbuoNgTamang.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPagbuoNgTamang.setBounds(23, 189, 240, 26);
		panel_1.add(lblPagbuoNgTamang);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" na magkaruon ng tamang asal at pagpapakumbaba sa pakikipagkapwa-tao.\r\n");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_1.setBounds(286, 211, 596, 26);
		panel_1.add(lblNewLabel_1_2_1);
		
		JLabel lblPagpapahalagaSaMoral = new JLabel("Pagpapahalaga sa Moral na Prinsipyo:");
		lblPagpapahalagaSaMoral.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPagpapahalagaSaMoral.setBounds(10, 261, 388, 26);
		panel_1.add(lblPagpapahalagaSaMoral);
		
		JLabel lblNewLabel_1_2_2 = new JLabel(" Itinuturo ng Edukasyon sa Pagpapakatao ang kahalagahan ng moral na prinsipyo\r\n");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2.setBounds(358, 261, 667, 26);
		panel_1.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("tulad ng katarungan, paggalang, at pagkakapantay-pantay.");
		lblNewLabel_1_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_1.setBounds(343, 284, 507, 26);
		panel_1.add(lblNewLabel_1_2_2_1);
		
		JLabel lblPakikipagkapwatao = new JLabel("Pakikipagkapwa-tao:");
		lblPakikipagkapwatao.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPakikipagkapwatao.setBounds(15, 336, 218, 26);
		panel_1.add(lblPakikipagkapwatao);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel(" Isa sa mga pangunahing layunin ng Edukasyon sa Pagpapakatao ang pagtuturo sa mga mag-aaral ");
		lblNewLabel_1_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_2.setBounds(221, 337, 864, 26);
		panel_1.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_2_2_2_1 = new JLabel(" ng pagpapahalaga sa sarili at pagkilala sa sariling kakayahan.");
		lblNewLabel_1_2_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2_2_2_1.setBounds(221, 361, 555, 26);
		panel_1.add(lblNewLabel_1_2_2_2_1);
		
		JLabel lblPagtuturoNgEtika = new JLabel("Pagtuturo ng Etika: ");
		lblPagtuturoNgEtika.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPagtuturoNgEtika.setBounds(23, 420, 210, 26);
		panel_1.add(lblPagtuturoNgEtika);
		
		JLabel lblNewLabel_1_2_2_2_2 = new JLabel("Naglalaman din ang Edukasyon sa Pagpapakatao ng mga aral tungkol sa etika, o tamang moral ");
		lblNewLabel_1_2_2_2_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_2_2.setBounds(210, 421, 832, 26);
		panel_1.add(lblNewLabel_1_2_2_2_2);
		
		JLabel lblNewLabel_1_2_2_2_3 = new JLabel(" na paguugali, sa iba't ibang larangan ng buhay.\r\n");
		lblNewLabel_1_2_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_2_3.setBounds(221, 445, 398, 26);
		panel_1.add(lblNewLabel_1_2_2_2_3);
		
		JLabel lblPagsusulongNgPagiging = new JLabel("Pagsusulong ng Pagiging Responsable: ");
		lblPagsusulongNgPagiging.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPagsusulongNgPagiging.setBounds(10, 504, 412, 26);
		panel_1.add(lblPagsusulongNgPagiging);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel(" Isa itong paraan upang ituro sa mga mag-aaral ang pagiging responsable");
		lblNewLabel_1_2_2_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_3.setBounds(379, 508, 615, 26);
		panel_1.add(lblNewLabel_1_2_2_3);
		
		JLabel lblNewLabel_1_2_2_2_1_1 = new JLabel("sa kanilang mga gawain at desisyon");
		lblNewLabel_1_2_2_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2_2_2_1_1.setBounds(389, 532, 362, 26);
		panel_1.add(lblNewLabel_1_2_2_2_1_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage math=new Homepage();
				  math.show();
				  dispose(); 
			}
		});
		btnNewButton.setBounds(28, 10, 89, 68);
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
		btnNewButton_1.setBounds(1203, 0, 89, 68);
		panel_1.add(btnNewButton_1);
	}
}
