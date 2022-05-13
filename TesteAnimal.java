package Exercicios;

public class TesteAnimal {

	public static void main(String[] args) {
		
		System.out.println("\n***************** Cachorro ******************");
		Cachorro cachorro = new Cachorro("Canis familiaris", "Mel", "Casa", 7, 4, "Fox Paulistinha",
				"Preto, Branco e Marrom", "Médio");
		cachorro.imprimirInfo();
		
		System.out.println("\n****************** Cavalo *******************");
		Cavalo cavalo = new Cavalo("Equus ferus", "Spirit", "Semidesértico", 25, 4, "Frísio", 88);
		cavalo.imprimirInfo();
		
		System.out.println("\n**************** Bicho-Preguiça *****************");
		Preguica preguica = new Preguica("Bradypus variegatus", "Soninho", "Floresta", 17, 4, 18);
		preguica.imprimirInfo();
	}

}
