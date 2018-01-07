import java.util.*;
import java.util.Scanner;

class Uva12247 {
	static ArrayList<Integer> b = new ArrayList<Integer>();
	static ArrayList<Integer> g = new  ArrayList<Integer>();
	static ArrayList<Integer> t = new  ArrayList<Integer>();
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < 3; i++) {
		int aux = sc.nextInt();
		t.add(aux);
		g.add(aux);
	}
	for (int i = 0; i < 2; i++) {
		int aux = sc.nextInt();
		t.add(aux);
		b.add(aux);
	}
	
	
	while(!(t.get(0)==0&&t.get(1)==0&&t.get(2)==0&&t.get(3)==0&&t.get(4)==0) ) {
		Collections.sort(g);
		Collections.sort(b);
		Collections.sort(t);
		int iter = 2;
		int p =0;
		for (int i = 1; i >=0; i--) {
			if(g.get(iter)<b.get(i)) continue;
			
			iter--;
			p++;
		}
		if(p==0)
			System.out.println(foo(1));
		else if(g.get(2)>b.get(1) && g.get(1)>b.get(0))
			System.out.println(-1);
		else {
			// Para la menor carta de b
			for (int i = 0; i < g.size(); i++) {
				if(g.get(i) > b.get(0)) {
//					System.out.println("menor: "+g.get(i));
					g.remove(i);
					
					break;
				}
			}
			for (int i = 0; i < g.size(); i++) {
				if(g.get(i)<b.get(1)) {
//					System.out.println("mayor: "+g.get(i));
					g.remove(i);
					break;
				}
			}
//			System.out.println("g: "+g.get(0));
			int aux = foo(g.get(0)+1);
			if(aux>52)System.out.println(-1);
			else
				System.out.println(aux);
		}
		t.clear();
		g.clear();
		b.clear();
		for (int i = 0; i < 3; i++) {
			int aux = sc.nextInt();
			t.add(aux);
			g.add(aux);
		}
		for (int i = 0; i < 2; i++) {
			int aux = sc.nextInt();
			t.add(aux);
			b.add(aux);
		}
	}
}
static int foo(int n) {
	for (int i = 0; i < t.size(); i++) {
		if(t.get(i) == n) n++;
	}
	return n;
}
}
