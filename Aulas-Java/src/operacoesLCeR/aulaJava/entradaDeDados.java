package operacoesLCeR.aulaJava;

import javax.swing.JOptionPane;

public class entradaDeDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros:");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de Pessoas:");
		
		/*Para a entrada de dados, o java recebe como texto, por isso a vari�vel � uma String.
		 * 
		 * Mas para poder realizar c�lculos � necess�rios converter a entrada para um tipo num�rico.*/
		
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoa);
		
		/*Agora que os resultados j� est�o convertidos, j� pode-se realizar os c�lculos.*/
		
		int divisao = (int) (carroNum / pessoaNum) ; /*Esse tipo (int) serve
		para que, caso o resultado da divis�o seja fracion�rio, s� seja retornado
		o valor inteiro para a variavel "divis�o".*/
		
		double resto = carroNum % pessoaNum;
		
		System.out.println("A quantidade de carros �: "+carros);
		System.out.println("A quantidade de pessoas �: "+pessoa);
		
		System.out.println("A divis�o de carros para as pessoas deu: "+divisao+" . E restaram: "+resto+" carros.");
		JOptionPane.showMessageDialog(null,"A divis�o de carros para as pessoas deu: "+divisao+" . E restaram: "+resto+" carros." );
		
		/*Esse "JOptionPane...", j� mostra entradas e sa�da em uma caixa de 
		 * di�logo como de programas normais. O System.out.println executa 
		 * no Console do programa mesmo.*/
	}
}
