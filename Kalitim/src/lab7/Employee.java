package lab7;

public class Employee { 
	 
	 protected String Adi;
	 protected String Soyadi;
	 protected String TcNo;
	 
	public Employee(String adi, String soyadi, String tcNo) {
		
		Adi = adi;
		Soyadi = soyadi;
		TcNo = tcNo;
	}
	 
	
	public String getAdi() {
		return Adi;
	}
	public void setAdi(String adi) {
		Adi = adi;
	}
	public String getSoyadi() {
		return Soyadi;
	}
	public void setSoyadi(String soyadi) {
		Soyadi = soyadi;
	}
	public String getTcNo() {
		return TcNo;
	}
	public void setTcNo(String tcNo) {
		TcNo = tcNo;
	}
	 
	 

}
