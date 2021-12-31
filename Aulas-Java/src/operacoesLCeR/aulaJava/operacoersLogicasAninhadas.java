package operacoesLCeR.aulaJava;

public class operacoersLogicasAninhadas {

	
	public static void main(String[] args) {

		/*int mediaAluno = 69;
		String nome = "Caio";

		if (mediaAluno >= 70 && nome.equals("Rodrigo")) {
			System.out.println("Parabéns vc está aprovado");
		} else if (mediaAluno >= 70) {
			System.out.println("Aprovado porém não identificado");
		} else {
			System.out.println("Aluno não encontrado");
		}*/

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 0;
		int nota4 = 0;
		int media;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*OPERAÇÕES LÓGICAS ANINHADAS: Operações dentro de Operações*/
		
		if (media >= 50) {
			if(media >= 70) {
				if(media >= 90){
					System.out.println("Aluno SUPER Aprovado, media = " + media );
				}
				else {
					System.out.println("Aluno Aprovado, media = " + media );
				}
			}
			else{
				System.out.println("Aluno em Recuperação, media = " + media);
			}
		}else {
			System.out.println("Aluno Reprovado Direto, media = " + media);
		}
		
	}
}
