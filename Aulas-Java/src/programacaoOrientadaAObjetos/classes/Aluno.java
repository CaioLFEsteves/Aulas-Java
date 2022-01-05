package programacaoOrientadaAObjetos.classes;

public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	public Aluno() {/*Cria os dados da memória como padrão do JAVA*/
		
	}
	
	public Aluno(String nomePadrao) {/*Aqui atribue ao nome a entrada simples, 
	colocado no aluno4 do arquivo primeiraClasseJava*/
		
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {/*Aqui atribue ao nome e à idade a entrada dos dois valores, 
	colocados no aluno5 do arquivo primeiraClasseJava*/
		
		nome = nomePadrao;
		idade = idadePadrao;
	}
	
	
}
