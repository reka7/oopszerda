
import java.util.Scanner;

public class Kalkulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bemenet = new Scanner(System.in);
		
		
		System.out.println("kerem 1.");
		System.out.println("1.operandus:");
		double elso_operandus = bemenet.nextDouble();
		
		System.out.println("kerem 2.");
		System.out.println("2.:");
		double masodik_operandus = bemenet.nextDouble();
		
		System.out.println("kerem adja meg az operatort!");
		System.out.println("Operator:");
		String operator = bemenet.nextLine();
		operator = bemenet.nextLine();
		double eredmeny;
		
		switch (operator) {
		case "+":
			System.out.println("osszeadas");
			System.out.println(elso_operandus + masodik_operandus);
			break;

						
		case "-":
			System.out.println("kivonas");
			eredmeny = elso_operandus - masodik_operandus;
			break;
			
			
		case "*":
			System.out.println("szorzas");
			System.out.println(elso_operandus * masodik_operandus);
			break;
			
			
		case "/":
			System.out.println("osztas");
			System.out.println(elso_operandus / masodik_operandus);
			break;
			
		default:
			break;
				
			
			
		}
				
		
		
		
		String kifejezes = bemenet.nextLine();
		String[] eredmenytomb = kifejezes.split(" ");
		
		switch (eredmenytomb[1]) {
		case "+":
			System.out.println("osszeadas eredmenye");
			System.out.println(eredmenytomb[0] +eredmenytomb[2]);
			break;

						
		case "-":
			System.out.println("kivonas");
			eredmeny = Double.parseDouble(eredmenytomb[0]) - Double.parseDouble(eredmenytomb[2]);
			System.out.println("a kivonas eredmenye:");
			System.out.println(eredmeny);
			break;
			
			
		default:
			break;
	}
	
	
		
	}
}
