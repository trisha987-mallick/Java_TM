public class leapyear {
    public static void main(String[] args) {
          int year=1900;
        // System.out.println("year is leapyear:"+isLeapyear(year));
        if(isLeapyear(year)){
            System.out.println(year+" is leapyear");
        }else{
            System.out.println(year+" isn't leapyear");
        }
    }
    static boolean isLeapyear(int y){
        return (y%4==0 && y%100!=0)||(y%400==0);  
    }
}
