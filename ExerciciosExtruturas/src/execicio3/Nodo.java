package execicio3;

public class Nodo {
	private int dado;
	private Nodo prox;
	private Nodo ant;
	
	public Nodo(int dado) {
		this.dado = dado;
		prox=null;
		ant=null;
	}

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}

	public Nodo getAnt() {
		return ant;
	}

	public void setAnt(Nodo ant) {
		this.ant = ant;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}
}
