import java.util.Scanner;

public class basico_adHoc {

	public static void main(String[] args) {
		/*Calibrar os pneus do carro deve ser uma tarefa cotidiana de todos os motoristas.
		 *Para isto, os postos de gasolina possuem uma bomba de ar.
		 *A maioria das bombas atuais s�o eletr�nicas, permitindo que o motorista indique a
		 * press�o desejada num teclado. Ao ser ligada ao pneu, a bomba primeiro l� a press�o
		 * atual e calcula a diferen�a de press�o entre a desejada e a lida.
		 * Com esta diferen�a ela esvazia ou enche o pneu para chegar na press�o correta.

			Sua ajuda foi requisitada para desenvolver o programa da pr�xima bomba da SBC - Sistemas de Bombas Computadorizadas.
			Escreva um programa que, dada a press�o desejada digitada pelo motorista e
			 a press�o do pneu lida pela bomba, indica a diferen�a entre a press�o desejada e a press�o lida.
		*/

		Scanner scan = new Scanner(System.in);

	    int N = scan.nextInt();
	    int M = scan.nextInt();
		    
		System.out.println( N-M );
	}
}