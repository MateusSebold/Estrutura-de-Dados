package execicio6;



public class listaA {
	
	private NodoA inicio;

	public listaA(int dado) {
		inicio = new NodoA(dado);
	}

	public NodoA getInicio() {
		return inicio;
	}

	public void inseririnicio(int dado) {
		NodoA novoNodo = new NodoA(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}

	public String mostraLista() {
		String lista = "";
		NodoA aux = inicio;
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
		
		NodoA aux = inicio;
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
			NodoA aux = inicio;
			NodoA anterior = null;
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
		
		//5
		
	
}
	

