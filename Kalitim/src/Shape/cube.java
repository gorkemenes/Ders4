package Shape;

public class cube { 
	//k�p 
	  
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

	public double K�pAlan()
	 {
		 return 6 * k * k;
	 }
	public double K�pHacim()

	{
		return k * k * k;
	}
}
