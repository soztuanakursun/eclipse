package deðiþkendeðiþtirme;

import java.util.Scanner;

public class main {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("deðiþtirilmeden önce");
		int a=scanner.nextInt();
		System.out.println("birinci sayý:" +a);
		int b=scanner.nextInt();
		System.out.println("ikinci sayý:" +b);
		System.out.println("deðiþtirildikten sonra");
		int gecici=a;
		a=b;
		b=gecici;
		System.out.println("birinci sayý:" +a);
		System.out.println("ikinci sayý:" +b);
	}
	
}
