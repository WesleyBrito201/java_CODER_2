package controle;

public class desafioFor {

	public static void main(String[] args) {
		
		String valor = "@";
		for (int i = 1; i <=6; i++) {
			System.out.println(valor);
			valor += "@";
		}
		//n�o utilizar valores numericos para controlar o la�o (for)
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}

	}

}
