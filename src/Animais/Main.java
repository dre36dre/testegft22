package Animais;

public class Main {
public static void main(String[] args) {
	Gato coca=new Gato("Coca",20);
	Gato foxy=new Gato("Foxy",3);
	Cachorro ein=new Cachorro("Einstein",10);
	Cachorro ed=new Cachorro("Edward",5);
	int total=ein.getQuantidade();
	System.out.println(total);
}
}
