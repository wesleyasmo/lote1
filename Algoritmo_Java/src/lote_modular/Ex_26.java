package lote_modular;

import java.util.Scanner;

public class Ex_26 {
	public static String b="";
	public static void presentation(){
		System.out.println(b);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = { s.nextInt(), s.nextInt() };
		if (a[0] > a[1]) {
			if (a[0] % a[1] == 0) {
				//System.out.println(a[0] + " é multiplo de " + a[1]);
				b+=a[0] + " é multiplo de " + a[1]+"\n";
			}
		}
		else {
			if (a[1] % a[0] == 0) {
				//System.out.println(a[1] + " é multiplo de " + a[0]);
				b+=a[1] + " é multiplo de " + a[0];
			}
		}
		presentation();
	}
}
