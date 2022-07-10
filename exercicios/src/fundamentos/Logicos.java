package fundamentos;


public class Logicos {
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3>7;
		
		System.out.println( condicao1 && condicao2);
		System.out.println( condicao1 || condicao2);
		System.out.println( condicao1 ^ condicao2);
		System.out.println(!! condicao1 );
		System.out.println( !condicao1 );
		
		//Tabela Verdade "E"
		
		System.out.println("TABELA VERDADE E (END)");
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);

		//Tabela Verdade "OU EXCLUSIVO"
		
		System.out.println("TABELA VERDADE OU(XOR)EXCLUSIVO ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//Tabela Verdade "OR"
		
		System.out.println("TABELA VERDADE OU  (OR)");
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		
		
		
	}

}
