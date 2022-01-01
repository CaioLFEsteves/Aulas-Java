package operacoesLCeR.aulaJava;

import javax.swing.JOptionPane;

public class entradaDeDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros:");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de Pessoas:");
		
		/*Para a entrada de dados, o java recebe como texto, por isso a variável é uma String.
		 * 
		 * Mas para poder realizar cálculos é necessários converter a entrada para um tipo numérico.*/
		
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoa);
		
		/*Agora que os resultados já estão convertidos, já pode-se realizar os cálculos.*/
		
		int divisao = (int) (carroNum / pessoaNum) ; /*Esse tipo (int) serve
		para que, caso o resultado da divisão seja fracionário, só seja retornado
		o valor inteiro para a variavel "divisão".*/
		
		double resto = carroNum % pessoaNum;
		
		System.out.println("A quantidade de carros é: "+carros);
		System.out.println("A quantidade de pessoas é: "+pessoa);
		
		System.out.println("A divisão de carros para as pessoas deu: "+divisao+" . E restaram: "+resto+" carros.");
		JOptionPane.showMessageDialog(null,"A divisão de carros para as pessoas deu: "+divisao+" . E restaram: "+resto+" carros." );
		
		/*Esse "JOptionPane...", já mostra entradas e saída em uma caixa de 
		 * diálogo como de programas normais. O System.out.println executa 
		 * no Console do programa mesmo.*/
	}
}
