package exercicio03;

import javax.swing.JOptionPane;

public class Clientes {

	/*3. Uma lanchonete precisa de um sistema para calcular o troco que será dado aos clientes, 
	 * para isso faça com que seja informado um código a quantidade pedida daquele produto (que pertence ao código informado). 
	 * Crie um laço onde o cliente irá informar códigos e quantidades infinitamente. 

Após informados os códigos e suas respectivas quantidades informe o total consumido e peça o valor que o cliente irá pagar 
(Se o cliente tentar pagar menos que o total peça novamente o pagamento até ele informar um valor igual ou superior consumido). 

Ao término informe o troco que será dado ao cliente. 

CÓDIGO PEDIDO VALOR 1 Hambúrguer + Suco de Laranja R$ 5,00 2 Sanduíche natural + Suco de Uva R$ 4,50 3 Prato do dia R$ 8,00 
4 Pizza R$12,00 5 Lasanha R$ 16,50 6 Pão de queijo R$ 1,00 7 Bolo R$ 2,50 

	 */
	//Atributos
	int codigo =-1;
	double troco =0;
	double valor =0 ;
	int quantidade = -1;
	double dinheiro=0;
	double total =0;

	//Metodo para obter os codigos
	public void obterCodigos(){
			codigo = Integer.parseInt(JOptionPane.showInputDialog(null ,"Informe o Codigo do produto\n Digite 0 Para Sair"));
		
		}
	
	//Obter A quantide de produtos
	public void obterProdutos(){
		quantidade = Integer.parseInt(JOptionPane.showInputDialog(null ,"Informe a quantidade de produtos"));


	}
	
	//Método para o laço de repetição
		public void laco(){
			do {
				obterCodigos();
				if (codigo == 0) {break;}
				obterProdutos();
			    precoProduto();
			    valorProduto();
			    valorVerificado();
			    ObterTroco();
			    InformarTroco();
			    
		}while (codigo != 0);
		}
		
		//Preço dos produtos
		public void precoProduto(){
			if (codigo == 1){valor = 5.00;}
		     else if (codigo == 2){valor = 4.50;}
		     else if (codigo == 3){valor = 8.00;}
		     else if (codigo == 4){valor = 12.00;}
		     else if (codigo == 5){valor = 16.50;}
		     else if (codigo == 6){valor = 1.00;}
		     else {valor = 2.50;}
		}
	
		//Definindo os valores
		public void valorProduto() {
			valor = valor*quantidade;
			
		}
		//Verificando o dinheiro do cliente
		public void valorVerificado() {
		while (dinheiro < valor){
			dinheiro = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o Dinheiro cliente" ));}
			
		}
	
		//definindo o troco
		public void ObterTroco() {
			troco = dinheiro - valor;
		}
	
	
		//Informar o troco
		public void InformarTroco() {
		JOptionPane.showMessageDialog(null,"Troco: "+troco);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
