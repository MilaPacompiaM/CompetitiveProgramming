import java.util.*;
 class Uva10324 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int caso =1;
	while(sc.hasNext()) {
		System.out.println("Case "+ caso+":");
		caso++;
		String str = sc.next();
//		System.out.println(('0'-'0'));
		int [][] arr = new int[1000000][3];
		arr[0][0] = str.charAt(0) - '0';
		int i=1;
		int index = 0;
//		int iter=0;
		for ( i = 1; i < str.length(); i++) {
			if(str.charAt(i) == str.charAt(i-1)) {
//				iter++;
				continue;
			}
			arr[index][2] = i - 1;
			index++;
			arr[index][0] = str.charAt(i) - '0';
			arr[index][1] = i;
		}
		arr[index][2] = i-1;
		
		if(index + 1<arr.length)
			arr[index+1][0] = -1;
		
//		print(arr);
		int t = sc.nextInt();
		
		for (int j = 0; j < t; j++) {
			int x=sc.nextInt();
			int y = sc.nextInt();
			int a = Math.min(x, y);
			int b=Math.max(x, y);
			
			for (int k = 0; k < arr.length && arr[k][0] != -1; k++) {
				if(a>=arr[k][1] && a<=arr[k][2]) {
					if(arr[k][2] >= b) System.out.println("Yes");
					else System.out.println("No");
					break;
				}
			}
		}
		
	}
}
static void print(int[][] arr) {
	for (int i = 0; i < arr.length; i++) {
		if(arr[i][0] == -1) break;
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+ " ");
			
		}
		System.out.println();
	}
	
}
}
