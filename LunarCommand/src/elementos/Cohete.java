package elementos;

import configuracion.Configuracion;

public class Cohete extends Arma {
	private int tiempoLanzamiento;
	private int contador = 0;
	private Escenario escenario;
	
	public Cohete(Escenario escenario) {
		// TODO Auto-generated constructor stub
		super();
		this.escenario = escenario;
	}
	
	@Override
	public void chocar(Elemento otro) {
		// TODO Auto-generated method stub
		
		if (otro instanceof Laser) {
			System.out.println(this + " choc— con " + otro);
			System.out.println("Muere el objeto " + this);
			this.morir();
		}
	}
	
	public void dispararMisil() {
		Misil misil = new Misil(this.escenario);
		
		misil.setPosicion(this.getPosicion());
		misil.setVelocidad(Configuracion.getVelocidad_misil());
		misil.setDanio(Configuracion.getDanio_misil());
		misil.setTamanio(new Tamanio(Configuracion.getMisil_tamanio_ancho(), Configuracion.getMisil_tamanio_ancho()));
		misil.setDireccion(getRandomDireccion());
		misil.avanzar();
		this.escenario.addElemento(misil);
		
		if (Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogDebug) System.out.println("Disparo Misil");
	}
	
	private int getRandomDireccion() {
		return aleatorio(270,90) ;
	}
	
	private static int aleatorio(int max,int min){
		return (int)(Math.random()*(max-min))+min;		
	}

	@Override
	public void jugar() {
		int i;
		// TODO Auto-generated method stub
		super.jugar();
		++contador;
		
		if ((contador % Configuracion.getCoheteTurnosdisparomisil()) == 0) {
			//Disparo x misiles y muero
			for (i=0; i<Configuracion.getCoheteCantidaddisparomisil(); i++) {
				dispararMisil();
				this.morir();
			}
		}
	}



	public int getTiempoLanzamiento() {
		return tiempoLanzamiento;
	}



	public void setTiempoLanzamiento(int tiempoLanzamiento) {
		this.tiempoLanzamiento = tiempoLanzamiento;
	}

	public void disparar() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
