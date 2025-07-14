package com.ef.optidata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OptidataApplication {
	/*// Carga el archivo .env y lo configura para inyectar en System Properties
	Dotenv dotenv = Dotenv.configure()
			.directory("./") // Directorio donde se encuentra .env (ej. raíz del proyecto)
            .filename(".env") // Nombre del archivo
            .ignoreIfMalformed()
            .ignoreIfMissing()
            .systemProperties() // Esto es CLAVE: carga en System.properties
            .load();
*/
	public static void main(String[] args) {
		SpringApplication.run(OptidataApplication.class, args);
	}

}
