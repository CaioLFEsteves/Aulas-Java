package operacoesLCeR.aulaJava;

public class operadoreRelacionais {

	public static void main(String[] args) {
		
		int nota1 = 80;
		int nota2 = 80;
		
		/*OPERADORES RELACIONAIS ESTIPULAM AS RELA��ES DE CONDI��O*/
		
		/*if(nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		}
		else if(nota1 != nota2) {No modo que est� agora, com "else if",
		a verifica��o acabaria aqui, mesmo que algumas das situa��es posteriores
		sejam verdadeiras. 
			System.out.println("As notas s�o diferentes");
		}
		else if(nota1 > nota2) {
			System.out.println("A Nota 1 � maior que a Nota 2");
		}
		else {
			System.out.println("A Nota 1 � menor que a Nota 2");
		}*/
		
		if(nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		}
		if(nota1 != nota2) {/*Para que todas as verifica��es sejam feitas,
		todas tem que estar com apenas "if".*/
			System.out.println("As notas s�o diferentes");
		}
		if(nota1 > nota2) {
			System.out.println("A Nota 1 � maior que a Nota 2");
		}
		if(nota1 < nota2){
			System.out.println("A Nota 1 � menor que a Nota 2");
		}
		if(nota1 >= nota2){
			System.out.println("A Nota 1 � maior ou igual a Nota 2");
		}
		if(nota1 <= nota2){
			System.out.println("A Nota 1 � menor ou igual a Nota 2");
		}
	}
}
