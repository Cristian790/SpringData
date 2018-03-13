//package com.spring;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//import com.spring.dao.CostumerRepository;
//import com.spring.model.Costumer;
//
//@SpringBootApplication
//public class SpringDataApplication {
//
//	private static final Logger log = LoggerFactory.getLogger(SpringDataApplication.class);
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringDataApplication.class);
//	}
//
//	@Bean
//	public CommandLineRunner demo(CostumerRepository repository) {
//		return (args) -> {
//			// save a couple of customers
//			repository.save(new Costumer("Jack", "Bauer"));
//			repository.save(new Costumer("Chloe", "O'Brian"));
//			repository.save(new Costumer("Kim", "Bauer"));
//			repository.save(new Costumer("David", "Palmer"));
//			repository.save(new Costumer("Michelle", "Dessler"));
//
//			// fetch all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Costumer customer : repository.findAll()) {
//				log.info(customer.toString());
//			}
//			log.info("");
//
//			// fetch an individual customer by ID
//			Costumer costumer=repository.findOne(2L);
//			if(costumer!=null) {
//					log.info("Customer found with findById(1L):");
//					log.info("--------------------------------");
//					log.info(costumer.toString());
//					log.info("");
//				};
//
//			
//			// fetch customers by last name
//			log.info("Customer found with findByLastName('paLmEr'):");
//			log.info("--------------------------------------------");
//			for (Costumer bauer : repository.findByLastNameIgnoringCase("paLmEr")) {
//				log.info(bauer.toString());
//			}
////			repository.findByLastName("Bauer").forEach(bauer -> {
////				log.info(bauer.toString());
////			});
//			// for (Customer bauer : repository.findByLastName("Bauer")) {
//			// 	log.info(bauer.toString());
//			// }
//			log.info("");
//			
//			log.info("Customer found with findAllByFirstNameAndLastNameIgnoringCase('Jack', 'bauer'):");
//			log.info("--------------------------------------------");
//			for (Costumer bauer : repository.findAllByFirstNameAndLastNameIgnoringCase("Jack", "bauer") ){
//				log.info(bauer.toString());
//			}
//			log.info("");
//			};
//			
//	}
//
//}
package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataApplication.class, args);
	}
}