package elementos;

public class Laser extends Arma {
	private Posicion posicionDestino;
	private int radioExplosion;
	private Escenario escenario; 
	
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

	public Laser(Escenario escenario) {
		// TODO Auto-generated constructor stub
		super();
		this.escenario = escenario;
	}

	@Override
	public void chocar(Elemento otro) {
		// TODO Auto-generated method stub
		super.chocar(otro);
		
		if (otro instanceof Ovni) {
			escenario.sumarPuntaje(((Ovni) otro).getPuntos());
			this.morir();
		}
		
		if (otro instanceof Misil) {
			this.morir();
		}
		
		if (otro instanceof Cohete) {
			this.morir();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
