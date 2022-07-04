package array;

import java.util.Random;

public class ex3_NumerosAleatorios {

	public static void main(String[] args) {
		
		/* Fa�a um programa que leia 20 n�meros inteiros aleat�rios entre 0 e 100, armazene-os em um vetor.
		 * Ao final, mostre os n�meros e seus sucessores 
		*/

		Random random = new Random();
		//Classe para gerar n�meros aleat�rios

		int[] numerosAleatorios = new int[20];
		
		for(int i=0; i<numerosAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numerosAleatorios[i] = numero;
		}
	
		System.out.println("N�meros aleat�rios: ");
		for (int num : numerosAleatorios) {
			System.out.print(num + " ");
		}
		System.out.println("");

		System.out.println("Sucessores dos n�meros aleat�rios: ");
		for (int num : numerosAleatorios) {
			System.out.print((num+1) + " ");
		}
		System.out.println("");
		
		System.out.println("Antecessor dos n�meros aleat�rios: ");
		for (int num : numerosAleatorios) {
			System.out.print((num-1) + " ");
		}
	}
}