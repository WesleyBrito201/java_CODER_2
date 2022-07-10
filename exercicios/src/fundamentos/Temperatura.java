package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC;
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit = 150;
		double celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("ºF " + fahrenheit + " equevale a " + celsius + " ºC");

		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;

		System.out.println("ºF " + fahrenheit + " equevale a " + celsius + " ºC");

	}

}
