package desafioComida;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz",0.180);
		Comida c2 = new Comida("Feij�o", 0.300);
		
		Pessoa pessoa = new Pessoa("Jo�o", 99.8);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(c1);
		
		System.out.println(pessoa.apresentar());
		pessoa.comer(c2);
		System.out.println(pessoa.apresentar());
	}

}
