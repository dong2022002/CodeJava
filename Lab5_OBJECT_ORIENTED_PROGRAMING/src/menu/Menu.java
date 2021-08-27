package menu;

public enum Menu{

    THOAT(0),
    PERSON(1),
    ANIMAL(2),
    CAR(3),
    COMPUTER(4),
    MUSIC(5),
    PLANT(6);


    public int value;
    private Menu(int value){
        this.value=value;
    }
}


