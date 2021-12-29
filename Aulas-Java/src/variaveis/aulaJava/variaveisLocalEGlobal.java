package variaveis.aulaJava;


public class variaveisLocalEGlobal {

	/*maiorIdadeGlobal aqui � uma vari�vel fora dos m�todos(global),
	 * ou seja, pode ser acessada por qualquer fun��o
	 * dentro de cada um dos metodos.*/
	static int maiorIdadeGlobal = 30;
	
	/*Main � um m�todo auto execut�vel do Java*/
	public static void main(String[] args) {
		
		/*maiorIdeda aqui � uma vari�vel local. Ou seja
		 * apenas fun��es dentro do mesmo m�todo (nesse caso o main)
		 * pode acess�-lo*/
		int maiorIdade = 18;
		System.out.println("Valor da variavel Local � =" + maiorIdade);
		
		/*Por regra, o �nico m�todo que � executado altomaticamente � o main,
		 * ent�o tudo que eu desejo que seja executado tem que ser chamado dentro dele,
		 * mesmo os metodos de fora.*/
		metodo2();
	}
	
	
	public static void metodo2() {
		
		System.out.println("Vaor da variavel global � =" + maiorIdadeGlobal);
		
	}
}
