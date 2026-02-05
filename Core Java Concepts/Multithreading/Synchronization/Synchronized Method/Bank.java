class Bank{
    int bal=2000;
   synchronized void withdraw(int amt){
        if(amt<=bal){
            System.out.println("Amount "+amt+" Withdraw succesfully....");
            bal=bal-amt;
            System.out.println("Total available Balance = "+bal);
        }else{
            System.out.println("Enter Valid Amount");
        }
    }

    
}