package githubdeneme;

import java.util.Scanner;

public class labsoru4 {

	private static final char D = 0;

	public static void main(String[] args) {
	 
		 
		 //A�a��dakilerden hangisi k�resel �s�nman�n sonu�lar�ndan biri de�ildir?
		/* A) Ortalama deniz seviyesinin y�kselmesi
		B) Tatl� su kaynaklar�n�n azalmas�
	C) Buzullar�n artmas�
	*D) �klim de�i�iklikleri */
          
	/*K�resel Is�nma: Atmosfere sal�nan CO2 gibi sera etkisi yaratan gazlar�n, yer y�zeyi ve denizlerin ortalama s�cakl���n� art�rmas�d�r.

Buna g�re; a�a��dakilerden hangisi k�resel �s�nmaya kar�� al�nabilecek �nlemler aras�nda de�ildir?

*A) Ambalajlar� fazla olan �r�nleri kullanmaktan ka��nmak
B) Ev ve i� yerinde enerji yal�t�m� sa�lamak
C) Yenilenemez enerji kaynaklar�n� kullanmay� tercih etmek
D) Otomobillerin hava ve yak�t filtrelerinin her zaman temiz olmas�na dikkat etmek
*/
		
		
		/*D�nya'ya G�ne�'ten gelen ���nlar, karbondioksit, metan ve su buhar� gibi atmosferde bulunan gazlar taraf�ndan tutulur. B�ylece D�nya'n�n s�cakl��� artar.

G�ne� enerjisinin bu gazlar taraf�ndan tutulmas� olay�na ne ad verilir?

A) G�ne� Tutulmas�
B) Sera Etkisi
*C) Buzullar�n Erimesi
D) Ozon Tabakas�n�n Delinmesi
*/  
		
		/*K�resel iklim de�i�iminin g�zlenen ve �ng�r�len etkilerinden biri de a��r� ya���lar sonucu olu�an sel ve ta�k�nlard�r.
Bu durum sonucunda a�a��dakilerden hangisinin ya�anmas� beklenmez?
A) Can ve mal kay�plar�n�n 
B) Ula��mda aksamalar�n 
C) Toprak erozyonunun 
*D) Orman yang�nlar�n�n
 */
  /* A�a��dakilerden hangisi sera gazlar�na �rnek de�ildir? 
   * a- su buhar�
    b-oksijen
    c-karbondioksit
    d-metan
   */  
		 Scanner input = new Scanner(System.in);
		 String sonuc1;
		String  sonuc2,sonuc3,sonuc4,sonuc5;
		 String[] sonuclar =  new  String [5]; 
		  int sayac=0;
		 
		  System.out.println("Test Ba�l�yor..\n\n\n");  
		  
		System.out.println("A�a��dakilerden hangisi k�resel �s�nman�n sonu�lar�ndan biri de�ildir?\r\n"
				+ "A) Ortalama deniz seviyesinin y�kselmesi\r\n"
				+ "B) Tatl� su kaynaklar�n�n azalmas�\r\n"
				+ "C) Buzullar�n artmas�\r\n"
				+ "*D) �klim de�i�iklikleri ");  
		  System.out.println("cevab�n�z� giriniz : A , B, C, D = "); 
		  sonuc1=input.next();
		  if(sonuc1.equals("D" )) 
		  {
			  System.out.println("CEVABINIZ DO�RU TEBR�KLER");
			  sayac++;
		  }
		  else {
			  System.out.println("Cevab�n�z Yanl�� Do�ru Cevap = D = ");
		  }
		  System.out.println("K�resel Is�nma: Atmosfere sal�nan CO2 gibi sera etkisi yaratan gazlar�n, "
		  		+ "yer y�zeyi ve denizlerin ortalama s�cakl���n� art�rmas�d�r.\r\n"
		  		+ "\r\n"
		  		+ "Buna g�re; a�a��dakilerden hangisi k�resel �s�nmaya kar�� al�nabilecek �nlemler aras�nda de�ildir?\r\n"
		  		+ "\r\n"
		  		+ "*A) Ambalajlar� fazla olan �r�nleri kullanmaktan ka��nmak\r\n"
		  		+ "B) Ev ve i� yerinde enerji yal�t�m� sa�lamak\r\n"
		  		+ "C) Yenilenemez enerji kaynaklar�n� kullanmay� tercih etmek\r\n"
		  		+ "D) Otomobillerin hava ve yak�t filtrelerinin her zaman temiz olmas�na dikkat etmek");  
			  System.out.println("cevab�n�z� giriniz : A , B, C, D = "); 
			  sonuc2=input.next();
			  if(sonuc2.equals("A" )) 
			  {
				  System.out.println("CEVABINIZ DO�RU TEBR�KLER");
				  sayac++;
			  }
			  else {
				  System.out.println("Cevab�n�z Yanl�� Do�ru Cevap = A ");
			  }
			  System.out.println("D�nya'ya G�ne�'ten gelen ���nlar, karbondioksit, metan ve su buhar� gibi +"
			  		+ "atmosferde bulunan gazlar taraf�ndan tutulur. B�ylece D�nya'n�n s�cakl��� artar.\r\n"
			  		+ "\r\n"
			  		+ "G�ne� enerjisinin bu gazlar taraf�ndan tutulmas� olay�na ne ad verilir?\r\n"
			  		+ "\r\n"
			  		+ "A) G�ne� Tutulmas�\r\n"
			  		+ "B) Sera Etkisi\r\n"
			  		+ "*C) Buzullar�n Erimesi\r\n"
			  		+ "D) Ozon Tabakas�n�n Delinmesi ");  
				  System.out.println("cevab�n�z� giriniz : A , B, C, D = "); 
				  sonuc3=input.next();
				  if(sonuc3.equals("C" )) 
				  {
					  System.out.println("CEVABINIZ DO�RU TEBR�KLER");
					  sayac++;
				  }
				  else {
					  System.out.println("Cevab�n�z Yanl�� Do�ru Cevap = C ");
				  }
				  System.out.println("K�resel iklim de�i�iminin g�zlenen ve �ng�r�len etkilerinden biri de a��r� ya���lar +"
				  		+ "sonucu olu�an sel ve ta�k�nlard�r.\r\n"
				  		+ "Bu durum sonucunda a�a��dakilerden hangisinin ya�anmas� beklenmez?\r\n"
				  		+ "A) Can ve mal kay�plar�n�n \r\n"
				  		+ "B) Ula��mda aksamalar�n \r\n"
				  		+ "C) Toprak erozyonunun \r\n"
				  		+ "*D) Orman yang�nlar�n�n ");  
					  System.out.println("cevab�n�z� giriniz : A , B, C, D "); 
					  sonuc4=input.next();
					  if(sonuc4.equals("D" )) 
					  {
						  System.out.println("CEVABINIZ DO�RU TEBR�KLER");
						  sayac++;
					  }
					  else {
						  System.out.println("Cevab�n�z Yanl�� Do�ru Cevap = D ");
					  }
	  System.out.println("A�a��dakilerden hangisi sera gazlar�na �rnek de�ildir? \r\n"
					  		+ "   * a- su buhar�\r\n"
					  		+ "    b-oksijen\r\n"
					  		+ "    c-karbondioksit\r\n"
					  		+ "    d-metan");  
						  System.out.println("cevab�n�z� giriniz : A , B, C, D "); 
						  sonuc5=input.next();
						  if(sonuc5.equals("A" )) 
						  {
							  System.out.println("CEVABINIZ DO�RU TEBR�KLER");
							  sayac++;
						  }
						  else {
							  System.out.println("Cevab�n�z Yanl�� Do�ru Cevap = A ");
						  }
		    
						   
		            if(sayac==5) {
		            	System.out.println("M�KEMMEL");
		            } 
		            else if(sayac==4)
		            {
		            	System.out.println("�OK �Y�");
		            }
		            else if (sayac<=3)
		            {
		            	System.out.println("K�resel �s�nma hakk�nda bilgilerinizi tazeleme zaman� :)");
		            }
		
		 
 
 	} 

}
