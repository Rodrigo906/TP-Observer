package ar.unrn.tp6.observadores;

import ar.unrn.tp6.modelo.Observador;

public class MostrarEnConsola implements Observador {

	@Override
	public void actualizarTemperatura(String temperatura) {
		int temp = Integer.valueOf(temperatura.substring(0, 2));
		if (temp < 12) {
			System.out.println("Hace frio, se encenderá la caldera");
		} else if (temp > 17) {
			System.out.println("Hace calor, se encenderá el aire acondicionado");
		}

	}

}
