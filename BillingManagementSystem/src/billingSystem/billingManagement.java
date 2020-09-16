package billingSystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class billingManagement {

	private JFrame frame;
	private JTextField hydro;
	private JTextField utilities;
	private JTextField internet;
	private JTextField phone;
	private JTextField misc;
	private JTextField subtotal;
	private JTextField tax;
	private JTextField total;

	/**
	 * Launching the billing management application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billingManagement window = new billingManagement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the billing management application
	 */
	public billingManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1000, 514);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/**
		 * Adding labels with specified names
		 */
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.LIGHT_GRAY, null));
		panel.setBounds(58, 31, 831, 86);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing Management System");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 11, 793, 64);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Utilities");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(33, 181, 161, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hydro");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(33, 238, 161, 28);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Internet");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblNewLabel_1_2.setBounds(33, 294, 161, 28);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_4 = new JLabel("Miscellaneous ");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		lblNewLabel_1_4.setBounds(33, 405, 180, 28);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		/**
		 * Adding borders for aesthetic
		 */
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1.setBounds(21, 174, 173, 46);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_2.setBounds(21, 231, 173, 43);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_3.setBounds(20, 285, 174, 43);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_4.setBounds(21, 339, 172, 46);
		frame.getContentPane().add(panel_4);
		
		JLabel lblNewLabel_2 = new JLabel("Phone");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_5.setBounds(21, 396, 172, 43);
		frame.getContentPane().add(panel_5);
		
		/**
		 * Text fields for user input
		 * Will be in string and then double parse will be used later to initialize as a double
		 * this first recognizes user input as a string
		 */
		
		hydro = new JTextField();
		hydro.setText("0");
		hydro.setHorizontalAlignment(SwingConstants.RIGHT);
		hydro.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		hydro.setBounds(224, 231, 172, 43);
		frame.getContentPane().add(hydro);
		hydro.setColumns(10);
		
		utilities = new JTextField();
		utilities.setHorizontalAlignment(SwingConstants.RIGHT);
		utilities.setText("0");
		utilities.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		utilities.setColumns(10);
		utilities.setBounds(224, 174, 172, 43);
		frame.getContentPane().add(utilities);
		
		internet = new JTextField();
		internet.setText("0");
		internet.setHorizontalAlignment(SwingConstants.RIGHT);
		internet.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		internet.setColumns(10);
		internet.setBounds(224, 285, 172, 43);
		frame.getContentPane().add(internet);
		
		phone = new JTextField();
		phone.setText("0");
		phone.setHorizontalAlignment(SwingConstants.RIGHT);
		phone.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		phone.setColumns(10);
		phone.setBounds(224, 339, 172, 43);
		frame.getContentPane().add(phone);
		
		misc = new JTextField();
		misc.setHorizontalAlignment(SwingConstants.RIGHT);
		misc.setText("0");
		misc.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		misc.setColumns(10);
		misc.setBounds(223, 396, 172, 43);
		frame.getContentPane().add(misc);
		
		/**
		 *  More panels for aesthetic purposes
		 */
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_1.setBounds(562, 174, 173, 46);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("Subtotal");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		panel_1_1.add(lblNewLabel_1_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_2.setBounds(562, 231, 173, 46);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_1_5 = new JLabel("Tax");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		panel_1_2.add(lblNewLabel_1_5);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_1_3.setBounds(562, 285, 173, 46);
		frame.getContentPane().add(panel_1_3);
		
		JLabel lblNewLabel_1_6 = new JLabel("Total");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
		panel_1_3.add(lblNewLabel_1_6);
		
		/**
		 * More text fields for user input 
		 */
		
		subtotal = new JTextField();
		subtotal.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		subtotal.setColumns(10);
		subtotal.setBounds(769, 174, 172, 43);
		frame.getContentPane().add(subtotal);
		
		tax = new JTextField();
		tax.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		tax.setColumns(10);
		tax.setBounds(769, 231, 172, 43);
		frame.getContentPane().add(tax);
		
		total = new JTextField();
		total.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		total.setColumns(10);
		total.setBounds(769, 285, 172, 43);
		frame.getContentPane().add(total);
		
		/**
		 * User can click the total button and the application will calculate
		 * the total, if there is no tax then there is a subtotal option
		 * where the user can see the cost without tax
		 */
		
		JButton totalButton = new JButton("TOTAL");
		totalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			//parse double() returns a new double initialized to the value represented by the specified string
				double utilitiesCost = Double.parseDouble(utilities.getText());
				double hydroCost = Double.parseDouble(hydro.getText());
				double internetCost = Double.parseDouble(internet.getText());
				double phoneCost = Double.parseDouble(phone.getText());
				double miscCost = Double.parseDouble(misc.getText());
				double taxCost = 1.13;
				double subtotalCost1 = utilitiesCost + hydroCost + internetCost + phoneCost + miscCost;
				double totalCost1 = (utilitiesCost + hydroCost + internetCost + phoneCost + miscCost) * taxCost;
				
				String subtotalCost = String.format("%.2f", subtotalCost1);
				subtotal.setText(subtotalCost);
				
				tax.setText("13%");
				
				String totalcost = String.format("%.2f", totalCost1);
				total.setText(totalcost);					
			}
		});
		totalButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		totalButton.setBounds(562, 396, 173, 37);
		frame.getContentPane().add(totalButton);
		
		/**
		 * Button that clicked, will reset the text fields for new input
		 */
		
		JButton resetButton = new JButton("RESET");
		resetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				utilities.setText("0");
				hydro.setText("0");
				internet.setText("0");
				phone.setText("0");
				misc.setText("0");
				subtotal.setText(null);
				tax.setText(null);
				total.setText(null);
			}
		});
		resetButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 25));
		resetButton.setBounds(769, 396, 173, 37);
		frame.getContentPane().add(resetButton);
	}
}
