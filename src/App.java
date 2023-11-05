import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
       
        Fan firstFan = new Fan();
        Fan secondFan = new Fan();

        System.out.println("\nWe have created two fans, enter the settings for the first fan:");
        
        System.out.println("\nEnter fan speed number(1 [SLOW], 2 [MEDIUM], 3 [FAST]): ");
        int fanOneSpeed = input.nextInt();
        firstFan.setSpeed(fanOneSpeed);

        System.out.println("\nEnter fan radius: ");
        double fanOneRadius = input.nextDouble();
        firstFan.setRadius(fanOneRadius);

        System.out.println("\nSet a color: ");
        String fanOneColor = input.next();
        firstFan.setColor(fanOneColor);

        System.out.println("\nTurn fan on or off(true or false): ");
        boolean fanOneStatus  = input.nextBoolean();
        firstFan.setStatus(fanOneStatus);

        System.out.println("\nSettings for the second fan: ");
        System.out.println("\nEnter fan speed number(1 [SLOW], 2 [MEDIUM], 3 [FAST]): ");
        int fanTwoSpeed = input.nextInt();
        secondFan.setSpeed(fanTwoSpeed);

        System.out.println("\nEnter fan radius: ");
        double fanTwoRadius = input.nextDouble();
        secondFan.setRadius(fanTwoRadius);

        System.out.println("\nSet a color: ");
        String fanTwoColor = input.next();
        secondFan.setColor(fanTwoColor);

        System.out.println("\nTurn fan on or off(true or false): ");
        boolean fanTwoStatus  = input.nextBoolean();
        secondFan.setStatus(fanTwoStatus);

        input.close();

        System.out.println("\nFan 1 settings: " + firstFan.toString());
        System.out.println("\nFan 2 settings: " + secondFan.toString());

    }
}
