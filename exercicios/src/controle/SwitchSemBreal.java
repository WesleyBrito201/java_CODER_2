package controle;

public class SwitchSemBreal {

	public static void main(String[] args) {

		String faixa = "preta";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-dai...");
		case "marron":
			System.out.println("Sei o tekki shodan...");
		case "roxa":
			System.out.println("Sei o heian godan...");
		case "verde":
			System.out.println("Sei o heian yodan...");
		case "laranja":
			System.out.println("Sei o heian sodan...");
		case "vermelha":
			System.out.println("Sei o heian nidan...");
		case "amarela":
			System.out.println("Sei o heian shodan...");
		default:
			System.out.println("Não sei nada!");

		}
		System.out.println("Fim!");

		int idade = 7;

		switch (idade) {
		case 7:
			System.out.println("Fui a escola depois praia!");
			break;
		case 6:
			System.out.println("Fui a escola!");
			break;
		case 5:
			System.out.println("Fui no parque!");
			break;
		case 4:
			System.out.println("Fui a falei e brinquei!");
			break;
		case 3:
			System.out.println("Eu andei!");
			break;
		case 2:
			System.out.println("Fui ao maternal!");
			break;
		case 1:
			System.out.println("Fui a creche!");
			break;
		case 0:
			System.out.println("Fui mamar!");
			break;
		}
	}
}
