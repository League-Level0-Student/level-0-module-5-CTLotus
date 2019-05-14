package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean userguess = true;
		boolean prim1 = true;
		String user = JOptionPane.showInputDialog("Pick a number. Any number..");
		int num = Integer.parseInt(user);
		String confirm = JOptionPane.showInputDialog("Is the number a prime number?");
		if (confirm.equals("yes")) {
			userguess = true;
		}else {
			prim1 = false;
		}
		for (int i = 2; i < num; i++) {
			if(num%i == 0) {
				prim1 = false;
				break;
		} 
		
			
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
}
