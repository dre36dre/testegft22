package Animais;

public class Gato  extends Animal{

	
	
	
	public Gato(String nome, int peso) {
		super(nome, peso);
	}

	@Override
	public String som() {
		return "miau";
	}

	@Override
	public int quantidadeDeRacao(int peso,int quantidade) {
		if(peso < 4  ) {
			quantidade=peso * 12;
			System.out.println();
		}if (peso >4) {
			quantidade=peso*15;
		}
		
		return quantidade;
	}

	@Override
	public int quantidadeDeRacao() {
		return 0 ;
	}
	

}
