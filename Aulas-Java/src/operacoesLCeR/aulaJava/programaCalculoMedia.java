package operacoesLCeR.aulaJava;

import javax.swing.JOptionPane;

public class programaCalculoMedia {

	
	public static void main(String[] args) {
		
		String aluno = JOptionPane.showInputDialog("Insira o nome do Aluno:");
		
		String nota1 = JOptionPane.showInputDialog("Insira a primeira nota do Aluno: ");
		String nota2 = JOptionPane.showInputDialog("Insira a segunda nota do Aluno: ");
		String nota3 = JOptionPane.showInputDialog("Insira a terceira nota do Aluno: ");
		String nota4 = JOptionPane.showInputDialog("Insira a quarta nota do Aluno: ");
		
		double nota1Num = Double.parseDouble(nota1);
		double nota2Num = Double.parseDouble(nota2);
		double nota3Num = Double.parseDouble(nota3);
		double nota4Num = Double.parseDouble(nota4);
		
		double media = (nota1Num + nota2Num + nota3Num + nota4Num)/4;
		
		/*M�dia para aprova��o � 70*/
		
			if(media >= 50) {
				
				if(media >= 70) {
					
						if(media >= 90) {
							JOptionPane.showMessageDialog(null, "Parab�ns!! A media final do "+aluno+" �: "+media+" . APROVAD�SSIMO!!!");
						}
						else {
							JOptionPane.showMessageDialog(null, "A media final do "+aluno+" �: "+media+" . Est� aprovado!");
						}
				}
				else {
					JOptionPane.showMessageDialog(null, "O aluno "+aluno+" est� com m�dia: "+media+". Precisar� fazer a recupera��o.");
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "O aluno: "+aluno+" est� com m�dia: "+media+" . Infelizmente est� reprovado.");
			}
	}
}
