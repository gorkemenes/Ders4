package githubdeneme;

import java.util.Scanner;

public class labsoru4 {

	private static final char D = 0;

	public static void main(String[] args) {
	 
		 
		 //Aþaðýdakilerden hangisi küresel ýsýnmanýn sonuçlarýndan biri deðildir?
		/* A) Ortalama deniz seviyesinin yükselmesi
		B) Tatlý su kaynaklarýnýn azalmasý
	C) Buzullarýn artmasý
	*D) Ýklim deðiþiklikleri */
          
	/*Küresel Isýnma: Atmosfere salýnan CO2 gibi sera etkisi yaratan gazlarýn, yer yüzeyi ve denizlerin ortalama sýcaklýðýný artýrmasýdýr.

Buna göre; aþaðýdakilerden hangisi küresel ýsýnmaya karþý alýnabilecek önlemler arasýnda deðildir?

*A) Ambalajlarý fazla olan ürünleri kullanmaktan kaçýnmak
B) Ev ve iþ yerinde enerji yalýtýmý saðlamak
C) Yenilenemez enerji kaynaklarýný kullanmayý tercih etmek
D) Otomobillerin hava ve yakýt filtrelerinin her zaman temiz olmasýna dikkat etmek
*/
		
		
		/*Dünya'ya Güneþ'ten gelen ýþýnlar, karbondioksit, metan ve su buharý gibi atmosferde bulunan gazlar tarafýndan tutulur. Böylece Dünya'nýn sýcaklýðý artar.

Güneþ enerjisinin bu gazlar tarafýndan tutulmasý olayýna ne ad verilir?

A) Güneþ Tutulmasý
B) Sera Etkisi
*C) Buzullarýn Erimesi
D) Ozon Tabakasýnýn Delinmesi
*/  
		
		/*Küresel iklim deðiþiminin gözlenen ve öngörülen etkilerinden biri de aþýrý yaðýþlar sonucu oluþan sel ve taþkýnlardýr.
Bu durum sonucunda aþaðýdakilerden hangisinin yaþanmasý beklenmez?
A) Can ve mal kayýplarýnýn 
B) Ulaþýmda aksamalarýn 
C) Toprak erozyonunun 
*D) Orman yangýnlarýnýn
 */
  /* Aþaðýdakilerden hangisi sera gazlarýna örnek deðildir? 
   * a- su buharý
    b-oksijen
    c-karbondioksit
    d-metan
   */  
		 Scanner input = new Scanner(System.in);
		 String sonuc1;
		String  sonuc2,sonuc3,sonuc4,sonuc5;
		 String[] sonuclar =  new  String [5]; 
		  int sayac=0;
		 
		  System.out.println("Test Baþlýyor..\n\n\n");  
		  
		System.out.println("Aþaðýdakilerden hangisi küresel ýsýnmanýn sonuçlarýndan biri deðildir?\r\n"
				+ "A) Ortalama deniz seviyesinin yükselmesi\r\n"
				+ "B) Tatlý su kaynaklarýnýn azalmasý\r\n"
				+ "C) Buzullarýn artmasý\r\n"
				+ "*D) Ýklim deðiþiklikleri ");  
		  System.out.println("cevabýnýzý giriniz : A , B, C, D = "); 
		  sonuc1=input.next();
		  if(sonuc1.equals("D" )) 
		  {
			  System.out.println("CEVABINIZ DOÐRU TEBRÝKLER");
			  sayac++;
		  }
		  else {
			  System.out.println("Cevabýnýz Yanlýþ Doðru Cevap = D = ");
		  }
		  System.out.println("Küresel Isýnma: Atmosfere salýnan CO2 gibi sera etkisi yaratan gazlarýn, "
		  		+ "yer yüzeyi ve denizlerin ortalama sýcaklýðýný artýrmasýdýr.\r\n"
		  		+ "\r\n"
		  		+ "Buna göre; aþaðýdakilerden hangisi küresel ýsýnmaya karþý alýnabilecek önlemler arasýnda deðildir?\r\n"
		  		+ "\r\n"
		  		+ "*A) Ambalajlarý fazla olan ürünleri kullanmaktan kaçýnmak\r\n"
		  		+ "B) Ev ve iþ yerinde enerji yalýtýmý saðlamak\r\n"
		  		+ "C) Yenilenemez enerji kaynaklarýný kullanmayý tercih etmek\r\n"
		  		+ "D) Otomobillerin hava ve yakýt filtrelerinin her zaman temiz olmasýna dikkat etmek");  
			  System.out.println("cevabýnýzý giriniz : A , B, C, D = "); 
			  sonuc2=input.next();
			  if(sonuc2.equals("A" )) 
			  {
				  System.out.println("CEVABINIZ DOÐRU TEBRÝKLER");
				  sayac++;
			  }
			  else {
				  System.out.println("Cevabýnýz Yanlýþ Doðru Cevap = A ");
			  }
			  System.out.println("Dünya'ya Güneþ'ten gelen ýþýnlar, karbondioksit, metan ve su buharý gibi +"
			  		+ "atmosferde bulunan gazlar tarafýndan tutulur. Böylece Dünya'nýn sýcaklýðý artar.\r\n"
			  		+ "\r\n"
			  		+ "Güneþ enerjisinin bu gazlar tarafýndan tutulmasý olayýna ne ad verilir?\r\n"
			  		+ "\r\n"
			  		+ "A) Güneþ Tutulmasý\r\n"
			  		+ "B) Sera Etkisi\r\n"
			  		+ "*C) Buzullarýn Erimesi\r\n"
			  		+ "D) Ozon Tabakasýnýn Delinmesi ");  
				  System.out.println("cevabýnýzý giriniz : A , B, C, D = "); 
				  sonuc3=input.next();
				  if(sonuc3.equals("C" )) 
				  {
					  System.out.println("CEVABINIZ DOÐRU TEBRÝKLER");
					  sayac++;
				  }
				  else {
					  System.out.println("Cevabýnýz Yanlýþ Doðru Cevap = C ");
				  }
				  System.out.println("Küresel iklim deðiþiminin gözlenen ve öngörülen etkilerinden biri de aþýrý yaðýþlar +"
				  		+ "sonucu oluþan sel ve taþkýnlardýr.\r\n"
				  		+ "Bu durum sonucunda aþaðýdakilerden hangisinin yaþanmasý beklenmez?\r\n"
				  		+ "A) Can ve mal kayýplarýnýn \r\n"
				  		+ "B) Ulaþýmda aksamalarýn \r\n"
				  		+ "C) Toprak erozyonunun \r\n"
				  		+ "*D) Orman yangýnlarýnýn ");  
					  System.out.println("cevabýnýzý giriniz : A , B, C, D "); 
					  sonuc4=input.next();
					  if(sonuc4.equals("D" )) 
					  {
						  System.out.println("CEVABINIZ DOÐRU TEBRÝKLER");
						  sayac++;
					  }
					  else {
						  System.out.println("Cevabýnýz Yanlýþ Doðru Cevap = D ");
					  }
	  System.out.println("Aþaðýdakilerden hangisi sera gazlarýna örnek deðildir? \r\n"
					  		+ "   * a- su buharý\r\n"
					  		+ "    b-oksijen\r\n"
					  		+ "    c-karbondioksit\r\n"
					  		+ "    d-metan");  
						  System.out.println("cevabýnýzý giriniz : A , B, C, D "); 
						  sonuc5=input.next();
						  if(sonuc5.equals("A" )) 
						  {
							  System.out.println("CEVABINIZ DOÐRU TEBRÝKLER");
							  sayac++;
						  }
						  else {
							  System.out.println("Cevabýnýz Yanlýþ Doðru Cevap = A ");
						  }
		    
						   
		            if(sayac==5) {
		            	System.out.println("MÜKEMMEL");
		            } 
		            else if(sayac==4)
		            {
		            	System.out.println("ÇOK ÝYÝ");
		            }
		            else if (sayac<=3)
		            {
		            	System.out.println("Küresel ýsýnma hakkýnda bilgilerinizi tazeleme zamaný :)");
		            }
		
		 
 
 	} 

}
