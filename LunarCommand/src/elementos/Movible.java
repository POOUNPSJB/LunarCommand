package elementos;

import configuracion.Configuracion;

public abstract class Movible extends Elemento {
	private int velocidad;
	private int direccion;
	
	public Movible() {
		// TODO Auto-generated constructor stub
		super();
		this.setVelocidad(Configuracion.getVelocidad_elementos()); //Velocidad por defecto
		this.setDireccion(0);
	}

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		super.jugar();
		this.avanzar();
		//System.out.println(this);
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public void girar() {
		
	}
	
	public void avanzar() {
		Posicion posicion = new Posicion(this.getPosicion().getX(), this.getPosicion().getY());
		
		//posicion.setX(posicion.getX() + Trigonometria.coseno(this.getDireccion(), this.getVelocidad()));
		//posicion.setY(posicion.getY() + Trigonometria.seno(this.getDireccion(), this.getVelocidad()));
		posicion.setX(posicion.getX() + Trigonometria.coseno(this.getDireccion()) * this.getVelocidad());
		posicion.setY(posicion.getY() + Trigonometria.seno(this.getDireccion()) * this.getVelocidad());

		this.setPosicion(posicion);
		
	}
		
	public String toString() {
		return "Elemento Clase:" + this.getClass().toString() + " ID: " + this.getId() + " Posicion: " + this.getPosicion().getX() + ", " + this.getPosicion().getY() + " - Direccion: " + this.getDireccion();
	}

	
	public void chocarPared() {
		System.out.println("Elemento " + this.getClass() + " chocarPared");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
