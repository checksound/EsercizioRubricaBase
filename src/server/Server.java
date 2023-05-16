package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

public class Server {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<Contatto> cont = new ArrayList<Contatto>();

		System.out.println("Server acceso\n");
		try (ServerSocket serverSocket = new ServerSocket(8000)) {

			while (true) {
				Socket socket = serverSocket.accept();
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				Scanner input = new Scanner(socket.getInputStream());

				System.out.println("Client connesso\n\n\n");

				int trovato = 0;

				String nome = input.nextLine();

				int numero = input.nextInt();

				System.out.println("Nome: " + nome + ", Numero: " + numero);
				cont.add(new Contatto(numero, nome));
				nome = input.next();

				System.out.println("NOME CERCATO: " + nome);

				for (int i = 0; i < cont.size(); i++) {
					if (cont.get(i).getNome().equals(nome)) {
						trovato = 1;
						out.println("Numero associato alla persona è:\t" + cont.get(i).getNumero());
					}
				}

				if (trovato == 0) {
					out.println("Non è stato trovato nessun numero\n");
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}