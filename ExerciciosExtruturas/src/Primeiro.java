

public class Primeiro {
	
	private Nodo inicio;
	private int parametro = 0;
	
	public int getParametro() {
		return parametro;
	}

	public void setParametro(int parametro) {
		this.parametro = parametro;
	}
	
	

	public Primeiro (int dado) {
		inicio = new Nodo(dado);
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public void inserirInicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public String mostraLista() {
		String lista = "";
		Nodo aux = inicio;
		while (aux!=null) {
			lista += aux.getDado();
			aux=aux.getProx();
		}
		return lista;
	}
	
	public void deletarUltimo() {
		Nodo aux = inicio;
		Nodo anterior = null;
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
	public void deleteComValor(int valor) {
		if(inicio == null) return;
		if(inicio.getDado()==valor) {
			inicio=inicio.getProx();
			return;
		}}
	
	public int numeroNodos() {
		Nodo aux = inicio;
		int k = 0;
		
		while(aux!=null) {
			k=k+1;
			aux=aux.getProx();
			
		}
		return k;
	}
	
	public int igual() {
		Nodo aux = inicio;
		int local =0;
		
		while(aux!=null) {
			if(aux.getDado()==getParametro()) {
				local = (aux.getDado());
			}
			aux= aux.getProx();
			
		}
		return local;
		
	}
	
	public int nodosMaiores() {
		Nodo aux = inicio;
		int q = 0;
		while(aux!=null) {
			if(aux.getDado()>getParametro()) q=q+1;
			aux=aux.getProx();
		}
		return q;
	}
	
}
