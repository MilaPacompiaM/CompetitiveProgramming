import java.util.*;
class Uva12289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			
			String str = sc.next();
			if(one(str)) System.out.println(1);
			else if(two(str)) System.out.println(2);
			else
				System.out.println(3);
			
		}
	}
	static boolean one(String str) {
		int c=0;
		if(str.charAt(0) == 'o')c++;
		if(str.charAt(1) == 'n')c++;
		if(str.charAt(2) == 'e')c++;
		return c>=2;
	}
	static boolean two(String str) {
		int c=0;
		if(str.charAt(0) == 't')c++;
		if(str.charAt(1) == 'w')c++;
		if(str.charAt(2) == 'o')c++;
		return c>=2;
	}
}
