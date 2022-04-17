package execicio6;

public class NodoR {

	int dado;
	NodoR prox;

	public NodoR(int dado) {
		this.dado = dado;
		this.prox = null;
	}

	public int getDado() {
		return dado;
	}

	public NodoR getProx() {
		return prox;
	}

	public void setProx(NodoR prox) {
		this.prox = prox;
	}
	
}
