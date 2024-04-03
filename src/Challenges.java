public class Challenges {
    public static void main(String[] args){

    }
    public static long toMillesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1L;
        }
        long milesPerHour=(long)(kilometersPerHour*.6231);
        return (milesPerHour);
    }
}
