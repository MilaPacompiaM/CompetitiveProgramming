import java.util.*;
import java.util.Scanner;

class Uva00119 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int asd = 0;
		while(sc.hasNext()) {
			if(asd != 0) System.out.println();
			int n = sc.nextInt();
			Map<String, Integer> m = new HashMap<String, Integer>();
			String names[]=new String[n];
			for (int i = 0; i < n; i++) {
				names[i] = sc.next();
				m.put(names[i], i);
			}
			int [][] matrix = new int[n][n];
			int [] dio = new int[n];
			for (int i = 0; i < n; i++) {
				int current = m.get(sc.next());
				int money = sc.nextInt();
				int give = sc.nextInt();
				int each = 0;
				if(give != 0)
					each = money / give;
				dio[current] = each * give;
				for (int j = 0; j < give; j++) {
					matrix[current][m.get(sc.next())] = each;
				}
			}
			for (int i = 0; i < n; i++) {
				int recibe = 0;
				for (int j = 0; j < n; j++) {
					recibe = recibe + matrix[j][i];
				}
				dio[i] = recibe - dio[i];
			}
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]+" "+ dio[ m.get(names[i]) ]);
			}
			asd++;
		}

	}

}
