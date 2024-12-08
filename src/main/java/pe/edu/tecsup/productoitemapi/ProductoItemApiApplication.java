package pe.edu.tecsup.productoitemapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductoItemApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductoItemApiApplication.class, args);
	}

}
