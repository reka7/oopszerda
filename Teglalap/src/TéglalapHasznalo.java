
public class T�glalapHasznalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		T�glalap a_objektum = new T�glalap(2);
		T�glalap b_objektum = new T�glalap(3, 4);
		T�glalap c_objektum;
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
