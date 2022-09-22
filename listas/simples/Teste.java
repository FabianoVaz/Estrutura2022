package listas.simples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
		
	  ListaLigada lista = new ListaLigada();
	  
	  Candidato c1 = new Candidato(5,"Artur");
	  Candidato c2 = new Candidato(7,"George");
	  Candidato c3 = new Candidato(9,"Maine");
	  Candidato c4 = new Candidato(10,"Elmo");
	  
	  No n1 = new No( c1 ); 
	  No n2 = new No( c2 ); 
	  No n3 = new No( c3 );
	  No n4 = new No( c4 );
	  
	  // cadastrar os cand 
	  lista.add( n1 ); 
	  lista.add( n2 ); 
	  lista.add( n3 );
	  lista.add( n4 );
	  
	  System.out.println("Tamanho: " + lista.size() );
	  
	  System.out.println("Existe: " + lista.contains( c4 ) );
	  
	  // iniciar a votação 
	  int num = 0;
	  while(true) { 
		num = scan.nextInt(); 
		Candidato c = lista.procurar(num);
		if(c != null)
			c.addVoto();
		else
			break;
	  }
	  
	  // votos de cada cand
	  lista.exibir();
	  System.out.println( "\nVotação encerrada!!\n\n" );
	
	  // informar vencedor 
	  Candidato vencedor = lista.apuração();
	  System.out.println(vencedor.getNome() + " ("+vencedor.getVotos()+")" );
	  
		
	}
}
