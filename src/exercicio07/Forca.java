package exercicio07;

import javax.swing.JOptionPane;

public class Forca {

	//Atributos
	int vida = 7 ;
	String palavraChave = "ESTUDAR";
	String sair = "" ;
	Object[] menus = {"Jogar uma palavra" , "Jogar uma letra" , "sair"};
	String letra = "" ;
	String letras = "" ;
	String palavra = "" ;
	boolean valido = false ;
	Object menu = "";


	//Metodo de exibiçao do menu
	public void ExibirMenu() {
		menu = JOptionPane.showInputDialog(null, " Escolha uma opcao \n numero de vidas: "+vida+"\nLetras descobertas: "+letras, "jogo da forca" , JOptionPane.PLAIN_MESSAGE, null, menus , "");
	}

	//Metodo para fazer um chute
	public void Chute() {
		if (menu.equals("Jogar uma letra")){
			letra = JOptionPane.showInputDialog(null, "Digite uma letra");
			letra = letra.toUpperCase().trim();
			switch (letra) {
			case "E":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " E " ;
				break;
			case "S":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " S " ;
				break;
			case "T":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " T " ;
				break;
			case "U":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " U " ;
				break;
			case "D":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " D " ;
				break;
			case "A":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " A " ;
				break;
			case "R":
				JOptionPane.showMessageDialog(null, "Voce acertou uma letra");
				letras += " R " ;
				break;
			default:
				JOptionPane.showMessageDialog(null,"Erro.");
				vida--;
				break;
			}

		}
	}


	//Metodo para arriscar uma palavra
	public void Palavra() {
		if(menu.equals("Jogar uma palavra")){
			palavra = JOptionPane.showInputDialog(null, "Insira uma palavra ");
			palavra = palavra.toUpperCase().trim();
			if (palavra.equals(palavraChave)) {
				JOptionPane.showMessageDialog(null, "Voce acertou");
			}else {
				JOptionPane.showMessageDialog(null , "Voce errou");
				vida--;
			}
		}


	}

	//Metodo Do laço
	public void laco() {
		do {
			ExibirMenu();
			if (menu.equals("sair")) {break;}
			Chute();
			Palavra();
			if (palavra.equals(palavraChave)) {break;}






		}while(vida>0);
	}














}

