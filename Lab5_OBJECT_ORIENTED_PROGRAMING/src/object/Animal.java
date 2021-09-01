package object;

public class Animal {

    private String name;
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name, String habitat) {

        this.name = name;
        this.habitat = habitat;

    }

    public Animal(String line) {
        String[] s = line.split(",");
        this.name = s[0];
        this.habitat = s[1];
    }

    @Override
    public String toString() {
        return "Ten goi        :" + name + "\nMoi truong song:" + habitat + "\n";

    }

}
