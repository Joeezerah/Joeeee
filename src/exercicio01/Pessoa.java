package exercicio01;

import javax.swing.JOptionPane;

public class Pessoa {

	/*1. Desenvolver um algoritmo que peça as seguintes informações: Nome, Idade, Sexo, Cargo, após cadastrar um determinado número de pessoas o programa deverá retornar os seguintes dados:  
	a) Quantidade de pessoas do sexo masculino e feminino;  
	b) Quantidade de pessoas dos seguintes cargos: gerente, atendente, açougueiro,  secretária, almoxarife, padeiro e estagiário.  
	c) Quantidade de pessoas maiores de idade (18+) e quantidade de pessoas menores de idade */

	//Atributos
	String nome;
	int idade , sexo , cargo;
	int qtmas = 0; int qtfem = 0 ; int qtmaior = 0; int qtmenor = 0;
	int qtgerente = 0; int qtatendente =0; int qtacougueiro =0; int qtsecretaria =0;
	int qtalmoxarife = 0; int qtpadeiro =0; int qtestagiario = 0;

	//Metodo para obter os dados
	public void obterDados(){
		
		

		nome = JOptionPane.showInputDialog("Informe seu nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Diga sua idade"));
		sexo =  Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Masculino e 2 para Feminino"));
		cargo = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para Gerente \n2 para atendente \n3 para açougueiro \n4 para secretária \n5 para almoxarife \n6 para padeiro \n7 para estagiario"));


	}
	//Método para o laço de repetição
	public void laco(){
		//Variavel continuar
		int continuar =0;

		do {
			obterDados();
			contabilizarSexo();
			contabilizarIdade();
			contabilizarCargo();
			
			
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		}while(continuar == 0);
		exibirDados();
	}
     
	//Metodo Para Contabilizar sexo
	public void contabilizarSexo() {
		if (sexo == 1) {
			qtmas++;
		}else {
			qtfem++;
		}
	}


	//Metodo para ver quantos Maiores de idades ou menores
	public void contabilizarIdade() {
		if(idade > 18) {
			qtmaior++;
		}else{
			qtmenor++;

		}
	}
     //Metodo Para ver quantos De cada cargo
	public void contabilizarCargo() {
		if (cargo == 1) {
			qtgerente++;
		}else if (cargo == 2) {
			qtatendente++;
		}else if (cargo == 3) {
			qtacougueiro++;
		}else if (cargo == 4) {
			qtsecretaria++;
		}else if (cargo == 5) {
			qtalmoxarife++;
		}else if (cargo == 6) {
			qtpadeiro++;
		}else{
			qtestagiario++;
		}
	}
	//Método para exibir a quantidade de pessoas
		public void exibirDados() {

			String msg = "Quantidade de pessoas sexo masculino :  " +qtmas;
			msg+= "\nQuantidade de pessoas sexo feminino : " +qtfem;
			msg+= "\nQuantidade de pessoas maiores de idade : " +qtmaior;
			msg+= "\nQuantidade de pessoas menores de idade : " +qtmenor;
			msg+= "\nQuantidade de gerentes : " +qtgerente;
			msg+= "\nQuantidade de atendentes : " +qtatendente;
			msg+= "\nQuantidade de açougueiros : " +qtacougueiro;
			msg+= "\nQuantidade de secretarias : " +qtsecretaria;
			msg+= "\nQuantidade de almoxarifes : " +qtalmoxarife;
			msg+= "\nQuantidade de padeiros : " +qtpadeiro;
			msg+= "\nQuantidade de estagiarios : " +qtestagiario;
			

			JOptionPane.showMessageDialog(null, msg);
	
}

}
