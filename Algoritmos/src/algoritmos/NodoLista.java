package algoritmos;

import algoritmos.entities.INodoLista;

public class NodoLista implements INodoLista{
	
	private NodoLista proximo;
	private int info;
	
	public NodoLista(int info) {
		setInfo(info);
	}
	@Override
	public NodoLista getProximo() {
		return proximo;
	}
	@Override
	public void setProximo(NodoLista nodo) {
		this.proximo = nodo;
	}
	@Override
	public int getInfo() {
		return info;
	}
	@Override
	public void setInfo(int info) {
		this.info = info;
	}


}
