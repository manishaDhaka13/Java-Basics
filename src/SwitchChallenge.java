public class SwitchChallenge {
    public static void main(String[] args){
        char c='g';

        switch (c){
            case 'a': System.out.println("the charcater is " + c +" and the NATO phonetic alphabet for it is Able");
            break;
            case 'b': System.out.println("the charcater is " + c +" and the NATO phonetic alphabet for it is Baker");
                break;
            case 'c': System.out.println("the charcater is " + c +" and the NATO phonetic alphabet for it is Charle");
                break;
            case 'd': System.out.println("the charcater is " + c +" and the NATO phonetic alphabet for it is Dog");
                break;
            case 'e': System.out.println("the charcater is " + c +" and the NATO phonetic alphabet for it is Easy");
                break;
            default : System.out.println("does not match");
            break;

        }
    }

}
