public class printDayOfWeekChallenge {
    public static void main(String[] args){


        int day=5;
        printDayOfWeek(day);
        printWeekDay(day);
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek =  switch(day){
            case 1-> "monday";
            case 2-> "tuesday";
            case 3-> "wednesday";
            case 4-> "thrusday";
            case 5-> "friday";
            case 6-> "saturday";
            case 7-> "sunday";
            default -> "invalid input";
        };
        System.out.println(day +" stands for  " +dayOfWeek);

    }

    public static void printWeekDay(int day){
        String dayOfWeek="invalid day";
        if(day==1){
            dayOfWeek="monday";
        }
        else if(day==2){
            dayOfWeek="tuesday";
        }
        else if(day==3){
            dayOfWeek="wednesday";
        }
        else if(day==4){
            dayOfWeek="thrusday";
        }
        else if(day==5){
            dayOfWeek="friday";

    }
        else if(day==6){
            dayOfWeek="saturday";

        }
        else if(day==7){
            dayOfWeek="sunday";

        }
        System.out.println(day +" stands for  " +dayOfWeek);


}

}
