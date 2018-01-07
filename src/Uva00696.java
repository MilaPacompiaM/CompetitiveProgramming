import java.util.Scanner;

class Uva00696 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		while(! (m==0 && n==0) ) {
			int a = Math.min(n, m);
			int b = Math.max(m, n);
			if(a==1) System.out.printf("%d knights may be placed on a %d row %d column board.\n", b, m,n);
			else if( (a==2 && b==3) || (a==2 && b==2))System.out.printf("%d knights may be placed on a %d row %d column board.\n", 4, m,n);
			else if(a==2 && b%2 == 1) System.out.printf("%d knights may be placed on a %d row %d column board.\n", ((b+1)/2)*2, m,n);
			else if(a==2 && b%2== 0) {
				if(b%4 == 0) System.out.printf("%d knights may be placed on a %d row %d column board.\n", b, m,n);
				else
					System.out.printf("%d knights may be placed on a %d row %d column board.\n", b+2, m,n);
			}
			else {
				int f1=((m+1)/2)*((n+1)/2);
				int f2=(m - (m+1)/2)*(n - (n+1)/2);
//				System.out.println(f1);
//				System.out.println(f2);
				System.out.printf("%d knights may be placed on a %d row %d column board.\n", (f1+f2), m,n);
			}
			m=sc.nextInt();
			n=sc.nextInt();
		}
	}
}





//if(i - 1 >=0 && j-2>=0 && arr[i-1][j-2] != 1) 
//	arr[i-1][j-2] = -1;
//else if(i - 1 >= 0 && j + 2 < n && arr[i-1][j+2] != 1) 
//	arr[i-1][j+2] = -1;
//else if(i - 2 >=0 && j-1>=0 && arr[i-2][j-1] != 1)
//	arr[i-2][j-1]=-1;
//else if(i - 2 >=0 && j+1<n && arr[i-2][j+1] != 1)
//	arr[i-2][j+1]=-1;
//
//else if(i + 1 <m && j-2>=0 && arr[i+1][j-2] != 1) 
//	arr[i+1][j-2] = -1;
//else if(i + 1 <m && j + 2 < n && arr[i+1][j+2] != 1) 
//	arr[i+1][j+2] = -1;
//else if(i + 2 <m && j-1>=0 && arr[i+2][j-1] != 1)
//	arr[i+2][j-1]=-1;
//else if(i + 2 <m && j+1<n && arr[i+2][j+1] != 1)
//	arr[i+2][j+1]=-1;


//Scanner sc = new Scanner(System.in);
//int m=sc.nextInt();
//int n=sc.nextInt();
//while(m!=0 && n!=0) {
//	int f1=((m+1)/2)*((n+1)/2);
//	int f2=(m - (m+1)/2)*(n - (n+1)/2);
//	System.out.println(f1);
//	System.out.println(f2);
//	System.out.printf("%d knights may be placed on a %d row %d column board.\n", (f1+f2), m,n);
//	m=sc.nextInt();
//	 n=sc.nextInt();