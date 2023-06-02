import java.util.Locale;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			double valueA = sc.nextDouble();
			double valueB = sc.nextDouble();
			double valueC = sc.nextDouble();
			
			double score = (valueA * 2.0 + valueB * 3.0 + valueC * 5.0) / 10.0;
			
			System.out.printf("%.1f%n", score);
		}
		
		sc.close();
	}
}
