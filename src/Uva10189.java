import java.util.*;
class Uva10189 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m = 0, count = 1;
		n = sc.nextInt();
		m = sc.nextInt();
		while( n != 0 || n != 0) {
			if(count != 1) System.out.println();
			
			char[][] arr = new char[n][m]; 
			for (int i = 0; i < n; i++) {
				String str = sc.next();
				arr[i] = str.toCharArray();
			}
			
			System.out.printf("Field #%d:\n", count);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					int s = 0;
					if(arr[i][j] == '*');
					else {
						if(i >= 1 && j >= 1 && arr[i-1][j-1] == '*') s++;
						if(j >= 1 && arr[i][j-1] == '*') s++;
						if(i < n-1 && j >= 1 && arr[i+1][j-1] == '*') s++;
						if(i >= 1 && arr[i-1][j] == '*') s++;
						if(i < n-1 && arr[i+1][j] == '*') s++;
						if(i >= 1 && j < m-1 && arr[i-1][j+1] == '*') s++;
						if(j < m-1 && arr[i][j+1] == '*') s++;
						if(i < n-1 && j < m-1 && arr[i+1][j+1] == '*') s++;
						arr[i][j] = (char) ('0' + s);
					}
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			count++;
			n = sc.nextInt();
			m = sc.nextInt();
		}
	}
}
