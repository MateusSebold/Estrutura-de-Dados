package tabelasHash;

public class TabelaHash2 {
	private int tam_array;
	private Nodo[]array;
	
	public TabelaHash2(int tam_array) {
		this.tam_array= tam_array;
		array=new Nodo[tam_array];
	}
	
	private int hash(String chave) {
		byte bytesChaves[]= chave.getBytes();
		int hashCode =0;
		for (int i : bytesChaves) {
			hashCode+=i;
		}
		return hashCode % tam_array;
	}
	private int hash(String chave,int numeroColisoes) {
		byte bytesChaves[]= chave.getBytes();
		int hashCode =0;
		for (int i : bytesChaves) {
			hashCode+=i;
		}
		return hashCode % tam_array;
	}
	public void inserir(String chave,String valor) {
		int indiceArray=hash(chave);
		
		if (array[indiceArray]==null) {
			array[indiceArray]= new Nodo(chave,valor);
			return;
		}
		if(array[indiceArray].getChave()==chave) {
			array[indiceArray].setValor(valor);
			return;
		}
	
		//colisão
		int numeroColisoes =1;
		int novoIndice=0;
		while(array[indiceArray].getChave()!=chave) {
			novoIndice = hash(chave,numeroColisoes);
			if (array[novoIndice]==null) {
				array[novoIndice]= new Nodo(chave,valor);
				return;
			}
			if(array[novoIndice].getChave()==chave) {
				array[novoIndice].setValor(valor);
				return;
			}
			numeroColisoes+=1;
			indiceArray=novoIndice;
		}
	}
	
	public String recuperar(String chave) {
		int indiceArray = hash(chave);
		if(array[indiceArray]==null) {
			System.out.println("Chave não esta na tabela ");
			return "";
		}
		if (array[indiceArray].getChave()==chave) {
			return array[indiceArray].getValor();
		}
		int numeroColisoes=1;
		while(array[indiceArray].getChave()!=chave) {
			int novoIndice = hash(chave,numeroColisoes);
			if(array[novoIndice]==null) {
				System.out.println("Chave não esta na tabela ");
				return "";
			}
			if (array[novoIndice].getChave()==chave) {
				return array[indiceArray].getValor();
			}
		}
		return"";
	}
}

