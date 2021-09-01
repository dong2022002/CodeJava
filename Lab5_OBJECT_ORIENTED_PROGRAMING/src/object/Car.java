package object;

public class Car {
    private String hangXe;
    private double speed;
    private String color;

    public String getColor() {
        return color;
    }

    public String getHangXe() {
        return hangXe;
    }

    public double getSpeed() {
        return speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Car() {

    }

    public Car(String hangXe, double speed, String color) {
        this.hangXe = hangXe;
        this.speed = speed;
        this.color = color;
    }

    public Car(String line) {
        String[] s = line.split(",");
        this.hangXe = s[0];
        this.speed = Double.parseDouble(s[1]);
        this.color = s[2];
    }

    @Override
    public String toString() {
        return "Hang xe   :" + hangXe + "\nToc do toi da:" + speed + " km/h" + "\nMau sac xe   :" + color + "\n";
    }
}
