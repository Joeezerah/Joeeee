package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1 , nota2 , nota3;
	int aprovado =0, reprovado = 0;

	//Método para realizar perguntas
	public void obterDados(){

		nome = JOptionPane.showInputDialog("Informe seu nome");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("1ª nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("2ª nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("3ª nota"));
	}

	//Método para o laço de repetição
	public void laco() {

		//Variavel continuar
		int continuar =0;

		do {
			obterDados();
			contabilizarSituacao();
			exibirDados();

			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		}while(continuar == 0);
	}

	//Método para retornar a média
	public double calculoMedia() {

		double media = (nota1+nota2+nota3)/3;

		return media ;
	}

	//Método para retornar a situaçao do aluno
	public String situacaoAluno(){
		String situacao = calculoMedia() >= 7 ? "Aprovado" : "Reprovado" ;
		return situacao;

	}
	//Metodo para contabilizar aprovados e reprovados
	public void contabilizarSituacao() {
		if (calculoMedia() >=7) {
			aprovado++;
		}else {
			reprovado++;
		}
	}

	//Método para exibir a média e a situaçao do aluno
	public void exibirDados() {

		String msg = "O aluno " +nome;
		msg+= "\nObteve média: "+String.format("%.2f",calculoMedia());
		msg+= "\nSua situação é : " +situacaoAluno();
		msg+= "\nHá "+aprovado+ " Aprovados. ";
		msg+= "\nHá "+reprovado+ " Reprovados. ";
		

		JOptionPane.showMessageDialog(null, msg);
	}



}




