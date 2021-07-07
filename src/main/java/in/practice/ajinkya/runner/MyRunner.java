package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.Product;

@Component

public class MyRunner implements CommandLineRunner {
	@Autowired
	private Product prod;
	public void run(String... args) throws Exception {
		System.out.println(prod);
	}

}
