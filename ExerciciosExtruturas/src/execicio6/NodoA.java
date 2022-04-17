package execicio6;



public class NodoA {
	
	int dado;
	NodoA prox;

	public NodoA(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public NodoA getProx() {
		return prox;
	}

	public void setProx(NodoA prox) {
		this.prox = prox;
	}

	
}
