package controle;

import java.util.Scanner;

public class IfElsIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota inv�lida!");
		} else if (nota >= 8.1) {
			System.out.println("Conveito A!");
			System.out.println("Parab�ns");
		} else if (nota >= 6.1) {
			System.out.println("Conveito B!");
		} else if (nota >= 4.1) {
			System.out.println("Conveito C!");
		} else if (nota >= 2.1) {
			System.out.println("Conveito D!");
		}else {
			System.out.println("Conveito E!");
			
		}
		System.out.println("Fim!");
		entrada.close();
	}
}
