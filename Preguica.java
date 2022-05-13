package Exercicios;

public class Preguica extends Animal {

	private int tempoSono;
	
	public Preguica(String especie, String nome, String habitat, int idade, int patas, int tempoSono) {
		
		super(especie, nome, habitat, idade, patas);
		this.tempoSono = tempoSono;
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do Animal");
		System.out.println("\nEspécie: " + getEspecie());
		System.out.println("\nNome: " + getNome());
		System.out.println("\nHabitat: " + getHabitat());
		System.out.println("\nIdade: " + getIdade());
		System.out.println("\nQuantidade de patas: " + getPatas());
		System.out.println("\nTempo de sono: " + tempoSono + " horas");
	}

	public int getTempoSono() {
		return tempoSono;
	}

	public void setTempoSono(int tempoSono) {
		this.tempoSono = tempoSono;
	}
	
}
