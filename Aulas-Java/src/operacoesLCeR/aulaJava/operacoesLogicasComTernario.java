package operacoesLCeR.aulaJava;

public class operacoesLogicasComTernario {

	public static void main(String[] args) {

		int nota1 = 0;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 80;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*if (media >= 70) {
			System.out.println("Aluno APROVADO, m�dia: " + media);
		} else if (media >= 50) 
			System.out.println("Aluno em RECUPERA��O, m�dia: " + media + " a prova ser� realizada no dia XX/XX");
		} else {
			System.out.println("Aluno REPROVADO, m�dia: " + media);
		}*/
		
		
		/*OPERADORES TERN�RIOS S�O FEITOS PARA L�GICAS SIMPLES*/
		
		String resultadoFinal;
		
		resultadoFinal = media >= 70 ? "Aprovado" : "Reprovado"; 
		
		/*L�-se: A media final do aluno foi igual
		ou maior que 70 ? Se sim imprima "Aprovado", se n�o (:), imprima "Reprovado".*/
		
		System.out.println(resultadoFinal);
		
		/*PODEM TER DUAS ENTRADAS DENTRO DELE, MAS � O M�XIMO SEGURO, PARA EVITAR ERROS*/
		
		resultadoFinal = media >= 70 ? "Aprovado" : (media >= 50) ? "Recupera��o" : "Reprovado";
		
		System.out.println(resultadoFinal + " media = " + media);

	}
}
