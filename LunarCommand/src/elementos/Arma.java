package elementos;

public class Arma extends Movible {
	private Posicion posicionInicial;
	private int disparador;
	
	public Arma() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	

	public Posicion getPosicionInicial() {
		return posicionInicial;
	}



	public void setPosicionInicial(Posicion posicionInicial) {
		this.posicionInicial = posicionInicial;
	}



	public int getDisparador() {
		return disparador;
	}



	public void setDisparador(int disparador) {
		this.disparador = disparador;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
