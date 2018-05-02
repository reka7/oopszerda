package tartalyos;

public class Tartaly extends Tarolo {

	private double nyomas;
	
	
	public Tartaly(int terfogat, double nyomas) {
		super(terfogat);
		this.nyomas = nyomas;
	}


	@Override
	public boolean veszelyesE() {
		if (getTerfogat() * nyomas > 100) {
			return true;
		} else { return false;

		}
	}


	@Override
	public String toString() {
		return "Tartaly [nyomas=" + nyomas + ", veszelyesE()=" + veszelyesE() + ", getTerfogat()=" + getTerfogat()
				+ "]";
	}

	private boolean nagyobbNyomas(double masikNyomas){
		if (nyomas > masikNyomas) {
			return true;
		} else {
			return false;
		}
	}
	
	private Tartaly nagyobbTerfogat(Tartaly egyikTartaly, Tartaly masikTartaly){
		if (egyikTartaly.getTerfogat() > masikTartaly.getTerfogat()) {
			return egyikTartaly;
		} else {
			return masikTartaly;
		}
	}
}
