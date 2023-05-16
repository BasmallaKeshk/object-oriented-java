
package basmalla_2051710203;

import java.util.*;
//the Testing class
public class Testing1 {//start of the class
    public static void main(String[] args){//start of main method
   ArrayList<Account>savingAccount=new ArrayList<>();//declare and creating list from type Account to save all accounts in it
   ArrayList<Transaction>savingTransactions=new ArrayList<>();////declare and creating list from type Transaction to save all happend Transactions in it
   String u="";//the nuique account number is saved in it
   String u1;// account number the money will be transferd to  him
   double b;//balane of the user
   String color;//variable of eye-color of holder 
   Bank C=new Bank();//object from type Bank to can call all static methods
   Date d=new Date();//object from Date
   //Withdrawal w=new Withdrawal();//object from withdrwawl class
   String name;//variable to save in it the name of the user
   String s="";//status of any happend transaction
   double tall;//variable to save in it the tall of the user
   String ans;//answer of any question to the user
   String ans2;//answer of any question to the user
   double newMoney=0.0;//variable  to save in it the new money of any transaction
   double money;//variable to save in it the money which the user will put it to do any transaction
   double transferdMoney=0.0;//variable to save the amout of transferd money
   //Transfer f=new Transfer();//object from transfer class
  
   
   int iterator=0;//iterator to be increased after any founf similer accounts number according to civil id
        for (int i = 0; i < 3; i++) {  //for loop to create objects and do some operations on them 
        Scanner c=new Scanner (System.in);//create of Scanner streamer
   System.out.println("Hello , To create an Bank Account ,please set your information carfully");
   System.out.println("creation Step");
   System.out.println("Enter your civil_id");//ask the user to put his civiid
   String civil_id1=c.next();
         for (int j = 0; j <savingAccount.size(); j++) {//first to check if there are an similler civil id has created before 
                 if(civil_id1.equals(savingAccount.get(j).getH().getCivil_id())){//if there are similer accounts
                         System.out.println("there are an error ,this account is already exists"); //printing an error 
                         System.out.println("Enter your civil_id");//ask again to continue on the next object
                         civil_id1=c.next();//put the civilid in the variable civil_id1
                   }
                 else{//if not 
                     iterator++;//increase the operator
                 } 
     }//end of inner loop
   System.out.println("Enter your name");//ask user to set his name
    name=c.next();//put the answer in name variable
   
   System.out.println("Enter your tall ");//ask the user to set his tall
    tall=c.nextDouble();//put the answer in tall variable
   
   System.out.println("Enter your first Balance");//ask the user about the first balance to crate an account with it
   b=c.nextDouble();//put the answer in the b variable
  
   System.out.println("Enter your color of eye");//ask the user about the color of eye 
   color=c.next();//pit the answe in the color variable
   
   Holder H1=new Holder();//crate an oblect from type Holder to can get all information about the holder
   Account A1=new Account(u,H1,b);//creaye an object from Account to can get all information of the Holder 
 
   H1.setCivil_id(civil_id1);//put the civilid in Holder civil id
   H1.setName(name);//put the name in Holder name
   H1.setTall(tall);//put the tall in Holder tall
   A1.setBalance(b);//put the Balance b in Holder b
   H1.setEye_color(color);//put the color in Holder color
   Transaction t=new Transaction(A1,b,d,s);//create an object from type Transaction
   Deposit d2=new Deposit(A1,b,d,s);//create an object from Deposit 
   Withdrawal w=new Withdrawal(A1,b,d,s);
   Transfer f=new Transfer(A1,b,d,s);
   System.out.println("your account number is : " + Bank.createAccountNumber(A1, H1,civil_id1, savingAccount) );//method of creating account 
   System.out.println("Transaction Step");
   ////ask the user if he want to make one of any Transactions (Deposit or transfer or withdrawal)
   System.out.println("Do you want deposit any money in your account");//ask user if he want to deposit money
   ans=c.next();//get the answer from the user
     if("yes".equals(ans)){//if answer is true
         System.out.println("how much money you want to deposit in your account ?");//ask him about amount of money he want to deposit
         money=c.nextDouble();//get the answer from the user and save it in the variable money //money is deposited money
    Bank.depositMoney(savingTransactions,t, money, d2,d,newMoney,s);//method of Deposit
     }//end if of deposit
     else{//if the user did not want to deposit ask about withdrawal 
         System.out.println("Do you want to withdrawal money ?");//ask if he want to withdrawal money
         ans2=c.next();//input the answer 
         if("yes".equals(ans2)){//if the answer is true
             System.out.println("Then,How much money you want to withdrawal");//ak about amout of money he want to withdrawal 
             money=c.nextDouble();//input the answer in money //money is withdrawaled money
             Bank.withDrwalMoney(savingTransactions, money, t, w, d, newMoney,s, A1);//withdrawal method
         }//end if
         else{//if the user did not want to deposit or withdrwal then ask him about transfer
             System.out.println("Do you want to transfer money ");//ask the user if he want to transfer the money
             ans=c.next();//set the answer in this variable ans
             if("yes".equals(ans)){//if the answe is true
                 System.out.println("enter the account number you want to transfer money");//ask the user about the acountnumber he want to transfer to it
                 u1=c.next();
                 System.out.println("enter amount of money you want to transfer");//ask about amount of transferd money
                 transferdMoney=c.nextDouble();//set the amount of transferd money in this transferdMoney variable
                 for (int j = 0; j <savingAccount.size(); j++) {//loop to the account who will get the transferd money
                     Account A=savingAccount.get(j);//initialize the account A
                     
                     if(u1.equals(savingAccount.get(j).getUniqueAccountNumber()))//chek if there are an exist account number 
                        //if true calling the transfer method
                        Bank.transferMoney(savingTransactions,t,f,transferdMoney,u,A,s);
             }//end of loop for to get an account who get the transferd money
         }//end of if for transfer question
       
   }//end for else of  if the user didnot want to deposit or withdrawal
           }//else about asking about with drawal
   
   }//end of outer loop 
   Bank.sortList(savingAccount);//method to sort the list according to civil id
   C.setAccountNumbers(savingAccount);//set savingAccount in AccountNumbers
   //System.out.println(C.getAccountNumbers());//printing final list of Accounts
   
   Bank.setTransactionsOperations(savingTransactions);//set savingTransactions in TransactionsOperations
   //System.out.println(Bank.getTransactionsOperations());//printing final list of transactions
   Bank.printInFile(savingAccount);//save tha data of savingAccount in text file
   Bank.printToFile(savingTransactions);//save the data of savingTransactions in text file
      
    }//end of main method block

}//end of class block

