package termekeim;

import java.awt.Color;

import sajat.ISzinezheto;

public class Toll extends Aru implements ISzinezheto {

	private Color szin;
	private String markanev;
	
	
	
	
	@Override
	public String toString() {
		return "Toll [szin=" + szin + ", markanev=" + markanev + ", toString()=" + super.toString() + "]";
	}

	public Toll(String nev, int ar, Color szin, String markanev) {
		super(nev, ar);
		this.szin = szin;
		this.markanev = markanev;
	}

	@Override
	public Color getSzin() {
		// TODO Auto-generated method stub
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		// TODO Auto-generated method stub
		this.szin = szin;
	}

}
