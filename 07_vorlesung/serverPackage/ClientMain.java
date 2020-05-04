package serverPackage;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {

	private boolean isRunning = true;
	public void createClient() {

		try {

//			Verbindung zum Server
			Socket socket = new Socket("127.0.0.1", 3445);

//			Writer und Scanner erstellen
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			Scanner scanner = new Scanner(socket.getInputStream());

			System.out.println("Bitte gib eine Nachricht ein:");

//			Keyboard scannen
			Scanner keyboardScanner = new Scanner(System.in);

//			Methode extracted (ALT + SHIFT + M)
			writeMessage(printWriter, keyboardScanner);

			while(isRunning) {
				System.out.println(scanner.nextLine());
			}
			
			keyboardScanner.close();
			scanner.close();
			printWriter.close();
			socket.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void writeMessage(PrintWriter printWriter, Scanner keyboardScanner) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(isRunning) {
//						Nachricht von Tastatur einlseen
//						Schicken übers Netzwerk
					String text = keyboardScanner.next();
					
					if(text.equals("quit")) {
						isRunning = false;
					} else {
						printWriter.println(text);
						printWriter.flush();
					}
				}
			}
		}).start();
	}

	public static void main(String[] args) {

		ClientMain client = new ClientMain();
		client.createClient();
	}
}
