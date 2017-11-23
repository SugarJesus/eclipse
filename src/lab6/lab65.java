package lab6;

import java.util.Random;

public class lab65 {
	public static void main(String[] args) {
		Random rnd = new Random();
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 5; j++) {
		        System.out.print(rnd.nextInt(10) + " ");
		    }
		    System.out.println();
		}
	}}