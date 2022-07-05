package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ex2_crimes {

	public static void main(String[] args) {
		/*
		 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma pessoa
		 * sobre um crime. As perguntas s�o: 1. "Telefonou para a v�tima?" 2.
		 * "Esteve no local do crime?" 3. "Mora perto da v�tima?" 4.
		 * "Devia para a v�tima?" 5. "J� trabalhou com a v�tima?"
		 * 
		 * Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada
		 * como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como "Assassina". Caso
		 * contr�rio, ele ser� classificado como "Inocente".
		 */

		List<String> respostas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Perguntas: ");
		System.out.print("\nTelefonou para v�tima? ");
		String resposta = scanner.next();
		respostas.add(resposta.toLowerCase());

		System.out.print("Esteve no local do crime? ");
		resposta = scanner.next();
		respostas.add(resposta.toLowerCase());

		System.out.print("Mora perto da v�tima? ");
		resposta = scanner.next();
		respostas.add(resposta.toLowerCase());

		System.out.print("Devia para v�tima? ");
		resposta = scanner.next();
		respostas.add(resposta.toLowerCase());

		System.out.print("J� trabalhou com a v�tima? ");
		resposta = scanner.next();
		respostas.add(resposta.toLowerCase());

		System.out.println(respostas);

		int count = 0;

		Iterator<String> contador = respostas.iterator();

		while (contador.hasNext()) {
			String resp = contador.next();
			if (resp.contains("s")) {
				count++;
			}
		}

		switch (count) {
		case 2:
			System.out.println(">> SUSPEITA <<");
			break;
		case 3:
		case 4:
			System.out.println(">> C�MPLICE <<");
			break;
		case 5:
			System.out.println(">> ASSASSINO <<");
			break;
		default:
			System.out.println(">> INOCENTE <<");
			break;
		}
	}
}