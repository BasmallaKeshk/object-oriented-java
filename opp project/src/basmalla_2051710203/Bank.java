
package basmalla_2051710203;
import java.util.*;
import java.io.*;
// this is  the class will do the main job
public class Bank {// start of class Bank
 //static attributes 
  static  ArrayList<Account> accountNumbers;//declare of array list from Account Type called accountNumbers which save the accounts in it
  static ArrayList<Transaction >transactionsOperations;//declare of array list from Transaction Type called transactionsOperations
                                    //which save all happend Transaction 
  // other attributes
  //static double money=0.0;//money  will get from user
  //static double newMoney=0.0;//amount of new money of any transactions
  //static double balance;//balance which transfered from account to annother account 
  //String uni_number="";//uniaccount number to allow you ao all operation
  static double max=0.0;//variable max to get the maximum transferd money
    // zero argument Constructor to initialize the attributes
    public Bank() {
    accountNumbers=new ArrayList<>();//create ArrayList
    transactionsOperations=new ArrayList<>();//create arrayList
   }
   
    public  ArrayList<Account> getAccountNumbers() {//getter method for AccountNumbers ArrayList
        return accountNumbers;
    }//end of getter method

    public  void setAccountNumbers(ArrayList<Account> accountNumbers) {//setter method for AccountNumbers
        Bank.accountNumbers = accountNumbers;
    }//end of setter method

    public static ArrayList<Transaction> getTransactionsOperations() {//getter method for TransactionsOperations  ArrayList
        return transactionsOperations;
    }//end of geeter method

    public static void setTransactionsOperations(ArrayList<Transaction> transactionsOperations) {//setter method for transactionsOperations
        Bank.transactionsOperations = transactionsOperations;
    }//end og setter method
    
    // Static methods 
     //method of creatig new account
    //which take the civil id from the Holder to crate unique account number
public static String createAccountNumber(Account A,Holder H ,String s,ArrayList<Account> accountNumbers ){
                   A.setUniqueAccountNumber(A.getCommon_prfeix()+H.getCivil_id());//to create account number 
                   accountNumbers.add(A);  //any account created is add to accountNumbers ArrayList
                   return A.getUniqueAccountNumber();
     }
     
     //method of deposit amount of money in any account 
//which take information of Holder ,Account number and the amount of money which want to deposit 
public static double depositMoney(ArrayList<Transaction >transactionsOperations,Transaction B,double money,Deposit d,Date dC,double newMoney,String status){
         if(money>0){//check if the amount of money yau want to deposit is greater than 0
         d.getA().setBalance(money+d.getA().getBalance());//if get true
         d.setNewBalance(d.getA().getBalance()); //set in new balance of deposit the balance of the user + the deposited money
         d.getNewBalance();
         transactionsOperations.add(d);//any deposit operation is created is add to the transactionsOperations ArrayList
         System.out.println("Successfully credited");// if the operation works fine
         System.out.println("--------------------");
         System.out.println("The money after the Deposit operation is " + d.getNewBalance());
         d.setStatus("The deposit  operation is successfully done " + " and the bew balance is " + d.getNewBalance());//ststus of the operation
         }
         else{//if the money ehich the user want to deposit < 0
             System.out.println("The operation can't be completed ");
             d.setStatus("not successfully credited");
         }
         return B.getA().getBalance();
     }

  //method to withdrawal money from account
//which take account number ,Holder information and the amount of money the user want to withdrwawl
     public static double withDrwalMoney(ArrayList<Transaction >transactionsOperations,double money,Transaction B,Withdrawal w,Date dC,double newMoney,String status,Account A){
          if(w.getA().getBalance()>=money){//check if the money the user want to withdrwawl > his balance
         w.getA().setBalance(w.getA().getBalance()-money);//if yes
         w.setNewMoney(w.getA().getBalance());//will set in the new money after withdrawal 
         w.getNewMoney();
         transactionsOperations.add(w);//any withdrawal operation is created is add to the transactionsOperations ArrayList
      
         System.out.println("Successfully credited");//if the operation works fine
          System.out.println("-----------------");
         System.out.println("The money after withdrawal operation is " + w.getNewMoney() );
         w.setStatus("The withdrwal operation is successfully done " + "----"+ "and the new Balance is " +w.getNewMoney() );//ststus of the operation
          }
          else// if the money the user want to withdrwawl < his balance
          {
              System.out.println("there an error , your Balance is lower than the amount of money you want to withdrawal");
          }
          return B.getA().getBalance();
      }//end of the method
     
     // method of transfering amount of money between two accounts
     //double balance is the money which be transferd
    //which take the Account who will transfer the money and the accont who get the money and amount of transferd moey
public static double transferMoney(ArrayList<Transaction >transactionsOperations,Transaction B,Transfer f,double balance,String uni_number,Account A1,String s){
   
    if(f.getA().getBalance()>balance){//checks if the amount of transferd money  > his balance
    f.getA().setBalance(f.getA().getBalance()-balance);//set in the transfer account the new balance after transfering
    f.getA().getBalance();
    A1.setBalance(balance+A1.getBalance());//set  the balance of account who get the transferd money 
    A1.getBalance();
    f.setAmountOfTransferdMoney(balance);//set the amount of transfrd money
    f.getAmountOfTransferdMoney();
    transactionsOperations.add(f);//any Transfer operation is created is add to the transactionsOperations ArrayList
        System.out.println("The amount of transferd money during transfer operation is " +  f.getAmountOfTransferdMoney() );
    // getting the maximum value of the amount of transferd money 
     if(balance>max){// get the maximum amount of transferd money
        max=balance; //set in max the maximum transferd money
     }
    System.out.println("Successfully transfered");//if the operation works fine
    System.out.println("---------------------");
    f.setStatus("The Transfer operation is done successfully " +"---"+ " with transferd money is "+balance);// the status of transfer opertion ,succes or not
    System.out.println("the maximum value is " + max + "\n "+ "and The account which transfer this money is " +B.getA());//printing the maximun
    System.out.println("the account who get the money is " + A1);//and accounts affected
    }
    
    else{//if  the money the user want to transfer < his balance
        System.out.println("there are an error, your Balance can't allow you to do this operation ,");
    }
        return B.getA().getBalance();
    }//end of the method

// method of sorting Account List according to civil id
    public static void sortList(ArrayList<Account> accountNumbers){
       Collections.sort(accountNumbers, new Comparator <Account> (){//using collections.sort to sort rhe list according to the civil id asscending
       @Override//overridden compare method to compare between two civil id
       public int compare (Account S,Account o){ return S.getH().getCivil_id().compareTo(o.getH().getCivil_id());}}); 
       
    }//end of method
    // method to saving all Accounts data in the text file and save it in the java project
    public static void printInFile(ArrayList<Account> accountNumbers){//saving the data in the accountNumbers ArrayList 
        try{// for exception handling 
            File d=new File ("C:\\Users\\user\\Documents\\NetBeansProjects\\Basmalla_2051710203\\m251\\  Account .txt");//URL of the text file which the acccounts will save in it
            //d is an object from type File
            PrintWriter pr=new PrintWriter(d);//open PrintWriter stream 
            for(Account v : accountNumbers)//for each loop to get the data of each account and save it into text file
                pr.println(v.getH()+ "Account number is" + v.getUniqueAccountNumber() + " and the balance is " + v.getBalance());
            pr.close();//closs PrintWriter stream
        }
        catch(IOException e){//catch if any error happend 
            System.out.println("there is an error : " + e);//tell the user if there are any error 
        }
    }//end of the method
    
    // method to saving all Transactions data in the text file and save it in the java project
   public static void printToFile(ArrayList<Transaction >transactionsOperations){//saving the data in the transactionsOperations ArrayList
        try{// for exception handling
            File i=new File ("C:\\Users\\user\\Documents\\NetBeansProjects\\Basmalla_2051710203\\m251\\ Transaction .txt");////URL of the text file which the TransActions will save in it
            //i is an object from type File
            PrintWriter pr=new PrintWriter(i);//open PrintWriter stream
            for(Transaction o : transactionsOperations )//for each loop to get the data of each transaction and save it into text file
                pr.println(o.getA() + "" + "\n" + o.getStatus() + " " + o.dateCreated );
            pr.close();//closs PrintWriter stream
        }
        catch(IOException e){//catch if any error happend
            System.out.println("there is an error : " + e);////tell the user if there are any error
        }//end of catch
    }//end of method
    

}//end of Bank class
