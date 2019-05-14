package extra;

import java.util.Random;

import javax.swing.JOptionPane;

public class CodingPractice {
	public static void main(String[] args) {
		
		Random g = new Random();
		int h = g.nextInt(100);
		
		for (int i = 2; i < h; i+=2) {
			if (i%2 ==0) {
				System.out.println(i);
			}
		}
		
		String ask = JOptionPane.showInputDialog("Think of a number.");
		int o = Integer.parseInt(ask);
		System.out.println(o*10);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
