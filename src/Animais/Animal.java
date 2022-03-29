package Animais;

public abstract  class Animal {

	private String nome;
	private int peso;
	private int quantidade;
	
	
	public Animal(String nome, int peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	
	
	
	
	public int getQuantidade() {
		return quantidade;
	}





	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}





	public String getNome() {
		return nome;
	}





	public int getPeso() {
		return peso;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public void setPeso(int peso) {
		this.peso = peso;
	}





	public abstract String som();
	public abstract int quantidadeDeRacao();

	public int quantidadeDeRacao(int peso, int quantidade) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
