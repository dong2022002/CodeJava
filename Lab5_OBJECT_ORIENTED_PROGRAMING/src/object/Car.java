package object;



public class Car {
    public String hangXe;    
    public double speed;
    public String color;
    public Car() {
        
    }
    public Car(String hangXe,double speed,String color) {
         this.hangXe=hangXe;         
         this.speed=speed;
         this.color=color;           
    }
    public Car(String line) {
        String[] s=line.split(",");
        this.hangXe=s[0];
        this.speed=Double.parseDouble(s[1]);
        this.color=s[2];
    }
    @Override
    public String toString() {
        return "Hang xe   :"+hangXe+
               "\nToc do toi da:"+speed+" km/h"+
               "\nMau sac xe   :"+color;
    }
}
