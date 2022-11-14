package Shape;

public class sphere { 
	//küre 
	//yüzey alanı hesapla  
	 
	  protected int r; 
	  
	  
	  public sphere(int r) {
		super();
		this.r = r;
	}


	public int getR() {
		return r;
	}


	public void setR(int r) {
		this.r = r;
	}


	public double KüreAlan ()
	  {
		  return 4 * 3.14 * r *r ;
	  } 
	public double KüreHacim()
	{
		return Math.PI*r*r*r*4/3;
	}

}
