package polinom;

import matematika.Polinom;

public class LinearisPolinom implements Polinom {

	private double a;
	private double b;
	
	public LinearisPolinom(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	
	@Override
	public String toString() {
		//Pl: y=2x-3
		return "y=" + a + "x" + (b < 0 ? "" : "+") +  b ;
	}


	@Override
	public double szamol(double x) {
		// TODO Auto-generated method stub
		//Képlete: y=ax+b
		return a * x +b;
	}

	@Override
	public int polinomFoka() {
		// TODO Auto-generated method stub
		if (a == 0) {
			return 0;
		}else {
			return 1;
		}
	}

	
	
}
