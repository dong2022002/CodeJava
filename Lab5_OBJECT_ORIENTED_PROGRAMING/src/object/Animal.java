package object;

public class Animal {
    
    public String name;
    public String habitat;
    
    public Animal() {
            
    }
    public Animal(String name,String habitat) {
        
        this.name=name;
        this.habitat=habitat;
        
    }
    public Animal(String line) {
        String[] s=line.split(",");
        this.name=s[0];
        this.habitat=s[1];
    }
    @Override
    public String toString() {
        return 
             "Ten goi        :"+name+
             "\nMoi truong song:"+habitat;
           
    }
    
}
