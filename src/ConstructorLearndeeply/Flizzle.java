package ConstructorLearndeeply;

public class Flizzle extends Alien{

    private int armCount;

    //Constructor

    public Flizzle(String name, String color, int antennaCount, int armCount){
        super(name, color, antennaCount);
        this.armCount = armCount;
    }
    //Method
    @Override
    public String toString(){
        return  super.toString() + " It also has " + this.armCount + " arms.";
    }
    public  int getArmCount(){
        return this.armCount;
    }

    public void setArmCount(int armCount){
        this.armCount = armCount;
    }
}
