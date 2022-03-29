package NotasMusicais;

import java.util.Scanner;

public class NotaMusical {
	String[] nota = {"do", "re" ,  "mi" , "fa", "so", "la", "si"};
	Scanner entrada=new Scanner(System.in);
	private int inicial;
	private int fim;

	public NotaMusical() {
	}

	public String[] getNota() {
		return nota;
	}

	public Scanner getEntrada() {
		return entrada;
	}
	
	public int getInicial() {
		return inicial;
	}


	public int getFim() {
		return fim;
	}
	
	
	
	public void setNota(String[] nota) {
		
		this.nota = nota;
		
		
	}
	
	
	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}
	
	public void setInicial(int inicial) {
		this.inicial = inicial;
	}

	public void setFim(int fim) {
		this.fim = fim;
	}
	
	
	public int sequencia() {
		
		System.out.println("Nota inicial");
		this.inicial=entrada.nextInt();
		System.out.println("Nota Final");
		this.fim=entrada.nextInt();
		
		int c= inicial;
		
		for(int i=0;i<fim; i++ ) {
			System.out.print(nota[c]+" ");
			c++;
		}
		return 0;
		
		
	}}

	
	
	
	
	



