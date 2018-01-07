import java.util.Arrays;
import java.util.Scanner;
class Uva11364 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		for (int k = 0; k < c; k++) {
			
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] =sc.nextInt();
			}
			Arrays.sort(a);
			int s=0;
			for (int i = 1; i < a.length; i++) {
				//System.out.println(a[i]);
				s+=a[i]-a[i-1];
			}
			System.out.println(s*2);
		}
	}

}
