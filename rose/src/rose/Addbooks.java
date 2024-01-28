package rose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import com.toedter.calendar.JDateChooser;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

public class Addbooks extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final String JDBC_URL = "jdbc:mysql://localhost:3306/readme";
	public static final String JDBC_USERNAME = "root";
	public static final String JDBC_PASSWORD = "";
	private JPanel contentPane;
	private JTextField txtbook;
	private JTextField txtversion;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addbooks frame = new Addbooks();
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
	public Addbooks() {
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
		panel.setBounds(44, 55, 682, 674);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(26, 21, 635, 632);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBackground(SystemColor.activeCaption);
		panel_3.setBounds(22, 10, 588, 612);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(252, 29, 137, 107);
		panel_3.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\user(1)3.png"));
		
		JLabel lblNewLabel_1 = new JLabel("Add Books");
		lblNewLabel_1.setBounds(37, 540, 95, 33);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton txtadd = new JButton("");
		txtadd.setBounds(21, 423, 142, 107);
		panel_3.add(txtadd);
		txtadd.setVerticalTextPosition(SwingConstants.BOTTOM);
		txtadd.setOpaque(false);
		txtadd.setBackground(new Color(255, 255, 255));
		txtadd.setBorder(null);
		txtadd.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\library11.png"));
		txtadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try(Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)){
					String bookname = txtbook.getText().trim();
					String bookversion = txtversion.getText(); 

					if (bookname.isEmpty() || bookversion.isEmpty()) {
					    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
					}
				String insert = "INSERT INTO books (book_name , book_version) VALUES (?,?)";
				try(PreparedStatement preparedStatement = connection.prepareStatement(insert)){
					preparedStatement.setString(1, bookname);
					preparedStatement.setString(2, bookversion);
					
					int row = preparedStatement.executeUpdate();
					
					if(row > 0) {
						JOptionPane.showMessageDialog(null, "Book Added Successfully");
						reloadTable() ;
					}else {
						JOptionPane.showMessageDialog(null, "Failed to Add Book, Please Try Again.");
					}
				}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		txtadd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1 = new JLabel("Update");
		lblNewLabel_1_1.setBounds(263, 540, 85, 33);
		panel_3.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton txtupdate = new JButton("");
		txtupdate.setBounds(236, 453, 112, 77);
		panel_3.add(txtupdate);
		txtupdate.setOpaque(false);
		txtupdate.setBorder(null);
		txtupdate.setBackground(new Color(255, 255, 255));
		txtupdate.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\phonebook1.png"));
		txtupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update();
			}
		});
		txtupdate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Log out");
		lblNewLabel_1_1_1.setBounds(434, 540, 73, 33);
		panel_3.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(422, 453, 85, 85);
		panel_3.add(btnNewButton);
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(null);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int userChoice = JOptionPane.showConfirmDialog(null, "Do you want to Log out?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);

		        if (userChoice == JOptionPane.YES_OPTION) {
		            // User chose 'Yes,' exit the program
		        	setVisible(false);	
					new Firstpage().setVisible(true);

		        } else {
		            // User chose 'No,' continue with the program
		            System.out.println("Program continues...");
		        }
		    
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\turn-off(1)2.png"));
		
		txtversion = new JTextField();
		txtversion.setBorder(new LineBorder(Color.BLACK, 2));
		txtversion.setBounds(219, 325, 266, 43);
		panel_3.add(txtversion);
		txtversion.setColumns(10);
		
		JLabel lblBook = new JLabel("Bookversion :");
		lblBook.setBounds(58, 330, 153, 30);
		panel_3.add(lblBook);
		lblBook.setFont(new Font("Algerian", Font.BOLD, 20));
		
		txtbook = new JTextField();
		txtbook.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		txtbook.setBounds(213, 203, 272, 43);
		panel_3.add(txtbook);
		txtbook.setColumns(10);
		txtbook.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char typeP=e.getKeyChar();
				if(!Character.isLetter(typeP)) {e.consume();}
			}
		});
		txtbook.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("Bookname :");
		lblNewLabel.setBounds(72, 208, 131, 30);
		panel_3.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 20));
		txtversion.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char typeP=e.getKeyChar();
				if(!Character.isDigit(typeP)) {e.consume();}
			}
		});
		txtversion.setColumns(10);
		
		
	
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Firstpage math=new Firstpage();
				  math.show();
				  dispose();
				
				
			}
		});
		
		
		
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\MY ACER\\Downloads\\backtome.png"));
		btnNewButton_1.setBounds(0, 0, 85, 62);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(732, 55, 733, 674);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		scrollPane.setBorder(new LineBorder(Color.BLACK, 3));
		scrollPane.setBounds(32, 28, 663, 613);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 15));
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				displaySelectedRow();
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_4.setBackground(SystemColor.activeCaption);
		panel_4.setBounds(10, 10, 699, 654);
		panel_1.add(panel_4);
		display();
	}
	private void display() {
	    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
	        String query = "SELECT book_id, book_name, book_version FROM books";
	        try (Statement statement = connection.createStatement();
	             ResultSet result = statement.executeQuery(query)) {

	            String[] column = {"Book ID", "Book Name", "Book Version"};

	            List<Object[]> data = new ArrayList<>();
	            while (result.next()) {
	                Object[] row = new Object[3];
	                row[0] = result.getObject("book_id");
	                row[1] = result.getObject("book_name");
	                row[2] = result.getObject("book_version");
	                data.add(row);
	            }

	            // Create a DefaultTableModel with data and column names
	            DefaultTableModel model = new DefaultTableModel(data.toArray(new Object[0][]), column) {
	                @Override
	                public boolean isCellEditable(int row, int column) {
	                    // Allow editing only for the "Book Version" column
	                    return column == 2;
	                }
	            };

	            table.setModel(model);
	            reloadTable();

	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
	    }
	}

	/* private void reloadTable() {
	        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
	            String query = "SELECT book_id, book_name, book_version FROM books";
	            try (Statement statement = connection.createStatement();
	                 ResultSet result = statement.executeQuery(query)) {

	                String[] column = {"Book ID", "Book Name", "Book Version"};

	                List<Object[]> data = new ArrayList<>();
	                while (result.next()) {
	                    Object[] row = new Object[3];
	                    row[0] = result.getObject("book_id");
	                    row[1] = result.getObject("book_name");
	                    
	                    java.sql.Date bookVersionDate = result.getDate("book_version");
	                    if (bookVersionDate != null) {
	                        row[2] = bookVersionDate.toLocalDate().getYear();
	                    } else {
                     row[2] = null;
	                    }

	                    data.add(row);
	                }

	                DefaultTableModel model = new DefaultTableModel(data.toArray(new Object[0][]), column);
	                table.setModel(model);

	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
	        }
	    }*/
	private void reloadTable() {
	    try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
	        String query = "SELECT book_id, book_name, book_version FROM books";
	        try (Statement statement = connection.createStatement();
	             ResultSet result = statement.executeQuery(query)) {
	            DefaultTableModel model = (DefaultTableModel) table.getModel();
	            model.setRowCount(0);

	            while (result.next()) {
	                Object[] rowData = {
	                        result.getString("book_id"),
	                        result.getString("book_name"),
	                        getFormattedYear(result.getDate("book_version"))
	                };
	                model.addRow(rowData);
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	private String getFormattedYear(Date date) {
	    if (date != null) {
	        // Format the date to show only the year
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	        return sdf.format(date);
	    } else {
	        return "";
	    }
	}
	 //to clear all fields
	 private void clearbook() {
        		 txtbook.setText("");
        		 txtversion.setText("");
	 }
	 //to update row
	 private void update() {
		    int selectedrow = table.getSelectedRow();
		    if (selectedrow != -1) {
		        String book = txtbook.getText().trim();
		        String version = txtversion.getText().trim();
		        if (txtbook.getText().isEmpty() || txtversion.getText().isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Please fill in all fields!", "ERROR", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        DefaultTableModel model = (DefaultTableModel) table.getModel();

		        if (selectedrow >= 0 && selectedrow < model.getRowCount()) {
		            model.setValueAt(book, selectedrow, 1);
		            model.setValueAt(version, selectedrow, 2);
		        }
		        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
		            String query = "UPDATE books SET book_name=?, book_version=? WHERE book_id=?";
		            try (PreparedStatement update = connection.prepareStatement(query)) {
		                // Get the book_id from the selected row
		                int bookId = Integer.parseInt(model.getValueAt(selectedrow, 0).toString());

		                update.setString(1, book);
		                update.setString(2, version);
		                update.setInt(3, bookId);

		                update.executeUpdate();
		                clearbook();
		                reloadTable();
		                JOptionPane.showMessageDialog(null, "Book Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
		            } catch (SQLException e) {
		                e.printStackTrace();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}

	 private void displaySelectedRow() {
		 int selectedrow = table.getSelectedRow();
		 
		 if(selectedrow != -1) {
			 String book = table.getValueAt(selectedrow, 1).toString();
			 String version = table.getValueAt(selectedrow, 2).toString();
			 
			 txtbook.setText(book);
			 txtversion.setText(version);
		 }
	 }
}