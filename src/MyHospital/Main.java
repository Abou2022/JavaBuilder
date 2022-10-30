package MyHospital;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList <Bill> newBill = new ArrayList<>();
        Patient myNewBill = new Patient("John", newBill);
        System.out.println(myNewBill);
    }
}
