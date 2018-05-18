package exercicio06;

import javax.swing.JOptionPane;

public class Escola {

	//Atributos
	String nome = "";
	int sexmas = 0 ;
	int sexfem = 0 ; 
	int sexo = 0 ;
	double n1 = 0 ;
	double n2 = 0 ; 
	double n3 = 0 ; 
	double n4 = 0 ; 
	double media = 0;
	double Parabens = 0 ;
	double Otimo = 0 ;
	double bom = 0 ;
	double satisfatorio = 0;
	double recuperacao = 0;
	double reprovado = 0;
	double qtalunos = 0;
	double p1 = 0;
	double p2 = 0;
	double p3 = 0;
	double p4 = 0;
	double p5 = 0;
	double p6 = 0;
	double p7 = 0;
	double p8 = 0;

	//Metodo para informar o nome
	public void obterNome(){
		nome = JOptionPane.showInputDialog(null, "Informe o Nome , Ou digite sair para encerrar o programa");
	}

	//Metodo para informar o sexo
	public void obterSexo(){
		sexo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para masculino e 2 para feminino"));  
		if (sexo == 1) {sexmas++;} else {sexfem++;}
	}
	//Metodo Para informar as notas
	public void obterNotas() {
		do {
			n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 1")); 
		}while((n1 < 0) || (n1 > 10));
		do {
			n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 2"));
		}while((n2 < 0) || (n2 > 10));
		do {
			n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 3"));
		}while((n3 < 0) || (n3 > 10));
		do {
			n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota 4"));
		}while((n4 < 0) || (n4 > 10));

	}

	//Metodo para o laço de repeticao
	public void laco(){
		do {
			obterNome();
			if(nome.equals("sair")) {break;}
			qtalunos++;
			obterSexo();
			obterNotas();
			exibirMedia();
			exibirSituacao();
			

		}while (!nome.equals("sair"));
		exibirPorcentagens();
		Exibir();
	}

	//Metodo para calcular a media
	public void exibirMedia() {
		media = (n1+n2+n3+n4)/4;
	}
	
	//Metodo para exibir a situaçao dos alunos
	public void exibirSituacao() {
		if (media == 10) {
			JOptionPane.showMessageDialog(null,"Parabens" + media);
			Parabens++;
		}else if (media >= 9) {
			JOptionPane.showMessageDialog(null,"Otimo" + media);
			Otimo++;
		} else if (media >= 8) {
			JOptionPane.showMessageDialog(null,"Bom" + media);
			bom++;
		}else if (media >= 7) {
			JOptionPane.showMessageDialog(null,"Satisfatorio" + media);
			satisfatorio++;
		}else if (media >= 5) {
			JOptionPane.showMessageDialog(null,"Recuperaçao" + media);
			recuperacao++;
		}else {
			JOptionPane.showMessageDialog(null,"Reprovado" + media);
			reprovado++;}
	}

	//metodo para descobrir as porcentagens
	public void exibirPorcentagens() {
		p1 = (Parabens/qtalunos)*100;
		p2 = (Otimo/qtalunos)*100;
		p3 = (bom/qtalunos)*100;
		p4 = (satisfatorio/qtalunos)*100;
		p5 = (recuperacao/qtalunos)*100;
		p6 = (reprovado/qtalunos)*100;
		p7 = (sexmas/qtalunos)*100;
		p8 = (sexfem/qtalunos)*100;

	}


	//Metodo para exibir o texto final
	public void Exibir() {
		JOptionPane.showMessageDialog(null," Dez : % " + Parabens + " " +p1+ "%");
		JOptionPane.showMessageDialog(null," Nove : % " + Otimo + " " +p2 +"%");
		JOptionPane.showMessageDialog(null," Oito : % " + bom + " " +p3+ "%");
		JOptionPane.showMessageDialog(null," Sete : % " + satisfatorio + " " +p4+ "%");
		JOptionPane.showMessageDialog(null," cinco : % " + recuperacao + " "+ p5+ "%");
		JOptionPane.showMessageDialog(null," Menos de cinco : " + reprovado + " " +p6+ "%");
		JOptionPane.showMessageDialog(null," Homens : " +sexmas+ " " +p7+ "%");
		JOptionPane.showMessageDialog(null," Mulheres : " +sexfem+ " " +p8+ "%");











	}
}
