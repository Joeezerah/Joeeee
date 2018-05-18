package exercicio02;

import javax.swing.JOptionPane;

public class Pessoa {
	/*2. Desenvolver um algoritmo que peça nome, altura, idade, peso dos jogadores de basquete,
	enquanto o nome do jogador for diferente da palavra SAIR o programa deverá pedir essas informações,
	após cadastrados deverá aparecer as seguintes informações:  
		a. Quantidade de jogadores cadastrados; b. Nome e altura do maior Jogador;
		c. Nome e idade do jogador mais velho; d. Nome e peso do jogador mais pesado; e. Média das alturas jogadores.*/ 


	//Atributos
	String nome;
	double altura ,alturamaior , peso , pesomaior , media , somaaltura;
	int idade , idademaior;
	int qtjogadores = 0; 
	String NomeMaiorJogador;
	String NomeVelhoJogador;
	String NomePesadoJogador;

	//metodo para obternome
	public void Obternome() {
		nome = JOptionPane.showInputDialog("Informe seu nome ou Sair para finalizar");	  
	}

	//Método para realizar perguntas
	public void obterDados(){

		altura = Double.parseDouble(JOptionPane.showInputDialog("altura do jogador"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("peso do jogador"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Idade do jogador"));
	}

	//Metodo para o Laço de repetiçao
	public void laco () {
		do {
			Obternome();
			if(nome.equals("Sair")) {break;}
			obterDados();
			qtjogadores++;
			ObterMaiorJogador();
			ObterJogadorVelho();
			ObterJogadorPesado();
			ObterAltura();

		}while(!nome.equals("Sair"));
		ObterMedia();	
		exibirDados();

	}



	//Metodo para encontrar o Maior jogador
	public void ObterMaiorJogador() {
		if (altura > alturamaior) {
			alturamaior = altura;
			NomeMaiorJogador = nome;
		} 
	}
	//Metodo para encontrar o jogador mais velho
	public void ObterJogadorVelho() {
		if (idade > idademaior) {
			idademaior = idade;
			NomeVelhoJogador = nome;
		} 
	}
	//Metodo para encontrar o jogador mais pesado
	public void ObterJogadorPesado() {
		if (peso > pesomaior) {
			pesomaior = peso;
			NomePesadoJogador = nome;
		} 
	}
	//metodo para fazer a media das alturas dos jogadores
	public void ObterAltura() {
		somaaltura += altura;


	}
	//Metodo para exibir a media
	public void ObterMedia() {
		media += (somaaltura/qtjogadores);
	}

	//Método para exibir a média e a situaçao do aluno
	public void exibirDados() {

		String msg = "Quantidade de jogadores registrados " +qtjogadores;
		msg+= "\nNome e Altura do maior jogador : " +NomeMaiorJogador + " " +alturamaior;
		msg+= "\nNome e idade do jogador mais velho : " +NomeVelhoJogador +" "+idademaior;
		msg+= "\nNome e peso do jogador mais pesado : " +NomePesadoJogador +" "+pesomaior;
		msg+= "\nMedia das alturas dos jogadores "+media;


		JOptionPane.showMessageDialog(null, msg);
	}
}