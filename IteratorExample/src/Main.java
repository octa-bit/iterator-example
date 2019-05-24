
//client

public class Main {

	public static void main(String[] args) {

		ColecaoDeCanais canaisDeEsportes = new CanaisEsportes();

		System.out.println("Canais de Esporte:\n");

		for (Iterator it = canaisDeEsportes.createIterator(); !it.hasNext(); it.next()) {

			System.out.println(it.currentItem().nome);
		}

		ColecaoDeCanais canaisDeFilmes = new CanaisFilmes();

		System.out.println("\nCanais de Filmes:\n");

		for (Iterator it = canaisDeFilmes.createIterator(); !it.hasNext(); it.next()) {

			System.out.println(it.currentItem().nome);
		}
	}
}
