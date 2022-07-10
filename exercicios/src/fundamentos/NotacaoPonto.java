package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {

		double a = 2.3;
		String s = "Bom dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase(); // coloca o texto em maiusculo
		s = s.concat("!!!");

		System.out.println(s);
		String x = "Leo".toUpperCase();
		System.out.println(x);
		System.out.println(a);

		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");

		System.out.println(y);
		
		//Tipo primitivos  não tem operador "."
		int g = 3;
		System.out.println(g);

	}

}
