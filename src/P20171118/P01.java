package P20171118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class P01 {
public static void main(String[] args) throws IOException {
	BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
	String line;
	while((line = inp.readLine()) != null) {
		String [] str = line.split("[ ]+");
		int a = Integer.parseInt(str[0]);
		int b = Integer.parseInt(str[1]);
		int pares[][] = new int[b][2];
		for (int i = 0; i < b; i++) {
			str = inp.readLine().split("[ ]+");
			pares[i][0] = Integer.parseInt(str[0]);
			pares[i][1] = Integer.parseInt(str[1]);
		}
		int mine = Integer.parseInt(inp.readLine());
		
		int arreglo []  = new int [a+1];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i]=i;
		}
		for (int i = 0; i < pares.length; i++) {
		
				int x =pares[i][0];
			
				while(arreglo[x]!=x) {
					x=arreglo[x];
				}
				int y =pares[i][1];
				while(arreglo[y]!=y) {
					y=arreglo[y];
				}
				if (x==pares[i][0]) {
					
					arreglo[x]=y;
				continue;
				}
				if ( y == pares [i][1]) {
					
					arreglo[y]=x;
				continue;
				}
				
				arreglo[i]=x;
			
		}
		int x= mine ; 
		int y =0 ;
		
		while(arreglo[x]!=x) {
			x=arreglo[x];
		}
		int rpta = 0 ; 
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
			if(arreglo[i]==x)rpta++;
		}
		System.out.println();
		System.out.println(rpta);
		
	}
}
}
