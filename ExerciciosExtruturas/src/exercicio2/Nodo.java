package exercicio2;

public class Nodo {

	private int codigo;
	private double preço;
	private int quantidade;
	
	private Nodo prox;
	
	public Nodo(int codigo,double preço,int quantidade ) {
		this.codigo=codigo;
		this.preço=preço;
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
	public double getPreço() {
		return preço;
	}
	public void setPreço(int preço) {
		this.preço = preço;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
