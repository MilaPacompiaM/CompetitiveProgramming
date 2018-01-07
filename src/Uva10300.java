import java.io.*;

class Uva10300 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(inp.readLine());
		
		for (int k = 0; k < t; k++) {
			int f=Integer.parseInt(inp.readLine());
			long s=0;
			for (int i = 0; i < f; i++) {
				String[] arr=inp.readLine().split("[ ]+");
				long a=Long.parseLong(arr[0]);
				long b=Long.parseLong(arr[1]);
				long c=Long.parseLong(arr[2]);
				s+=(a*c);
			}
			System.out.println(s);
		}
		
	}
}
