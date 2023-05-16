
package basmalla_2051710203;

// second class Account for account_Number 
 public class Account  {//start of Account class
 private String uniqueAccountNumber;//attribute of account number
 private Holder H;//attribute object from type holdwe to can use the holder class
 private double balance;//the balance of clients in bank which will have some transactions on it (first money which user open your Bank account
 private final  String common_prfeix="010111"; // this is an common prefix to be add before each civil_id to create an account number

 public Account(){//zero argument constructor for account
  uniqueAccountNumber="null";//defult value of nuiAccountNumber
  H=new Holder();//initialize object from holder type
  balance=0.0;//initialize the balance with defult value
 }
// more argument constructor 
    public Account(String u, Holder H, double b) {// assign the attributes to instance variables 
        uniqueAccountNumber = u; 
        this.H = H;
        balance = b;
       
    }
//getter methods for attributes
    //only return the attribute don't take parameters 
    public String getUniqueAccountNumber() {//getter for UniqueAccountNumber
        
        return uniqueAccountNumber;
    }//end of getUniqueAccountNumber method
    
    public double getBalance() {//getter for balance
        return balance;
    }//end of get balance method method
    
     public Holder getH() {//getter for object H 
        return H;
    }//end  get H method
     
     public String getCommon_prfeix() {//getter for common_prefix
        
        return common_prfeix;
    }//end of get method

     //setter common_prefix methods
    public void setUniqueAccountNumber(String uniqueAccountNumber) {//setter for uniNumber
        this.uniqueAccountNumber = uniqueAccountNumber;
    }//end of setUniqueAccountNumber method

    public void setBalance(double balance) {//setter for balance
        this.balance = balance;
    }//end balance method
    
    public void setH(Holder H) {//setter for object H
        this.H = H;
    }// end H method
    
//overriden method to print all information about Account class
    @Override
    public String toString() {//start of toString 
        return "Account{" + "uniqueAccountNumber=" + uniqueAccountNumber + ", H=" + H + ", balance=" + balance + '}';
    }//end of to string method
}// end of account class
