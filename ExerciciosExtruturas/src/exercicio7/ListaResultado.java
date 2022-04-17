package exercicio7;

public class ListaResultado {
	
	//7- Implemente uma função que receba como parâmetro duas listas duplamente 
	//	 encadeadas e  retorne um valor lógico que indique se as duas listas são idênticas. 

	private NodoR inicio;

	public ListaResultado(int dado) {
		inicio = new NodoR(dado);
	}

	public NodoR getInicio() {
		return inicio;
	}

	public void inseririnicio(int dado) {
		NodoR novoNodo = new NodoR(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}

	public String mostraLista() {
		String lista = "";
		NodoR aux = inicio;
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
		
		NodoR aux = inicio;
		while (aux.getProx()!=null) {
			if(aux.getProx().getDado()==valor) {
			aux.setProx(aux.getProx().getProx());
			return;
		}
			aux=aux.getProx();
		}
		
		}
	
		public void deletarUltimo() {
			NodoR aux = inicio;
			NodoR anterior = null;
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
