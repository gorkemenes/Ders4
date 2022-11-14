package Shape;

public class cube { 
	//küp 
	  
	 protected int k;
	 
	 public cube(int k) {
		super();
		this.k = k;
	}
	 
	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public double KüpAlan()
	 {
		 return 6 * k * k;
	 }
	public double KüpHacim()

	{
		return k * k * k;
	}
}
