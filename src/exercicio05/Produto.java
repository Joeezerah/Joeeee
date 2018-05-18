package exercicio05;

import javax.swing.JOptionPane;

public class Produto {

	//Atributos
	String produto = "";
	double valor = 0;

	//Metodo para informar o produto
	public void obterProduto(){
		produto = JOptionPane.showInputDialog(null, "Informe o Produto , Ou digite sair para encerrar o programa");
	}

	//Metodo para informar o valor do produto
	public void obterValor(){
		valor = Double.parseDouble( JOptionPane.showInputDialog(null, "Informe O valor"));
	}

	//Metodo para o laço de repeticao
	public void laco(){
		do {
			obterProduto();
			if(produto.equals("sair")) {break;}
			obterValor();
			Valordesconto();

		}while (!produto.equals("sair"));
		
	}

	//Informar o valor com desconto
	public void Valordesconto(){
		JOptionPane.showMessageDialog(null,"\nProduto : "+produto+ "\nValor : "+valor+ "\n1 x "+(valor*0.95)+" = "+(1*(valor*0.95))
				+"\n2 x "+(valor*0.90)+" = "+(2*(valor*0.90))+"\n3 x "+(valor*0.85)+ " = " +(3*(valor*0.85))
				+"\n4 x "+(valor*0.80)+" = "+(4*(valor*0.80))+ "\n5 x "+(valor*0.75)+ " = " + (5*(valor*0.75))
				+"\n6 x "+(valor*0.70)+" = "+(6*(valor*0.70))+ "\n7 x "+(valor*0.65)+ " = " + (7*(valor*0.65))
				+"\n8 x "+(valor*0.60)+" = "+(8*(valor*0.60))+ "\n9 x "+(valor*0.55)+ " = " + (9*(valor*0.55))
				+"\n10 x "+(valor*0.50)+" = "+(10*(valor*0.50)));

	}

}
