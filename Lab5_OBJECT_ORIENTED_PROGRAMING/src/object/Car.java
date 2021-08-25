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
    @Override
    public String toString() {
        return "Hang xe   :"+hangXe+
               "\nToc do toi da:"+speed+
               "\nMau sac xe   :"+color;
    }
}
