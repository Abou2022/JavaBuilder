package ConditionalOperators;

public class Loop1 {

    public static void main(String[] args) {

        int num = 1;
        int n = 6;
        while (num <= 5) {
            System.out.println("Hello " + num);
            num++;
        }
        System.out.println("================= =============== ========================");
        do {
            System.out.println("Hello Here " + n);
            n++;
        }while (n <= 5);

    }
}
