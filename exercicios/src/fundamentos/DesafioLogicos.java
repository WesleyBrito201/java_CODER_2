package fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTv50 = trabalho1 && trabalho2;
		boolean comprouTv32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador unario
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\" ?  " + comprouTv50);
		System.out.println("Comprou TV 32\" ?  " + comprouTv32);
		System.out.println("Comprou TV 32\" e sorvete ?  " + comprouSorvete);
		System.out.println("Mais Saudável? " + maisSaudavel);
	}

}
