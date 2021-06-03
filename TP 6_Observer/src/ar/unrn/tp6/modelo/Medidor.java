package ar.unrn.tp6.modelo;

public class Medidor implements DecoradorTemperatura {

	private String temperatura;
	private ClimaOnline clima;

	public Medidor(ClimaOnline clima) {
		this.clima = clima;
	}

	@Override
	public String leerTemperatura() {
		// leo la temperatura del servicio web
		this.temperatura = this.clima.temperatura();
		return this.temperatura;
	}

}
