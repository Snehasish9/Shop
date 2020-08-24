import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Shop extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Shop frame = new Shop();
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
	public Shop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677,530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 36, 628, 7);
		contentPane.add(separator);
		
		
		
		
		JButton btnNewButton_1 = new JButton("PURCHASE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Purchase_Order purchase = new Purchase_Order();
				purchase.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(227, 95, 121, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CUSTOMER INFORMATION");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Custmor_Information ct = new Custmor_Information();
				ct.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(442, 95, 174, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LOGOUT");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = JOptionPane.showConfirmDialog(btnNewButton_3, "Are you sure?");
				if(a==JOptionPane.YES_OPTION){
					dispose();
					SIGNUP sign= new SIGNUP();
					sign.setTitle(null);
					sign.setVisible(true);
				}
				/*dispose();
				SIGNUP sign= new SIGNUP();
				sign.setTitle(null);
				sign.setVisible(true);*/
			}
		});
		btnNewButton_3.setBounds(227, 202, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblElectronicShop = new JLabel("ELECTRONIC SHOP");
		lblElectronicShop.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElectronicShop.setBounds(243, 11, 158, 14);
		contentPane.add(lblElectronicShop);
		
		JButton btnNewButton = new JButton("STOCK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Stock stock = new Stock();
				stock.setVisible(true);
			}
		});
		btnNewButton.setBounds(28, 95, 89, 23);
		contentPane.add(btnNewButton);
		this.setLocationRelativeTo(null);
	}
}
