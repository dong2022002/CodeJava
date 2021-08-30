package menu;

public enum Menu{

    THOAT(0),
    PERSON(1),
    ANIMAL(2),
    CAR(3),
    COMPUTER(4),
    MUSIC(5),
    PLANT(6),
    //
    DSSINHVIEN(7),
    //Menu Quan ly sinh vien
    //tang
    SOFTTANGTHEOTEN(8),    
    SOFTTANGTHEOHOTEN(9),
    SOFTTANGTHEOTUOI(10),
    SOFTTANGTHEOCHIEUCAO(11),
    SOFTTANGTHEOCANNANG(12),
    SOFTTANGTHEOTINCHI(13),
    SOFTTANGTHEONAMSINH(14),
    
    //giam
    SOFTGIAMTHEOTEN(15),
    SOFTGIAMTHEOHOTEN(16),
    SOFTGIAMTHEOTUOI(17),
    SOFTGIAMTHEOCHIEUCAO(18),
    SOFTGIAMTHEOCANNANG(19),
    SOFTGIAMTHEOTINCHI(20),
    SOFTGIAMTHEONAMSINH(21),
    //
    ADD1SV(22),
    //XOA
    XOATEN(23),
    XOAHOTEN(24),
    XOAKHOA(25),
    XOALOP(26),
    XOANAMSINH(27);

    public int value;
    private Menu(int value){
        this.value=value;
    }
}


