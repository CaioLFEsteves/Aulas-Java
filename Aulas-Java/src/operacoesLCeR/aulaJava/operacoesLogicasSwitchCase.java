package operacoesLCeR.aulaJava;

public class operacoesLogicasSwitchCase {

	public static void main(String[] args) {

		int dia = 8;

		/*SWITCH CASE: Usado para opera��es exatas*/
		
		if(dia >= 1 && dia <=7) {/*Essa altera��o eu fiz para que o programa n�o aceite
		entradas diferentes de valores entre 1 e 7. Claro que o default faria isso de qualquer
		maneira, no entanto isso evita que processamento desnecess�rio seja realizado.*/
			
				switch(dia) {
				case 1: /*Aqui entra o valor atribuido � vari�vel*/
					System.out.println("Domingo");
					break;
					
				case 2:
					System.out.println("Segunda-Feira");
					break;
					
					/*... quantas verifica��es exatas forem necess�rias*/
				
				default:/*Caso nenhuma das atribui��es de valor correspondam aos casos*/
					System.out.println("Outro dia que n�o Domingo e Segunda");
					break;
				}
		}
		else{
			System.out.println("Entrada inv�lida");
		}	
	}
}
