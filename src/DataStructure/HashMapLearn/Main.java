package DataStructure.HashMapLearn;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Map<Integer, String> topMovies = new HashMap<>();

        topMovies.put(1, "The Shawshank Redemption");
        topMovies.put(2, "The Godfather");
        topMovies.put(3, "The Dark Knight");
        topMovies.put(4, "The Godfather: Part II");
        topMovies.put(5, "12 Angry Men");

        System.out.println(topMovies.get(3));

        //print only the key
        System.out.println(topMovies.keySet());

        //print only the value
        System.out.println(topMovies.values());

        //print key and value
        System.out.println(topMovies.entrySet());

        HashMap <String, Integer> employees = new HashMap<>();
        employees.put("Deer Park", 345);
        employees.put("Homer Simpson", 234);
        employees.put("Gordon Freeman", 445);
        employees.put("Nikola Tesla", 543);

        System.out.println(employees.get("Gordon Freeman"));

        //print only the key
        System.out.println(employees.keySet());

        //print only the value
        System.out.println(employees.values());

        //print key and value
        System.out.println(employees.entrySet());



    }
}
