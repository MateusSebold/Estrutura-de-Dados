

public class TestePrimeiro {

	public static void main(String[] args) {
		
		
		Primeiro p1 = new Primeiro(5);
		p1.inserirInicio(4);
		p1.inserirInicio(2);
		p1.inserirInicio(9);
		p1.inserirInicio(6);
		p1.deletarUltimo();
		p1.inserirInicio(7);
		p1.inserirInicio(1);
		p1.inserirInicio(3);
		p1.setParametro(6);
		p1.inserirInicio(8);
		System.out.println("lista � igual a " +p1.mostraLista()); //Resultado: 83176924
		System.out.println("Numero de nodos � "+p1.numeroNodos());// 8
		System.out.println("O Dado do nodo que � igual ao parametro � "+p1.igual());//6
		System.out.println("O Numero de nodos que tem valor maior que o parametro � "+p1.nodosMaiores());//3
		
		
		
		
		
		
		
		
		
	}

}
