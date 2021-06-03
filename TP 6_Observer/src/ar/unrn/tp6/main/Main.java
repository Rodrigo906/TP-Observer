package ar.unrn.tp6.main;

import java.util.List;

import ar.unrn.tp6.decoradores.ConNotificacion;
import ar.unrn.tp6.modelo.DecoradorTemperatura;
import ar.unrn.tp6.modelo.Medidor;
import ar.unrn.tp6.observadores.MostrarEnConsola;
import ar.unrn.tp6.observadores.RegistrarEnArchivo;
import ar.unrn.tp6.servicios.WeatherChannelService;

public class Main {

	public static void main(String[] args) {

		DecoradorTemperatura medidor = new ConNotificacion(new Medidor(new WeatherChannelService()),
				List.of(new MostrarEnConsola(), new RegistrarEnArchivo("C:/Users/Rodrigo/temperaturas.txt")));
		medidor.leerTemperatura();

	}
}
