package operacoesLCeR.aulaJava;

public class operadoreRelacionais {

	public static void main(String[] args) {
		
		int nota1 = 80;
		int nota2 = 80;
		
		/*OPERADORES RELACIONAIS ESTIPULAM AS RELAÇÕES DE CONDIÇÃO*/
		
		/*if(nota1 == nota2) {
			System.out.println("As notas são iguais");
		}
		else if(nota1 != nota2) {No modo que está agora, com "else if",
		a verificação acabaria aqui, mesmo que algumas das situações posteriores
		sejam verdadeiras. 
			System.out.println("As notas são diferentes");
		}
		else if(nota1 > nota2) {
			System.out.println("A Nota 1 é maior que a Nota 2");
		}
		else {
			System.out.println("A Nota 1 é menor que a Nota 2");
		}*/
		
		if(nota1 == nota2) {
			System.out.println("As notas são iguais");
		}
		if(nota1 != nota2) {/*Para que todas as verificações sejam feitas,
		todas tem que estar com apenas "if".*/
			System.out.println("As notas são diferentes");
		}
		if(nota1 > nota2) {
			System.out.println("A Nota 1 é maior que a Nota 2");
		}
		if(nota1 < nota2){
			System.out.println("A Nota 1 é menor que a Nota 2");
		}
		if(nota1 >= nota2){
			System.out.println("A Nota 1 é maior ou igual a Nota 2");
		}
		if(nota1 <= nota2){
			System.out.println("A Nota 1 é menor ou igual a Nota 2");
		}
	}
}
