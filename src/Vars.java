import java.text.DecimalFormat;

public class Vars {
    public static void main(String[] args) {


        double x = 12E22; //12 * 10 ^ 22;
        double y = 12E-42; // 12 * 10 ^ -22;

        DecimalFormat decimalFormat = new DecimalFormat("#. ###################3");

        System.out.println(y);
        System.out.println(decimalFormat.format(y));

        //int i = 350000;
        int i = 3_500_000;

        int a = 5;
        int b = 2;
        System.out.println(a % b);


    }
}