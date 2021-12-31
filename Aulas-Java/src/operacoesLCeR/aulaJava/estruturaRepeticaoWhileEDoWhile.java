package operacoesLCeR.aulaJava;

public class estruturaRepeticaoWhileEDoWhile {

	public static void main(String[] args) {
		
		/*ESTRTUTRA DA REPETIÇÃO WHILE*/
		
		int num = 0;
		
		while(num <= 10) {/*Repete a ação enquanto a condição for true. Primeiro 
		verifica e depois executa*/
			
			System.out.println("O número atual é: " + num);
			num ++; /*num = num + 1*/
			
		}
		/*-------------------------------------------------------------------------*/
		
		int num2 = 0;
		
		do {/*Repete a ação enquanto a condição for true. Primeiro 
			 executa e depois verifica*/
			
			System.out.println("O número atual é: " + num2);
			num2 ++; /*num2 = num2 + 1*/
			
		}while(num2 <= 10);
	}
}
