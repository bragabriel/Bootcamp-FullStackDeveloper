import java.util.Scanner;

public class ex5_Tabuada {

	public static void main(String[] args) {
		/* 
		 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
		 * n�mero entre 1 e 10. O usu�rio deve informar de qual n�mero ele deseja ver a tabuada.
		 * A sa�da eve ser conforme o exemplo abaixo:
		*/
		System.out.println("Insira um n�mero para ver sua tabuada: ");
		Scanner scan = new Scanner(System.in);
		
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada do n�mero: " + tabuada);
		
		for (int i = 1; i<=10; i++) {
			System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
		}
	}

}
