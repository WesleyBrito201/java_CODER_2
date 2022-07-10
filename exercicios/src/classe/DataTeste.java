package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();

		var d2 = new Data(12, 12, 2012);

		var d3 = new Data(21, 10, 2022);

		System.out.println(d1.obetrDataformada());
		System.out.println(d2.obetrDataformada());
		System.out.println(d3.obetrDataformada());

	}

}
