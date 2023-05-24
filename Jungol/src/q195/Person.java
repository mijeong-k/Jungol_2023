package q195;

public class Person {
	private String name;
	private String tel;
	private String addrs;
	
	public Person(String name, String tel, String addrs) {
		this.name = name;
		this.tel = tel;
		this.addrs = addrs;
	}
	
	//run
	public void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("addr : "+addrs);
	}
}
