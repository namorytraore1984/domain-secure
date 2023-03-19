package com.nexttechnologes.domainsecure;

import com.nexttechnologes.domainsecure.domaine.entity.Client;
import com.nexttechnologes.domainsecure.domaine.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DomainSecureApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(DomainSecureApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var client = Client.builder().firstName("Namory").lastName("Traore").build();
		clientRepository.save(client);
	}
}
