package configuracion;

public class Configuracion {

	private final int escenario_ancho = 800;
	private final int escenario_alto = 600;
	private final int velocidad_misil = 3;
	private final int velocidad_cohete = 3;
	private final int velocidad_laser = 2;
	private final int danio_misil = 5;
	private final int radio_destruccion_laser = 5;
	private final int velocidad_elementos = 10;
	private final int cantidad_bombas = 2;
	private final int cantidad_baseslunares = 6;

	
	public int getDanio_misil() {
		return danio_misil;
	}

	public int getRadio_destruccion_laser() {
		return radio_destruccion_laser;
	}
	
	public int getVelocidad_cohete() {
		return velocidad_cohete;
	}

	public int getVelocidad_elementos() {
		return velocidad_elementos;
	}
	
	public int getCantidad_baseslunares() {
		return cantidad_baseslunares;
	}

	public int getCantidad_bombas() {
		return cantidad_bombas;
	}

	public int getEscenario_ancho() {
		return escenario_ancho;
	}

	public int getEscenario_alto() {
		return escenario_alto;
	}

	public Configuracion() {
		// TODO Auto-generated constructor stub
	}

	
	public int getVelocidad_misil() {
		return velocidad_misil;
	}

	public int getVelocidad_laser() {
		return velocidad_laser;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
