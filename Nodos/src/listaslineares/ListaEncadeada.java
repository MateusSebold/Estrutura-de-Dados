package listaslineares;

public class ListaEncadeada {
	private Nodo inicio;
	
	public ListaEncadeada(int dado) {
		inicio = new Nodo(dado);
		
	}
	public Nodo getInicio() {
		return inicio;
	}
	
	public void contagemNodo(){
		int contagem = 0;
		Nodo aux = inicio;
		
	}
	
	public void inseririnicio(int dado) {
		Nodo novoNodo = new Nodo(dado);
		novoNodo.setProx(inicio);
		inicio = novoNodo;
	}
	
	public String mostraLista() {
		String lista ="";
		Nodo aux = inicio;
		while(aux!=null) {
			lista += aux.getDado()+"\n";
			aux=aux.getProx();
		}
		return lista;
	}
	public void deleteComValor(int valor) {
		if(inicio==null)return;
		if(inicio.getDado()==valor) {
			inicio=inicio.getProx();
		}
		Nodo aux = inicio;
		while(aux.getProx()!=null) {
			if(aux.getProx().getDado()==valor) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux=aux.getProx();
		}
	}
	
}
