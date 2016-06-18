package br.com.sysk.dynengines.aes;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import br.com.sysk.dynengines.aes.controllers.PersonController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
@ComponentScan(basePackageClasses = {
		PersonController.class
})
public class DynenginesAesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DynenginesAesApplication.class, args);
	}
}
