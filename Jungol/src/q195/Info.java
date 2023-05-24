package q195;

public class Info {
	private String name;
	private String tel;
	private String address;

	//생성자
	Info(String name, String tel, String address){
		setName(name);
		setTel(tel);
		setAddress(address);
	}
		
	//Set
	public void setName(String name) {
		if(name.length()<=100) {
			this.name = name;			
		}
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//Get
	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}
	
	//Run
	public void print() {
		System.out.println("name : "+getName());
		System.out.println("tel : "+getTel());
		System.out.println("addr : "+getAddress());
	}
}
