package object;

public class Plant extends Animal {
    public String soil;
    public Plant() {}  
    public Plant(String species,String name,String habitat,String soil) {
        super(species,name,habitat);
        this.soil=soil;
    }  
    @Override
    public String toString() {
        return super.toString()+
             "\nLoai dat       :"+soil;   
    }
}
