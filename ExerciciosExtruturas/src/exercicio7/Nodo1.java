package exercicio7;



public class Nodo1 {
	
	int dado;
	Nodo1 prox;

	public Nodo1(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public Nodo1 getProx() {
		return prox;
	}

	public void setProx(Nodo1 prox) {
		this.prox = prox;
	}

	
}
