import java.util.*;
public class Uva11799 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 1; i <= t; i++) {
			int s = sc.nextInt();
			int max = 0;
			for (int j = 0; j < s; j++) {
				max = Math.max(max, sc.nextInt());
				
			}
			System.out.printf("Case %d: %d\n", i ,max);
			
		}
	}

}
