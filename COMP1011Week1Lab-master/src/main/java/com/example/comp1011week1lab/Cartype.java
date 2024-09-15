package com.example.comp1011week1lab;
public class Cartype {

    //The class should have at least 3, private instance variables.
    private String make;
    private String vehicletype;
    private String license_number;



    public Cartype(String make, String vehicletype, String license_number) {
        setMake(make);
        setVehicletype(vehicletype);
        setLicense_number(license_number);
    }

    public Cartype() {

    }


    //The class should have get/set methods for all of the instance variables.
    //The set methods should have some form of validation and throw an exception if they have an invalid argument.

    public String getMake(String make) {
        return make;

    }

    public void setMake(String make) {
        if (make.equals("Toyota") || make.equals("Ford") || make.equals("Honda") || make.equals("Chevrolet")) {
            this.make = make;
        } else {
            throw new IllegalArgumentException("make is not valid; enter Ford, Toyota, Honda, or Chevrolet");
        }
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        if (vehicletype.equals("coupe") || vehicletype.equals("sedan") || vehicletype.equals("convertible") || vehicletype.equals("hatchback")){
            this.vehicletype = vehicletype;
        } else
            throw new IllegalArgumentException("vehicle type is not valid: choose from the following; coupe, sedan, convertible, hatchback");

    }


    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        if (license_number.equals("AAAA") || license_number.equals("BBBB") || license_number.equals("CCCC") || license_number.equals("DDDD")) {
            this.license_number = license_number;
        } else
            throw new IllegalArgumentException("license number is not valid");
    }
    //There should be a toString() method that clearly displays the object with useful information.
    @Override
    public String toString(){
        return "vehicle make:" + make + "',vehicle type: "  + vehicletype + " registered to: " + license_number ;
    }
}

