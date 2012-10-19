package elementos;

public class BaseLunar extends Elemento {
	private int escudo;
	
	public BaseLunar() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public BaseLunar(int x, int y) {
		this();
		setPosicion(new Posicion(x, y));
	}

	public int getEscudo() {
		return escudo;
	}

	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
