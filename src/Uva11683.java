import java.util.Scanner;

class Uva11683 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int alto = sc.nextInt();
	while(alto != 0) {
	int ancho = sc.nextInt();
	int s = 0;
	int before = alto - sc.nextInt();
	for (int i = 0; i < ancho - 1; i++) {
		int aux = alto-sc.nextInt();
		if(before - aux > 0) {
			s = s+(before-aux);
		}
		before = aux;
	}
	s = s + before;
	System.out.println(s);
	alto =sc.nextInt();
	}
}
}
