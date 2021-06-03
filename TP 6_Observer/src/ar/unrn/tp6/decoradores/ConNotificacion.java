package ar.unrn.tp6.decoradores;

import java.util.List;

import ar.unrn.tp6.modelo.DecoradorTemperatura;
import ar.unrn.tp6.modelo.Observador;
import ar.unrn.tp6.modelo.Sujeto;

public class ConNotificacion extends Sujeto implements DecoradorTemperatura {

	private DecoradorTemperatura medidorTemperatura;

	public ConNotificacion(DecoradorTemperatura medidorTemperatura, List<Observador> observadores) {
		this.medidorTemperatura = medidorTemperatura;
		for (Observador obs : observadores) {
			this.agregarObservador(obs);
		}
	}

	@Override
	public String leerTemperatura() {
		String temperatura = medidorTemperatura.leerTemperatura();
		this.notificar(temperatura);
		return temperatura;
	}

}
