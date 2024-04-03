package ThePrimeNumberChallenge;

public class Main {
    public static void main(String[] args){

        System.out.println(" 0 is "+ ((isPrime(0))? " " :"NOT " ) + "Prime Number");
        System.out.println(" 2 is "+ ((isPrime(2))? " " :"NOT " ) + "Prime Number");
        System.out.println(" 36 is "+ ((isPrime(36))? " " :"NOT " ) + "Prime Number");
        System.out.println(" 13 is "+ ((isPrime(13))? " " :"NOT " ) + "Prime Number");
        int counter=0;
        for(int i=1;counter<3; i++){
            int wholeNumber=(int)(Math.random()*1000);
            if(isPrime(wholeNumber)){
                System.out.println("the no "+wholeNumber+ " is Prime Number");
                counter++;

            }
//            if(counter==3){
//                break;
           // }

        }
    }

    public static boolean isPrime(int wholeNumber){
        if(wholeNumber<=2){
            return (wholeNumber==2);
        }
        for(int divisor=2; divisor <= wholeNumber/2 ; divisor++ ){
            if(wholeNumber%divisor==0){
                return false;
            }
        }
        return true;
    }

}