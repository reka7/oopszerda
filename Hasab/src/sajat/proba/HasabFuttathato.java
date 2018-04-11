package sajat.proba;

import sajat.*;

public class HasabFuttathato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Henger henger1 = new Henger(1, 2);
		Hasab henger2 = new Henger(3,4);
		
		System.out.println(henger1);
		System.out.println(henger1.getTerfogat());
		
		Teglatest teglatest = new Teglatest(5, 6, 7);
		System.out.println(teglatest);
		System.out.println(teglatest.getTerfogat());
		
		if (henger1.nagyobbTerfogat(teglatest)) {
			System.out.println("henger1 nagyobb terfogatu");
		} else {
			System.out.println("teglatest nagyobb terfogatu");
		}
	
		
		
		
		
	}

}
