package elementos;

public class BaseLunarArmada extends BaseLunar {
	private int puntos;
	private int cantidadBombas;
	public Laser laser;
	
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

	public BaseLunarArmada() {
		// TODO Auto-generated constructor stub
		super();
		laser = new Laser();
	}

	public void dispararBomba() {
		
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
