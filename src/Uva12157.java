import java.io.*;
public class Uva12157 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(inp.readLine());
		int iter = 1;
		while(t-- > 0) {
			int n = Integer.parseInt(inp.readLine());
			int m = 0;
			int j = 0;
			
			String [] arr =inp.readLine().split("[ ]+");
			for (int i = 0; i < n; i++) {
				int llamada = Integer.parseInt(arr[i]);
				m += 10*((30 + llamada )/ 30);
				j += 15*((60 + llamada )/60);
			}
			//System.out.println(m +"  " +j);
			if(m == j) System.out.printf("Case %d: Mile Juice %d\n", iter, m);
			else if(m < j) System.out.printf("Case %d: Mile %d\n", iter, m);
			else
				System.out.printf("Case %d: Juice %d\n", iter, j);
			iter++;
		}
		
	}
}
