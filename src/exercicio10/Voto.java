package exercicio10;

import javax.swing.JOptionPane;

public class Voto {
	Object[] menus = {"Candidato 1" , "Candidato 2" , "Candidato 3" , "Candidato 4" , "sair"};
	Object menu = "";
	double candidato1 = 0;
	double candidato2 = 0;
	double candidato3 = 0;
	double candidato4 = 0;
	double quantVotos = 0;
	double percCandidato1 = 0;
	double percCandidato2 = 0;
	double percCandidato3 = 0;
	double percCandidato4 = 0;




	//Metodo de exibiçao de menu 
	public void ExibirMenu() {
		menu = JOptionPane.showInputDialog(null, "Selecione o candidato", "Urna", JOptionPane.PLAIN_MESSAGE, null, menus, "");

	}
	//Metodo Do laço
	public void laco() {
		do {
			ExibirMenu();
			if (menu.equals("sair")) {break;}
			quantVotos++;
			Votacao();
			Porcentagem();
			



		}while (menu != "sair");
		
		Vencedor();
		
	}	

	//metodo para incrementar a quantidade de votos nos candidatos
	public void Votacao() {
		if(menu.equals("candidato1")){
			candidato1++;
		}else if(menu.equals("candidato2")){
			candidato2++;
		}else if(menu.equals("candidato3")){
			candidato3++;
		}else{
			candidato4++;

		}	
	}
	
	//Metodo para pega a porcentagem de votos
	public void Porcentagem() {
	 percCandidato1 = (candidato1/quantVotos)*100;
     percCandidato2 = (candidato2/quantVotos)*100;
     percCandidato3 = (candidato3/quantVotos)*100;
     percCandidato4 = (candidato4/quantVotos)*100;
	
	}
	
	//Metodo Para mostrar O vencedor
	public void Vencedor() {
		if((candidato1>candidato2) && (candidato1>candidato3) && (candidato1>candidato4)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato1, com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");

        }else if((candidato2>candidato1) && (candidato2>candidato3) && (candidato2>candidato4)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato2, com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");

        }else if((candidato3>candidato1) && (candidato3>candidato2) && (candidato3>candidato4)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato3, com "+candidato3+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");

        }else if((candidato4>candidato1) && (candidato4>candidato2) && (candidato4>candidato3)){
            JOptionPane.showMessageDialog(null, "O vencedor é o candidato4, com "+candidato4+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato2) && (candidato1==candidato3) && (candidato1==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato4, candidato3, candidato2, candidato1, ambos com "+candidato4+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato2) && (candidato1==candidato3)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato2, candidato3, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato3) && (candidato1==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato3, candidato4, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato1==candidato2) && (candidato1==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato2, candidato3, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if((candidato2==candidato4) && (candidato2==candidato4)){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato2, candidato3, candidato4, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato1==candidato2){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato2, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato1==candidato3){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato3, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato1==candidato4){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato1, candidato4, ambos com "+candidato1+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato2==candidato3){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato2, candidato3, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else if(candidato2==candidato4){
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato2, candidato4, ambos com "+candidato2+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos");
        
        }else{
            JOptionPane.showMessageDialog(null, "Os vencedores são: candidato3, candidato4, ambos com "+candidato3+" votos"
            +"\nPorcentagem de votos dos candidatos e quantidade de votos: "
            +"\nCandidato1: "+candidato1+" votos, totalizando em "+ percCandidato1+ "% dos votos"
            +"\nCandidato2: "+candidato2+" votos, totalizando em "+ percCandidato2+ "% dos votos"
            +"\nCandidato3: "+candidato3+" votos, totalizando em "+ percCandidato3+ "% dos votos"
            +"\nCandidato4: "+candidato4+" votos, totalizando em "+ percCandidato4+ "% dos votos"); 
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
