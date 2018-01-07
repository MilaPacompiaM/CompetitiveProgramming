import java.util.Scanner;

class Uva11507 {
public static void main(String[] args) {
	int[][] m = {{},{1,3,2,4,0,5},{2,1,3,5,4,0},{},{4,0,2,1,3,5},{5,1,0,2,4,3}};
	String data[] = {"+x", "+y", "+z","-x", "-y", "-z"};
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n != 0) {
		int current = 0;
		for (int i = 0; i < n - 1; i++) {
			String str = sc.next();			
			if(str.equals("No")) continue;
			current = m[oper(str)][current];
//			System.out.println(data[current]);
		}
		System.out.println(data[current]);
		n = sc.nextInt();
	}
}
static int oper(String str) {
	if(str.equals("+y") ) return 1;
	if(str.equals("-y") ) return 4;
	if(str.equals("+z") ) return 2;
	return 5;
}

}
