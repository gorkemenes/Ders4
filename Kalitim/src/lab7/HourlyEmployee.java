package lab7;

public  class HourlyEmployee extends Employee { 
	 
	 protected int Wage; // saatlik ücret
	 protected int Hour; // saat
	public HourlyEmployee(String adi, String soyadi, String tcNo, int wage, int hour) {
		super(adi, soyadi, tcNo);
		Wage = wage;
		Hour = hour;
	}
	
	
	public int getWage() {
		return Wage;
	}
	public void setWage(int wage) {
		Wage = wage;
	}
	public int getHour() {
		return Hour;
	}
	public void setHour(int hour) {
		Hour = hour;
	}
	public double earnings()
	 {
		 return Hour * Wage * 30; 
	 }
	 
	

}
