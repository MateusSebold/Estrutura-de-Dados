package exercicio2;

public class Nodo {

	private int codigo;
	private double pre�o;
	private int quantidade;
	
	private Nodo prox;
	
	public Nodo(int codigo,double pre�o,int quantidade ) {
		this.codigo=codigo;
		this.pre�o=pre�o;
		this.quantidade=quantidade;
		
	}
	public Nodo(Nodo prox) {
		this.prox = prox;
		
	}

	

	public Nodo getProx() {
		return prox;
	}

	public void setProx(Nodo prox) {
		this.prox = prox;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(int pre�o) {
		this.pre�o = pre�o;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
