package algoritmos.exec;

import algoritmos.ListaEncadeada;
import algoritmos.NodoLista;

public class UsuLista {

	public static void main(String[] args) {
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		listaEncadeada.add(3);
		listaEncadeada.add(5);
		listaEncadeada.add(1);
		listaEncadeada.sort();
		NodoLista nodo = listaEncadeada.imprime();
		while (nodo != null) {
			System.out.println("Elemento: "+nodo.getInfo());
			nodo = nodo.getProximo();
		}
	}

}
