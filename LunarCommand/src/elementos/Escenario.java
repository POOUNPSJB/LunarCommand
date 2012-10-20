package elementos;

import java.util.ArrayList;

import configuracion.Configuracion;

public class Escenario {
	private ArrayList <Elemento> elementos;
	private Configuracion configuracion = new Configuracion();
	
	public Escenario() {
		// TODO Auto-generated constructor stub
		this.elementos = new ArrayList <Elemento>();
	}
	private Tamanio tamanio;

	public void configurar() {
		
	}
	
	/*
	 * Devuelve la posicion en el eje X que debe tener la Base Lunar
	 * @param nroBase int Nœmero de Base
	 * @param totalBases int Cantidad Total de Bases Lunares sin inclu’r la base Armada
	 */
	private int getPosicionXBaseLunar(int nroBase, int totalBases) {
		int x;
		x = configuracion.getEscenario_ancho() / totalBases * (nroBase);
		return x;
	}

	/*
	 * Crea un objeto Base Lunar
	 * @param nroBase int Nœmero de Base
	 * @param totalBases int Cantidad Total de Bases Lunares sin inclu’r la base Armada
	 */
	private BaseLunar crearBaseLunar(int nroBase, int totalBases) {
		
		BaseLunar baselunar = new BaseLunar(getPosicionXBaseLunar(nroBase, totalBases), configuracion.getEscenario_alto());
		
		return baselunar;
	}
	
	/*
	 * Crea un objeto Nave Nodriza
	 */
	private NaveNodriza crearNaveNodriza() {
		NaveNodriza navenodriza = new NaveNodriza();
		navenodriza.setPosicion(new Posicion(configuracion.getEscenario_ancho()/2, 0));
		navenodriza.setVelocidad(configuracion.getVelocidad_elementos());
		navenodriza.setDireccion(0); //Por defecto mueve para la derecha
		navenodriza.setEscenario(this);
		return navenodriza;
	}
	
	/*
	 * Crea un objeto Base Lunar Armada
	 */
	private BaseLunarArmada crearBaseLunarArmada() {
		Posicion posicion = new Posicion();
		BaseLunarArmada baselunararmada;
		baselunararmada = new BaseLunarArmada();
		
		posicion.setX(configuracion.getEscenario_ancho()/2);
		posicion.setY(configuracion.getEscenario_alto());
		baselunararmada.setCantidadBombas(configuracion.getCantidad_bombas());
		baselunararmada.laser.setRadioExplosion(configuracion.getRadio_destruccion_laser());
		
		return baselunararmada;
	}
	
	private boolean posicionValida(Posicion posicion) {
		return !(posicion.getX() >= configuracion.getEscenario_ancho() || posicion.getY() > configuracion.getEscenario_alto() || posicion.getX() <= 0 || posicion.getY() < 0);
	}
	
	public void addElemento(Elemento elemento) {
		this.elementos.add(elemento);
	}
	public void iniciar() {
		
		//Creo los objetos
		System.out.println("Inicio del Juego");
		//Agrego Base Lunar Armada
		this.addElemento(crearBaseLunarArmada());

		//Agrego las otras Bases Lunares
		int i;
		for (i=1; i<=configuracion.getCantidad_baseslunares(); i++)
			this.addElemento(crearBaseLunar(i, configuracion.getCantidad_baseslunares()));
		
		//Agrego la Nave Nodriza
		this.addElemento(crearNaveNodriza());
		
		//Pongo a jugar a los elementos
		//while (true) {
		for (i = 1; i <= 5; i++) {
			for (Elemento e: elementos) 
				e.jugar();
			
			//Termino la ronda
			
			//Me fijo si alguno de los elementos movibles se fue de la pantalla
			for (Elemento e: elementos) {
				if (e instanceof Movible) {
					if (! posicionValida(e.getPosicion()))
						((Movible) e).chocarPared();
				}
			}
		}
		
	}
	
	public void finalizar() {
		
	}
	
	public void pausar() {
		
	}
	
	public void reanudar() {
		
	}
	
	
	public Tamanio getTamanio() {
		return tamanio;
	}

	public void setTamanio(Tamanio tamanio) {
		this.tamanio = tamanio;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Escenario e = new Escenario();
		
		e.iniciar();
	}

}
