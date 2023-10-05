package com.samseen.servicesupplychain;

import com.samseen.servicesupplychain.user.entity.Permission;
import com.samseen.servicesupplychain.user.repository.RoleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
@Slf4j
public class ServiceSupplyChainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceSupplyChainApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner initializeDatabase(RoleRepository roleRepository) {
//		return args -> {
//			// Check if the database is empty; if so, populate it
//			if (roleRepository.count() == 0) {
//				Permission userPermission = new Permission();
//				userPermission.setName("USER");
//
//				Permission managerPermission = new Permission();
//				managerPermission.setName("MANAGER");
//
//				roleRepository.save(userPermission);
//				roleRepository.save(managerPermission);
//
//				log.info("Database populated with permissions.");
//			}
//
//		};
//	}

}
