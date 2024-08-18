package br.com.emersonfarias.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * - Swagger 3
 *
 * @author emersonsantos
 */
@EnableFeignClients
@SpringBootApplication
public class GofApplication {
    public static void main(String[] args) {
        SpringApplication.run(GofApplication.class, args);
    }
}
