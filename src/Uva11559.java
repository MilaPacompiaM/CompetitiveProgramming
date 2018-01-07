import java.util.*;
public class Uva11559 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int n=sc.nextInt();
			int dinero = sc.nextInt();
			int hotel = sc.nextInt();
			int semanas=sc.nextInt();
			
			int minimo = Integer.MAX_VALUE;
			
			for (int i = 0; i < hotel; i++) {
				int dineroya = dinero;
				int porpersona = sc.nextInt();
				
				int gastosemanal = porpersona * n ; 
				//System.out.println("*"+gastosemanal);
				int suma = 0;
				for(int j=0; j < semanas; j++) {
					int cuartos = sc.nextInt();
					
					if(gastosemanal > dineroya) continue;
					
					if(n > cuartos) continue;
					if(suma != 0) continue;
					
					suma = suma + gastosemanal; 
					dineroya = dineroya - gastosemanal;
					
				}
				if(suma != 0)
					minimo = Math.min(minimo, suma);
			}
			if(minimo == Integer.MAX_VALUE )
				System.out.println("stay home");
			else
				System.out.println(minimo);
		}
	}

}
