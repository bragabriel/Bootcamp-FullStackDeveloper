import java.util.Scanner;

public class ex6_Fatorial {

	public static void main(String[] args) {
		/* Fa�a um programa que calcule o fatorial de um n�mero inteiro
		 * fornecido pelo usu�rio. 
		 * Ex: 5! = 120 (5x4x3x2x1)
		*/
		int fatorial;
		int i;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um n�mero para ver seu fatorial: ");
		fatorial = scan.nextInt();
		
		int resultado = fatorial;
		
		for(i = 1; i < fatorial; i++) {
			resultado *= (fatorial-i); 
		}
		System.out.println("O fatorial do n�mero " + fatorial + " �: " + resultado);
	}
}