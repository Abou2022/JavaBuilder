package InterfaceLearn;

public class Duck extends Bird implements Flyer, Swimmer{

    @Override
    public void dive() {
        System.out.println();
    }

    @Override
    public void swim() {
        System.out.println();
    }
}
