import java.util.Arrays;
import java.util.Scanner;
class Uva11727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 1; k <= t; k++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println("Case "+k+": " + (a+b+c-Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c))));
		}
	}

}
