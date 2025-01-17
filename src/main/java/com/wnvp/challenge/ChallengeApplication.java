package com.wnvp.challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeApplication.class, args);
		String rawPassword = "contraseña123";
		String hashedPassword = new BCryptPasswordEncoder().encode(rawPassword);
		System.out.println(hashedPassword);

	}

}
