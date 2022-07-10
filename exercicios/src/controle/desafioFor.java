package controle;

public class desafioFor {

	public static void main(String[] args) {
		
		String valor = "@";
		for (int i = 1; i <=6; i++) {
			System.out.println(valor);
			valor += "@";
		}
		//não utilizar valores numericos para controlar o laço (for)
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}

	}

}
