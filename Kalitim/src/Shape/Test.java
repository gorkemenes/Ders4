package Shape;

public class Test {

	public static void main(String[] args) {
		
		circle c = new circle(7);
		System.out.println("Dairenin Alan� : "+c.Dairealan()); 
		cube cu = new cube(2);
		System.out.println("K�p�n Y�zeyi Alan� : "+cu.K�pAlan()); 
		System.out.println("K�p�n Hacmi : "+cu.K�pHacim());
		sphere sp = new sphere(3);
		System.out.println("K�renin Y�zeyi Alan� : "+sp.K�reAlan());
		System.out.println("K�renin Hacmi : "+sp.K�reHacim());
		square sq = new square(6);
		System.out.println("Karenin Alan� : "+sq.KareAlan());
	
		
		
		

	}

}
