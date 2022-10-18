package EncapsulationLearn;

public class CreditCard {


    //Two private variables here
    //The private modifier means that the variables here can only be accessed within this class, external access will have to be done with non-private methods.
    private String name;
    private String creditCardNumber;
    private String expirationDate;
    private int cvv;

    //This is a setter, and just as it's name would suggest, it sets the name variable.
    public void setName(String name){
        this.name = name;
    }

    //Also clearly named, here we get the name variable
    public String getName(){
        return name;
    }
    //note how both methods have the public modifier. This allows us to access the methods anywhere throughout the program.

    public void setCreditCardNumber(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }


    public String getCreditCardNumber(){
        return creditCardNumber;
    }

    public void setExpirationDate(String expirationDate){
        this.expirationDate = expirationDate;
    }


    public String getExpirationDate(){
        return expirationDate;
    }

    public void setCvv(int cvv){
        this.cvv = cvv;
    }


    public int getCvv(){
        return cvv;
    }
}
