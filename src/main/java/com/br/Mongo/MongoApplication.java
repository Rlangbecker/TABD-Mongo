package com.br.Mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);


		String uri = "mongodb+srv://rlangbecker:rootroot@fundatec.ttbcqmq.mongodb.net/?retryWrites=true&w=majority";
		MongoClient mongoClient = MongoClients.create(uri);


	}

}
