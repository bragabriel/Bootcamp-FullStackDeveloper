package collections_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class iteracao_metodos {

	public static void main(String[] args) {
		
		/* ArrayList: deve ser usado onde mais opera��es de pesquisa s�o necess�rias.
		 * LinkedList: deve ser usado onde mais opera��es de inser��o e exclus�o s�o necess�rias.*/
	
		System.out.println("\nCrie uma lista e adicione sete notas: ");
		
		List<Double> notas = new ArrayList<Double>();
		notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
		
		System.out.println(notas);
		System.out.println(notas.toString());
		
		
		System.out.println("\nExiba a posi��o da nota 5.0: " + notas.indexOf(5d));

		
	    System.out.println("\nAdicione na lista a nota 8.0 na posi��o 4: ");
	    notas.add(4, 8d);
	    System.out.println(notas);

	    
	    System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
	    notas.set(notas.indexOf(5d), 6.0);
	    System.out.println(notas);

	    
	    System.out.println("\nConfira se a nota 5.0 est� na lista: " + notas.contains(5d));

	    
	    System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
	    for (Double nota : notas) System.out.print(nota + " ");

	    
	    System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
	    System.out.println(notas.toString());
	    

	    System.out.println("Exiba a menor nota: " + Collections.min(notas));

	    
	    System.out.println("Exiba a maior nota: " + Collections.max(notas));

	        
	    
	    Iterator<Double> iterator = notas.iterator();
	        
	    Double soma = 0d;
	        
	    while(iterator.hasNext()){
	    	Double next = iterator.next();
	    	soma += next;
	    }
	    
	    System.out.println("Exiba a soma dos valores: " + soma);

	    
	    System.out.println("Exiba a m�dia das notas: " + (soma/notas.size()));

	    
	    System.out.println("Remova a nota 0: ");
	    notas.remove(0d);
	    System.out.println(notas);

	    
	    System.out.println("Remova a nota da posi��o 0");
	    notas.remove(0);
	    System.out.println(notas);

	    
	    System.out.println("Remova as notas menores que 7 e exiba a lista: ");
	    Iterator<Double> iterator1 = notas.iterator();
	    while(iterator1.hasNext()) {
	    	Double next = iterator1.next();
	    	if(next < 7) iterator1.remove();
	    }
	    
	    System.out.println(notas);

	    /*System.out.println("Apague toda a lista");
	    notas.clear();
	    System.out.println(notas);
	    */
	    System.out.println("Confira se a lista est� vazia: " + notas.isEmpty()); 
	}
}