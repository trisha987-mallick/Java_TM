public class Veriable {
    public static void main(String[] args) {

        //primetive
        byte a1 = 127; //2^8=256/2 =-128 to 127
        short a2 = 29; //2^9=256/2 =-128 to 127
        int a3 = 29;
        long a4 = 458973345;
        char name = 'T';
        boolean islogin = false;
        // float "T"
        float marks = 43.67543299f;
        double score = 67.5687429;
        System.out.println("Hello :" +a1);
        System.out.println("Hello :" +a2);
        System.out.println("Hello :" +a3);
        System.out.println("Hello :" +a4);
        System.out.println("Hello :" +name);
        System.out.println("Hello :" +islogin);
        System.out.println("Hello :" +marks);
        System.out.println("Hello :" +score);

        //non-primetive
        String fullname = "Trisha Mallick";
        System.out.println("Hello :" + fullname);

        int arr[]={10,20,30};
        System.out.println(arr[1]);
    }
}