package Exercicios;

public class Cavalo1 extends Animal1{

	public Cavalo1(String nome, int idade) {
		super(nome, idade);
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do Animal");
		System.out.println("\nNome: " + getNome() + "\t\tIdade: " + getIdade());
	}
	
	@Override
	public void emiteSom(String som) {
		System.out.println("\niiiirrrrí...iiiirrí...");
	}
	
	@Override
	public void acao(String acao) {
		System.out.println("\nCorre, salta e dá coice.");
	}
}
