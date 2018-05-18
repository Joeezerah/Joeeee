package exercicio04;

import javax.swing.JOptionPane;

public class Publico {

	//atributos
	int idade = 0;
	double voto = 0;
	Object[] votos = {"excelente" , "otimo", "bom", "regular", "ruim" , "sair"};
	Object[] idades = {"criancas 0 a 9 anos" , "adolescente 10 a 17 anos", "adulto acima de 17 anos"};
	double excelente = 0;
	double otimo = 0;
	double bom = 0;
	double regular = 0;
	double ruim = 0;
	double criancas = 0;
	double adolescente = 0;
	double adulto = 0;
	Object opco = " ";
	Object opcoe = " ";
	double excelente1 = 0;
	double otimo1 = 0;
	double bom1 = 0;
	double regular1 = 0;
	double ruim1 = 0;
	


	//Metodo para selecionar o voto
	public void obterVoto(){
		opcoe = JOptionPane.showInputDialog(null, "Selecione o Seu voto", "Voto" , JOptionPane.PLAIN_MESSAGE, null, votos, "");
		voto++;
	}
	//Metodo para selecionar a idade
	public void obterIdade(){
		opco = JOptionPane.showInputDialog(null, "Selecione sua idade", "Idade" , JOptionPane.PLAIN_MESSAGE, null, idades, "");

	}

	//Metodo para o laço de repeticao
	public void laco(){
		do {
			obterVoto();
			if(opcoe.equals("sair")) {break;}
			obterIdade();
			contarIdade();
			contarVoto();
			CalcularVotos();


		}while (!opcoe.equals("sair"));
		ExibirVotos();
	}



	//Obter os votos
	public void contarVoto(){
		if (opcoe.equals ("excelente"))  {excelente++;}
		if (opcoe.equals ("otimo")) {otimo++;}
		if (opcoe.equals ("bom")) {bom++;}
		if (opcoe.equals ("regular")) {regular++;}
		if (opcoe.equals ("ruim")) {ruim++;}
	}
	//Obter as idades
	public void contarIdade(){
		if (opco.equals("criancas 0 a 9 anos")) {criancas++;}
		else if (opco.equals("adolescente 10 a 17 anos")) {adolescente++;}
		else {adulto++;}

	}
	//Obtendo a % dos votos
	public void CalcularVotos(){
		excelente1 = (excelente/voto)*100;
		otimo1 = (otimo/voto)*100;
		bom1 = (bom/voto)*100;
		regular1 = (regular/voto)*100;
		ruim1 = (ruim/voto)*100;

	}
	//Mostrando a porcentagem dos votos
	public void ExibirVotos(){
		JOptionPane.showMessageDialog(null," excelente : % " +excelente1 +", "+excelente);
		JOptionPane.showMessageDialog(null," otimo : % " +otimo1 + ", "+otimo);
		JOptionPane.showMessageDialog(null," bom : % " +bom1 + ", "+bom);
		JOptionPane.showMessageDialog(null," regular : % " +regular1 + ", "+regular);
		JOptionPane.showMessageDialog(null," ruim : % " +ruim1 + ", "+ruim);
		JOptionPane.showMessageDialog(null," criancas : " +criancas);
		JOptionPane.showMessageDialog(null," adolescente : " +adolescente);
		JOptionPane.showMessageDialog(null," adulto : " +adulto);



















	}
}
