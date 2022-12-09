package MyHospital;

import java.util.*;


class Main {

    public static void main(String[] args) {

        ArrayList <Bill> newBill = new ArrayList<>();

        Patient myNewBill = new Patient("John", newBill);
        myNewBill.setIllness("severe cold");
        System.out.println(myNewBill);

        //Create a new Bill object for John with amount 99.95 and     date June 15 2021
        Bill myfacture = new Bill(99.95, "June 15 2021");
        System.out.println(myfacture);

        //Need to set amount
        myfacture.setAmount(99.95);
        //get amount
        double totalFac = myfacture.getAmount();
        System.out.println(totalFac);
    }

}