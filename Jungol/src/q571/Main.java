package q571;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp=sc.nextInt();
		sc.close();
		
		StringPrint print = new StringPrint();
		
		print.setNum(inp);	
		print.printStr();

	}

}
