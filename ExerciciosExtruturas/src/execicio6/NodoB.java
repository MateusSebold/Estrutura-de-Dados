package execicio6;



public class NodoB {
	int dado;
	NodoB prox;

	public NodoB(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public NodoB getProx() {
		return prox;
	}

	public void setProx(NodoB prox) {
		this.prox = prox;
	}

}
