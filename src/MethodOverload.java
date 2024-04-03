public class MethodOverload {

    public static void main(String[] args){
         System.out.println("5ft ,8 inch=" + convertToCentimeters(5, 8)+"cm");
         System.out.println("68 inches=" +convertToCentimeters(68)+ "cm");
    }
    public static double convertToCentimeters(int heightInches){
        double heightCm=heightInches*2.54;
        return heightCm;
    }
    public static double convertToCentimeters(int heightFeet, int heightInches){
        heightInches=heightFeet*12+heightInches;
        double heightCm=convertToCentimeters(heightInches);
        return heightCm;
    }
}
