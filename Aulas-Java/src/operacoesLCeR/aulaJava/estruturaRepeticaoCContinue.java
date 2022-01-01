package operacoesLCeR.aulaJava;

public class estruturaRepeticaoCContinue {

	public static void main(String[] args) {
			
			/*ESTRTUTRA DA REPETIÇÃO FOR COM CONTINUE*/
			
			
			for (int num1 = 0; num1 <= 10; num1 ++) {
				if(num1 == 3 || num1 == 6 || num1 == 9 ) {
				System.out.println("Número " +num1+" encontrado");
				continue;/*Assim que um valor é encontrado, o continue obriga que 
				a a repetição do for seja realizada imediatamente, e não realiza
				a função abaixo.*/
				}
				
				System.out.println("Processando valores da condição");
			}
			
			
		}
}
