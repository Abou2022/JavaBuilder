public class Poli {
    public static void main(String[] args) {
       add(1,2);
       add(1,3,5);
    }
    //this overloading methode
    //to avoid instant variable I used static
    public static void add(int first, int second){
        System.out.println(first + second);
    }
    public static void add(int first, int second, int third){
        System.out.println(first + second + third);
    }
}
