package Shape;

public class circle { 
	//daire 
	 
	protected  int r ;
	public circle(int r) {
		super();
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double Dairealan ()
	
	{
		return 3.14 * r *r;
	}

}
