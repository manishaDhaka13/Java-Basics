public class ForStatement {
     public static void main(String[] args){
        // int counter=1;
         for( int counter=1; counter<5; counter++){
             System.out.println("counter is "+ counter);
         }
         int amount =10000;
         for(double rate=1.0; rate<=5.0; rate+=.25){
             System.out.println("the interest rate is "+ rate + " and the amount is "+ amount+" the calculated interest is " + calculateInterest(amount,rate));
         }
     }
        public static double calculateInterest(double amount , double interestRate){
         return (amount * (interestRate/100));
        }
}
