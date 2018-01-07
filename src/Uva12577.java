import java.util.*;
public class Uva12577 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int con =1;
		String str = sc.nextLine();
		while(!str.equals("*")) {
			
			if(str.equalsIgnoreCase("Hajj")) System.out.printf("Case %d: Hajj-e-Akbar\n", con);
			else  System.out.printf("Case %d: Hajj-e-Asghar\n", con);
			con++;
			str=sc.next();
		}
		
	}
}
