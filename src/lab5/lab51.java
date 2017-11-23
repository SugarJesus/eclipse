package lab5;

import javax.swing.JOptionPane;

public class lab51 {
	public static void main(String[] args) {
		int n1;
		String res = null;
		String n = JOptionPane.showInputDialog("Введи n");
		n1 = Integer.parseInt(n);
			switch(n1){
		 case 0:
		 res="Ноль";
		 case 1:
		 res="Один";
		 break;
		 case 2:
		 res="Два";
		 break;
		 case 3:
		 res="Три";
		 break;
		 case 4:
		 res="Четыре";
		 break;
		 case 5:
		 res="Пять";
		 break;
		 case 6:
		 res="Шесть";
		 break;		 
		 case 7:
		 res="Семь";
		 break;		 
		 case 8:
		 res="Восемь";
		 break;		 
		 case 9:
		 res="Девять";
		 break;		 		 		 		 		 		 
		 }
			 System.out.println(res);
;
	}
		 }

		 
