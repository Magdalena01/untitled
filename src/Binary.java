public class Binary {
    public static void main(String[] args) {
        // & - iloczyn bitowy
        // | - suma bitowa
        // ^ - XOR (eXclusive OR)
        //~ - negacja bitowa
        // << przesunięcie w lewo
        // >> przesunięcie w prawo

        System.out.printf("%10sz\n", Integer.toBinaryString(5));
        System.out.printf("%10sz\n", Integer.toBinaryString(5 << 3));


        //11 > 0
        //01 > 1
        //11 > 1
        //00 > 0

        System.out.println("negacja 5: " + (~5));
        //00110101
        //11001010


        int a = 6;
        int b = 5;
        int c = calculate(a, b);

   show (a,b,c);

    }

    static void show(int a, int b, int c){
        System.out.println("operacja: " + a + " |" + b + " = " + c);
        System.out.printf("%10s\n", Integer.toBinaryString(a));
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("----------");
        System.out.printf("%10s\n", Integer.toBinaryString(c));
        System.out.println(c);
    }

    static int calculate(int a, int b) {
        return a | b;
    }
}










