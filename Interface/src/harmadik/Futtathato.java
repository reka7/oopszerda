package harmadik;

import java.awt.Color;

import masik.SzinesPont;
import sajat.ISzinezheto;
import termekeim.Toll;

public class Futtathato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ISzinezheto szinespont = new SzinesPont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		Atszinezo(szinespont);
		System.out.println(szinespont);
		
		ISzinezheto toll = new Toll("toll", 2000, Color.BLUE, "Parker");
		System.out.println(toll);
		
		toll.setSzin(Color.CYAN);
		System.out.println(toll);
		
		Atszinezo(toll);
		System.out.println(toll);
		
	}

	public static void Atszinezo(ISzinezheto objektum) {
		objektum.setSzin(objektum.alapertelmezett);
		
		
	}
	
	
	
}
