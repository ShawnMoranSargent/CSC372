package BankGUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.util.Random;

public class Banking {
		public static void main(String[] args) {
		// MAKING FRAME
		JFrame bankFrame = new JFrame();
		bankFrame.setLayout(new CardLayout());
		
		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 400;
		
		Random rand = new Random();
		
		Account NewAccount = new Account();
		
		//************************** Defining greeting Panel*****************************
		JPanel greetingPanel = new JPanel();
		
		greetingPanel.setLayout(new BoxLayout(greetingPanel, BoxLayout.Y_AXIS));
		greetingPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20)); // Magic numbers dont kill me please
		greetingPanel.setBackground(Color.gray);
		
		
		// I am terrible at Graphic design...
		JLabel StartTitle = new JLabel("Welcome to SCMS Banking!");
		StartTitle.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JLabel firstNameLab = new JLabel("Enter First Name:");
		firstNameLab.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JLabel lastNameLab = new JLabel("Enter Last Name:");
		lastNameLab.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JTextField FirstnameInput = new JTextField(16);
		FirstnameInput.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JTextField LastnameInput = new JTextField(16);
		LastnameInput.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JButton CreateAccount = new JButton("Create Account");
		CreateAccount.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		
		
		JPanel accountInputPanel = new JPanel();
		accountInputPanel.add(firstNameLab);
		accountInputPanel.add(FirstnameInput);
		accountInputPanel.add(lastNameLab);
		accountInputPanel.add(LastnameInput);
		accountInputPanel.setBackground(Color.gray);
		
		greetingPanel.add(StartTitle);
		greetingPanel.add(accountInputPanel);
		greetingPanel.add(CreateAccount);
		
		
		//************************** Defining Transaction Panel*****************************
		JPanel transactionPanel = new JPanel();
		transactionPanel.setLayout(new BoxLayout(transactionPanel, BoxLayout.Y_AXIS));
		transactionPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20)); // Magic numbers dont kill me please
		transactionPanel.setBackground(Color.gray);
		
		JLabel Errors = new JLabel("");
		Errors.setAlignmentX(transactionPanel.CENTER_ALIGNMENT);
		
		JLabel transactionTitle = new JLabel("Let's Make a Transaction!");
		transactionTitle.setAlignmentX(transactionPanel.CENTER_ALIGNMENT);
		
		JLabel accountBalance = new JLabel("Current Balance: " + Double.toString(NewAccount.getBalance()));
		accountBalance.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JTextField moneyInput = new JTextField(16);
		moneyInput.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JButton depositButt = new JButton("Deposit");
		depositButt.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JButton withdrawButt = new JButton("Withdraw");
		withdrawButt.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JButton SummaryButton = new JButton("Summary");
		SummaryButton.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JPanel moneyInputPanel = new JPanel();
		moneyInputPanel.add(moneyInput);
		moneyInputPanel.add(depositButt);
		moneyInputPanel.add(withdrawButt);
		moneyInputPanel.setBackground(Color.gray);
		
		transactionPanel.add(transactionTitle);
		transactionPanel.add(accountBalance);
		transactionPanel.add(moneyInputPanel);
		transactionPanel.add(Errors);
		transactionPanel.add(SummaryButton);
		
		//************************** Defining Summary Panel*****************************
		JPanel summaryPanel = new JPanel();
		summaryPanel.setLayout(new BoxLayout(summaryPanel, BoxLayout.Y_AXIS));
		summaryPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20)); // Magic numbers dont kill me please
		summaryPanel.setBackground(Color.gray);
		
		JLabel SummaryTitle = new JLabel("Account Summary");
		SummaryTitle.setAlignmentX(transactionPanel.CENTER_ALIGNMENT);
		
		JLabel AccountID = new JLabel("AccountID: " + NewAccount.getAccountID());
		AccountID.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JLabel AccountFullName = new JLabel("Account Holder: " + NewAccount.getFirstName() + " " + NewAccount.getLastName());
		AccountFullName.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		JLabel AccountBal = new JLabel("Current Balance: " + Double.toString(NewAccount.getBalance()));
		AccountBal.setAlignmentX(greetingPanel.CENTER_ALIGNMENT);
		
		summaryPanel.add(SummaryTitle);
		summaryPanel.add(AccountID);
		summaryPanel.add(AccountFullName);
		summaryPanel.add(AccountBal);
		
		bankFrame.add(greetingPanel);
		bankFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		bankFrame.setTitle("Shawn's Basic Banking Application");
		bankFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bankFrame.setVisible(true);
		// button action listeners
		CreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
				NewAccount.setFirstName(FirstnameInput.getText());
				NewAccount.setLastName(LastnameInput.getText());
				NewAccount.setAccountID(rand.nextInt(1000000));
				
				accountBalance.setText("Current Balance: " + Double.toString(NewAccount.getBalance()));
				bankFrame.remove(greetingPanel);
				bankFrame.add(transactionPanel);
				bankFrame.setVisible(true);
			}
		});
		
		depositButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					NewAccount.deposit(Double.parseDouble(moneyInput.getText()));
					Errors.setText("Success!");
				}
				catch(Exception e) {
					Errors.setText("You didn't input a number. Please try again!");
				}
				finally {
					accountBalance.setText("Current Balance: " + Double.toString(NewAccount.getBalance()));
				}
			}
			
		});
		
		withdrawButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					NewAccount.withdrawal(Double.parseDouble(moneyInput.getText()));
					Errors.setText("Success!");
				}
				catch(Exception e) {
					Errors.setText("You didn't input a number. Please try again!");
				}
				finally {
					accountBalance.setText("Current Balance: " + Double.toString(NewAccount.getBalance()));
				}
			}
			
		});
		SummaryButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				AccountID.setText("AccountID: " + NewAccount.getAccountID());
				AccountFullName.setText("Account Holder: " + NewAccount.getFirstName() + " " + NewAccount.getLastName());
				AccountBal.setText("Current Balance: " + Double.toString(NewAccount.getBalance()));
				bankFrame.remove(transactionPanel);
				bankFrame.add(summaryPanel);
				bankFrame.setVisible(true);
			}
			
		});
		
			
		}
}
