
public class UsaLista
{
    public static void main(String[] args) 
    {
	     System.out.println("----------------------");
	     ListaEncadeada lE1 = new ListaEncadeada();
	     lE1.insereOrdem(44);
	     lE1.insereOrdem(55);
	     System.out.println("Lista encadeada = ");
	     lE1.imprimeLista();
	     ListaEncadeada lE3 = new ListaEncadeada();
	     lE3.insereLista(10);
	     lE3.insereLista(44);
	     lE3.insereLista(55);
	     lE3.insereLista(10);
	     System.out.println("lE3  --------------");
	     lE3.imprimeLista();
	     lE3.bolha();
	     System.out.println("lE3 ordenada");
	     lE3.imprimeLista();
	     
	     ListaEncadeada lE4 = lE1.copiaLista3();
	     System.out.println("lE4");
	     lE4.imprimeLista();
	     System.out.println("n = " + lE3.contaValoresDiferentes());
	    	     	    	                                 
	     System.out.println("------------------");
	     System.out.println("Max = " + Runtime.getRuntime().freeMemory());
	 }

	
	
}
