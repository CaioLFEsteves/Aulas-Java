package operacoesLCeR.aulaJava;

public class operacoesLogicas {

	public static void main(String[] args) {

		/*Condições Lógicas com IF e ELSE*/
		
		int mediaAluno = 69;
		String nome = "Caio";

		if (mediaAluno >= 70 && nome.equals("Rodrigo")) {/*Esse .equals designa uma lógica booleana comparando strings*/
			System.out.println("Parabéns vc está aprovado");
		} else if (mediaAluno >= 70) {
			System.out.println("Aprovado porém não identificado");
		} else {
			System.out.println("Aluno não encontrado");
		}

		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 90;
		int nota4 = 80;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno APROVADO, média: " + media);
		} else if (media >= 50) {/*nessa condição poderia haver um "&& <=69" após o >=50,
		porém se isso fosse realizado cairia numa redundância, ou seja, codificação desnecessária.*/
			System.out.println("Aluno em RECUPERAÇÃO, média: " + media + " a prova será realizada no dia XX/XX");
		} else {
			System.out.println("Aluno REPROVADO, média: " + media);
		}
		
		/*Operadores Ternários, são usados para micro validações, coisa simples, de uma linha.*/
		
		String resultadoFinal;
		
		resultadoFinal = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado"; /*Lê-se: A média final
		do aluno é igual ou mair que 70? Se sim, imprima na tela "Aluno Aprovado", se não (:), imprima
		"Aluno Reprovado"*/
		
		System.out.println(resultadoFinal);
		}
}
