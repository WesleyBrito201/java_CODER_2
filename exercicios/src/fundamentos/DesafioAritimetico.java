package fundamentos;

public class DesafioAritimetico {
	public static void main(String[] args) {
		
		//int eq1, eq2, eq3, eq4;
		int eq1= 6*(3+2);
		int eq2= ((1-5)*(2-7))/2;
		int res1 = (int) Math.pow(eq1, 2)/(3*2);
		int res2 = (int) Math.pow(eq2, 2);
		int res3 = (int) Math.pow((res1-res2), 3);
		int res4 = (int) Math.pow(10,3);
		int res5 = (int)(res3 / res4);
 
		
		//System.out.println(eq1);
		
		System.out.println(res5);
		
		
		
	}
}



/*int a = 3 * 4 - 10;
int b = (int) Math.pow(a, 3);
double c = Math.pow(a, 3);

System.out.println(b);
System.out.println(c);
*/