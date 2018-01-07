import java.util.*;

class Uva00555 {
	static String [] arr = {"C2","C3","C4","C5","C6","C7","C8","C9","CT","CJ","CQ","CK","CA",     "D2","D3","D4","D5","D6","D7","D8","D9","DT","DJ","DQ","DK","DA",    "S2","S3","S4","S5","S6","S7","S8","S9","ST","SJ","SQ","SK","SA",   "H2","H3","H4","H5","H6","H7","H8","H9","HT","HJ","HQ","HK","HA"};
	static String[] play = {"S","W","N","E"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> m = new HashMap<String, Integer>();
		for (int i = 0; i < arr.length; i++) {
			m.put(arr[i], i);
		}
		char c = sc.next().charAt(0);
		while (c!='#') {
			//	Map<String, Integer> players= new HashMap<String, Integer>();
			//	players.put(key, value)
			int ini = foo(c) + 1;
			int top = ini + 4;
			String str1 = sc.next();
			String str2 = sc.next();
			int[][] ans = new int[4][13];
			int iter = 0;
			for (int i = 0; i < str1.length(); i+=2) {
				ans[(ini%4)][iter] = m.get(str1.substring(i, i+2));
				ini++;
				if(ini == top) {
					ini = ini - 4;
					iter++;
				}
			}
			for (int i = 0; i < str2.length(); i+=2) {
				ans[ini%4][iter] = m.get(str2.substring(i, i+2));
				ini++;
				if(ini == top) {
					ini = ini - 4;
					iter++;
				}
			}
			print(ans);
			c = sc.next().charAt(0);
		}
	}
	static int foo(char c) {
		switch (c) {
		case 'S':
			return 0;
		case 'W':
			return 1;
		case 'N':
			return 2;
		default:
			return 3;
		}
	}
	static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			Arrays.sort(m[i]);
			System.out.print(play[i]+":");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(" "+arr[m[i][j]]);
			}
			System.out.println();
		}
	}

}