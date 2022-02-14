package com.company;

// Challenge 1: Implement the Rectangle Class Using the Concepts of Encapsulation
class  Rectangle{
    private double width;
    private double height;
    public  Rectangle(){
        this.height = 0;
        this.width = 0;
    }
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }
    public double getWidth(){
        return  this.width;
    }
    public double getHeight(){
        return  this.height;
    }
    public  double getArea(){
        return this.getHeight()* this.getWidth();
    }
}
// Assignment 2: Implement the Complete Student Class
class Student {
   private String name;
   private String rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }
}
// Challenge 1: Implement the Derived Class
class Car{
    private String model;
    private String speed;
    public Car(){
        this.model = "";
        this.speed="";
    }
    public Car(String model, String speed){
        this.model = model;
        this.speed=speed;
    }
    public String getModel() {
        return model;
    }

    public String getSpeed() {
        return speed;
    }
}
class XCar extends Car{
    public XCar(String model, String speed){
        super(model,speed);
        }
     public String getDetails(String carName){
         return  carName+", "+this.getModel()+", "+this.getSpeed();
     }
}

// Assignment 3: Implement the Parametrized Constructor
class Laptop{
    private String name;
    public Laptop(){
        name = "";
    }
    public  Laptop(String name){
        this.name = name;
    }
    public  String getName(){
        return this.name;
    }
}
class Dell extends Laptop{
    public  Dell(String name){
        super(name);
    }
    public String  getDetails(){
        return this.getName();
    }
}

public class Main {

    public static void main(String[] args) {
        //Challenge 1: Implement the Rectangle Class Using the Concepts of Encapsulation
        System.out.println("Challenge 1: Implement the Rectangle Class Using the Concepts of Encapsulation");
        Rectangle rec = new Rectangle(2,2);
        System.out.println(rec.getArea());

        //Assignment 2: Implement the Complete Student Class
        System.out.println("Assignment 2: Implement the Complete Student Class");
        Student student = new Student();
        student.setName("Rumbi");
        System.out.println(student.getName());
        student.setRollNumber("rumbirolnumber");
        System.out.println(student.getRollNumber());

        //Challenge 1: Implement the Derived Class
        System.out.println("Challenge 1: Implement the Derived Class");
        XCar car = new XCar("Tesla","100");
        System.out.println(car.getDetails("Roadster"));

        //Assignment 3: Implement the Parametrized Constructor
        System.out.println("Assignment 3: Implement the Parametrized Constructor");
        Dell lap = new Dell("Dell Inspiron");
        System.out.println(lap.getDetails());
    }
}
