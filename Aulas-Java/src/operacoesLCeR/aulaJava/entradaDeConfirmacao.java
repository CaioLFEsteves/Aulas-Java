package operacoesLCeR.aulaJava;

import javax.swing.JOptionPane;

public class entradaDeConfirmacao {

	
public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de Carros:");
		String pessoa = JOptionPane.showInputDialog("Informe a quantidade de Pessoas:");
		
		
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoa);
	
		
		int divisao = (int) (carroNum / pessoaNum) ; 
		
		double resto = carroNum % pessoaNum;
		
		int confirme = JOptionPane.showConfirmDialog(null, "Deseja ver os resultados?");
		/*Essa funcionalidade permite criar uma caixa de decisão, que retorna 0 p/ sim, 1 p/não
		 * e 2 p/ cancelar.*/
		
		if(confirme == 0) {
			JOptionPane.showMessageDialog(null,"A divisão de carros para as pessoas deu: "+divisao+" . E restaram: "+resto+" carros." );
		}
		else if (confirme == 1){
			JOptionPane.showMessageDialog(null,"Respostas negadas");
		}
		else{
			JOptionPane.showMessageDialog(null, "Respostas foram canceladas.");
		}
	}
}
