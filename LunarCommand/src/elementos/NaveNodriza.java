package elementos;

import configuracion.Configuracion;

public class NaveNodriza extends Movible {
	private int frecuenciaDisparoCohete = 7;
	private int frecuenciaDisparoMisil = 5;
	private int frecuenciaDisparoOvni = 10;
	private int turnoActual = 0;
	private Escenario escenario;
	
	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		super.jugar();
		++turnoActual;
		if ((turnoActual % frecuenciaDisparoCohete) == 0)
			this.dispararCohete();
		if ((turnoActual % frecuenciaDisparoMisil) == 0)
			this.dispararMisil();
		if ((turnoActual % frecuenciaDisparoOvni) == 0)
			this.dispararOvni();
	}
	
	public NaveNodriza(Escenario escenario) {
		super();
		this.escenario = escenario;
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
	
	public void dispararOvni() {
		Ovni ovni = new Ovni();
		
		ovni.setPosicion(this.getPosicion());
		ovni.setVelocidad(Configuracion.getOvniVelocidad());
		ovni.setTamanio(new Tamanio(Configuracion.getOvniTamanioAlto(), Configuracion.getOvniTamanioAncho()));
		ovni.setDireccion(getRandomDireccion());
		ovni.avanzar();
		this.escenario.addElemento(ovni);
		
		if (Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogDebug) System.out.println("Disparo Ovni");
	}
	
	private int getRandomDireccion() {
		return aleatorio(270,90) ;
	}
	
	private static int aleatorio(int max,int min){
		return (int)(Math.random()*(max-min))+min;		
	}
		
	public void dispararCohete() {
		Cohete cohete = new Cohete(this.escenario);
		
		cohete.setPosicion(this.getPosicion());
		cohete.avanzar();
		cohete.setVelocidad(Configuracion.getVelocidad_cohete());
		cohete.setTamanio(new Tamanio(Configuracion.getCohete_tamanio_ancho(), Configuracion.getCohete_tamanio_ancho()));
		cohete.setDireccion(getRandomDireccion());
		escenario.addElemento(cohete);
		
		if (Configuracion.getLogmode() == Configuracion.ShowLogType.ShowLogDebug) System.out.println("Disparo Cohete");
	}
	

	@Override
	public void chocarPared() {
		// TODO Auto-generated method stub
		super.chocarPared();
		/*
		if (this.getDireccion() == 0)
			this.setDireccion(180);
		else
			this.setDireccion(0);
			*/
		this.setVelocidad(this.getVelocidad() * -1);
		System.out.println("Nueva Direccion: " + this.getDireccion());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
