package contact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hausaufgabe {

	public static void main(String[] args) {
		
		//Variante 2
		//Aufgabe 1
		
		//TXT-Datei erstellen mit Objekt
		try {
			File file = new File("test.txt");

			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Contact test = new Contact("Test", 123);
			oos.writeObject(test);

			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		//TXT-Datei auslesen
		try {
			File file = new File("test.txt");
			
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();

			if (obj instanceof Contact) {
				Contact bla = (Contact) obj;
				System.out.println(bla.getName() + " " + bla.getPhonenNumber());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		//Variante 2
		//Aufgabe 2
		
		//PrintWriter Text in Datei schreiben
		try {
			File file = new File("file.txt");
			
			FileWriter out = new FileWriter(file);
			PrintWriter writer = new PrintWriter(out);

			writer.println("Hier ist mein Text");
			
			writer.close();
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		//Mit Scanner Datei auslesen
		try {
			File file = new File("file.txt");
			
			Scanner scanner = new Scanner(file);
			
			String line = scanner.nextLine();
			System.out.println(line);
			
			scanner.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
