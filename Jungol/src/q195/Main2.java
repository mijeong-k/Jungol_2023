package q195;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String addres = sc.next();
		sc.close();
		
		Person person=new Person(name, tel, addres);
		
		person.print();
		
	}

}
