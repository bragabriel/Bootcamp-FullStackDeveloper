import java.text.DecimalFormat;
import java.util.Scanner;

public class basico_apiario {

	public static void main(String[] args) {
		/* Seu J�lio � propriet�rio de um grande api�rio situado no interior da Para�ba.
		 *  Todo ano, semestralmente, seu J�lio coleta o mel produzido pelas abelhas da sua propriedade
		 *  e armazena-o em um recipiente de formato CIL�NDRICO para que facilite o transporte do mel
		 *  para os estabelecimentos que encomendam esse produto natural para a comercializa��o.
	
		Certa vez seu J�lio percebeu que devido a um crescimento na produ��o do mel,
		 em rela��o ao semestre anterior, o recipiente que possuia n�o suportaria o
		 volume de mel produzido por suas abelhas. Seu J�lio precisa agora que voc�
		 fa�a um programa que informado o volume de mel em cm3 e o di�metro da parte
		 interna do recipiente em cm, calcule e mostre:

		- Qual deve ser a altura(em cm) da parte interna do recipiente;

		- A �rea(em cm2) da boca(entrada) do recipiente.

		Obs.: Considere pi = 3.14
		*/

		Scanner leitor = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.00");
    	double V, D, R, area, altura;
    	
    	while (leitor.hasNext()) {
    		V = leitor.nextDouble();
    		D = leitor.nextDouble();
    		R = D/2;
    		area = 3.14 * (R*R);
    		altura = V / ((R*R) * 3.14);
    		System.out.println("ALTURA = " + df.format(altura));
    		System.out.println("AREA = " + df.format(area));
    	}
	}
}