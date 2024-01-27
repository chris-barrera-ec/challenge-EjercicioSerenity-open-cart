package com.dum.util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Persona {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String company;
    private String address;
    private String city;
    private String postCode;
    private String country;
    private String region;
    public Persona(){
        //leer de un archivo
        try (FileReader fr = new FileReader("src/test/resources/data/opencart/datos.csv")) {
            BufferedReader br = new BufferedReader(fr);
            // Lectura del fichero
            String linea;

            while((linea=br.readLine())!=null){
                this.firstName= extraerValor(linea, 1);
                this.lastName=  extraerValor(linea, 2);
                this.email=  extraerValor(linea, 3);
                this.phone=  extraerValor(linea, 4);
                this.company=  extraerValor(linea, 5);
                this.address=  extraerValor(linea, 6);
                this.city =  extraerValor(linea, 7);
                this.postCode =  extraerValor(linea, 8);
                this.country =  extraerValor(linea, 9);
                this.region =  extraerValor(linea, 10);
                System.out.println("asignando valores a objeto persona desde archivo csv");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static String extraerValor(String cadena,int cual){
        String[] parts = cadena.split(",");
        return parts[cual-1];
    }
    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }
    public String getCompany(){
        return this.company;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCity(){
        return this.city;
    }
    public String getPostCode(){
        return this.postCode;
    }
    public String getCountry(){
        return this.country;
    }
    public String getRegion(){
        return this.region;
    }
}
