package AbstractLearn;

public abstract class Instrument {
String game;
    //Abstract method
    abstract void sound();

    public void dance(String game){
        this.game = game;
    }
//    public String dance(String game){
////        System.out.println("");
//        return "I am a " + game ;
//    }
}
