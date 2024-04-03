public class DigitSumChallenge {
    public static void main(String[] args){
        System.out.println("1298634 sum of digit is "+ sumDigits(1298634));
       //float f=5.25; //error incompatible types: possible lossy conversion from double to float
        float f=5;
        float s=5/2;
        System.out.println(f);  // 5.0
        System.out.println("tjhe value of s is " +s);  // 2.0
        float s1=5f/2;
        System.out.println("tjhe value of s1 is " +s1);  // 2.5
       // float s2=5.0/2; error  possible lossy conversion from double to float
 
 
        float t=5.25f;
        System.out.println(t); // 5.25
       // byte b=129; error java: incompatible types: possible lossy conversion from int to byte
        byte b=78;
        System.out.println(b);
        int i=127;
       // byte c= i+1; error incompatible types: possible lossy conversion from int to byte


    }
    public static int sumDigits(int number){
        int sumDigit=0;
        int digit=0;
        int numb=number;
        if(number < 0){
            return -1;
        }
        for(int i=1;numb!=0;i++){
            digit=digit+numb%10;
            numb=numb/10;
            


        }

        return digit;
    }
}
