package operacoesLCeR.aulaJava;

public class estruturaRepeticaoWhileEDoWhile {

	public static void main(String[] args) {
		
		/*ESTRTUTRA DA REPETI��O WHILE*/
		
		int num = 0;
		
		while(num <= 10) {/*Repete a a��o enquanto a condi��o for true. Primeiro 
		verifica e depois executa*/
			
			System.out.println("O n�mero atual �: " + num);
			num ++; /*num = num + 1*/
			
		}
		/*-------------------------------------------------------------------------*/
		
		int num2 = 0;
		
		do {/*Repete a a��o enquanto a condi��o for true. Primeiro 
			 executa e depois verifica*/
			
			System.out.println("O n�mero atual �: " + num2);
			num2 ++; /*num2 = num2 + 1*/
			
		}while(num2 <= 10);
	}
}
