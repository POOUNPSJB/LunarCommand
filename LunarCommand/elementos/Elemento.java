package elementos;

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

	public void chocar(Elemento otro) {
		
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
