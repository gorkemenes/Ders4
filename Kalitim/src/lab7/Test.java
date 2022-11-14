package lab7;

public class Test {

	public static void main(String[] args) {
 
		 Employee em = new Employee("Görkem Enes ","ÝNCÝ","45678912310");
		 System.out.println("Ýþçi ADI : "+em.getAdi()+ "    Ýþçi Soyadý : "+em.getSoyadi()+"     T.C. : "+em.getTcNo());
		 HourlyEmployee he =  new HourlyEmployee(null, null, null, 18 , 12);
		 System.out.println("Saatlik Ücret : "+he.getWage()+ " TL " +"     Saatlik Kazancý : "+he.getHour()+ " "+"    AYLIK KAZANÇ : "+he.earnings()+" TL");
		 
		 
				 
		 

	}

}
