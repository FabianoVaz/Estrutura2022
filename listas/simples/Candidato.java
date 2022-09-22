package listas.simples;

public class Candidato {
	
	// Propriedades (Atributos)
	private int numero;
	private String nome;
	private int votos;
	
	// Construtor (número, nome)
	public Candidato(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.votos = 0;
	}
	
	// Métodos de Acesso (GET e SET)
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

	public int getVotos() {
		return votos;
	}

	public void addVoto() {
		this.votos++;
	}
	
	
}