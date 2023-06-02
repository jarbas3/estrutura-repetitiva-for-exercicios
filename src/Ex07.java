import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			
			int line = i;
			int square = i * i;
			int cube = i * i * i;
			
			System.out.printf("%d %d %d%n", line, square, cube);
		}
		
		sc.close();
	}
}
