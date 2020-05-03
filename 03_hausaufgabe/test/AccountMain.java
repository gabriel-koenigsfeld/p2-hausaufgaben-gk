package test;

import java.util.HashSet;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		HashSet<Account> accounts = new HashSet<>();
		

		Account account01 = new Account("Tack", 363636);
		accounts.add(account01);
		
		Account account02 = new Account("Sina", 201020);
		accounts.add(account02);
		
		Account account03 = new Account("Jessie", 735513);
		accounts.add(account03);
		
		Account account04 = new Account("Kiwoke", 696969);
		accounts.add(account04);

		Scanner scanner = new Scanner(System.in);
		
		try {
			Account account05 = new Account(scanner.nextLine(),scanner.nextInt());
			accounts.add(account05);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			scanner.close();
		}
		
		for(Account account:accounts) {
			System.out.println("Username: "+ account.getUsername());
			System.out.println("Number: "+ account.getPhoneNumber() + "\n");
		}
		
	}
}
