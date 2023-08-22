package com.alejfneto.desafio_01;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alejfneto.desafio_01.entities.Order;
import com.alejfneto.desafio_01.services.OrderService;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner{
	
	@Autowired
	private static OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
		Locale.setDefault(Locale.US);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.print(order1.toString());
		System.out.println(String.format("%.2f%n", orderService.total(order1)));
		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.print(order2.toString());
		System.out.println(String.format("%.2f%n", orderService.total(order2)));
		Order order3 = new Order(1309, 95.90, 0.0);
		System.out.print(order3.toString());
		System.out.println(String.format("%.2f%n", orderService.total(order3)));
		
	}

}
