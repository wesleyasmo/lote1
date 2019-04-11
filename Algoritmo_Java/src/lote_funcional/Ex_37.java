package lote_funcional;

import java.util.Scanner;

public class Ex_37 {
	public static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int num[]= new int[n];
		num[0]=1;
		for(int i=0;i<n;i++){			
			try{
				num[i]=sum(num[i-1],num[i-2]);
			}catch(Exception e){
				num[i]=1;
			}
		}
		for(int k:num){
			System.out.print(k+" ");
		}
	}
}
