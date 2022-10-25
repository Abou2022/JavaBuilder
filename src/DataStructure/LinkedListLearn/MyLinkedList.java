package DataStructure.LinkedListLearn;

import java.util.*;
public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<String> animals = new LinkedList<>();
        animals.addLast("Cat");
        animals.addLast("Dog");
        animals.addLast("Mouse");
        animals.addLast("Wolf");
        animals.addFirst("Beaver");

        animals.add(3, "Frog");

        for (String animal : animals) {
            System.out.println(animal);
        }

        LinkedList<String> planets = new LinkedList<>();
        planets.addLast("Sun");
        planets.addLast("Mercury");
        planets.addLast("Venus");
        planets.addLast("Earth");
        planets.addLast("Moon");
        planets.addLast("Mars");
        planets.addLast("Jupiter");
        planets.addLast("Saturn");
        planets.addLast("Uranus");
        planets.addLast("Neptune");
        planets.addLast("Pluto");

        planets.removeFirst();
        planets.remove("Moon");
        planets.removeLast();


        for(String planet : planets){
            System.out.println(planet);
        }
        System.out.println();
        //this will print inside the array
        System.out.println(planets);

    }
}
