package elementos;

import java.util.ArrayList;

import configuracion.Configuracion;

public class Misil extends Arma {
	private int danio;
	public ArrayList <Cohete> cohetes;
	private int puntos;
	private Escenario escenario;
	
	@Override

	public void chocar(Elemento otro) {
		// TODO Auto-generated method stub
		if (otro instanceof BaseLunar) {
			System.out.println(this + " choc— con " + otro);
			System.out.println("Muere el objeto " + this);
			this.morir();
		}
		
		if (otro instanceof Laser) {
			System.out.println(this + " choc— con " + otro);
			System.out.println("Muere el objeto " + this);
			escenario.sumarPuntaje(this.getPuntos());
			this.morir();
		}
	}


	
	public Misil(Escenario escenario) {
		// TODO Auto-generated constructor stub
		super();
		cohetes = new ArrayList <Cohete>();
		this.setPuntos(Configuracion.getMisilPuntos());
		this.escenario = escenario;
	}

	
	
	public int getPuntos() {
		return puntos;
	}



	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}



	public int getDanio() {
		return danio;
	}


	public void setDanio(int danio) {
		this.danio = danio;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
