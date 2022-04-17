package execicio3;

public class Terceiro {
	private Nodo inicio =null;
	private Nodo fim=null;
	
	public void inserirInicio(int dado) {
		Nodo novoInicio = new Nodo(dado);
		if(inicio !=null) {
			inicio.setAnt(novoInicio);
			novoInicio.setProx(inicio);
		}
		inicio= novoInicio;
		if(fim==null) {
			fim = novoInicio;
		}
	}
	
	public void inserirFinal(int dado) {
		Nodo novoFim = new Nodo(dado);
		if(fim !=null) {
			fim.setProx(novoFim);
			novoFim.setAnt(fim);
		}
		fim=novoFim;
		if(inicio==null) {
			inicio=novoFim;
		}
		
	}
	public void removeInicio() {
		Nodo nodoRemovido = inicio;
		if(inicio==null)return;
		inicio=inicio.getProx();
		
		if(inicio != null) {
			inicio.setAnt(null);
		}
		if(nodoRemovido==fim) {
			removeFinal();
		}
	}
	
	public void removeFinal() {
		Nodo nodoRemovido=fim;
		if(fim==null)return;
		fim=fim.getAnt();
		if(fim !=null) {
			fim.setProx(null);
		}
		if(nodoRemovido==inicio) {
			removeInicio();
		}
	}
	
	
	public void removeComValor(int dado) {
		Nodo nodoRemovido = null;
		Nodo aux = inicio;
		while(aux !=null){
			if(aux.getDado()==dado) {
				nodoRemovido =aux;
				break;
			}
			aux=aux.getProx();	
		}
		if(nodoRemovido == inicio)removeInicio();
		else if(nodoRemovido == fim)removeFinal();
		else {
			nodoRemovido.getAnt().setProx(nodoRemovido.getProx());
			nodoRemovido.getProx().setAnt(nodoRemovido.getAnt());
		}
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
	
	public int maior() { 
		Nodo aux = inicio;
		int maior = 0;
		while(aux!=null) {
			if(maior==0) maior = aux.getDado();
			
			else if(aux.getDado()>maior) maior = aux.getDado();
			aux =aux.getProx();
		}
		return maior;
	}
	
	public int menor() {
		Nodo aux = fim;
		int menor = 10000;
		while(aux!=null) {
			if(menor==10000) menor = aux.getDado();
			
			else if(aux.getDado()<menor) menor = aux.getDado();
			aux=aux.getAnt();
		}
		return menor;
	}
	
	public double media() {
		Nodo aux = inicio;
		int soma =0;
		int contador=0;
		
		while(aux!=null) {
			contador=contador+1;
			soma=soma+aux.getDado();
			aux=aux.getProx();
		}
		return soma/contador;
	}
}
