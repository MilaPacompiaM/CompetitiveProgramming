import java.util.*;

public class Uva00101 {
	public static int[] pos;
	public static Stack[] list;
	public static int ert = 0;
	public static void oper1(int a, int b) {
		int sna = pos[a];
		int snb = pos[b];
		Stack s = list[sna];
		int aux = -1;
		while(!s.isEmpty() && (aux = (int) s.peek()) != a) {
			pos[aux] = aux;
			list[aux].push(aux);
			s.pop();
		}
		if (aux == a) s.pop();
		aux = -1;
		s = list[snb];
		while(!s.isEmpty() && (aux = (int) s.peek()) != b) {
			pos[aux] = aux;
			list[aux].push(aux);
			s.pop();
		}
		s.push(a);
	}
	public static void oper2(int a, int b) {
		int sna = pos[a];
		int snb = pos[b];
		Stack s = list[sna];
		int aux = -1;
		while(!s.isEmpty() && (aux = (int) s.peek()) != a) {
			pos[aux] = aux;
			list[aux].push(aux);
			s.pop();
		}
		if (aux == a) s.pop();
		s = list[snb];
		s.push(a);
	}
	public static void oper3(int a, int b) {
		int sna = pos[a];
		int snb = pos[b];
		Stack s = list[snb];
		int aux = -1;
		while(!s.isEmpty() && (aux = (int) s.peek()) != b) {
			pos[aux] = aux;
			list[aux].push(aux);
			s.pop();
		}
		s = list[sna];
		Stack temp = new Stack<>();
		while(!s.isEmpty() && (aux = (int) s.peek()) != a) {
			temp.push(aux);
			s.pop();
		}
		temp.push(aux);
		s.pop();
		
		s = list[snb];
		while(!temp.isEmpty()) {
			s.push(temp.peek());
			pos[(int)temp.peek()] = snb;
			temp.pop();
		}
	}
	public static void oper4(int a, int b) {
		int sna = pos[a];
		int snb = pos[b];
		Stack s = list[snb];
		int aux = -1;
		s = list[sna];
		Stack temp = new Stack<>();
		while(!s.isEmpty() && (aux = (int) s.peek()) != a) {
			temp.push(aux);
			s.pop();
		}
		if (!s.isEmpty()) s.pop();
		temp.push(aux);
		s = list[snb];
		while(!temp.isEmpty()) {
			s.push(temp.peek());
			pos[(int)temp.peek()] = snb;
			temp.pop();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		list = new Stack[n];
		pos = new int[n];
		for (int i = 0; i < pos.length; i++) {
			pos[i] = i;
			list[i] = new Stack<Integer>();
			list[i].push(i);
		}
		String ins1, ins2, line;
		int a, b;
		String[] lit;
		while( !"quit".equals(line = sc.nextLine()) ) {
			lit = line.split("[ ]+");
			a = Integer.parseInt(lit[1]);
			b = Integer.parseInt(lit[3]);
			if(a == b || pos[a] == pos[b]) continue;

			ins1 = lit[0];
			ins2 = lit[2];
			if("move".equals(ins1))
				if("onto".equals(ins2)) oper1(a,b);
				else oper2(a,b);
			else
				if("onto".equals(ins2)) oper3(a,b);
				else oper4(a,b);
			pos[a] = pos[b];
		}
		Stack asd;
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%d:", i);
			asd = list[i];
			Stack other = new Stack<>();
			while(!asd.isEmpty()) {
				other.push(asd.peek());
				asd.pop();
			}
			while(!other.isEmpty()) {
				System.out.printf(" %d", (int)other.peek());
				other.pop();
			}
			System.out.println();
		}
	}

}
