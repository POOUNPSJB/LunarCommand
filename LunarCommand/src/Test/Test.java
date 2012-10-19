package Test;

import configuracion.Configuracion;
import elementos.*;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuracion configuracion = new Configuracion();
		Escenario escenario = new Escenario();
		Tamanio tamanio = new Tamanio(configuracion.getEscenario_alto(), configuracion.getEscenario_ancho());
		
		escenario.setTamanio(tamanio);
		
	}

}
