package programacaoOrientadaAObjetos.executavel;

import programacaoOrientadaAObjetos.classes.Aluno;

public class PrimeiraClasseJava {

		public static void main(String[] args) {
			
			/*CONSTRUTORES PADR�O*/
			
					/*Objeto ainda n�o existe na memoria*/
					Aluno aluno;
					
					Aluno aluno1 = new Aluno();
					/*Agora temos um objeto real na memoria*/
					
					Aluno aluno2 = new Aluno(); /* 'new' � a palavra reservada do JAVA para
					que um espa�o na mem�ria seja criado, esperando as entradas novas referente
					� classe.*/
					
					Aluno aluno3 = new Aluno(); /* Esses construtores aqui, que se segurar ctrl e clicar
					te levam � classe no arquivo raiz, cria uma vari�vel aluno sem nenhuma informa��o prim�ria*/
			
			/*CONSTRUTORES COM PAR�METROS INICIAIS
			 *Um e dois par�metros nesse caso, mas podem ser passados mais. */
			
			
					Aluno aluno4 = new Aluno("Maria");/*Nome j� proposto*/
					
					Aluno aluno5 = new Aluno("Jo�o", 40);/*Nome e idade ja propostos*/
		}
}
