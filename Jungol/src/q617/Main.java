package q617;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		String[] str = new String[5];
		int[] arr = new int[5];
		
		for(int i=0; i<str.length; i++) {
			str[i] = sc.next();
			arr[i] = sc.nextInt();
		}
		sc.close();

		People p = new People();		
		
		p.setName(str);
		p.setHeight(arr);
		p.print();
		
	}

}
