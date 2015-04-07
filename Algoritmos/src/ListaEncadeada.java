public class ListaEncadeada {
	private NodoLista inicio;

	public ListaEncadeada() {
		this.inicio = null;
	}

	public NodoLista getInicio() {
		return inicio;
	}

	public void insereLista(int info) {
		NodoLista nodo = new NodoLista(info);
		nodo.setProximo(inicio);
		inicio = nodo;
	}

	public void imprimeLista() {
		NodoLista p = inicio;
		while (p != null) {
			System.out.println(p.getInfo());
			p = p.getProximo();
		}

	}
	
	public void imprimeLista2()
	{
		imprimeListaRecursivo(inicio);
	}
	
	private void imprimeListaRecursivo(NodoLista n)
	{
		if( n != null)
		{
			System.out.println(n.getInfo());
			imprimeListaRecursivo(n.getProximo());
		}
		
	}
	
//	private void imprimeListaRecursivo(NodoLista n)
//	{
//		if( n != null)
//		{
//			System.out.println(n.getInfo());
//			imprimeListaRecursivo(n.getProximo());
//		}
//		
//	}
	
	
	public int excluiValor(int valor)
	{
		if( inicio == null)
		{
			return 0;
		}
		else
		{   int c = 0;
			NodoLista p = inicio;
			NodoLista pAnt = null;
			while ( p != null)
			{
				
    			if( p.getInfo() == valor )
    			{
    				if( p == inicio)
    				{
    					inicio = inicio.getProximo();
    					p = inicio;
    					c++;
    				}
    				else{
    					
    				    p = p.getProximo();
    					pAnt.setProximo(p);
    					c++;
    				}
    				
    			}
    			else				
			    {
				     pAnt = p;
				     p = p.getProximo();
			    }
		    }
			return c;
		}
	}
	public boolean comparaListas2(ListaEncadeada l2)
	{
		NodoLista p1 = this.inicio;
		NodoLista p2 = l2.inicio;
		while ( p1 != null && p2 != null)
		{
			if( p1.getInfo() == p2.getInfo())
			{
				p1 = p1.getProximo();
				p2 = p2.getProximo();
			}
			else
				return false;			
		}
		if( p1 == null && p2 == null)
			return true;
		else
			return false;
	}
	
	public boolean comparaListas(ListaEncadeada l2)
	{
		NodoLista p1 = this.inicio;
		NodoLista p2 = l2.inicio;
		return comparaListasRecursivo(p1, p2);
	}

	private boolean comparaListasRecursivo(NodoLista p1, NodoLista p2)
	{
		if( p1 != null && p2 != null)
			if( p1.getInfo() == p2.getInfo())
				return comparaListasRecursivo(p1.getProximo(), p2.getProximo());
			else
				return false;
		else
		{
			if ( p1 == null && p2 == null)
				return true;
			else
				return false;
		}
		
	}
	
    
	public void bolha() {  // ordena a lista encadeada utilizando o método da bolha.
	boolean trocou;
	if (inicio == null)
		return;
	else
		do {
			trocou = false;
			NodoLista q, r, ant=inicio;
			NodoLista p = inicio;
			while (p.getProximo() != null) {
				q = p.getProximo();
				if (p.getInfo() > q.getInfo()) {
					r = q.getProximo();
					p.setProximo(r);
					q.setProximo(p);
					if (p == inicio){
						inicio = q;
			        }
					else{
					    ant.setProximo(q);
					 }
					ant = q;
					trocou = true;
				}
				else {
				   ant = p;
				   p = q;
			}

			}
			//imprimeLista();
		} while (trocou);

}
	public int contaValoresDiferentes()
	{
		int contador = 1;

		if( inicio == null )
			return 0;
		else
		{
			NodoLista p = inicio;
			int valor = p.getInfo();
			while ( p.getProximo() != null)
			{
				p = p.getProximo();
				if( valor != p.getInfo())
				{
					contador++;
					valor = p.getInfo();
				}
					
				
			}
			return contador;
		}
	}
	
	public ListaEncadeada copiaLista()
	{
		ListaEncadeada listaNova = new ListaEncadeada();
		NodoLista p1 = this.inicio;
		NodoLista p2 = null;
		while ( p1 != null)
		{
			NodoLista nodo = new NodoLista(p1.getInfo());
			if(listaNova.inicio == null)
				listaNova.inicio = nodo;
			else
				p2.setProximo(nodo);
			p2 = nodo;
			p1 = p1.getProximo();
		}
		return listaNova;
	}
	
	
	public ListaEncadeada copiaLista2()
	{
		ListaEncadeada lNova = new ListaEncadeada();
		lNova.inicio = copiaRecursiva(this.inicio);
		return lNova;
	}
	
	private NodoLista copiaRecursiva(NodoLista p)
	{
		if ( p != null)
		{
			NodoLista nodo = new NodoLista(p.getInfo());
			nodo.setProximo(copiaRecursiva(p.getProximo()));
			return nodo;
		}
		else
			return null;
	}
	
	
	
	
	public ListaEncadeada copiaLista3()
	{
		ListaEncadeada nova = new ListaEncadeada();
	    nova.inicio = copiaRecursivo2(this.inicio);
	    return nova;
	}
	
	private NodoLista copiaRecursivo2(NodoLista nodo)
	{
		if( nodo != null )
		{
			NodoLista r = copiaRecursivo2(nodo.getProximo());
			NodoLista n = new NodoLista(nodo.getInfo());
			n.setProximo(r);
			return n;
		}
		else
			return null;
	}
	
	
	public void inverteLista()
	{
		NodoLista p = inicio;
		NodoLista inicioAux = null;
		while ( p != null)
		{
			inicio = inicio.getProximo();
			p.setProximo(inicioAux);
			inicioAux = p;
			p = inicio;
					
		}
		inicio = inicioAux;
	}
	public boolean removeElemento(int info)

	{
		if (inicio == null)
			return false;
		else
		{
			if (inicio.getInfo() == info)
			{
				inicio = inicio.getProximo();
				return true;
			}
			else
			{
				NodoLista p = inicio;

				NodoLista nodo = p.getProximo();

				while (nodo != null)

				{

					if (nodo.getInfo() == info)

					{

						p.setProximo(nodo.getProximo());

						return true;

					}

					p = nodo;

					nodo = nodo.getProximo();

				}

				return false;

			}

		}

	}

	public ListaEncadeada uneLista(ListaEncadeada l1)
	{
		NodoLista p_desta = this.inicio;
		ListaEncadeada l3 = new ListaEncadeada();
		NodoLista p3 = null;
		while (p_desta != null)
		{
			NodoLista nodo = new NodoLista(p_desta.getInfo());
			if (l3.inicio == null)
				l3.inicio = nodo;
			else
				p3.setProximo(nodo);
			p3 = nodo;
			p_desta = p_desta.getProximo();
		}
		NodoLista p1 = l1.inicio;
		boolean achou;
		while (p1 != null)
		{
			p_desta = this.inicio;
			achou = false;
			while ((p_desta != null) && (!achou))
			{
				if (p_desta.getInfo() == p1.getInfo())
					achou = true;
				else
					p_desta = p_desta.getProximo();
			}
			if (!achou)
			{
				NodoLista nodo = new NodoLista(p1.getInfo());

				if (l3.inicio == null)
				{
					l3.inicio = nodo;
				}
				else
					p3.setProximo(nodo);
				p3 = nodo;
			}

			p1 = p1.getProximo();

		}

		return l3;

	}

	public boolean listaVazia() 
	{
		if (inicio == null)
			return true;
		else
			return false;
	}


	public void insereOrdem(int info)
	{
		if (inicio == null) {
			inicio = new NodoLista(info);
			return;
		}
		else 
		{
			NodoLista p, p_ant;
			p = inicio;
			p_ant = inicio;
			while (p.getInfo() < info) 
			{
				if (p.getProximo() != null) 
				{
					p_ant = p;
					p = p.getProximo();
				}
				else {
					NodoLista nodo = new NodoLista(info);
					p.setProximo(nodo);
					return;
				}
			}
			NodoLista nodo = new NodoLista(info);
			nodo.setProximo(p);
			if (inicio == p) 
			{
				inicio = nodo;
			}
			else
				p_ant.setProximo(nodo);
			return;
		}
	}

	public ListaEncadeada concatenaListas(ListaEncadeada l2) 
	{
		ListaEncadeada lN = new ListaEncadeada();

		NodoLista p1 = this.inicio;

		NodoLista p2 = l2.inicio;

		NodoLista pN = null; // variavel para ligar os objetos da lista nova

		NodoLista aux;

		while ((p1 != null) && (p2 != null)) // enquanto p1 e p2 nao forem nulos, faça:
		{
			if (p1.getInfo() < p2.getInfo()) // compara
			{ // as informacoes de p1 e p2 para ver qual é maior;

				aux = new NodoLista(p1.getInfo()); // se

				// p1 for menor, pega informacao de p1;

				p1 = p1.getProximo(); // ja peguei, vou para o proximo
			}
			else 
			{
				aux = new NodoLista(p2.getInfo()); // se

				// p2 for menor, pega informacao de p2;

				p2 = p2.getProximo(); // ja peguei, vou para o proximo.
			}
			if (pN == null) { // para ligar os

				// objetos se pN é null
				pN = aux;
				lN.inicio = aux;
			} 
			else 
			{
				pN.setProximo(aux); // pN recebe o aux
				// (proximo objeto).
				pN = aux;
			}
		}

		// Quando sair do while, continua a copiar os que faltam.

		// se falta em p1 ou em p2

		if (p1 == null) 
		{
			while (p2 != null) 
			{
				aux = new NodoLista(p2.getInfo());
				p2 = p2.getProximo();
				if (pN != null) 
				{
					pN.setProximo(aux); // pN recebe o aux (proximo objeto)

					// referencia para o proximo.

					pN = aux;
				} 
				else 
				{
					lN.inicio = aux;
					pN = aux;
				}
			}
		} 
		else 
		{
			while (p1 != null) 
			{
				aux = new NodoLista(p1.getInfo());
				p1 = p1.getProximo();
				if (pN != null) 
				{
					pN.setProximo(aux); // pN recebe o aux (proximo objeto)

					// referencia para o proximo.
					pN = aux;
				} 
				else 
				{
					lN.inicio = aux;
					pN = aux;
				}
			}
		}
		return lN;
	}
}
