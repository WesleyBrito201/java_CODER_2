package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Quantas notas: ");

		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Inoforme a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
						
		}
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		double media = total/notas.length;
		System.out.println("A m�dia � : " + media + " !");
		

		entrada.close();

	}

}
