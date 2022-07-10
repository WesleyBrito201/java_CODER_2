package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		//Wrappers (embrulho)
		//comportamentos associados
		//são a versão objeto dos tipos primitivos!
		
		int a = 123;
		System.out.println(s);
		System.out.println(a);
		
		
	}

}
