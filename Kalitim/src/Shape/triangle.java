package Shape;

public class triangle {
	//��gen 
   protected double e;
   protected double h;

	public triangle(double e, double h) {
	super();
	this.e = e;
	this.h = h;
}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double ��genAlan()
	{
		return e * h;
	}

}
