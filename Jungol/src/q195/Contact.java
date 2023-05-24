package q195;

public class Contact {
	private String name;
	private String tel;
	private String address;

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
