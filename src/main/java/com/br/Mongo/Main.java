//package com.br.Mongo;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static com.mongodb.client.model.Filters.eq;
//
//public class Main {
//    public static void main(String[] args) {
//
//        String uri = "mongodb+srv://rlangbecker:rootroot@cluster0.ib4c2u7.mongodb.net/?retryWrites=true&w=majority";
//        MongoClient mongoClient = MongoClients.create(uri);
//
//        MongoDatabase mongoDatabase = mongoClient.getDatabase("Carros");
//
//        MongoCollection<Document> Ford = mongoDatabase.getCollection("FORD");
//
////        System.out.println(aulas.find(eq("titulo", "teste")).first());
//
//        List<Document> dbList = new ArrayList<>();
//
//        Document novoDocumento = new Document("Modelo", "Fiesta")
//                .append("Ano", "2010")
//                .append("Valor", "18.000,00");
//
//        Document novoDocumento2 = new Document("Modelo", "Ka")
//                .append("Ano", "2006")
//                .append("Valor", "7.500,00");
//
//        Document novoDocumento3 = new Document("Modelo", "Courier")
//                .append("Ano", "1998")
//                .append("Valor", "10.500,00");
//
//        Document novoDocumento4 = new Document("Modelo", "New Fiesta")
//                .append("Ano", "2020")
//                .append("Valor", "42.500,00");
//
//
//        dbList.add(novoDocumento);
//        dbList.add(novoDocumento2);
//        dbList.add(novoDocumento3);
//        dbList.add(novoDocumento4);
//
//        dbList.stream().forEach(document -> Ford.insertOne(document));
//
//
//        System.out.println(Ford.find(eq("Modelo", "Courier")).first());
//
//        System.out.println("==========================================================");
//        System.out.println(Ford.find());
//
//    }
//}
