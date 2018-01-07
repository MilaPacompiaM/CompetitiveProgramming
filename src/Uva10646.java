import java.util.*;
import java.util.Scanner;

public class Uva10646 {
	static final int N=52;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int test =sc.nextInt();
		int cc = 1;
		while(cc<=test) {
			String[] list = new String[N];
			for (int i = 0; i < list.length; i++) {
				list[i]=(sc.next());
			}
			int y = 0;
			int puntero = 26;
			int aux = puntero;
			for (int i = 0; i < 3; i++) {
//				System.out.println(puntero);
//				System.out.println(list[puntero]);
				int x = value(list[puntero]);
				y = y + x;
				aux = puntero;
				puntero = puntero - (1+10-x);
//				System.out.println("x: "+x);
//				System.out.println(puntero);
			} 
			if(puntero >= y) System.out.println("Case "+ cc+": "+list[y]);
			else {
				System.out.println("Case "+ cc+": "+list[25+(y-puntero)]);
			}
			cc++;
		}
	}
	static int value(String str) {
		char c =  str.charAt(0);
		switch (c) {
		case '2':return 2;
		case '3':return 3;
		case '4':return 4;
		case '5':return 5;
		case '6':return 6;
		case '7':return 7;
		case '8':return 8;
		case '9':return 9;
		default:
			return 10;
		}
	}
}
