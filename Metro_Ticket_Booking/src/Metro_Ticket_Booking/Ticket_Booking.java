package Metro_Ticket_Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Ticket_Booking {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket_Booking window = new Ticket_Booking();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ticket_Booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 32));
		lblNewLabel.setBounds(244, 25, 244, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name\r\n");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1.setBounds(80, 116, 101, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(82, 175, 80, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To\r\n");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_3.setBounds(80, 229, 82, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_4.setBounds(81, 294, 100, 25);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 13));
		t1.setBounds(284, 126, 138, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 13));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Miyapur", "JNTU", "KPHB", "Kukatpally", "SR Nagar", "Erragadda", "Ameerpet"}));
		c1.setBounds(289, 184, 133, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 13));
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Miyapur", "JNTU", "KPHB", "Kukatpally", "SR Nagar", "Erragadda", "Ameerpet"}));
		c2.setBounds(289, 238, 133, 22);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 13));
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select ", "1", "2", "3", "4", "5", "6", "7", "8"}));
		c3.setBounds(289, 300, 133, 22);
		frame.getContentPane().add(c3);
		
		JButton b1 = new JButton("Book");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String n=t1.getText();
			String from=(String) c1.getSelectedItem();
			String to=(String) c2.getSelectedItem();
			String t=(String) c3.getSelectedItem();
			int not=Integer.parseInt(t);
			int bill=not*80;
			if(from.equals(to))
			{
				JOptionPane.showMessageDialog(b1, "Check Stations");
			}
			else
			{
				JOptionPane.showMessageDialog(b1, "Name "+n+"\nFrom "+from+"\nTo "+to+"\nTickets "+t+"\nBill "+bill);
			}
			}
		});
		b1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		b1.setBounds(221, 366, 108, 30);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online\\Desktop\\logo.png"));
		lblNewLabel_5.setBounds(528, 25, 138, 132);
		frame.getContentPane().add(lblNewLabel_5);
		frame.setBounds(100, 100, 743, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
