import java.util.Scanner;

public class Uva10849 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int test = sc.nextInt();
	while(test-- >0) {
		int subcase = sc.nextInt();
		int n = sc.nextInt();
		while(subcase-- > 0) {
			int bf = sc.nextInt();
			int bc = sc.nextInt();
			int of = sc.nextInt();
			int oc = sc.nextInt();
			if( (bf + bc) % 2 != (of + oc) % 2)
				System.out.println("no move");
			else if(bf == of && oc == bc)
				System.out.println(0);
			else if( (bf-of == oc-bc) || (bf-of == bc -oc) )
				System.out.println(1);
			else
				System.out.println(2);
		}
	}
}
}
