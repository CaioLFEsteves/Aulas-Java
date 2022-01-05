package programacaoOrientadaAObjetos.executavel;

import programacaoOrientadaAObjetos.classes.Aluno;

public class PrimeiraClasseJava {

		public static void main(String[] args) {
			
			/*CONSTRUTORES PADRÃO*/
			
					/*Objeto ainda não existe na memoria*/
					Aluno aluno;
					
					Aluno aluno1 = new Aluno();
					/*Agora temos um objeto real na memoria*/
					
					Aluno aluno2 = new Aluno(); /* 'new' é a palavra reservada do JAVA para
					que um espaço na memória seja criado, esperando as entradas novas referente
					à classe.*/
					
					Aluno aluno3 = new Aluno(); /* Esses construtores aqui, que se segurar ctrl e clicar
					te levam à classe no arquivo raiz, cria uma variável aluno sem nenhuma informação primária*/
			
			/*CONSTRUTORES COM PARÂMETROS INICIAIS
			 *Um e dois parâmetros nesse caso, mas podem ser passados mais. */
			
			
					Aluno aluno4 = new Aluno("Maria");/*Nome já proposto*/
					
					Aluno aluno5 = new Aluno("João", 40);/*Nome e idade ja propostos*/
		}
}
