package elementos;

import configuracion.Configuracion;

public class BaseLunar extends Elemento {
	private int escudo;
	private Escenario escenario;
	
	@Override
	public void chocar(Elemento otro) {
		// TODO Auto-generated method stub
		if (otro instanceof Misil) {
			System.out.println(this + " choc— con " + otro);
			decrementarEscudo(((Misil) otro).getDanio());
		}
	}
	
	public void decrementarEscudo(int danio) {
		this.setEscudo(this.getEscudo() - danio);
		if (this.getEscudo() <= 0) 
			this.morir();
	}

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
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Escudo: " + this.getEscudo();
	}
	
	

	@Override
	public void morir() {
		// TODO Auto-generated method stub
		super.morir();
		System.out.println("Destruyeron la Base Lunar " + this);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
