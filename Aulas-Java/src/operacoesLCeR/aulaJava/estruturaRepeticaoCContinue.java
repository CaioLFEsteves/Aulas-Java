package operacoesLCeR.aulaJava;

public class estruturaRepeticaoCContinue {

	public static void main(String[] args) {
			
			/*ESTRTUTRA DA REPETI��O FOR COM CONTINUE*/
			
			
			for (int num1 = 0; num1 <= 10; num1 ++) {
				if(num1 == 3 || num1 == 6 || num1 == 9 ) {
				System.out.println("N�mero " +num1+" encontrado");
				continue;/*Assim que um valor � encontrado, o continue obriga que 
				a a repeti��o do for seja realizada imediatamente, e n�o realiza
				a fun��o abaixo.*/
				}
				
				System.out.println("Processando valores da condi��o");
			}
			
			
		}
}
