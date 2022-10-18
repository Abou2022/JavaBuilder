package ConstructorLearndeeply;

public class Main {

    public static void main(String[] args) {
        Flizzle myFliz = new Flizzle("Gloobert", "tie-dye", 2, 4);
        System.out.println(myFliz.getName());
        System.out.println(myFliz.getColor());
        System.out.println(myFliz.getAntennaCount());
        System.out.println(myFliz.getArmCount());
    }
}
