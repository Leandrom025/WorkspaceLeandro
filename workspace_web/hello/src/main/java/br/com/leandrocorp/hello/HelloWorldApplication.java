package br.com.leandrocorp.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

@GetMapping("/Pagina")
	public String mostrarPagina() {
	return "<html>"
			+ "<body> "
			+ "<h1> "
			
			
}

}
