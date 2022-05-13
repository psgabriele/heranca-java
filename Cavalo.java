package Exercicios;

public class Cavalo extends Animal {

	private String raca;
	private int velocidade;
	
	public Cavalo(String especie, String nome, String habitat, int idade, int patas, String raca, int velocidade) {
		
		super(especie, nome, habitat, idade, patas);
		this.raca = raca;
		this.velocidade = velocidade;
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do Animal");
		System.out.println("\nEspécie: " + getEspecie());
		System.out.println("\nNome: " + getNome());
		System.out.println("\nHabitat: " + getHabitat());
		System.out.println("\nIdade: " + getIdade());
		System.out.println("\nQuantidade de patas: " + getPatas());
		System.out.println("\nRaça: " + raca);
		System.out.println("\nVelocidade: " + velocidade + "km/h");
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
}
