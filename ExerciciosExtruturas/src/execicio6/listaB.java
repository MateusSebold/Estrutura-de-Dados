package execicio6;

public class listaB {
	
	private NodoB inicio;

	public listaB(int dado) {
		inicio = new NodoB(dado);
	}

	public NodoB getInicio() {
		return inicio;
	}

	public void inseririnicio(int dado) {
		NodoB novoNodo = new NodoB(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}

	public String mostraLista() {
		String lista = "";
		NodoB aux = inicio;
		while (aux!=null) {
			lista += aux.getDado();
			aux=aux.getProx();
		}
		return lista;
	}

	public void deleteComValor(int valor) {
		if(inicio == null) return;
		if(inicio.getDado()==valor) {
			inicio=inicio.getProx();
			return;
		}
		
		NodoB aux = inicio;
		while (aux.getProx()!=null) {
			if(aux.getProx().getDado()==valor) {
			aux.setProx(aux.getProx().getProx());
			return;
		}
			aux=aux.getProx();
		}
		
		}
	//deletar ultimo
		public void deletarUltimo() {
			NodoB aux = inicio;
			NodoB anterior = null;
			if (inicio == null) return;
			if(inicio.getProx() == null) {
				inicio = null;
				return;
			}
			while (aux.getProx()!=null) {
				anterior = aux;
				aux=aux.getProx();
			}
			anterior.setProx(null);
		}
	
}
