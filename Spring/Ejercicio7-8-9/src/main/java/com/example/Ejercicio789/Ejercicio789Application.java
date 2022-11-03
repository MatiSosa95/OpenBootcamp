package com.example.Ejercicio789;

import com.example.Ejercicio789.Entity.Laptop;
import com.example.Ejercicio789.Repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio789Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Ejercicio789Application.class, args);
		LaptopRepository lr= context.getBean(LaptopRepository.class);
		Laptop l1= new Laptop(null, "Hp", "Intel", "negro", "Windows", 15.5d, false);
		Laptop l2= new Laptop(null, "Apple", null, "gris", "Linux", 15d, true);

		lr.save(l1);
		lr.save(l2);
	}

}
