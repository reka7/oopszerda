package sajat;

public class Teglatest extends Hasab {

	private int a;
	private int b;
	
	
	
	public Teglatest(int magassag, int a, int b) {
		super(magassag);
		this.a = a;
		this.b = b;
	}



	@Override
	public int getAlapterulet() {
		// TODO Auto-generated method stub
		return a * b;
	}



	@Override
	public String toString() {
		return "Teglatest [a=" + a + ", b=" + b + ", getMagassag()=" + getMagassag() + "]";
	}

	
}
