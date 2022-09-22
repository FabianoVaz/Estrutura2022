package listas.simples;

public class ListaLigada {
	// Atributo: referência para posição de memória
	No inicio; // Artur -> null  ... -> George -> Maine -> null
	
	/**
	 * Esse método serve para nada... te vira!!
	 * @param um coisa ai qualquer novo
	 */
	
	public void add(No novo) {
		if(inicio == null)
			inicio = novo;
		else {
			No atual = inicio;		// atual = George | inicio = Artur
			while(atual.proximo != null)
				atual = atual.proximo;
			atual.proximo = novo;
		}
	}
	
	public Candidato procurar(int numero) {
		No atual = inicio;
		while(atual != null) {		// atual = George
			if(numero == atual.candidato.getNumero())
				return atual.candidato;
			atual = atual.proximo;
		}
		return null;
	}
	
	public void exibir() {
		for(No atual = inicio; atual != null; atual = atual.proximo)
			System.out.println(atual.candidato.getNome() + "\t" +	
					atual.candidato.getVotos() );
	}
	
	public Candidato apuração() {
		Candidato tmp = null;
		int maior = inicio.candidato.getVotos();
		for(No atual = inicio; atual != null; atual = atual.proximo) {
			if( atual.candidato.getVotos() >= maior) {
				maior = atual.candidato.getVotos();
				tmp = atual.candidato;
			}
		}
		return tmp;
	}

	public int size() {	// quantidade de candidatos inseridos 
		No atual = inicio;
		int count = 0;
		while(atual != null) {
			count++;
			atual = atual.proximo;
		}
		return count;
	}
	
	public boolean contains(Candidato c) {
		No atual = inicio;
		while(atual != null) {
			if(c == atual.candidato )
				return true;
			atual = atual.proximo;
		}
		return false;
	}
}
