package listas.simples;

// nó [(elemento),(próximo)] -> [null]

public class No {
	
	// Atributos
	Candidato candidato;
	No proximo;
	
	public No(Candidato x) {
		this.candidato = x;
		this.proximo = null;
	}
	
}
