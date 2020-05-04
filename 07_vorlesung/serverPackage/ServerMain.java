package serverPackage;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public void createServer() {
		
		try {
			
//			Auf Port horchen
			ServerSocket serverSocket = new ServerSocket(3445, 1);
			
//			.accept()
//			Warten auf Client, wirft dann Socket Objekt zurück
			Socket socket = serverSocket.accept();
			
//			.getOutputStream()
//			Writer erstellen, alle Nachrichten über Socket schreiben, Socket schreibt übers netzwerk
			PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			
//			.getInputStream()
//			Nachrichten übers Netzwerk lesen
			Scanner scanner = new Scanner(socket.getInputStream());
			
//			Ausgabe (local)

			printWriter.println("Hallo Client!");
			
//			Ausgabe wird abgeschickt
			printWriter.flush();
			
//			Sachen schließen (im .close() wird ebenfalls geflusht) 
			printWriter.close();
			socket.close();
			serverSocket.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		ServerMain server = new ServerMain();
		server.createServer();
		
	}

}
