package exercicio7;



public class Lista2 {

	private Nodo2 inicio;
	private String parametro2;
	public Lista2(int dado) {
		inicio = new Nodo2(dado);
	}

	public Nodo2 getInicio() {
		return inicio;
	}

	public void inseririnicio(int dado) {
		Nodo2 novoNodo = new Nodo2(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}

	public String mostraLista() {
		String lista = "";
		Nodo2 aux = inicio;
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
		
		Nodo2 aux = inicio;
		while (aux.getProx()!=null) {
			if(aux.getProx().getDado()==valor) {
			aux.setProx(aux.getProx().getProx());
			return;
		}
			aux=aux.getProx();
		}
		
		}
	
		public void deletarUltimo() {
			Nodo2 aux = inicio;
			Nodo2 anterior = null;
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

		public String getParametro2() {
			return parametro2;
		}

		public void setParametro2(String parametro2) {
			parametro2 = mostraLista();
			this.parametro2 = parametro2;
		}			
}
