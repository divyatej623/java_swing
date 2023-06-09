package Metro_Ticket_Booking;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 716, 490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(256, 21, 192, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_1.setBounds(112, 97, 74, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Phone no");
		lblNewLabel_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(112, 163, 120, 24);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_3.setBounds(112, 223, 131, 31);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Fav Programming ");
		lblNewLabel_4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_4.setBounds(112, 285, 218, 54);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(386, 107, 120, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(386, 170, 120, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		r1.setBounds(386, 232, 74, 24);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 16));
		r2.setBounds(475, 230, 94, 24);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "C", "C++", "Java", "Python", "Ruby", "HTML", "CSS"}));
		c1.setBounds(386, 305, 120, 22);
		frame.getContentPane().add(c1);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String ph=t2.getText();
				String g;
				if(r1.isSelected())
				{
					g="Male";
				}
				else if(r2.isSelected()) {
					g="Female";
				}
				else {
					g="Invalid";
				}
				String p=(String) c1.getSelectedItem();
				JOptionPane.showMessageDialog(b1, "Name "+n+"\nPhone no "+ph+"\nGender "+g+"\nFavorite Programming Language "+p);
			}
		});
		b1.setFont(new Font("Segoe Print", Font.BOLD, 16));
		b1.setBounds(310, 375, 113, 23);
		frame.getContentPane().add(b1);
	}
}
