
public class Alkalmazott {
	private String nev;
	private int kor;
	private long fizetes;
	
	private static int nyugdijkorhatar = 65;

	public Alkalmazott(String nev, int kor, long fizetes) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		this.nev = nev;
		this.kor = kor;
		this.fizetes = 10000 * kor;
	}
	
	public int hanyEvVanHatra() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott [nev=" + nev + ", kor=" + kor + ", fizetes=" + fizetes + ", hanyEvVanHatra()="
				+ hanyEvVanHatra() + "]";
	}

	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}

	public static Alkalmazott tobbEveVanHatra(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.hanyEvVanHatra() > masodikAlkalmazott.hanyEvVanHatra()) {
			return elsoAlkalmazott;
		} else {
			return masodikAlkalmazott;
		}
			
		
	}
	
	
}

