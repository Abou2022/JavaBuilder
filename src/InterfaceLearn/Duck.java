package InterfaceLearn;

public class Duck extends Bird implements Flyer, Swimmer{

    @Override
    public void fly(){
        System.out.println("Ducks can fly great distances when migrating");
    }

    @Override
    public void swim() {
        System.out.println("Ducks swim by paddling their feet under the water");
    }

    @Override
    public void dive() {
        System.out.println("Ducks can hold their breathe for several minutes when they dive for food");
    }
}
