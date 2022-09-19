package com.mongo.atlas.example.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("persons")
public class Person {

    @Id
    private ObjectId id;

    private String name;

    private String location;

    private String govtId;

    public Person() {
    }

    public Person(String name, String location, String govtId) {
        this.name = name;
        this.location = location;
        this.govtId = govtId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGovtId() {
        return govtId;
    }

    public void setGovtId(String govtId) {
        this.govtId = govtId;
    }
}
