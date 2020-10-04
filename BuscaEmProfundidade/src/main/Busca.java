package main;

import java.util.List;

public class Busca {
	
	public static final byte branco = 0;
	public static byte preto = 1;
	private String saida;
	private Grafo grafo;
	
	public Busca (Grafo g ){
		this.grafo = g;
		saida = "";
	}
	
	//Visita os verticies caso não tenham sido visitados..
	private void visitaDfs(int u, int cor[]) {
		System.out.println(" Visitando o vertice: " + u);
		saida += u + ", ";	//Armazena a ordem de visita dos vertices em uma string
		cor[u] = preto;
		if (!grafo.vertices[u].isEmpty()) {
			List<Integer> listaAdj = grafo.vertices[u];
			for (Integer v : listaAdj) {
				if (cor[v] == branco) {
					this.visitaDfs(v, cor);
				}
			}
		}
	}
	

	 //Metodo que realiza a busca em profundidade propriamente dita.
	public void buscaProfundidade() {
		int cor[] = new int[this.grafo.numeroVertices];
		for (int u = 0; u < this.grafo.numeroVertices; u++) {
			cor[u] = branco;
		}
		for (int u = 0; u < grafo.numeroVertices; u++) {
			if (cor[u] == branco)
				this.visitaDfs(u, cor);
		}
		System.out.print("\n Ordem de visita: ");
		System.out.println(saida.substring(0, saida.lastIndexOf(",")));
		System.out.print("\n");
	}
	
	
}
