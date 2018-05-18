//Classe = molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	//Atributos (caracteristicas)
	String nome;
	int idade;
	double peso , altura;

	//Método de apresentação
	public void apresentacao() {
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome é " +nome);
	}


	//Método para calcular o imc
	public double calculoIMC() {

		double imc = peso / Math.pow(altura,2);
		return imc;

	}

	//Método para retornar a condiçao do IMC
	public String condicaoIMC() {

		//Obter o valor do imc
		double imc = calculoIMC();


		//Variavel contendo a condicao
		String condicao;

		//Condicional
		if(imc < 17) {
			condicao = "muito abaixo do peso";
		}else if (imc < 18.5) {
			condicao = "Abaixo do peso";
		}else if (imc < 25) {
			condicao = "Peso normal";
		}else if (imc < 30) {
			condicao = "Acima do peso";
		}else if (imc < 35) {
			condicao = "Obesidade I";
		}else if (imc < 40 ) {
			condicao = "Obesidade II";
		}else {
			condicao = "Obesidade III";
		}

		//Retorno
		return condicao;


	}

	   //Método para exibir o IMC
	public void exibirIMC() {
		String msg = "******IMC******\n";
		msg += "Seu IMC é de: "+String.format("%.2f", calculoIMC()) + "\n";
		msg += "Sua condiçao é " +condicaoIMC();
		
		JOptionPane.showMessageDialog(null, msg);
	}




}
