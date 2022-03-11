package listaslineares;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaEncadeada L1 = new ListaEncadeada(5);
		L1.inseririnicio(8);
		L1.inseririnicio(1);
		L1.inseririnicio(10);
		L1.deleteComValor(8);
		L1.inseririnicio(13);
		System.out.println(L1.mostraLista());
		
		
	}

}
