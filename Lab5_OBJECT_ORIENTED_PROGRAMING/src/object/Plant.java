package object;

public class Plant {
    private String name;
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public String getName() {
        return name;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plant() {
    }

    public Plant(String name, String habitat) {
        this.name = name;
        this.habitat = habitat;
    }

    public Plant(String line) {
        String[] s = line.split(",");
        this.name = s[0];
        this.habitat = s[1];
    }

    @Override
    public String toString() {
        return "Ten goi        :" + name + "\nMoi truong song:" + habitat + "\n";

    }
}
