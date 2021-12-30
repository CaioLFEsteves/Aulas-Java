package variaveis.aulaJava;

public class operacoesDeInteiros {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;
		
		/*Nessa primeira, sem os parenteses na soma, ele reconhece apenas como concatenação.*/
		System.out.println("Média das notas = " + nota1 + nota2 + nota3 + nota4);
		
		System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4));
		System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4)/4);
	}	
	
}
