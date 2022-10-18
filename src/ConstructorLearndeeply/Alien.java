package ConstructorLearndeeply;

public class Alien {
    //Variable
    private String name;
    private String color;
    private  int antennaCount;

    //Constructor
    public Alien(){
        System.out.println("Alien no-args constructor called!");
    }

    public Alien(String name, String color, int antennaCount){
        this.name = name;
        this.color = color;
        this.antennaCount = antennaCount;
    }
    //Method
    @Override
    public  String toString(){
        return  "The alien " + this.name + " is " + this.color + " and has " + this.antennaCount + " antennas.";
    }

    public String getName(){
        return this.name;
    }
    public  void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }
    public  void setColor(String color){
        this.color = color;
    }

    public int getAntennaCount(){
        return this.antennaCount;
    }
    public  void setAntennaCount(int antennaCount){
        this.antennaCount = antennaCount;
    }

}
