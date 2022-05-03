package tabelasHash;



public class ListaEncadeada {
	private Nodo inicio;

	public ListaEncadeada(String chave,String valor) {
		inicio = new Nodo(chave,valor);
	}

	public Nodo getInicio() {
		return inicio;
	}

	public void inserirFinal(String chave,String valor) {
		Nodo novoNodo = new Nodo(chave,valor);
		Nodo aux = inicio;
		while(aux.getProx()!=null) {
			aux=aux.getProx();
		
		}
		
	}

	public String mostraLista() {
		String lista = "";
		Nodo aux = inicio;
		while (aux!=null) {
			lista += aux.getValor();
			aux=aux.getProx();
		}
		return lista;
	}

	public void deleteComChave(String chave) {
		if(inicio == null) return;
		if(inicio.getChave()==chave) {
			inicio=inicio.getProx();
			return;
		}
		
		Nodo aux = inicio;
		while (aux.getProx()!=null) {
			if(aux.getProx().getValor()==chave) {
			aux.setProx(aux.getProx().getProx());
			return;
		}
			aux=aux.getProx();
		}
		
		}
	
		
		
		
		
	
}
	

