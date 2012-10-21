package configuracion;

public class Configuracion {

	private final static int escenario_ancho = 800;
	private final static int escenario_alto = 600;
	private final static int laser_velocidad = 2;
	private final static int radio_destruccion_laser = 5;
	private final static int velocidad_elementos = 10;
	private final static int cantidad_bombas = 2;
	private final static int cantidad_baseslunares = 6;
	private final static int baseLunar_tamanio_alto = 5;
	private final static int baseLunar_tamanio_ancho = 5;
	private final static int baseLunarArmada_tamanio_alto = 10;
	private final static int baseLunarArmada_tamanio_ancho = 10;
	private final static int naveNodriza_tamanio_alto = 10;
	private final static int naveNodriza_tamanio_ancho = 50;
	private final static int misil_danio = 5;
	private final static int misil_velocidad = 6;
	private final static int misil_tamanio_alto = 5;
	private final static int misil_tamanio_ancho = 5;
	private final static int cohete_velocidad = 8;
	private final static int cohete_tamanio_alto = 5;
	private final static int cohete_tamanio_ancho = 5;
	private final static boolean modo_debug = false;
	
	
	public static boolean isModo_debug() {
		return modo_debug;
	}

	public static int getCohete_tamanio_alto() {
		return cohete_tamanio_alto;
	}

	public static int getCohete_tamanio_ancho() {
		return cohete_tamanio_ancho;
	}

	public static int getMisil_tamanio_alto() {
		return misil_tamanio_alto;
	}

	public static int getMisil_tamanio_ancho() {
		return misil_tamanio_ancho;
	}

	public static int getNaveNodriza_tamanio_alto() {
		return naveNodriza_tamanio_alto;
	}

	public static int getNaveNodriza_tamanio_ancho() {
		return naveNodriza_tamanio_ancho;
	}

	public static int getBaseLunarArmada_tamanio_alto() {
		return baseLunarArmada_tamanio_alto;
	}

	public static int getBaseLunarArmada_tamanio_ancho() {
		return baseLunarArmada_tamanio_ancho;
	}

	public static int getBaseLunar_tamanio_alto() {
		return baseLunar_tamanio_alto;
	}

	public static int getBaseLunar_tamanio_ancho() {
		return baseLunar_tamanio_ancho;
	}

	public static int getDanio_misil() {
		return misil_danio;
	}

	public static int getRadio_destruccion_laser() {
		return radio_destruccion_laser;
	}
	
	public static int getVelocidad_cohete() {
		return cohete_velocidad;
	}

	public static int getVelocidad_elementos() {
		return velocidad_elementos;
	}
	
	public static int getCantidad_baseslunares() {
		return cantidad_baseslunares;
	}

	public static int getCantidad_bombas() {
		return cantidad_bombas;
	}

	public static int getEscenario_ancho() {
		return escenario_ancho;
	}

	public static int getEscenario_alto() {
		return escenario_alto;
	}

	public Configuracion() {
		// TODO Auto-generated constructor stub
	}

	
	public static int getVelocidad_misil() {
		return misil_velocidad;
	}

	public static int getVelocidad_laser() {
		return laser_velocidad;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	}

}
