package P20171118;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Uva00584 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String l = bf.readLine();
		while(!l.equals("Game Over"))
		{
			int total = 0;
			int a = 0, valor = 0, na = 0, ant = 0, cant = 1;
			int n = 0;
			String [] ll = l.split("[ ]+");
			for (int i = 0; i < ll.length; i++) 
			{
				if(ll[i].equals("/"))
				{
					valor = 10-ant;
					n++;
					if(n <= 20) na = 1;
					else na = 0;
					
				}
				else if(ll[i].equals("X"))
				{
					valor = 10;
					n+=2;
					if(n <= 20) na = 2;
					else na = 0;
					
				}
				else
				{
					valor = Integer.parseInt(ll[i].charAt(0)+"");
					na = 0;
					n++;
				}
				
				total+=valor;
				if(a>2) {cant=2;}
				else cant = 1;
				if(a>0 && n<=20)
				{
					total+=(valor*cant);
					a-=cant;
				}
				if(a > 2 && n> 20) 
				{
					total+= valor;
					a--;
				}
				a+=na;

				ant = valor; 
			}
			
			l = bf.readLine();
			System.out.println(total);
		}
	}
}
