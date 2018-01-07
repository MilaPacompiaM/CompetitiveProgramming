import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Uva12554 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int t =Integer.parseInt(inp.readLine());
		String [] arr = new String[t];
		String song[]= {"Happy", "birthday", "to", "you","Happy", "birthday", "to", "you","Happy", "birthday", "to", "Rujia","Happy", "birthday", "to", "you"};
		for (int i = 0, iter=0; i < arr.length; i++) {
			arr[i] = inp.readLine();
		}
		int to = 16;
		if (t>16) to = (t) + (t%16 == 0 ? 0: (16 - (t%16) ));
			
		for (int i = 0, iter=0, iter2=0; i < to; i++, iter++, iter2++) {
			if(iter== t) iter = 0;
			if(iter2 == song.length) iter2=0;
			System.out.printf("%s: %s\n",arr[iter], song[iter2]);
			
		}
	}
}