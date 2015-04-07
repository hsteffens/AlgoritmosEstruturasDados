package algoritmos.entities;

import algoritmos.NodoLista;

public interface IListaEncadeada {
	NodoLista getInicio();
	void setInicio(NodoLista nodo);
	void add(int info);
	NodoLista imprime();
	void sort();
}
