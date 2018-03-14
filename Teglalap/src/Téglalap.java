
public class Téglalap {
	private int a_oldal;
	private int b_oldal;
	
	public Téglalap(int a_oldal, int b_oldal) {
		 setOldalak( a_oldal, b_oldal);
	} 
	public Téglalap(int oldalhossz) {
		//a_oldal = oldalhossz;
		//b_oldal = oldalhossz;
		this (oldalhossz, oldalhossz);
	}
	
	public int terulet() {
		return a_oldal * b_oldal;
		
	}

	@Override
	public String toString() {
		return a_oldal + ", "  + b_oldal + ": " + terulet();
	}

	public void setOldalak(int a_oldal, int b_oldal) {
		this.a_oldal = a_oldal;
		this.b_oldal = b_oldal;
	}
	
	public void setOldalak(int oldalhossz) {
		setOldalak (oldalhossz, oldalhossz);
	}
	
	public boolean nagyobbTeruletuMint(Téglalap masikTéglalap) {
		return terulet() > masikTéglalap.terulet();
	}
	
	public boolean egyezikE(Téglalap masikTéglalap) {
		return a_oldal == masikTéglalap.a_oldal
				&& b_oldal == masikTéglalap.b_oldal;
		
	}
}


