public class UseOf_throw{

// Method to withdraw amount
    static void withdraw(int balance, int amount) {

        // Business rule check
        if (amount > balance) {
            // Manually throwing exception
            throw new ArithmeticException("Insufficient Balance");
        }

        // Executes only if exception is NOT thrown
        balance = balance - amount;
        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance = " + balance);
    }

    public static void main(String[]args){
        System.out.println("Program fot the use of throw keyword.....");
        try {
            // Calling method that may throw exception
          UseOf_throw obj=new UseOf_throw();
          obj.withdraw(5000, 7000);
        }
        catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Exception Caught: " + e.getMessage());
        }

        System.out.println("Program Ended Normally");
    }


    }
