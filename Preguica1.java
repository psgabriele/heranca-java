package Exercicios;

public class Preguica1 extends Animal1{

	public Preguica1(String nome, int idade) {
		super(nome, idade);
	}
	
	public void imprimirInfo() {
		System.out.println("\n\tInformações do Animal");
		System.out.println("\nNome: " + getNome() + "\t\tIdade: " + getIdade());
	}
	
	@Override
	public void emiteSom(String som) {
		System.out.println("\nAaah...Aaaaah...Aaah");
	}
	
	@Override
	public void acao(String acao) {
		System.out.println("\nDorme, escala e dá abraços.");
	}
}
