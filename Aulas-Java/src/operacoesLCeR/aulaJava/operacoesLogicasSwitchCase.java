package operacoesLCeR.aulaJava;

public class operacoesLogicasSwitchCase {

	public static void main(String[] args) {

		int dia = 8;

		/*SWITCH CASE: Usado para operações exatas*/
		
		if(dia >= 1 && dia <=7) {/*Essa alteração eu fiz para que o programa não aceite
		entradas diferentes de valores entre 1 e 7. Claro que o default faria isso de qualquer
		maneira, no entanto isso evita que processamento desnecessário seja realizado.*/
			
				switch(dia) {
				case 1: /*Aqui entra o valor atribuido à variável*/
					System.out.println("Domingo");
					break;
					
				case 2:
					System.out.println("Segunda-Feira");
					break;
					
					/*... quantas verificações exatas forem necessárias*/
				
				default:/*Caso nenhuma das atribuições de valor correspondam aos casos*/
					System.out.println("Outro dia que não Domingo e Segunda");
					break;
				}
		}
		else{
			System.out.println("Entrada inválida");
		}	
	}
}
