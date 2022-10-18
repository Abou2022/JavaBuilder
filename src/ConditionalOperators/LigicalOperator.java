package ConditionalOperators;

import java.util.Scanner;
public class LigicalOperator {
    public static void main(String[] args) {

//        int a = 5;
//        int b = 10;

//        if(a==b)
//            System.out.println("A and B are the same");
//        //the else statement doesn't use a condition, and it is always precede by if
//        else {
//            System.out.println("note the same");
//        }
//        if (a == b) {
//            System.out.println("A and B are the same");
//            System.out.println("The value of a is: " + a);
//            System.out.println("The value of b is: " + a);
//            System.out.println("Their sum is: " + a + b);
//        }
//
//        if (a == b)
//            System.out.println("A and B are the same");
//        System.out.println("The value of a is: " + a);
//        System.out.println("The value of b is: " + a);
//        System.out.println("Their sum is: " + a + b);

//        char letter = 'b';
//        int number = 10;
//        if (letter == 'a' || letter == 'e' ) {
//            if (number % 2 == 0) {
//                System.out.println("Letter is a vowel. Number is Even.");
//            } else {
//                System.out.println("Letter is a vowel. Number is Odd.");
//            }
//        } else {
//            if (number % 2 == 0) {
//                System.out.println("Letter is a Consonant. Number is Even.");
//            } else {
//                System.out.println("Letter is a Consonant. Number is Odd.");
//            }
//        }
        Scanner scann = new Scanner(System.in);
        System.out.println("How old are you?");

       int age = scann.nextInt();

        String rating = "R";
       boolean withParent = false;

       if (rating == "R"){
           if (age >=18 || (age >= 13 && withParent))
               System.out.println("You can watch this rated R movie");
           else
               System.out.println("You can not watch this rated R movie");
       } else if (rating == "PG13"){
           if (age >=13 || (age >= 10 && withParent))
               System.out.println("You can watch this rated PG13 movie");
           else
               System.out.println("You can not watch this rated PG13 movie");
       } else if (rating == "PG"){
           System.out.println("Anyone can PG movies");
       }
        System.out.println("end of application");
    }
}
