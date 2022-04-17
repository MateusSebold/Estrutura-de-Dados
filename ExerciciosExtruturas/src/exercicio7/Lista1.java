package exercicio7;



public class Lista1 {

	private Nodo1 inicio;
	private String parametro1;

	public Lista1(int dado) {
		inicio = new Nodo1(dado);
	}
	public Nodo1 getInicio() {
		return inicio;
	}

	public void inseririnicio(int dado) {
		Nodo1 novoNodo = new Nodo1(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}

	public String mostraLista() {
		String lista = "";
		Nodo1 aux = inicio;
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
		
		Nodo1 aux = inicio;
		while (aux.getProx()!=null) {
			if(aux.getProx().getDado()==valor) {
			aux.setProx(aux.getProx().getProx());
			return;
		}
			aux=aux.getProx();
		}
		
		}
		public void deletarUltimo() {
			Nodo1 aux = inicio;
			Nodo1 anterior = null;
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
		public String getParametro1() {
			return parametro1;
		}
		public void setParametro1(String parametro1) {
			parametro1 = mostraLista();
			this.parametro1 = parametro1;
		}	
		
}
