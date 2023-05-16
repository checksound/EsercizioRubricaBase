package server;

public class Contatto {

	int numero;
	String nome;
	
	public Contatto(int numero, String nome) {
		this.numero=numero;
		this.nome=nome;
	}

	public String toString() {
		return "Numero=" + numero + ",    Nome=" + nome + "";
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
