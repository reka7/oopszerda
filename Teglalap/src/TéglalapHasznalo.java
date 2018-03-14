
public class TéglalapHasznalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Téglalap a_objektum = new Téglalap(2);
		Téglalap b_objektum = new Téglalap(3, 4);
		Téglalap c_objektum;
		c_objektum = a_objektum;
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldalak(5);
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		a_objektum.setOldalak(3, 4);
		
		System.out.println(a_objektum);
		System.out.println(b_objektum);
		System.out.println(c_objektum);
		
		System.out.println(a_objektum == b_objektum);
		System.out.println(a_objektum == c_objektum);
		System.out.println(a_objektum.egyezikE(b_objektum));

		
		
	}

}
