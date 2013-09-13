//martin java
package edu.nvcc.bank;

import javax.swing.JOptionPane;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account tanes = new Account(100.00,"Tanes",8888);
		Account craig = new Account(1000000.00,"craig",0000);
		
		JOptionPane.showMessageDialog(null,tanes.getAcNum() + "\n" + tanes.getName() + "\n" + tanes.getBalance());
		tanes.setBalance(30);
		JOptionPane.showMessageDialog(null,tanes);
		
		JOptionPane.showMessageDialog(null,craig);
		
		
		System.out.println("There are " + Account.getCount() + " account(s).");
		Account.setCount(5);
		System.out.println("There are " + tanes.getCount() + " account(s).");
		System.out.println("There are " + craig.getCount() + " account(s).");
		
	}

}
