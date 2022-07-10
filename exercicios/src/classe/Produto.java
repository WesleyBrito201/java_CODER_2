package classe;

public class Produto {

	String nome;
	double preco;
	double desconto;
	
	//tipo metodo (paramentros) usar o return//
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
		double precoComDesconto(double descontoDoGerente) {
			return preco * (1-desconto + descontoDoGerente);
	
	}
}
