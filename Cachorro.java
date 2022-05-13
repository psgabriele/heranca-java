package Exercicios;

public class Cachorro extends Animal{

	private String raca;
	private String corPelo;
	private String porte;
	
	public Cachorro(String especie, String nome, String habitat, int idade, int patas, String raca, String corPelo, String porte) {
		
		super(especie, nome, habitat, idade, patas);
		this.raca = raca;
		this.corPelo = corPelo;
		this.porte = porte;	
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do Animal");
		System.out.println("\nEspécie: " + getEspecie());
		System.out.println("\nNome: " + getNome());
		System.out.println("\nHabitat: " + getHabitat());
		System.out.println("\nIdade: " + getIdade());
		System.out.println("\nQuantidade de patas: " + getPatas());
		System.out.println("\nRaça: " + raca);
		System.out.println("\nCor do pelo: " + corPelo);
		System.out.println("\nPorte: " + porte);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}
		
}
