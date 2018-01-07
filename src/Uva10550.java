import java.util.*;
class Uva10550 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		while(!(a ==0 && b ==0&&c==0&&d==0)) {
			int s = 720 + 360;
//			s = s + (40 - b)*9;
			s = s + ((a-b+40)%40+(c-b+40)%40+(c-d+40)%40)*9;


			System.out.println(s);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
		}
	}

}
