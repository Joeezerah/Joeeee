package exercicio09;

import javax.swing.JOptionPane;

public class Ano {

	//Atributos
	int ano = 0 ;
	int menu = 1 ;
	int resultado = 0;

	//Metodo para ver se a pessoa quer continuar com o prgrama
	public void Continue() {
		menu = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 0 para sair ou outro numero para continuar"));
	}


	//Metodo para pegar o laço
	public void laco(){
		do {
			Continue();
			if (menu == 0) {break;}
			Anop();
			Verificacao();


		}while(menu != 0);

	}

	//metodo para pegar o ano que a pessoa deseja
	public void Anop() {
		ano = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano"));


	}
      //metodo para Verificar se o ano e bissexto ou nao
	  public void Verificacao() {
		  resultado = (ano % 4);
	        if (resultado==0) {
	           JOptionPane.showMessageDialog(null,"E bissexto"); 
	        }else{
	            JOptionPane.showMessageDialog(null, "nao e bissexto");
	        }
	  }



}


