package elementos;

import java.awt.Rectangle;

/**
 * @author matiasiglesias
 *
 */
public abstract class Elemento {
	private Posicion posicion;
	private Tamanio tamanio;
	
	public Elemento() {
		// TODO Auto-generated constructor stub
	}

	public void jugar() {
		System.out.println(this);
	}
	
	public void morir() {
		
	}
	
	public boolean vivo() {
		return true;
	}
	
	public Posicion getPosicion() {
		return posicion;
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

	/*
	 * Devuelve true si el elemento this choca con el Elemento otro y false si no lo hace
	 */
	public boolean chocar(Elemento otro) {
		Rectangle esteRectangulo = new Rectangle(this.getPosicion().getX(), this.getPosicion().getY(), this.getTamanio().getAncho(), this.getTamanio().getAlto());
		Rectangle otroRectangulo = new Rectangle(otro.getPosicion().getX(), otro.getPosicion().getY(), otro.getTamanio().getAncho(), otro.getTamanio().getAlto());
		
		return esteRectangulo.intersects(otroRectangulo);
	}
	
	public String toString() {
		return "Elemento Clase:" + this.getClass().toString(); //+ " Posicion: " + this.getPosicion().getX() + ", " + this.getPosicion().getY();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
