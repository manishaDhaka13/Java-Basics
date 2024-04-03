public class ForStatementChallenge {
    public static void main(String[] args){
        int counter=0;
        int[] a={0,0,0,0,0};
        for(int i=1; (counter<5 && i<=1000);i++){
            if((i%3==0)&&(i%5==0)){

                System.out.println("the "+ i + " is divisible by 3 and 5");
                a[counter]=i;
                counter++;
            }
        }

        int sum=0;
        for (int i=0;i<5;i++){
            sum=sum+a[i];

        }
        System.out.println("sum is " + sum);

        int j=1;
        while(true){
            if(j==5){
                break;
            }
            System.out.println("value of j is "+j);
            j++;

        }
        boolean isReady=false;
        do{
            System.out.println("isReady="+isReady);
        }
        while(isReady);

    }



}
