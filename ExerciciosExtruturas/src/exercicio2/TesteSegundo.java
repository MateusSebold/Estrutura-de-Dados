package exercicio2;

public class TesteSegundo {

	public static void main(String[] args) {
		Segundo s1 = new Segundo(222100877, 7.75,250);
		s1.inseririnicio(724155542, 3.45,100);
		s1.inseririnicio(453278911, 32.50, 125);
		s1.inseririnicio(137849756, 500.00, 20);
		
		System.out.println(s1.mostraLista());
		}
}
