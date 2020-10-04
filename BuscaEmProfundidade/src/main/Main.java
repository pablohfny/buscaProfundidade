package main;

public class Main {
	
	public static void main(String[] args) {
		
		Grafo grafo = new Grafo(7);
		Busca busca = new Busca(grafo);
		busca.buscaProfundidade();

	}
}
