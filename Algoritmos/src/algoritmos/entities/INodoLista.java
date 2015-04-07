package algoritmos.entities;

import algoritmos.NodoLista;

public interface INodoLista {
	NodoLista getProximo();
	void setProximo(NodoLista nodo);
	int getInfo();
	void setInfo(int info);
	
}
