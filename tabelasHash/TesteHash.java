package tabelasHash;

public class TesteHash {

	public static void main(String[] args) {
		TabelaHash tabelaHash=new TabelaHash(10);
		
		tabelaHash.inserir("012.345.678-99", "João da Silva");
		tabelaHash.inserir("999.999.999-99", "Maria");
		tabelaHash.inserir("123.678.456.00", "Jotaro");
		
		System.out.println(tabelaHash.recuperar("012.345.678-99"));
		System.out.println(tabelaHash.recuperar("999.999.999-99"));
		System.out.println(tabelaHash.recuperar("123.678.456.00"));
	}

}
