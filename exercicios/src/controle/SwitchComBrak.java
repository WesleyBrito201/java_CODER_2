package controle;

import java.util.Scanner;

public class SwitchComBrak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String conceito = "";
		System.out.println(" Informe a nota: ");
		int nota = entrada.nextInt();

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;
		case 8:
		case 7:
			conceito = "B";
			break;
		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
		case 3:
			conceito = "D";
			break;
		case 2:
		case 1:
			conceito = "F";
			break;
		default:
			conceito = ("|..Nota n�o reconhecida-Sem conceito!..|");

		}
		System.out.println("Ceoneito �:  " + conceito);
		entrada.close();
	}

}
