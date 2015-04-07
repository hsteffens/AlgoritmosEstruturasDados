package algoritmos;

import algoritmos.entities.IListaEncadeada;

public class ListaEncadeada implements IListaEncadeada{

	private NodoLista inicio;
	
	@Override
	public NodoLista getInicio() {
		return inicio;
	}

	@Override
	public void setInicio(NodoLista nodo) {
		this.inicio = nodo;
	}

	@Override
	public void add(int info) {
		NodoLista nodoLista = new NodoLista(info);
		nodoLista.setProximo(getInicio());
		setInicio(nodoLista);
	}

	@Override
	public NodoLista imprime() {
		return getInicio();
	}

	public ListaEncadeada() {
		super();
	}

	@Override
	public void sort() {
		if (getInicio() != null) {
			NodoLista novaLista = new NodoLista(getInicio().getInfo());
			while (getInicio() != null) {
				if (getInicio().getInfo() < novaLista.getInfo()) {
					NodoLista p2 = novaLista;
					novaLista = getInicio();
					novaLista.setProximo(p2);
				}else if (getInicio().getInfo() != novaLista.getInfo()) {
					novaLista.setProximo(getInicio());
				}
				setInicio(getInicio().getProximo());
			}
			setInicio(novaLista);
		}
	}

}
