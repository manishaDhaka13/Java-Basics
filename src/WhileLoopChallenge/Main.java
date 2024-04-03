package WhileLoopChallenge;

public class Main {
    public static void main(String[] args){
        int sumEvenNo=0;
        int sumOddNo=0;
        int totalEvenNo=0;
        int j=5;
        while(j<=20){
            if(isEvenNumber(j)){
                System.out.println("the no "+j+" is even");
                totalEvenNo++;
                sumEvenNo+=j;
                if(totalEvenNo==5){
                    break;
                }
            }
            else{
                System.out.println("the no is "+j+ " odd");
                sumOddNo+=j;
            }
            j++;
        }
        System.out.println("the sum of even no is "+sumEvenNo+ " and the sum of odd no is "+ sumOddNo);
    }
    public static boolean isEvenNumber(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

}

