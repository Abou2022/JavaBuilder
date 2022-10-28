package PolymorphicCasting;

import java.util.*;
public class Main {
  public static void main(String[] args) {

//    ArrayList <String> family = new ArrayList<>();
  List <Person> family = new ArrayList<>();
    GrandParent grandparent = new GrandParent("Mary");
    GrandParent grandparent1 = new GrandParent("John");
    Parent parent = new Parent("Amy","medium");
    Parent parent1 = new Parent("Andy", "low");
    Child child = new Child("Annie", "high", "Johnson");

    family.add(grandparent);
    family.add(grandparent1);
    family.add(parent);
    family.add(parent1);
    family.add(child);

    for (Person person : family){
      person.walk();
    }
  }
}
