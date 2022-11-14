package Shape;

public class shape { 
	//şekil
	protected String adi;
	protected double deger;
	public shape(String adi, double deger) {
		super();
		this.adi = adi;
		this.deger = deger;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public double getDeger() {
		return deger;
	}
	public void setDeger(double deger) {
		this.deger = deger;
	}
}