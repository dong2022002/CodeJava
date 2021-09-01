package object;

public class Music {
    private String name;
    private String author;

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Music() {

    }

    public Music(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Music(String line) {
        String[] s = line.split(",");
        this.name = s[0];
        this.author = s[1];
    }

    @Override
    public String toString() {
        return "Bai hat co ten:" + name + "\n Tac gia      :" + author + "\n";
    }
}
