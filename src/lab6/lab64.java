package lab6;

public class lab64 {
	public static void main(String[] args) {

		short[] array = new short[10];

		System.out.print("\n�������� ������: ");

		for (short i = 0; i < 10; i++) {

		array[i] = (short) Math.round(30 * Math.random());

		System.out.print(array[i] + ", ");}
	
		int sumChet = 0;

		int sumNeChet = 0;

		for (int i = 0; i < array.length; i++) {

		if (array[i] % 2 == 0) {

		sumChet = sumChet + array[i];

		} else {

		sumNeChet = array[i] + sumNeChet;

		}

		}
		System.out.println("\n����� ������" + sumChet);

		System.out.println("\n����� �� ������" + sumNeChet);

		}}