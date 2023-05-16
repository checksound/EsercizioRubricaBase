package client;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class Client {
	public static void main(String[] args) {
		System.out.println("Client attivo\n\n");

		try (Socket socket = new Socket("localhost", 8000);
				Scanner inputConsole = new Scanner(System.in);
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				Scanner scannerInputSocket = new Scanner(socket.getInputStream())) {

			System.out.println("Inserisci nome:");
			String nomeUtente = inputConsole.nextLine();
			out.println(nomeUtente);
			System.out.println("Inserisci numero:");
			int num = inputConsole.nextInt();
			out.println(num);
			System.out.println("Inserisci nome da ricercare:");
			String nomeRicerca = inputConsole.next();
			out.println(nomeRicerca);
			
			String result = scannerInputSocket.nextLine();
			System.out.println("Result: " + result);
			
		} catch (IOException e) {
			System.out.println("SONO QUI!!!");
			e.printStackTrace();
		}
	}
}