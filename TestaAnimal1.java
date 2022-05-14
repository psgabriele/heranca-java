package Exercicios;

import java.util.Scanner;

public class TestaAnimal1 {

	public static void main(String[] args) {
		
Scanner leia = new Scanner(System.in);
		
		Cachorro1 cachorro = new Cachorro1("Amora", 2);
		Cavalo1 cavalo = new Cavalo1("Spirit", 23);
		Preguica1 preguica = new Preguica1("Soninho", 10);
		
		Animal1 animal = null;
		
		System.out.println("\n1.Cachorro \n2.Cavalo \n3.Preguiça");
		System.out.println("\nEscolha um animal: ");
		int op;
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			animal = cachorro; 
			cachorro.imprimirInfo();
			cachorro.emiteSom(null);
			cachorro.acao(null);
			break;
		case 2:
			animal = cavalo; 
			cavalo.imprimirInfo();
			cavalo.emiteSom(null);
			cavalo.acao(null);
			break;
		case 3: 
			animal = preguica; 
			preguica.imprimirInfo();
			preguica.emiteSom(null);
			preguica.acao(null);
			break;
		default: System.out.println("\nNão existe um animal cadastrado nesse número...");
		}

	}

}
