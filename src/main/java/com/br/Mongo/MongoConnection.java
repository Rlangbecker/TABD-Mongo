package com.br.Mongo;


import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.*;
import org.bson.BsonArray;
import org.bson.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@SpringBootApplication
@RestController
public class MongoConnection {

    public static void main(String[] args) {
        SpringApplication.run(MongoConnection.class, args);
    }

    String uri = "mongodb+srv://rlangbecker:rootroot@cluster0.ib4c2u7.mongodb.net/?retryWrites=true&w=majority";
    MongoClientSettings settings = MongoClientSettings.builder()
            .applyConnectionString(new ConnectionString(uri))
            .build();

    MongoClient mongoClient = MongoClients.create(settings);

    MongoDatabase database = mongoClient.getDatabase("Carros");
    MongoCollection<Document> ford = database.getCollection("FORD");


    @GetMapping("/")
    public Document retornarPrimeiro() {
        return ford.find().first();
    }

    @PostMapping("/")
    public ResponseEntity criarDocumento(@RequestBody Carro carro){

        ford.insertOne(new Document("Modelo",carro.getModelo())
                .append("Ano",carro.getAno())
                .append("Valor",carro.getValor()));

        return new ResponseEntity<>(carro, HttpStatus.OK);
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Carro>> retornarLista(){
        List<Carro> documents = new ArrayList<>();

        FindIterable<Document> iterable = ford.find();
        for (Document doc : iterable) {
            Carro carro = new Carro();
            carro.setModelo(doc.getString("Modelo"));
            carro.setAno(doc.getString("Ano"));
            carro.setValor(doc.getString("Valor"));
            documents.add(carro);
        }
              return new ResponseEntity<>(documents,HttpStatus.OK);
    }

}
