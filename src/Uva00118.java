import java.util.*;
class Uva00118 {
  public static boolean[][] lost;
  public static int dir(String str) {
    switch (str.charAt(0)) {
    case 'N':
      return 0;
    case 'E':
      return 1;
    case 'S':
      return 2;
    default:
      return 3;
    }
  }
  public static String dirStr(int d) {
    switch (d) {
    case 0:
      return "N";
    case 1:
      return "E";
    case 2:
      return "S";
    default:
      return "W";
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    lost = new boolean[X+1][Y+1];
    int x, y, d, x0, y0;
    String instStr;
    while(sc.hasNext()) {
      x = sc.nextInt();
      y = sc.nextInt();
      d = dir(sc.next());
      instStr = sc.next();
      x0 = x;
      y0 = y;
      boolean interrupted = false;
      for (int i = 0; i < instStr.length(); i++) {
        x0 = x;
        y0 = y;
        switch (instStr.charAt(i)) {
        case 'R':
          d = (d + 1) % 4;
          break;
        case 'L':
          d = (4 + d - 1) % 4;
          break;
        default:
          if (d == 0) y++;
          else if (d == 1) x++;
          else if (d == 2) y--;
          else x--;
          break;
        }
        if(x >= 0 && x <= X && y >= 0 && y <= Y) continue;
        if(lost[x0][y0]) {
          x = x0;
          y = y0;
         
        }
        else {
          lost[x0][y0] = true;
          interrupted = true;
          break;
        }
      }
      if(interrupted) {
        System.out.printf("%d %d %s LOST",x0, y0, dirStr(d));
      }
      else{
        System.out.printf("%d %d %s",x, y, dirStr(d));
      }
      System.out.println();
    }
  }
}
