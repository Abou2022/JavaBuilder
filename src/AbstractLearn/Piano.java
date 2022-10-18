package AbstractLearn;

public class Piano extends Instrument{

    @Override
    public void sound(){
        System.out.println("Keys clank");
    }
@Override
    public void dance(String game){
    System.out.println( "I love " + game + " and I took couple classes");
    }
}
