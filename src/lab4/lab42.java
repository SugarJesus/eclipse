package lab4;

import javax.swing.JOptionPane;

public class lab42 {
public static void main(String[] args) {
int n1;
double a, s=0,m=0;
String n;
n = JOptionPane.showInputDialog("¬веди n");
n1= Integer.parseInt(n);
for (int i=1; i<=n1; i++){
m=i;
a=(Math.pow(-1,m+1))*(1/m);
s+=a;
}
System.out.println(s);
}
}
