package de�i�kende�i�tirme;

import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("de�i�tirilmeden �nce");
		int a=scanner.nextInt();
		System.out.println("birinci say�:" +a);
		int b=scanner.nextInt();
		System.out.println("ikinci say�:" +b);
		System.out.println("de�i�tirildikten sonra");
		int gecici=a;
		a=b;
		b=gecici;
		System.out.println("birinci say�:" +a);
		System.out.println("ikinci say�:" +b);
	}
	
}
