package lab7;

public class Test {

	public static void main(String[] args) {
 
		 Employee em = new Employee("G�rkem Enes ","�NC�","45678912310");
		 System.out.println("���i ADI : "+em.getAdi()+ "    ���i Soyad� : "+em.getSoyadi()+"     T.C. : "+em.getTcNo());
		 HourlyEmployee he =  new HourlyEmployee(null, null, null, 18 , 12);
		 System.out.println("Saatlik �cret : "+he.getWage()+ " TL " +"     Saatlik Kazanc� : "+he.getHour()+ " "+"    AYLIK KAZAN� : "+he.earnings()+" TL");
		 
		 
				 
		 

	}

}
