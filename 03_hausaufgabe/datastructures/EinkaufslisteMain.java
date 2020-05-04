package datastructures;

import java.util.HashMap;
import java.util.Set;

public class EinkaufslisteMain {

	public static void main(String[] args) {
		
		HashMap<String, String> einkaufsliste = new HashMap<>();
		
		einkaufsliste.put("Kartoffelchips", "2 Packungen");
		einkaufsliste.put("Nachos", "1 Packung");
		einkaufsliste.put("NFC-Chips", "10");
		einkaufsliste.put("Dip", "2 Gläser");
		
		Set<String> einkaufName = einkaufsliste.keySet();
		
		for(String name : einkaufName) {
			System.out.println( name + " : "+ einkaufsliste.get(name));
		}
		
		
		
	}

}
