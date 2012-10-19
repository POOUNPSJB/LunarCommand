package elementos;

public class Laser extends Arma {
	private Posicion posicionDestino;
	private int radioExplosion;
	
	public Posicion getPosicionDestino() {
		return posicionDestino;
	}

	public void setPosicionDestino(Posicion posicionDestino) {
		this.posicionDestino = posicionDestino;
	}

	public int getRadioExplosion() {
		return radioExplosion;
	}

	public void setRadioExplosion(int radioExplosion) {
		this.radioExplosion = radioExplosion;
	}

	public Laser() {
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
