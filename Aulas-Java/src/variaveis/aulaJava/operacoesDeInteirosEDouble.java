package variaveis.aulaJava;

public class operacoesDeInteirosEDouble {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;
		
		double nota5 = 90;
		double nota6 = 70;
		double nota7 = 50;
		double nota8 = 88;
		
		double mediaFinal = ((nota5 + nota6 + nota7 + nota8)/4);
		
		/*Nessa primeira, sem os parenteses na soma, ele reconhece apenas como concatenação.*/
		System.out.println("Soma das notas = " + nota1 + nota2 + nota3 + nota4);
		System.out.println("Soma das notas = " + (nota1 + nota2 + nota3 + nota4));
		System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4)/4);
		
		/*Para conseguir a média correta, tanto a variáveis do calculo quanto o calculo precisam
		 * estar no mesmo tipo de variável, nesse caso double*/
		System.out.println("Média da notas com double = " + mediaFinal);
	}	
	
}
