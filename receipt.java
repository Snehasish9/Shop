import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import  java.awt.print.*;
import java.util.Date;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.*;


public class receipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					receipt frame = new receipt();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection = null;
	/**
	 * Create the frame.
	 */
	public receipt() {
		connection = Database_Connection .dbconnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("     ");
		textArea.setBounds(43, 41, 565, 474);
		contentPane.add(textArea);
		
		
		
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 28, 632, 2);
		contentPane.add(separator);
		
		JLabel lblElectronicShop = new JLabel("ELECTRONIC SHOP");
		lblElectronicShop.setBounds(272, 11, 268, 14);
		contentPane.add(lblElectronicShop);
		//this.setVisible(true);
		
			
			JButton btnNewButton = new JButton("Ok");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					
					try{
						
						textArea.setText("\t *****************************************************************************"+"\n\t");
						textArea.setText(textArea.getText()+"\t   Address        \t");
						textArea.setText(textArea.getText()+"                                   phone number             \n");
						textArea.setText(textArea.getText()+"\t City center vishal mega mart indore                  \n");
						
						
						textArea.setText(textArea.getText()+"\t *******************************************************************\n");
						textArea.setText(textArea.getText()+"Date:");
						Date obj = new Date();
						String date  =  obj.toString();
						textArea.setText(textArea.getText()+"\n"+date+"\n\n");
						textArea.setText(textArea.getText()+"Customer Id:"+"\t\t\t");
						textArea.setText(textArea.getText()+"Customer Name:"+"\n\n");
						//textArea.setText("******************");
						textArea.setText(textArea.getText()+"ItemModel:"+"\t");
						textArea.setText(textArea.getText()+"category:"+"\t");
						textArea.setText(textArea.getText()+"Quantity:"+"\t");
						textArea.setText(textArea.getText()+"price:"+"\t");
						textArea.setText(textArea.getText()+"total:"+"\n\n\n\n\n\n\n\n\n\n\n\n");
						textArea.setText(textArea.getText()+"*****************************************************************************"+"\n");
						textArea.setText(textArea.getText()+"total amount:"+"\n");
						textArea.setText(textArea.getText()+"*****************************************************************************"+"\n\n");
						textArea.setText(textArea.getText()+"                          thank you visit again:");
						}
					catch(Exception e){
					e.printStackTrace();	
					}
					}
			});
			btnNewButton.setBounds(249, 526, 89, 23);
			contentPane.add(btnNewButton);
			}
			
			
	}
		
