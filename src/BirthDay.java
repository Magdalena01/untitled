import java.util.StringTokenizer;

public class BirthDay {
    public static void main(String[] args) {

        String birthDay = "30/06/1992";

        tokenizeBirthDay(birthDay);
    }

    static void tokenizeBirthDay (String birthDay) {
        StringTokenizer st = new StringTokenizer(birthDay, "/");
        System.out.println("First string token (day): " + st.nextToken());
        System.out.println("Second string token (day): " + st.nextToken());
        System.out.println("Third string token (day): " + st.nextToken());
    }
}
