package execicio3;

public class testeTerceiro {

	public static void main(String[] args) {
		
		Terceiro t3 = new Terceiro();
		t3.inserirInicio(2);
		t3.inserirFinal(6);
		t3.inserirInicio(7);
		t3.inserirFinal(4);
		t3.inserirFinal(8);
		t3.inserirFinal(5);
		t3.inserirFinal(9);
		t3.inserirFinal(1);
		t3.inserirFinal(3);
		
		System.out.println("O Maior é "+t3.maior());
		System.out.println("O Menor é "+t3.menor());
		System.out.println("E a média dos valores é "+t3.media());

	}

}
