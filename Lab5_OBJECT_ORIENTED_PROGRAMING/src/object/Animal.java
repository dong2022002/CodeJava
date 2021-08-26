package object;

public class Animal {
    public String species;
    public String name;
    public String habitat;
    
    public Animal() {
            
    }
    public Animal(String species,String name,String habitat) {
        this.species=species;
        this.name=name;
        this.habitat=habitat;
        
    }
    @Override
    public String toString() {
        return "Dong vat loai  :"+species+
             "\nTen goi        :"+name+
             "\nMoi truong song:"+habitat;
           
    }
    
}
