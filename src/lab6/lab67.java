package lab6;

public class lab67 {
		 public static String compare(String s4, String s5){
		 String s1="F";
		 String s2="F";
		 String s3="K";	 
			 String s6="";
		 if (s4.equals(s5)){
		 s6="Строки 1 и 2 \""+s1+"\" и \""+s2+"\" ";
		 } else {
		 s6="Строки 1 и 3 \""+s1+"\" и \""+s3+"\" ";
		 }
		 return s6;
		 }
		 public static String add(String s1, String s2){
		 System.out.print("\nРезультат сложения строк \""+s1+"\" и"+"\""+s2+"\": ");
		 s1+=" "+s2;
		 return s1;
		 }
		 public static void main(String[] args) {
		 System.out.println(compare("АБВГ","АБВ"));
		 System.out.print(compare("АБВ","АБВ"));
		 
		 }
		 }