package com.nagarro.demo;

import com.nagarro.demo.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@RestController
public class OrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	@RequestMapping("/order/1")
	public List<Order> gerOrder(){
		return Arrays.asList(
				new Order(1,250,"14-Apr-2020"),
				new Order(2,450,"15-Apr-2020")
				);
	}
}
