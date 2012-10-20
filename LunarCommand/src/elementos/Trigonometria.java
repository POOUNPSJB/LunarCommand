package elementos;

public class Trigonometria {

	public Trigonometria() {
		// TODO Auto-generated constructor stub
	}

	public static int seno(int direccion) {
		return (int) Math.round(Math.sin(Math.toRadians((double)direccion)));
	}

	public static int coseno(int direccion) {
		return (int) Math.round(Math.cos(Math.toRadians((double)direccion)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(seno(180));
	}
	
}
