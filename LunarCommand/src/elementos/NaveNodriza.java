package elementos;

import java.util.ArrayList;

import configuracion.Configuracion;

public class NaveNodriza extends Movible {
	private int frecuenciaDisparoCohete = 7;
	private int frecuenciaDisparoMisil = 5;
	private int turnoActual = 0;
	private Configuracion configuracion;
	public  ArrayList <Misil> misiles;
	public  ArrayList <Cohete> cohetes;
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

	public NaveNodriza() {
		// TODO Auto-generated constructor stub
		super();
		configuracion = new Configuracion();
		misiles = new ArrayList <Misil>();
		cohetes = new ArrayList <Cohete>();
	}

	public void dispararMisil() {
		Misil misil = new Misil();
		
		misil.setPosicion(this.getPosicion());
		misil.setVelocidad(configuracion.getVelocidad_misil());
		misil.setDanio(configuracion.getDanio_misil());
		this.escenario.addElemento(misil);
		
		System.out.println("Disparo Misil");
		
	}
	
	public void dispararCohete() {
		Cohete cohete = new Cohete();
		
		cohete.setPosicion(this.getPosicion());
		cohete.setVelocidad(configuracion.getVelocidad_cohete());
		escenario.addElemento(cohete);
		
		System.out.println("Disparo Cohete");
	}
	
	

	public void setEscenario(Escenario escenario) {
		this.escenario = escenario;
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
