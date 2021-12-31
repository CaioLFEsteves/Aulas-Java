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
			System.out.println("Aluno APROVADO, média: " + media);
		} else if (media >= 50) 
			System.out.println("Aluno em RECUPERAÇÃO, média: " + media + " a prova será realizada no dia XX/XX");
		} else {
			System.out.println("Aluno REPROVADO, média: " + media);
		}*/
		
		
		/*OPERADORES TERNÁRIOS SÃO FEITOS PARA LÓGICAS SIMPLES*/
		
		String resultadoFinal;
		
		resultadoFinal = media >= 70 ? "Aprovado" : "Reprovado"; 
		
		/*Lê-se: A media final do aluno foi igual
		ou maior que 70 ? Se sim imprima "Aprovado", se não (:), imprima "Reprovado".*/
		
		System.out.println(resultadoFinal);
		
		/*PODEM TER DUAS ENTRADAS DENTRO DELE, MAS É O MÁXIMO SEGURO, PARA EVITAR ERROS*/
		
		resultadoFinal = media >= 70 ? "Aprovado" : (media >= 50) ? "Recuperação" : "Reprovado";
		
		System.out.println(resultadoFinal + " media = " + media);

	}
}
