package operacoesLCeR.aulaJava;

public class operacoesMatematicasCModulo {

	public static void main(String[] args) {
		
		/*MÓDULO (%): Resto da divisão;*/
		
		/*Resto no java é o que sobra de uma divisão entre dois
		 * valores inteiros.*/
		
		/*Na linguagem C e C++, o módulo só pode ser aplicado
		 * em variáveis tipo "int", mas no Java elas podem 
		 * ser aplicado em qualquer variável, desde que o valor dela
		 * seja inteiro.*/
		
		float carro = 9;
		float pessoa = 2;
		
		float resto = carro % pessoa;
		
		System.out.println("Sobraram: "+resto+" carros.");
	}
	
	
}
