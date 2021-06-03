package ar.unrn.tp6.observadores;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

import ar.unrn.tp6.modelo.Observador;

public class RegistrarEnArchivo implements Observador {

	private String path;

	public RegistrarEnArchivo(String path) {
		this.path = path;
	}

	@Override
	public void actualizarTemperatura(String temperatura) {
		this.RegistrarTemperatura(temperatura);
	}

	private void RegistrarTemperatura(String temperatura) {
		try {
			String registro = temperatura + "; " + LocalDateTime.now() + "\r";
			Files.write(Paths.get(this.path), registro.getBytes(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo persistir", e);
		}

	}

}
