public class Fan {
    
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public int getSpeed(){

        return speed;
    }

    public boolean getStatus(){

        return on;
    }

    public double getRadius(){

        return radius;
    }

    public String getColor(){

        return color;
    }

    public void setSpeed(int inputSpeed){

        speed = inputSpeed;
    }

    public void setStatus(boolean inputStatus){

        on = inputStatus;
    }

    public void setRadius(double inputRadius){

        radius = inputRadius;
    }

    public void setColor(String inputColor){

        color = inputColor;
    }

    public String toString(){

        if (on) {

            return "\nCurrent Speed: " + speed + "\nFan Radius: " + radius + "\nFan Color: " + color + "\nFan is currently on";
        } else {

            return "\nFan Radius: " + radius + "\nFan Color: " + color + "\nFan is currently off";
        }
    }
}
