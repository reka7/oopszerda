package polinom;

import java.util.Scanner;

import matematika.Polinom;

public class Teszt {

	public static void fvTablazat(Polinom polinom) {
		System.out.println("x\ty");
		for (double i = 0; i <= 1; i += 0.1) {
			System.out.println(i + "\t");
			System.out.println(polinom.szamol(i));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinearisPolinom egyenesEgyenlete = new LinearisPolinom(2, 3);
		
		System.out.println(egyenesEgyenlete);
		
		int polinomokSzama = 5;
		LinearisPolinom[] polinomok = new LinearisPolinom[polinomokSzama];
		
		double a, b;
		Scanner beolvasas = new Scanner(System.in);
		for (int i = 0; i < polinomok.length; i++) {
			System.out.println("Kerem a");
			a = beolvasas.nextDouble();
			beolvasas.nextLine();
			System.out.println("Kerem b");
			b = beolvasas.nextDouble();
			beolvasas.hasNextLine();
			
			polinomok[i] = new LinearisPolinom(a, b);
		}
			for (int i = 0; i < polinomok.length; i++)
			
				System.out.println(polinomok[i]);
			beolvasas.close();
			
			fvTablazat(polinomok[polinomok.length - 1]);
		
	}

}
