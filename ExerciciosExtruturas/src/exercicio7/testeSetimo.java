package exercicio7;

public class testeSetimo {

	public static void main(String[] args) {
		Lista1 l1 = new Lista1(5);
		Lista2 l2 = new Lista2(5);
		Resultado rs = new Resultado();
		l1.inseririnicio(3);
		l2.inseririnicio(3);
		l1.inseririnicio(8);
		l2.inseririnicio(8);
		l1.inseririnicio(4);
		l2.inseririnicio(9);
		l1.inseririnicio(1);
		l2.inseririnicio(1);
		l1.inseririnicio(6);
		l2.inseririnicio(6);
		
		System.out.println("Lista 1= "+l1.mostraLista());
		System.out.println("Lista 2= "+l2.mostraLista());
		System.out.println("Confirmação= "+rs.getValor());
		
	}

}
