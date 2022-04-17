
public class Nodo {

	private int dado;
	private Nodo prox;
	
	public Nodo(int dado) {
		this.dado = dado;
		
	}
	public Nodo(Nodo prox) {
		this.prox = prox;
		
	}


	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	
	
	
}
