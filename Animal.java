/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal.*/

package Exercicios;

public class Animal {
	
	private String especie;
	private String nome;
	private String habitat;
	private int idade;
	private int patas;
	
	public Animal(String especie, String nome, String habitat, int idade, int patas) {
		super();
		this.especie = especie;
		this.nome = nome;
		this.habitat = habitat;
		this.idade = idade;
		this.patas = patas;
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do animal");
		System.out.println("\nEspécie: " + especie);
		System.out.println("\nNome: " + nome);
		System.out.println("\nHábitat: " + habitat);
		System.out.println("\nIdade: " + idade);
		System.out.println("\nQuantidade de patas: " + patas);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

}
