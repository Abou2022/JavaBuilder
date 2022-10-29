package MyHospital;

import java.util.ArrayList;

public class Patient {

    //two instance private variable
    private String name;
    private String illness;

    public double total = 0;

    private ArrayList<Bill> bills = new ArrayList<>();

    public Patient(String name, ArrayList<Bill> bills ){
        this.name = name;
        this.bills = bills;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getIllness() {
        return illness;
    }
    public void setIllness(String illness) {
        this.illness = illness;
    }
    public void addBill(Bill bill){
        bills.add(bill);
    }

    @Override
    public String toString(){
        return "[Patient's name = " + name + ", Patient's illness = " + illness + "]";
    }

    public void printBills(){
        for (Bill mybills : bills){
           double totalBill =  mybills.getAmount();
            System.out.println(totalBill);
        }
        System.out.println(total);
    }
}
