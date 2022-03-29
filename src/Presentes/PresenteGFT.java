package Presentes;

import java.util.Scanner;

public class PresenteGFT {
	private int anoAtual;
	private int anoEntrada;
	private int totalAnos=anoAtual-anoEntrada;
	private String mensagem="";
	




	public PresenteGFT() {
		
	}
	
	
	public PresenteGFT(int anoAtual, int anoEntrada) {
		super();
		this.anoAtual = anoAtual;
		this.anoEntrada = anoEntrada;
		
	}

	public int getTotalAnos() {
		return totalAnos=anoAtual-anoEntrada;
	}

	public int getAnoAtual() {
		return anoAtual;
	}
	public String getMensagem() {
		return mensagem;
	}
	
	
	public void setTotalAnos(int totalAnos) {
		this.totalAnos = totalAnos;
	}
	
	
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}


	public int getAnoEntrada() {
		return anoEntrada;
	}


	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}


	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}


	public int presentes() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Digite o ano de entrada");
		anoEntrada=entrada.nextInt();
		
		System.out.println("Digite o ano atual");
		anoAtual=entrada.nextInt();
		
	switch(totalAnos) {
	

	
	case 1: mensagem="Vale presente"  ;
	break;
	
	case 2: mensagem="Smart watch" ;
	break;

	case 5:mensagem="Fone bluetooth"  ;
	break;
	
	case 10: mensagem="jantar"  ;
	break;
	
	case 15:mensagem="Jantar top"  ;
	break;
	
	default:
		System.out.println("Esse ano não vai ter presente");
	}
	System.out.println(mensagem);
	return   this.totalAnos;
	}	
}	


