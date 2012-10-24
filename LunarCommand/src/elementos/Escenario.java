package elementos;

import java.util.concurrent.CopyOnWriteArrayList;

import configuracion.Configuracion;

public class Escenario {
	private CopyOnWriteArrayList <Elemento> elementos;
	
	public Escenario() {
		// TODO Auto-generated constructor stub
		this.elementos = new CopyOnWriteArrayList <Elemento>();
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
		if (nroBase > totalBases / 2)
			nroBase++;
		x = Configuracion.getEscenario_ancho() / (totalBases + 1) * nroBase;
		return x;
	}

	/*
	 * Crea un objeto Base Lunar
	 * @param nroBase int Nœmero de Base
	 * @param totalBases int Cantidad Total de Bases Lunares sin inclu’r la base Armada
	 */
	private BaseLunar crearBaseLunar(int nroBase, int totalBases) {
		
		BaseLunar baselunar = new BaseLunar(this, getPosicionXBaseLunar(nroBase, totalBases), Configuracion.getEscenario_alto());
		baselunar.setTamanio(new Tamanio(Configuracion.getBaseLunar_tamanio_alto(), Configuracion.getBaseLunar_tamanio_ancho()));
		baselunar.setEscudo(100); //Escudo 100%
		return baselunar;
	}
	
	/*
	 * Crea un objeto Nave Nodriza
	 */
	private NaveNodriza crearNaveNodriza() {
		NaveNodriza navenodriza = new NaveNodriza(this);
		navenodriza.setPosicion(new Posicion(Configuracion.getEscenario_ancho()/2, 0));
		navenodriza.setVelocidad(Configuracion.getVelocidad_elementos());
		navenodriza.setDireccion(0); //Por defecto mueve para la derecha
		navenodriza.setTamanio(new Tamanio(Configuracion.getNaveNodriza_tamanio_ancho(), Configuracion.getNaveNodriza_tamanio_alto()));
		return navenodriza;
	}
	
	/*
	 * Crea un objeto Base Lunar Armada
	 */
	private BaseLunarArmada crearBaseLunarArmada() {
		Posicion posicion = new Posicion();
		BaseLunarArmada baselunararmada;
		baselunararmada = new BaseLunarArmada(this);
		
		posicion.setX(Configuracion.getEscenario_ancho()/2);
		posicion.setY(Configuracion.getEscenario_alto());
		baselunararmada.setPosicion(posicion);
		baselunararmada.setCantidadBombas(Configuracion.getCantidad_bombas());
		baselunararmada.laser.setRadioExplosion(Configuracion.getRadio_destruccion_laser());
		
		baselunararmada.setTamanio(new Tamanio(Configuracion.getBaseLunarArmada_tamanio_alto(), Configuracion.getBaseLunarArmada_tamanio_ancho()));

		baselunararmada.setEscudo(100); //Escudo 100%
		
		return baselunararmada;
	}
	
	private boolean posicionValida(Posicion posicion) {
		return !(posicion.getX() >= Configuracion.getEscenario_ancho() || posicion.getY() > Configuracion.getEscenario_alto() || posicion.getX() <= 0 || posicion.getY() < 0);
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
		for (i=1; i<=Configuracion.getCantidad_baseslunares(); i++)
			this.addElemento(crearBaseLunar(i, Configuracion.getCantidad_baseslunares()));
		
		//Agrego la Nave Nodriza
		this.addElemento(crearNaveNodriza());
		
		//Pongo a jugar a los elementos
		//while (true) {
		for (i = 1; i <= 50; i++) {
			for (Elemento e: elementos) {
				e.jugar();
			}
			
			//System.out.println("Termino la ronda");
			
			//Me fijo si alguno de los elementos movibles se fue de la pantalla
			for (Elemento e: elementos) {
				if (e instanceof Movible) {
					if (! posicionValida(e.getPosicion())) {
						((Movible) e).chocarPared();
						
						if (e instanceof Misil) {
							e.morir();
							//elementos.remove(e); // Lo elimino despues en un bucle for
						}
						if (e instanceof Cohete) {
							e.morir();
							//elementos.remove(e); // Lo elimino despues en un bucle for
						}
					}
				}
			}
			
			//Me fijo si alguno de los elementos choc— con otro
			
			for (Elemento e1: elementos) {
//				for (Elemento e2: elementos) {
//					if ((e1 != e2) && (e2 instanceof Movible)) { //Me fijo que un elemento no controle choque consigo mismo y solo con objetos movibles
//						if (e1.chocar(e2)) {
//							System.out.println("Elemento " + e1 + " choc— con " + e2);
//							if (e1 instanceof Cohete) {
//								Cohete cohete;
//									cohete = (Cohete) e1;
//									
//							}
//						}
//					}
//				}
				if (e1 instanceof Arma) {
					//Laser, misil o cohete
				}
			}
			
			//Me fijo si alguno de los elementos muri— y los elimino del Array de objetos
			for (Elemento e: elementos) {
				if (!e.vivo()) {
					if (Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogResume || Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogDebug)
						System.out.println("Elimino al elemento " + e + " del arreglo de objetos");
					elementos.remove(e);
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
