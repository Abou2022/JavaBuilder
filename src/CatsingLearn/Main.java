package CatsingLearn;

public class Main {

    public static void main(String[] args) {

        //upcasting
        Animal anim = new Dog();
        anim.name = "Charlie";
        anim.doTrick();

        // We don't have access to bark method => anim.bark(); on upcasting

        Animal anim2 = new Cat();
        anim2.name = "Wanda";
        anim2.doTrick();


        makeAnimalSpeak(anim);
        makeAnimalSpeak(anim2);
    }

    //DownCasting
    public static void makeAnimalSpeak(Animal animal){

        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.bark();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.meow();
        }

    }
}
