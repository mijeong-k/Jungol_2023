package q195;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addres = sc.next();
		sc.close();
		
		Info person1=new Info(name, tel, addres);
		
		person1.print();

	}

}
