package classe_anonima;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class classe_anonima {

	public static void main(String[] args) {
		
		/* A classe an�nima em Java � uma classe que n�o recebeu um nome e �
		 * tanto declarado e instanciado em uma �nica instru��o. Voc� deve considerar
		 * o uso de uma classe an�nima sempre que voc� precisa para criar uma classe
		 * que ser� instanciado apenas uma vez */
		
		List <Gato> meusGatos = new ArrayList<>() {
			add(new Gato(nome: "Jon", idade: 12, cor:"branco"));
			add(new Gato(nome: "Douglas", idade: 13, cor:"amarelo"));
		};

		
		//Exemplo SEM a Classe An�nima:
		meusGatos.sort(new ComparatorIdade());
		
		class ComparatorIdade implements Comparator<Gato>{
			@Override
			public int compare(Gato g1, Gato g2) {
				return Integer.compare(g1.getIdade(), g2.getIdade());
			}
		}
		
		//Exemplo COM a classe An�nima:
		meusGatos.sort(new ComparatorIdade<Gato>){
			@Override
			public int compare(Gato g1, Gato g2) {
				return Integer.compare(g1.getIdade(), g2.getIdade());
			
		}
	}
	}
}