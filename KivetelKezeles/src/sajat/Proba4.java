package sajat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Proba4 {

	public static void main(String[] args) {
		
		int meret = 5;
		int[] egeszTomb = new int[meret];
		
		InputStreamReader bemenetiAdatfolyam = new InputStreamReader(System.in);
		BufferedReader beolvasas = new BufferedReader(bemenetiAdatfolyam);
		
		for (int i = 0; i < egeszTomb.length; i++) {
			try {
				boolean rosszAdat = true;
				
				do {
					System.out.println("Kerem adja meg" + (i + 1) + ". egesz szamot!");
					System.out.println("Szam:");
					
					
					try {
						String sztring = beolvasas.readLine();
						egeszTomb[i] = Integer.parseInt(sztring);
						rosszAdat = false;
					} catch (NumberFormatException e) {
						System.out.println("Nem egesz szamot kaptunk. Kerem adja meg �jb�l");
					}
					
				} while (rosszAdat);
				
			} catch (IOException kivetelObjektum) {
				kivetelObjektum.printStackTrace();
			}//try
			
			
		}//for
		System.out.println("A tomb elemei:");
		for (int i : egeszTomb) {
			System.err.println(i);
		}
		
	}//main

}
