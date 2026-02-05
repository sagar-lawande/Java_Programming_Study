class Bank{
    int bal=2000;
    void withdraw(int amt){
       synchronized(this){

        if(amt<=bal){
            System.out.println("Amount "+amt+" Withdraw succesfully....");
            bal=bal-amt;
            System.out.println("Total available Balance = "+bal);
        }else{
            System.out.println("Enter Valid Amount");
        }
    }
    }

    
}