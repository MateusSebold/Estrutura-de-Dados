package execicio6;



public class listaResultado {
	
	private NodoR inicio;
	private NodoR fim;
	
	
	
	public void inseririnicio(int dado) {
		NodoR novoNodo = new NodoR(dado);
		if (inicio == null) {
			inicio = novoNodo;
			inicio.setProx(inicio);
			fim = inicio;
		} else {
			novoNodo.setProx(inicio);
			inicio = novoNodo;
			fim.setProx(inicio);
		}
	}
	public String mostraLista() {
		String lista = "";
		if (inicio == null)
			return lista;
		NodoR aux = inicio;
		do {
			lista += aux.getProx();
		} while (aux != inicio);
		return lista;
	}
	public void deleteComValor(int dado) {
		if (inicio == null)
			return;
		if (inicio.getDado() == dado) {
			if (inicio == fim) {
				inicio = null;
				return;
			}
			inicio = inicio.getProx();
			fim.setProx(inicio);
			return;
		}
		NodoR aux = inicio;
		do {
			if (aux.getProx().getDado() == dado) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();

		} while (aux != inicio);
	}

		
	
}
