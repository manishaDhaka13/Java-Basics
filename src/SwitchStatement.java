public class SwitchStatement {

    public static void main(String[] args){
         byte b=6;
        int value=b;
        String month="a";
        System.out.println(month + " is in the " +getQuarter(month) + " quarter");
        switch(value){
            case 1:{ System.out.println("value was " +value);
                System.out.println("hello");
            break;}
            case 2: case 3: case 4: System.out.println("value was " + value);
            break;
            default : System.out.println("value was not 1, 2,3,4,5 " );  // default can be written anywhere in switch statement but
                                                                       // and default match if no other value match even they are return
                                                                       // after default if we don't use break in default fall through happen
                                                                      // just like case
             //break;
            case 5: System.out.println("value was " + value);
                break;

        }
        switch(value){
            case 1->  System.out.println("the value is" +value);
            case 2 ,3,4-> System.out.println("the value is" +value);              // enhanced switch fall through does not happen
            default ->  System.out.println("value was not 1, 2,3,4,5 " );
            case 5->  System.out.println("value was " + value);

        }


    }
    public static String getQuarter(String month){

//        switch(month){
//            case "january" : case "febuary": case "march": return "first";
//            case "april":
//            case "may":
//            case "june":
//                return "second";
//            case "july":
//            case "august":
//            case "september":
//                return "third";
//            case "october":
//            case "november":
//            case "december":
//                return "forth";
//
//        }
//        return "bad";

        return switch(month){
            case "january" ,"febuary","march"-> "first";
            case "april","may","june"-> {yield "second";}
            case "july","august","september"-> "third";
            case "october","november","december"-> "forth";
            default -> {
             String badResponse =month + " is bad";
             yield badResponse;
            }
        };
    }

}
