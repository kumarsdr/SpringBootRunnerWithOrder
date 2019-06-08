package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM RUNNER A");

	}

	@Override
	public int getOrder() {

		return 5;
	}

}
