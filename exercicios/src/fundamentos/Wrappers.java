package fundamentos;

//import java.util.Scanner;
//Integer.parseInt(entrada.next());
//converte um valor inteiro em uma string
//Scanner entrada = new Scanner(System.in);
//entrada.close();

public class Wrappers {
	public static void main(String[] args) {

		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 1000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l);

	}
}
