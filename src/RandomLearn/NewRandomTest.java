package RandomLearn;

public class NewRandomTest {

    public static void main(String[] args) {
        NewRandom rand = new NewRandom();
        int no_of_tests = 6;

        System.out.println("\n1) Test: nextInt(low, high)");
        for (int i = 0; i < no_of_tests; i++) {
            int a = rand.nextInt(3, 9);
            System.out.println(a);
        }

        System.out.println("\n2) Test: nextEven(low, high)");
        for (int i = 0; i < no_of_tests; i++) {
            int a = rand.nextEven(3, 9);
            System.out.println(a);
        }

        System.out.println("\n3) Test: nextOdd(low, high)");
        for (int i = 0; i < no_of_tests; i++) {
            int a = rand.nextOdd(3, 9);
            System.out.println(a);
        }

        System.out.println("\n4) Test: nextChar()");
        for (int i = 0; i < no_of_tests; i++) {
            char a = rand.nextChar();
            System.out.println(a);

        }
        System.out.println("\n5) Test: nextChar(low, high)");
        for (int i = 0; i < no_of_tests; i++) {
            char a = rand.nextChar('A', 'Z');
            System.out.println(a);
        }
        System.out.println("\n6) Test: nextChar(c, i)");
        for (int i = 0; i < no_of_tests; i++) {
            char a = rand.nextChar('C', -3);
            System.out.println(a);
        }

        System.out.println("\n7) Test: nextSpecialChar()");
        for (int i = 0; i < no_of_tests; i++) {
            char a = rand.nextSpecialChar();
            System.out.println(a);
        }
    }
}

