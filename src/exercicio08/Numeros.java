package exercicio08;

import javax.swing.JOptionPane;

public class Numeros {



	//atributos
	double nr;
	String sucessores;
	String antecessores;

	//Metodo para criar um laço
	public void laco(){
		do {
			NumerosInteiro();
			if (nr == 0) {break;}
			Antecessor();
			Sucessor();
			Exibir();
			
		}while (nr != 0);
	}

	//metodo para pedir os numeros
	public void NumerosInteiro() {
		nr = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero ou digite 0 para sair"));

	}

	//metodo para informar os sucessores
	public String Sucessor() {
		sucessores = (nr + 1)+ "\n " +(nr + 2) + "\n " +(nr + 3)+ "\n " + (nr + 4) + "\n " + (nr +5) + "\n "+
				(nr + 6)+ "\n " +(nr + 7) + "\n " +(nr + 8)+ "\n " + (nr + 9) + "\n " + (nr +10);
		return sucessores;
		
	}
    //metodo para informar os antecessores 
	public String Antecessor() {
		antecessores = (nr - 1)+ "\n " +(nr - 2) + "\n " +(nr - 3)+ "\n " + (nr - 4) + "\n " + (nr - 5) + " \n " +
				(nr - 6)+ "\n " +(nr - 7) + "\n " +(nr - 8)+ "\n " + (nr - 9) + "\n " + (nr - 10);
         return antecessores;
	}

	//Metodo para exibir dados
	public void Exibir() {
	JOptionPane.showMessageDialog(null , "Numero : " +nr+ "\nAntecessores : " +antecessores+ "\nsucessores : " +sucessores);
	}
















}