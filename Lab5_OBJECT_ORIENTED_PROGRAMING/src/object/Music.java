package object;

public class Music {
    public String name;
    public String author;
    public Music() {
        
    }
    public Music(String name,String author) {
        this.name=name;
        this.author=author;        
    }
    @Override
    public String toString() {
        return "Bai hat co ten:"+name+
               "\n Tac gia      :"+author;
    }
}
