package main;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	@SuppressWarnings("unchecked")
	List<Integer> vertices[] = new List[100];
	int numeroVertices;
	
	public Grafo(int numVertices) {
		for (int i = 0; i < numVertices; i++)
			vertices[i] = new ArrayList<>(0);
		numeroVertices = numVertices;
		criarGrafo();
	}
	
	public void addArestas(int i, int... j) {
		for (Integer k : j) {
			vertices[i].add(k);
		}
	}
	
	//Cria o Digrafo 'G'
	public void criarGrafo() {
		addArestas(0, 1, 2);
		addArestas(2, 3);
		addArestas(3, 0, 4, 5);
		addArestas(4, 5);
		addArestas(5, 1);
		addArestas(1, 6);
	}
}
