package elementos;

import configuracion.Configuracion;

public class NaveNodriza extends Movible {
	private int frecuenciaDisparoCohete = 7;
	private int frecuenciaDisparoMisil = 5;
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
	}
	
	public NaveNodriza(Escenario escenario) {
		super();
		this.escenario = escenario;
	}

	public void dispararMisil() {
		Misil misil = new Misil();
		
		misil.setPosicion(this.getPosicion());
		misil.avanzar();
		misil.setVelocidad(Configuracion.getVelocidad_misil());
		misil.setDanio(Configuracion.getDanio_misil());
		misil.setTamanio(new Tamanio(Configuracion.getMisil_tamanio_ancho(), Configuracion.getMisil_tamanio_ancho()));
		this.escenario.addElemento(misil);
		
		System.out.println("Disparo Misil");

		
	}
	
	public void dispararCohete() {
		Cohete cohete = new Cohete();
		
		cohete.setPosicion(this.getPosicion());
		cohete.avanzar();
		cohete.setVelocidad(Configuracion.getVelocidad_cohete());
		cohete.setTamanio(new Tamanio(Configuracion.getCohete_tamanio_ancho(), Configuracion.getCohete_tamanio_ancho()));
		escenario.addElemento(cohete);
		
		System.out.println("Disparo Cohete");
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
