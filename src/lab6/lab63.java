package lab6;

public class lab63 {
	public static void main(String[] args) {
		int count = 10;
		double sum = 0;
		int arr[] = new int[10];
		for(int i = 0; i <  arr.length; i++) {
			arr[i] =  (int)(Math.random() * 20);
			sum += arr[i];
			System.out.print(arr[i] + "  ");
			
		}
		System.out.println("Среднее - " + (sum/count));}}