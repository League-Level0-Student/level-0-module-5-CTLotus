package nested_loops;

public class ForLoopGauntlet {
	public static void main(String[] args) {
		for (int i = 0; i < 101; i++) {
			System.out.println(i);
		}
		for (int j = 100; j > -1; j--) {
			System.out.println(j);
		}
		for (int y = 2; y < 101; y+=2) {
			System.out.println(y);
		}
		for (int u = 1; u < 100; u+=2) {
			System.out.println(u);
		}
		for (int p = 1; p < 501; p++) {
			if (p%2 ==0) {
				System.out.println(p + "even");
			}else {
				System.out.println(p + "odd");
			}
		}
		for (int t = 0; t <= 777; t++) {
			if (t%7==0) {
				System.out.println(t);
			}
		}
		for (int a = 2001; a <= 2019; a++) {
			System.out.println("In " + a + " I was " + (a - 2001)+ " years old. ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
