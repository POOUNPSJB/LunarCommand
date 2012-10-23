package elementos;

import configuracion.Configuracion;

public class BaseLunarArmada extends BaseLunar {
	private int puntos;
	private int cantidadBombas;
	public Laser laser;
	private Escenario escenario;
	
	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public int getCantidadBombas() {
		return cantidadBombas;
	}

	public void setCantidadBombas(int cantidadBombas) {
		this.cantidadBombas = cantidadBombas;
	}

	public BaseLunarArmada(Escenario escenario) {
		// TODO Auto-generated constructor stub
		super(escenario);
		this.escenario = escenario;
		laser = new Laser();
	}

	public void dispararBomba() {
		Bomba bomba = new Bomba();
		bomba.setTamanio(new Tamanio(Configuracion.getEscenario_ancho(), Configuracion.getEscenario_alto()));
		
		escenario.addElemento(bomba);
		
	}
	
	public void dispararLaser() {
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
