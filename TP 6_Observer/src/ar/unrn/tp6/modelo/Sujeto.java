package ar.unrn.tp6.modelo;

import java.util.ArrayList;
import java.util.List;

public class Sujeto {

	private List<Observador> observadores;

	public Sujeto() {
		observadores = new ArrayList<Observador>();
	}

	public void agregarObservador(Observador observador) {
		this.observadores.add(observador);
	}

	public void notificar(String temperatura) {
		for (Observador obs : this.observadores) {
			obs.actualizarTemperatura(temperatura);
		}
	}

}
