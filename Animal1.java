package Exercicios;

public abstract class Animal1 {

	private String nome;
	private int idade;
	
	abstract public void emiteSom(String som);
	abstract public void acao(String acao);
	
	public Animal1(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do animal");
		System.out.println("\nNome: " + nome);
		System.out.println("\nIdade: " + idade);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
