package NotasMusicais;

import java.util.Scanner;

public class NotaMusical {
    String[] nota = {"do", "re" ,  "mi" , "fa", "so", "la", "si"};
  Scanner entrada=new Scanner(System.in);
  private int inicial;
  private int fim;
  
  
  public NotaMusical(String[] nota, Scanner entrada, int inicial, int fim) {
	super();
	this.nota = nota;
	this.entrada = entrada;
	this.inicial = inicial;
	this.fim = fim;
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


public String sequencia() {
	  
  System.out.println("nota inicial");
  this.inicial=entrada.nextInt();
  System.out.println("Final");
  this.fim=entrada.nextInt();
  
  for(int i=0; i<nota.length+inicial; i++ ) {
	  System.out.print(nota[inicial]);
  }
  return null;
  }
}
