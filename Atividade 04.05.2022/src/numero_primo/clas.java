package numero_primo;

public class clas {
	
		private int numero;
		private String frase;
		
		
		
		public clas(int numero,String frase) {
			if((numero%numero==0)&&(numero%1==0)&&(numero%2!=0)) {
				frase="� um numero primo";
			}
			else {
				frase = "N�o � um numero primo";
			}
				
			
				
			
			setNumero(numero);
			setFrase(frase);
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public String getFrase() {
			return frase;
		}

		public void setFrase(String frase) {
			this.frase = frase;
		}

		

		
}
