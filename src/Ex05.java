import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}
		
		System.out.println(factorial);
		
		sc.close();
	}
}
