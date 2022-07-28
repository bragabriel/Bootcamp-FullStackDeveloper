import java.util.Scanner;

public class intermediario_dragaoBerradorWorld {

	public static void main(String[] args) {
		/*
		Desafio
		Todos os habitantes do Mundo M�gico est�o super animados com a abertura do
		 Drag�o Berrador World, o mais novo parque de divers�es do universo bruxo. 

		Infelizmente foram impostas algumas restri��es no momento da homologa��o
		 do brinquedo pelo Minist�rio Bruxo. Por quest�es de seguran�a,
		  h� uma altura m�nima e uma altura m�xima que as pessoam devem ter
		   para poder passear na montanha-russa.

		Para o dia da inaugura��o do parque, todos os convidados realizaram um
		pr�-cadastro no qual indicaram sua altura. Para reduzir filas e otimizar
		a opera��o do parque no primeiro dia, voc� foi contratado pela ger�ncia
 		do Drag�o Berrador World para fazer um programa que, dado o n�mero de visitantes,
  		altura m�nima, altura m�xima e as alturas de todos os visitantes, calcule quantas
   		pessoas poder�o andar na montanha-russa.

		Entrada
		A entrada cont�m v�rios casos de teste. A primeira linha de cada caso consiste
		em tr�s inteiros N (1 <= N <= 100), Amin e Amax (50 <= Amin <= Amax <= 250),
		o n�mero de visitantes, a altura m�nima e m�xima em cent�metros para
		 andar na montanha-russa, respectivamente.

		As N linhas seguintes cont�m, cada uma,
		 um n�mero inteiro representando a altura do visitantes,
		  em cent�metros.

		Sa�da
		Para cada caso de teste, imprima uma �nica linha com o n�mero
		 visitantes que podem passear na montanha-russa. 
		*/
		
		Scanner leitor = new Scanner(System.in);
		
		while (leitor.hasNext()) {
			
			int N = leitor.nextInt();
			int min = leitor.nextInt();
			int max = leitor.nextInt();
			int cont = 0;

			for (int i = 0; i < N; i++) {
				int A = leitor.nextInt();
				if (A>=min && A<=max) cont++;
			}
			
			System.out.println(cont);

		}
	}
}