package listas.simples;

// n� [(elemento),(pr�ximo)] -> [null]

public class No {
	
	// Atributos
	Candidato candidato;
	No proximo;
	
	public No(Candidato x) {
		this.candidato = x;
		this.proximo = null;
	}
	
}
