package elementos;

import configuracion.Configuracion;

public class BaseLunar extends Elemento {
	private int escudo;
	private Escenario escenario;
	
	public BaseLunar(Escenario escenario) {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public BaseLunar(Escenario escenario, int x, int y) {
		this(escenario);
		setPosicion(new Posicion(x, y));
	}

	public int getEscudo() {
		return escudo;
	}

	public void setEscudo(int escudo) {
		this.escudo = escudo;
	}
	
	public void romperEscudo(int danio) {
		this.setEscudo(this.getEscudo() - danio);
		System.out.println(this + " Escudo: " + this.getEscudo());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
