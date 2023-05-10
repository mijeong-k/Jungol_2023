package q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inp=new int[2];		
		for(int i=0;i<inp.length;i++) {
			inp[i]=sc.nextInt();
		}
		sc.close();
		
		int res1=(inp[0]==inp[1])? 1:0;
		int res2=(inp[0]!=inp[1])? 1:0;
		System.out.println(res1);
		System.out.println(res2);
		
		
//		int n1 = sc.nextInt();
//		int n2 = sc.nextInt();
//		sc.close();

//		String str1 = (n1==n2)? "true":"false";
//		String str2 = (n1!=n2)? "true":"false";
//		System.out.println(str1);
//		System.out.println(str2);
		
//		if (n1 == n2) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//
//		if (n1 != n2) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}


	}

}
