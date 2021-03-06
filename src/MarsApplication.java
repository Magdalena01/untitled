public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();

        System.out.println("Zwiększamy prędkość do 3.");

        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na - 90.");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temperatury. ");
        spirit.checkTemperature();

        MarsRobot opportunity = new MarsRobot();
        opportunity.speed = 200;
        opportunity.temperature = 100;
        opportunity.status = "Poszukiwania";
        opportunity.checkTemperature();
        opportunity.showAttributes();

        opportunity.checkStatus();
    }
}
