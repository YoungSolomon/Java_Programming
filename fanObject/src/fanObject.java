public class fanObject {
    private int speed;
    private boolean on;
    private double radius;
    String color;

    fanObject(int speed,boolean on,double radius,String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void defaultFan() {
        speed = 1;
        on = false;
        radius = 5;
        color = "Blue";
    }

    public String getSpeed(int speed) {
        String result = "";
        if (speed == 1) {
            result = "SLOW";
        }
        if (speed == 2) {
            result = "MEDIUM";
        }
        if (speed == 3) {
            result = "FAST";
        }
        return result;
    }

    public void getOn() {

    }

    public void getRadius() {

    }

    public void getColor() {

    }   

    public String toString() {
        if (on) {
            return "Fan speed is " + this.getSpeed(speed) + ". Color is " + color + ". and the radius is " + radius + ".";
        } else {
            return ("Fan color is " + color + ". Fan radius is " + radius + ". The fan is off.");
        }
    }
    public static void main(String[] args) throws Exception {
        fanObject fan1 = new fanObject(3, true, 10.0, "yellow");
        fanObject fan2 = new fanObject(2, false, 5.0, "blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
