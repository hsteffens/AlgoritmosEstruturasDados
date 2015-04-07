public class  NodoLista 
{
     private int info;
     private NodoLista proximo;

     public NodoLista(int info)
     {
        this.info = info;
        proximo = null;
     }
 

     public NodoLista getProximo()
     {
        return proximo;
     }
     

     public void setProximo(NodoLista proximo)
     {
        this.proximo = proximo;
     }
    
     public int getInfo()
     {
        return info;
     }    
}

