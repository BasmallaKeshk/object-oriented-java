
package basmalla_2051710203;

import java.util.Date;
// Deposit sub class from transaction to allow the user to deposit any money in his Back Account
public class Deposit extends Transaction{
 private double newBalance;//attribute to save all new balance in it

 //zero argument constructor
    public Deposit() {
    newBalance=0.0; //initialize the va;ue with defult
    }
 //more argument constructor which have the attributes of Super class 
    public Deposit(Account A, double amountOfMoney, Date dateCreated, String Status) {
        super(A, amountOfMoney, dateCreated, Status);//super() allow all Transaction contents to be in subclass
    }

    public Deposit(double newBalance) {//constructor of new Balance
        this.newBalance = newBalance;
    }

    public double getNewBalance() {//get method to get the new balance after deposit 
        return newBalance;
    }// end of get method 

    public void setNewBalance(double newBalance) {// set method to set the new balance with the method after deposit
        this.newBalance = newBalance;
    }
// overriden toString method to get all information about thr deposit sub class
    @Override
    public String toString() {//start of tostring method
       
        return super.toString()+"Deposit{" + "newBalance=" + newBalance + '}';
        //super is to get all information in tostring of super class 
    }//end of to string method

    
}// end of deposit sub class 
