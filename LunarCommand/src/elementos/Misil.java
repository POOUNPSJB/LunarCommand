package elementos;

import java.util.ArrayList;

public class Misil extends Arma {
	private int danio;
	public ArrayList <Cohete> cohetes;
	
	public Misil() {
		// TODO Auto-generated constructor stub
		super();
		cohetes = new ArrayList <Cohete>();
	}

	
	public int getDanio() {
		return danio;
	}


	public void setDanio(int danio) {
		this.danio = danio;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
