import java.util.*;
class Uva00573 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alt, arriba, abajo, fatiga;
		alt=sc.nextInt();
		arriba=sc.nextInt();
		abajo=sc.nextInt();
		fatiga=sc.nextInt();

		while(alt!=0) {
			//			int status = 0;
			double sube = 0;
			long day = 1;
			fatiga = fatiga*arriba / 100;
			


			while(true) {
				//if(sube <= 0 && day != 1) break;
				//if(day ==1) sube = sube+arriba;
				//else
				sube = sube + arriba;
				if(arriba > 0)
					arriba = arriba -fatiga;
				if(sube > alt) break;
				sube = sube - abajo;
				if(sube < 0) break;
				day++;
				
//				if(fatiga*( day -1) < arriba)
//					sube = sube + arriba - fatiga*( day-1);
//				if(sube > alt) break;
//
//				if(sube < 0) break;
//
//				sube = sube - abajo;
//				if(sube < 0) break;


			}

			if(sube<0)System.out.printf("failure on day %d\n", day);
			else System.out.printf("success on day %d\n", day);

			alt=sc.nextInt();
			arriba=sc.nextInt();
			abajo=sc.nextInt();
			fatiga=sc.nextInt();
		}
	}
}
