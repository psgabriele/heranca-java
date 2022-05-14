package Exercicios;

public class Cachorro1 extends Animal1{

	public Cachorro1(String nome, int idade) {
		super(nome, idade);
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do Animal");
		System.out.println("\nNome: " + getNome() + "\t\tIdade: " + getIdade());
	}
	
	@Override
	public void emiteSom(String som) {
		System.out.println("\nWoffwoff...Woffwoff...");
	}
	
	@Override
	public void acao(String acao) {
		System.out.println("\nCorre, pula, senta e dá patinha.");
	}
}
