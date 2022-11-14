package Shape;

public class Test {

	public static void main(String[] args) {
		
		circle c = new circle(7);
		System.out.println("Dairenin Alaný : "+c.Dairealan()); 
		cube cu = new cube(2);
		System.out.println("Küpün Yüzeyi Alaný : "+cu.KüpAlan()); 
		System.out.println("Küpün Hacmi : "+cu.KüpHacim());
		sphere sp = new sphere(3);
		System.out.println("Kürenin Yüzeyi Alaný : "+sp.KüreAlan());
		System.out.println("Kürenin Hacmi : "+sp.KüreHacim());
		square sq = new square(6);
		System.out.println("Karenin Alaný : "+sq.KareAlan());
	
		
		
		

	}

}
