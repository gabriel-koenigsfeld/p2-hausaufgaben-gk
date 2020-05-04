package datastructures;

public class Account {

	private String username;
	private int phoneNumber;

	public Account(String username, int phoneNumber) {
		super();
		this.username = username;
		this.phoneNumber = phoneNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}
