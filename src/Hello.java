public class Hello {
    public static void main(String[] args){
        System.out.println("hello World");
        boolean isAllian=false;
        if(!isAllian){
            System.out.println("look! it a allian");
            System.out.println("how exciting");
        }
        int topScore=80;
        if(topScore<100){
            System.out.println("you got a high score");
        }

        int secondTopScore=81;
        if(topScore > secondTopScore && topScore <100){
            System.out.println("greater than secondTopScore but less than 100 ");
        }
}
}
