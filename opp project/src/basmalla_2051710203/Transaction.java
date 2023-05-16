
package basmalla_2051710203;
import java.util.*;
//class for transactions
//Super class which do all transactions on accounts
public class Transaction {//start of transaction class block
private Account A;// object from type Account to can accses all Account class 
private double amountOfMoney;// attribute to save the money of each transactions
Date dateCreated;//to get the date of each created operation
String Status;//to save in it the status of each transaction succes or not

    //zero argument constructor
    public Transaction() {//only to initialize attributes with defult values
    A=new Account();//initialize the object A
    amountOfMoney=0.0;//initialize of amount of money
    dateCreated=new java.util.Date();//initialize of Date
    Status="null";//initializ with defult values of strings
 
    }
   //more argument constructor which take all attributes as a parameters
    public Transaction(Account A, double amountOfMoney, Date dateCreated,String Status) {
        this.A = A;
        this.amountOfMoney = amountOfMoney;
        this.dateCreated = dateCreated;
        this.Status = Status;
    }
//getter methods of needed attributes
    public Account getA() {//start of get A which get all information about the affected account
        return A;
    }//end of get A method

    public double getAmountOfMoney() {//start of get amount of money to get the amount of money
        return amountOfMoney;
    }

    public Date getDateCreated() {//start of get date method which get the date which the operation has done in it
        return dateCreated;
    }

    public String getStatus() {//start of get status method which get the status of current operation is done or not
        return Status;
    }

    public void setA(Account A) {//start of set A which set any account in another account
        this.A = A;
    }

    public void setAmountOfMoney(double amountOfMoney) {//start of set amout of money which set in it the money which affected
        this.amountOfMoney = amountOfMoney;
    }
    
    public void setStatus(String Status) {//start of set status to set in it the case of operation
        this.Status = Status;
    }

 //overriden toString method which get all information about Transaction class
    @Override
    public String toString() {//start of method
        return "Transaction{" + "A=" + A + ", dateCreated=" + dateCreated + "\n" +", Status=" + Status + '}';
    }//end of method
}//end of transaction class block
