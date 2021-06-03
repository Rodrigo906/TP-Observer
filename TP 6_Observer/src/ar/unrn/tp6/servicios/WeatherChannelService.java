package ar.unrn.tp6.servicios;

import java.util.Random;

import ar.unrn.tp6.modelo.ClimaOnline;

public class WeatherChannelService implements ClimaOnline {

	@Override
	public String temperatura() {
		int temp = new Random().nextInt(100);
		return temp + " c";
	}

}
