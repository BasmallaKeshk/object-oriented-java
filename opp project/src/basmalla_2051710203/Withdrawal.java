
package basmalla_2051710203;
// withdrawa sub class from transaction to allow the user to withdrawa any money from his Back Account

import java.util.Date;

public class Withdrawal extends Transaction {//start of withdrawal sub class
    private double newMoney;//new money after withdrawal

    //zero argument constructor to initialize the attributes with defult values
    public Withdrawal() {
     newMoney=0.0;   //defult value of nem money
    }

    public Withdrawal(double newMoney) {//constructor for new money
        this.newMoney = newMoney;
    }
//more argument constructor which have the attributes of Super class
    public Withdrawal(Account A, double amountOfMoney, Date dateCreated, String Status) {
        super(A, amountOfMoney, dateCreated, Status);// super() allow all Transaction contents to be in subclass
    }
    

    public double getNewMoney() {//getter method for newmoney to get new money after withdrawal
        return newMoney;
    }

    public void setNewMoney(double newMoney) {//setter method to set the withdrawald money in new money after withdrawal operation
        this.newMoney = newMoney;
    }
//overriden toString method to get all information about withdrawal subclass
    @Override
    public String toString() {//start of tostring method
        return super.toString()+"withdrawal{" + "newMoney=" + newMoney + '}';
        //super is to get all information in tostring of super class 
    }//end of to string method
  
}//end of withdrawal sub class
