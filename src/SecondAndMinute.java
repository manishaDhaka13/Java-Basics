public class SecondAndMinute {
    public static void main(String[] args){

        System.out.println(getDurationString(-3650));
        System.out.println(getDurationString(-45,55));
    }
    public static String getDurationString(int seconds){
        if(seconds <0){
            return "Invalid Value";
        }
        return getDurationString((seconds/60),(seconds%60));

    }

    public static String getDurationString(int minutes , int seconds){

        if(minutes<0 || (seconds <0 || seconds >59 )){
            return "Invalid Value";
        }
        String time=(minutes/60)+"h "+(minutes%60)+"m "+seconds+"s ";
        return time;
    }
}
