import java.util.Scanner;

public class intermediario_viraTempo {

	public static void main(String[] args) {
		/*
		Hermione est� criando um novo Vira Tempo especialmente para programadores.
		� impressionante as vantagens que ele oferece e o conforto
		pra codar que ele tem. O artefato ainda est� em desenvolvimento
		e ele prometeu consertar os bugs e colocar uns apetrechos melhores e,
		em troca, pediu um sistema simples para o modo Standy Bay. 
		O problema � que o artefato por si s� sempre tem o �ngulo de inclina��o
		do Sol/Lua(de 0 a 360). Valendo um Vira Tempo, caso deseja aceitar: 
		dada em grau da inclina��o do Sol/Lua, informe em qual per�odo do dia 
		ele se encontra.

		Entrada
		A entrada cont�m um n�mero inteiro M (0 <= M <= 360) representando o grau
		do Sol/Lua. Como a posi��o muda constantemente seu programa receber�
		diversos casos a cada segundo(EOF).

		Sa�da
		Imprima uma sauda��o referente ao per�odo do dia que ele se encontra:
		 "Boa Tarde!!", "Boa Noite!!", "Bom Dia!!" e "De Madrugada!!". 
		*/

		Scanner leitor = new Scanner(System.in);
		   
		String msg;

		while (leitor.hasNext()) {
	  		
			int graus = leitor.nextInt();
	  		
	  		if (graus == 360 || graus >= 0 && graus < 90) msg = "Bom Dia!!";
	  		else if (graus >= 90 && graus < 180) msg = "Boa Tarde!!";
	  		else if (graus >= 180 && graus < 270) msg = "Boa Noite!!";
	  		else msg = "De Madrugada!!";
	  		
	  		System.out.println(msg);
		}
	}
}