package youtube;

import java.util.Scanner;

public class hesapmakinası {
	static void menu() {
		System.out.println("[1] Toplama");
		System.out.println("[2] Çıkarma");
		System.out.println("[3] Çarpma");
		System.out.println("[4] Bölme");
	}
	
	
	static double Hesapla(double a, double b, int islem) {
		double s=0;
		switch(islem){
		case 1: s=a+b; break;
		case 2: s=a-b; break;
		case 3: s=a*b; break;
		case 4: s=(double) a/b;
		default: System.out.println("Geçersiz işlem."); break;
		}
		return s;
	}
	
	
	public static void main(String[] args) {
		Scanner bilgial = new Scanner (System.in);
		
		char cevap;
		do {
		menu();
		System.out.println("İkitane Sayı Giriniz");	
		double  a = bilgial.nextInt();
		double  b = bilgial.nextInt();
		System.out.print("Hangi İşlemi Yapmak İstiyorsunuz: ");
		int islem = bilgial.nextInt();
		
		double sonuc = Hesapla(a,b,islem);
		
		System.out.println("Sonuç: " + sonuc);
		
		
		System.out.println("Devam etmek istiyormusunuz? E/H");
		cevap = bilgial.next().charAt(0);
		}while(cevap == 'e' || cevap == 'E');
	}	
}
