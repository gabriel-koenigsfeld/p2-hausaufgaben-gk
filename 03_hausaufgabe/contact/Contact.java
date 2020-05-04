package contact;

import java.io.Serializable;

public class Contact implements Comparable<Contact>, Serializable{

	private String name;
	private int phoneNumber;
	
	private static final long serialVersionUID = 1L;

	public Contact(String name, int phonenNumber) {
		super();
		this.name = name;
		this.phoneNumber = phonenNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhonenNumber() {
		return phoneNumber;
	}

	public void setPhonenNumber(int phonenNumber) {
		this.phoneNumber = phonenNumber;
	}

	@Override
	public int compareTo(Contact other) {

		//Wenn der Name nicht gleich ist, wird alphabetisch sortiert.
		// ist der Name gleich, wird nach der Nummer sortiert. (if bedingung)
		
		int val = name.compareTo(other.name);
		if(val == 0) {
			//TODO dann vergleiche nummer
			if(phoneNumber < other.phoneNumber) {
				return -1;
			} else if (phoneNumber > other.phoneNumber) {
				return 1;
			}
			
		}
		return val;
	}

}
