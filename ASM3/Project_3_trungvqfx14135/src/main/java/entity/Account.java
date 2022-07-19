package entity;

public class Account {
	private String user, pass;
	private int role;
	private String name, address, phone;
	private int check;

	public Account() {
		// TODO Auto-generated constructor stub
	}
	

	public Account(String user, String pass, int role, String name, String address, String phone) {
		super();
		this.user = user;
		this.pass = pass;
		this.role = role;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}



	public Account(String user, String pass, int role, String name, String address, String phone, int check) {
		super();
		this.user = user;
		this.pass = pass;
		this.role = role;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.check = check;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	@Override
	public String toString() {
		return "Account [user=" + user + ", pass=" + pass + ", role=" + role + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", check=" + check + "]";
	}

	

	

}
