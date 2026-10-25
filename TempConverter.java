public class TempConverter {
    public static void main(String[] args) {
        int tempC=98;
        System.out.println("converted tempereture is: "+celsiusToFahrenheit(tempC));
        System.out.println("converted tempereture is: "+celsiusToFahrenheit(78));
    }
    static double celsiusToFahrenheit (double celsius){
        double F= (celsius*9/5)+32;
        return F;
    }
}