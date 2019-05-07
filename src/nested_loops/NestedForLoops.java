package nested_loops;

public class NestedForLoops {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i*3 + j + 1);
			}
			System.out.println();
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(i*10 + j + 1);
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 6; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 100; i > -1; i--) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
