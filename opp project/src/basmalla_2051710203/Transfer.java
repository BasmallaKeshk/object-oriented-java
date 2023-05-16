
package basmalla_2051710203;

//transfer amount of money from account to annother account

import java.util.Date;

public class Transfer extends Transaction {//start of subclass transfer 
private double amountOfTransferdMoney;//attribute to save in it the amount of money which transferd

    public Transfer() {//zero argument constructor to initialize attribute with defult values
    amountOfTransferdMoney=0.0;   
    }
//more argument constructor  which have the attributes of Super class 
    public Transfer( Account A, double amountOfMoney, Date dateCreated, String Status) {
        super(A, amountOfMoney, dateCreated, Status);//super() allow all Transaction contents to be in subclass
    }

    public double getAmountOfTransferdMoney() {//get method to get the amount of transferd money
        return amountOfTransferdMoney;
    }

    public void setAmountOfTransferdMoney(double amountOfTransferdMoney) {//set method to set amount of transferd money
        this.amountOfTransferdMoney = amountOfTransferdMoney;
    }
//overriden method to print all information about the transfer class
    @Override
    public String toString() {//start of toString method
        return super.toString()+ "Transfer{" + "amountOfTransferdMoney=" + amountOfTransferdMoney + '}';
    }//end of toString method
    
}//end of transfer subclass
