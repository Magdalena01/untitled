public class Hwd {
    public static void main(String[] args) {
        HwdDimensions hwdDimensions = new HwdDimensions();
        hwdDimensions.weight = 15;
        hwdDimensions.height = 25;
        hwdDimensions.depth = 30;

        System.out.println("Weight " + hwdDimensions.weight);
        System.out.println("Height " + hwdDimensions.height);
        System.out.println("Depth " + hwdDimensions.depth);

HwdDimensions hwdDimensions2 = new HwdDimensions();
HwdDimensions hwdDimensions3 = new HwdDimensions();
HwdDimensions hwdDimensions4 = new HwdDimensions();

        System.out.println("Number of instances " + HwdDimensions.numberOfinstance);
    }
}
class HwdDimensions{
    int height;
    int weight;
    int depth;
    static int numberOfinstance = 0;

    public HwdDimensions () {
        numberOfinstance++;


    }
}