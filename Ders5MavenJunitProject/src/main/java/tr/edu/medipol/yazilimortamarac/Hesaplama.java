package tr.edu.medipol.yazilimortamarac;

public class Hesaplama {

	public static int toplama(int sayi1 , int sayi2) {
		return sayi1 + sayi2;
	}
	
	public static int toplama(int [] sayilar) {
		int toplam=0;
		for(int i = 0; i<sayilar.length ; i++) {
			toplam += sayilar[i];
		}
		
		return toplam;
	}
	
}
