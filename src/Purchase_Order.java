import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;

public class Purchase_Order extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnBack;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Purchase_Order frame = new Purchase_Order();
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
	public Purchase_Order() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(300, 83, 356, 302);
		contentPane.add(table);
		
		JButton btnPrintRecipt = new JButton("PRINT RECIPT");
		btnPrintRecipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Print_Recipt recipt = new Print_Recipt();
				recipt.setVisible(true);
				dispose();
			}
		});
		btnPrintRecipt.setBounds(427, 384, 173, 23);
		contentPane.add(btnPrintRecipt);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shop back = new Shop();
				back.setVisible(true);
					dispose();
			}
		});
		btnBack.setBounds(67, 348, 89, 23);
		contentPane.add(btnBack);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setBounds(10, 83, 46, 14);
		contentPane.add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(128, 80, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("customer name");
		lblNewLabel.setBounds(10, 130, 99, 14);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 127, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("customer id");
		lblNewLabel_1.setBounds(10, 176, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 173, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD CARD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			ADD_CART cart = new ADD_CART();
			cart.setVisible(true);
			}
		});
		btnNewButton.setBounds(67, 255, 120, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DELETE CARD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Delete_cart cart = new Delete_cart();
				cart.setVisible(true);
			
			}
		});
		btnNewButton_1.setBounds(67, 301, 120, 23);
		contentPane.add(btnNewButton_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 57, 672, -4);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 42, 672, 14);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("PURCHASE ORDER");
		lblNewLabel_2.setBounds(223, 11, 338, 14);
		contentPane.add(lblNewLabel_2);
		this.setLocationRelativeTo(null);
	}
}
