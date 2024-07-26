package cl.praxis.ProyectoHospitalPostPandemia;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoHospitalPostPandemiaApplication {

	private static final Logger logger = LoggerFactory.getLogger(ProyectoHospitalPostPandemiaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ProyectoHospitalPostPandemiaApplication.class, args);
		logger.info("Iniciando sistema del Hospital");
	}

}
