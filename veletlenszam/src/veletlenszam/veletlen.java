package veletlenszam;

import java.util.Random;

public class veletlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tomb[] = new int [10];
		Random veletlenobjektum = new Random();
		
		System.out.println("A tomb elemei:");
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = veletlenobjektum.nextInt(50) + 1;
			
			System.out.println(tomb[i]);
			
		}
		
		
		System.out.println();
		System.out.println("A tomb elemei forditott sorrendben:");
		
		for (int i = tomb.length -1; i >= 0; i--) {
			System.out.println(tomb[i]);
			
		
		}
		
		
		System.out.println();
		System.out.println("A legnagyobb paros elem:");
		
		int maxindex = tomb[0];
		for (int i = 1; i < tomb.length; i++) {
			if (tomb[i] > tomb[maxindex]) {
				maxindex = i;
			}
				
			
		}
		System.out.println("legnagyobb ertek");
		System.out.println(tomb[maxindex]);
		
		
		
	}

}
