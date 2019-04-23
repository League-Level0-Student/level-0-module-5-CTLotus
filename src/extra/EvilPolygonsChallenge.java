package extra;
import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {
	
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot lul = new Robot ();
		//2. Set the speed to 100
		lul.setSpeed(100);
		int colorChoice=JOptionPane.showOptionDialog(null, "What color do you want?", "title", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new String[]{"Blue","Red", "Black","Green","Yellow"}, 0);
		System.out.println();
		//3. Use if statements to check the the value of colorChoice and set the pen color accordingly 
		if (colorChoice == 2) {
			lul.setPenColor(255,255,255);
			lul.penDown();
		}
		if (colorChoice == 0) {
			lul.setPenColor(0,0,255);
			lul.penDown();
		}
		if (colorChoice == 1) {
			lul.setPenColor(255,0,0);
			lul.penDown();
		}
		if (colorChoice == 3) {
			lul.setPenColor(0,255,0);
			lul.penDown();
		}
		if (colorChoice ==4) {
			lul.setPenColor(255,255,0);
			lul.penDown();
		}
		//4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons do you want to draw?");
		//5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < 2; i++) {
		lul.turn(75);
		lul.move(100);
		lul.turn(-150);
		lul.move(100);
		lul.turn(-105);
		lul.move(50);
	}
		for (int i = 0; i < 2; i++) {
		lul.turn(90);
		lul.move(75);;
		lul.move(90);
		lul.turn(45);
		lul.move(100);
		lul.turn(45);
		lul.move(150);
		lul.turn(90);
		lul.move(200);
		lul.turn(90);
		lul.move(150);
		lul.turn(45);
		lul.move(100);
	}
		lul.penDown();
	
		//6. Make it so your shapes do not overlap

		//7. Challenge: add more colors to the Option Dialog.
	}
}

