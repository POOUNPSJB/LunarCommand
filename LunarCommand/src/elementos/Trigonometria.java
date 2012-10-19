package elementos;

public class Trigonometria {

	public Trigonometria() {
		// TODO Auto-generated constructor stub
	}

	public static int seno(int direccion, int velocidad) {
		return (int) Math.round(Math.sin(direccion)) * velocidad;
	}

	public static int coseno(int direccion, int velocidad) {
		return (int) Math.round(Math.cos(direccion)) * velocidad;
	}

	
}
