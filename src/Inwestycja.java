public class Inwestycja {

    public static void main(String[] args) {

        int inwestycjaAmount = 14000;
        calculateInwestycja(14000);

    }

    static void calculateInwestycja(int inwestycjaAmount) {

    double inwestycjaFirstYear = inwestycjaAmount * 1.4;
    double inwestycjaSecondYear = inwestycjaFirstYear - 1500;
    double inwestycjaThridYear = Math.round(inwestycjaSecondYear * 1.12);

        System.out.println("Kwota inwestycji po pierwszym roku: " + inwestycjaFirstYear);
        System.out.println("Kwota inwestycji po drugim roku: " + inwestycjaSecondYear);
        System.out.println("Kwota inwestycji po trzecim roku: " + inwestycjaThridYear);

}

}
