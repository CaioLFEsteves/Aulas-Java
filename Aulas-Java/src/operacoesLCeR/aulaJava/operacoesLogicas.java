package operacoesLCeR.aulaJava;

public class operacoesLogicas {

	public static void main(String[] args) {

		int mediaAluno = 69;
		String nome = "Caio";

		if (mediaAluno >= 70 && nome.equals("Rodrigo")) {/*Esse .equals designa uma l�gica booleana comparando strings*/
			System.out.println("Parab�ns vc est� aprovado");
		} else if (mediaAluno >= 70) {
			System.out.println("Aprovado por�m n�o identificado");
		} else {
			System.out.println("Aluno n�o encontrado");
		}

		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 90;
		int nota4 = 80;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno APROVADO, m�dia: " + media);
		} else if (media >= 50) {/*nessa condi��o poderia haver um "&& <=69" ap�s o >=50,
		por�m se isso fosse realizado cairia numa redund�ncia, ou seja, codifica��o desnecess�ria.*/
			System.out.println("Aluno em RECUPERA��O, m�dia: " + media + " a prova ser� realizada no dia XX/XX");
		} else {
			System.out.println("Aluno REPROVADO, m�dia: " + media);
		}

	}
}
