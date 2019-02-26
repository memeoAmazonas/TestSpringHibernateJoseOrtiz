package com.spring.test.model;

public class Persona {
    private String id;
    private String name;
    private String lastName;
    private String birthDate;
    private String aplication;
    private static final String versionNumber ="1.0";

    public Persona(String id, String name, String lastName, String birthDate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public void setAplication(String aplication) {
        this.aplication = aplication;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAplication() {
        return aplication;
    }

    public static String getVersionNumber() {
        return versionNumber;
    }

}
