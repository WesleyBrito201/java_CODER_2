package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	
	//tipo metodo (paramentros) usar o return//
	
	double precoComDesconto() {
		return preco * (1-desconto);
	}
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1-desconto + descontoDoGerente);
	
	}
}
