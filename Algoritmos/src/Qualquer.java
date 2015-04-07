
public class Qualquer implements Comparable <Qualquer>{
	
	private String nome;
	
	public Qualquer(String nome) 
	{
		this.nome= nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int compareTo(Qualquer q)
	{
		return this.nome.compareTo(q.nome);
	}

}
