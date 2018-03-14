
public class T�glalap {
	private int a_oldal;
	private int b_oldal;
	
	public T�glalap(int a_oldal, int b_oldal) {
		 setOldalak( a_oldal, b_oldal);
	} 
	public T�glalap(int oldalhossz) {
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
	
	public boolean nagyobbTeruletuMint(T�glalap masikT�glalap) {
		return terulet() > masikT�glalap.terulet();
	}
	
	public boolean egyezikE(T�glalap masikT�glalap) {
		return a_oldal == masikT�glalap.a_oldal
				&& b_oldal == masikT�glalap.b_oldal;
		
	}
}


