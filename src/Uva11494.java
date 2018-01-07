import java.util.Scanner;

public class Uva11494 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q1, q2, o2, o1;
		q1 =sc.nextInt();
		q2 =sc.nextInt();
		o1 =sc.nextInt();
		o2 =sc.nextInt();
		while(!(q1==0 && q2==0&&o1==0&&o2==0)) {
			
			if(q1==o1 && q2==o2)System.out.println(0);
			else if(q1 == o1 || q2 == o2 || Math.abs(q1-o1) == Math.abs(q2-o2 ))
				System.out.println(1);
			else
				System.out.println(2);
			q1 =sc.nextInt();
			q2 =sc.nextInt();
			o1 =sc.nextInt();
			o2 =sc.nextInt();
		}
	}
}
