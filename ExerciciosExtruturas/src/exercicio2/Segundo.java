package exercicio2;



public class Segundo {
	private Nodo inicio;
	private Nodo fim;
	
	public Segundo(int codigo,double preço,int quantidade) {
		inicio = new Nodo(codigo,preço,quantidade);
		inicio.setProx(inicio);
		fim = inicio;
	}
	public void inseririnicio(int codigo,double preço,int quantidade) {
		Nodo novoNodo = new Nodo(codigo,preço,quantidade);
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
		Nodo aux = inicio;
		do {
			lista += aux.getProx();
		} while (aux != inicio);
		return lista;
	}
	public void deleteComValor(int codigo,double preço,int quantidade) {
		if (inicio == null)
			return;
		if (inicio.getCodigo() == codigo) {
			if (inicio == fim) {
				inicio = null;
				return;
			}
			inicio = inicio.getProx();
			fim.setProx(inicio);
			return;
		}
		Nodo aux = inicio;
		do {
			if (aux.getProx().getCodigo() == codigo) {
				aux.setProx(aux.getProx().getProx());
				return;
			}
			aux = aux.getProx();

		} while (aux != inicio);
	}
	
	}
