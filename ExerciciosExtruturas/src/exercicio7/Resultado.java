package exercicio7;

public class Resultado {
	 Lista1 a; 
	 Lista2 b;
	 private String frase;
	 private boolean valor;
	
	public boolean getValor() {
		return valor;
	}
	public void setValor(boolean valor) {
		if(a.getParametro1()!=b.getParametro2()) {
			valor = false;
		
		}
		else valor=true;
		this.valor = valor;
	}
}
