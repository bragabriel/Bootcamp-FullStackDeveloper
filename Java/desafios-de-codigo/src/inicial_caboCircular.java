import java.util.Scanner;

public class inicial_caboCircular {

	public static void main(String[] args) {
		/* Voc� tem em m�os dois cabos circulares de energia. 
		 * O primeiro cabo tem raio R1 e o segundo raio R2.
		 * Voc� precisa comprar um conduite circular de maneira a passar os dois cabos por dentro dele:
	    
	    Qual o menor raio do conduite que voc� deve comprar?
		 Em outras palavras, dado dois c�rculos, qual 
		 o raio do menor c�rculo que possa englobar ambos os dois?
		 * */

		Scanner scan = new Scanner(System.in);
			int T = scan.nextInt();
		    
		for (int i = 0; i < T; i++) {
			int R1 = scan.nextInt();
		    int R2 = scan.nextInt();
		    System.out.println(((R1+R1) + (R2+R2)) / 2);
		}
	}
}