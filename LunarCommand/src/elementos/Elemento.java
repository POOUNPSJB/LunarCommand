package elementos;

import java.awt.Rectangle;

import configuracion.Configuracion;

/**
 * @author matiasiglesias
 *
 */
public abstract class Elemento {
	private Posicion posicion;
	private Tamanio tamanio;
	private boolean vivo;
	private static int contador = 0;
	private int id;
	
	public Elemento() {
		// TODO Auto-generated constructor stub
		this.vivo = true;
		this.setId(++contador);
	}

	public void jugar() {
		if (Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogDebug) System.out.printf("Juega el objeto " + this + " (%d,%d)\n", this.getPosicion().getX(), this.getPosicion().getY());
	}
	
	public void morir() {
		if (Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogDebug) System.out.println("Muere el objeto " + this);
		this.vivo = false;
	}
	
	
	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public boolean vivo() {
		return this.vivo;
	}
	
	public Posicion getPosicion() {
		return this.posicion;
	}

	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}

	public Tamanio getTamanio() {
		return tamanio;
	}

	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}


	public void chocar(Elemento otro) {

	}
	
	public String toString() {
		return "Elemento Clase:" + this.getClass().toString() + " ID: " + this.getId(); //+ " Posicion: " + this.getPosicion().getX() + ", " + this.getPosicion().getY();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
