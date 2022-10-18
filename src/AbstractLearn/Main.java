package AbstractLearn;

public class Main {
    public static void main(String[] args) {



        Guitar guitar = new Guitar();
        guitar.sound();

        Piano piano = new Piano();
        piano.sound();
        piano.dance("Gamer");


        Violin violin = new Violin();
        violin.sound();

        Drums drums = new Drums();
        drums.sound();
    }
}
