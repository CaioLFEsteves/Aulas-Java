package variaveis.aulaJava;


public class variaveisLocalEGlobal {

	/*maiorIdadeGlobal aqui é uma variável fora dos métodos(global),
	 * ou seja, pode ser acessada por qualquer função
	 * dentro de cada um dos metodos.*/
	static int maiorIdadeGlobal = 30;
	
	/*Main é um método auto executável do Java*/
	public static void main(String[] args) {
		
		/*maiorIdeda aqui é uma variável local. Ou seja
		 * apenas funções dentro do mesmo método (nesse caso o main)
		 * pode acessá-lo*/
		int maiorIdade = 18;
		System.out.println("Valor da variavel Local é =" + maiorIdade);
		
		/*Por regra, o único método que é executado altomaticamente é o main,
		 * então tudo que eu desejo que seja executado tem que ser chamado dentro dele,
		 * mesmo os metodos de fora.*/
		metodo2();
	}
	
	
	public static void metodo2() {
		
		System.out.println("Vaor da variavel global é =" + maiorIdadeGlobal);
		
	}
}
