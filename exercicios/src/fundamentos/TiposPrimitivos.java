package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Inserir dados de um funcionario
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos =542;
		int id = 56789;
		long pontosAcumulados = 3_143_845_223L;// "L" literal long acima do inteiro
		
		//Tipos numéricos reais
		float salario = 11_445.44F;//"F" lieral em float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		// Tipos caractere
		char status = 'A'; //ativo
		
		//Calcular dias de empresa
		System.out.println(anosDeEmpresa*365);
		
		//Calcular o numero de viagens 
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real 
		
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha ->" + salario);
		System.out.println("Férias? :" + estaDeFerias);
		System.out.println("Status: " + status);
	
	}
}
