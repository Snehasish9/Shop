import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;

public class Custmor_Information extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Custmor_Information frame = new Custmor_Information();
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
	public Custmor_Information() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 677, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Shop back = new Shop();
				back.setVisible(true);
				dispose();
			}
		});
		btnBack.setBounds(280, 445, 89, 23);
		contentPane.add(btnBack);
		
		table = new JTable();
		table.setBounds(25, 58, 609, 371);
		contentPane.add(table);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 28, 641, 23);
		contentPane.add(separator);
		
		JLabel lblNewLabel = new JLabel("CUSTOMER INFORMATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(225, 11, 191, 14);
		contentPane.add(lblNewLabel);
		this.setLocationRelativeTo(null);
	}
}
