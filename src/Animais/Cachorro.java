package Animais;

public class Cachorro extends Animal {
	
public Cachorro(String nome, int peso) {
		super(nome, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
public int quantidadeDeRacao(int peso,int quantidade) {
	if(peso <3 ) {
		quantidade=35 * peso;
	}  if(peso > 3 && peso <10) {
		quantidade=45 * peso;
	}else {
		quantidade=50 * peso;
	}
	return quantidade;
}

	@Override
	public String som() {
		// TODO Auto-generated method stub
		return "auau";
	}

	@Override
	public int quantidadeDeRacao() {
		// TODO Auto-generated method stub
		return this.quantidadeDeRacao();
	}

//	
	
}
