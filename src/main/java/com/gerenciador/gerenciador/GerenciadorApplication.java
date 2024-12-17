package com.gerenciador.gerenciador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gerenciador.gerenciador.Model.User;
import com.gerenciador.gerenciador.repository.UserRepository;

@SpringBootApplication
public class GerenciadorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(UserRepository userRepository) {
		return args -> {
			// userRepository.delete

			User c = new User();
			c.setNome("Jonnas");
			c.setTime("Desenvolvedor");
			userRepository.save(c);
		};
	}
}
