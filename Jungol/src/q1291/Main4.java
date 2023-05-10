package q1291;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	      int s;
	      int e;

	      while (true) {
	         s = sc.nextInt();
	         e = sc.nextInt();
	         if (1 < s && s < 10 && 1 < e && e < 10) {
	            break;
	         }
	         System.out.println("INPUT ERROR!");
	      }
	      int cnt = s < e ? 1 : -1;
//		  if(s<e){
//			cnt=1;
//		  }else{
//	        cnt=-1;
//		  }
//
	      sc.close();

	      for (int i = 1; i < 10; ++i) {
	         for (int j = s;; j += cnt) {
	            System.out.printf("%d * %d = %2d   ", j, i, (j * i));
	            if (j == e) {
	               break;
	            }
	         }
	         System.out.print("\n");

	      }
	   }

	}
