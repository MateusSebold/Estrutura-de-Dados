package exercicio7;

public class Nodo2 {

	int dado;
	Nodo2 prox;

	public Nodo2(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public Nodo2 getProx() {
		return prox;
	}

	public void setProx(Nodo2 prox) {
		this.prox = prox;
	}

	
}
