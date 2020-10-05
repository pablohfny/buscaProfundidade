package main;

public class Main {
	
	public static void main(String[] args) {
				
		Grafo grafo = new Grafo(5);
		Busca busca = new Busca(grafo);
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nó inicial");
		n = s.nextInt();
		busca.buscaProfundidade(n);

	}
}
