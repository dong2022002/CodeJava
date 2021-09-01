
public class App {

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.xuatMenu();
            EnumMenu enumMenu = menu.chonMenu();
            switch (enumMenu) {
                case GIAITOAN:
                    menu.runToanSo();
                    break;
                case HINHHOC:
                    menu.runHinhHoc();
                    break;
                case CURRENCY:
                    menu.runCurrency();
                    break;
                case LISTSTRING:
                    menu.runListString();
                    break;
                case TACHCHUOITHANHMANG:
                    menu.runTachChuoiThanhMang();
                    break;
                case HASHMAPJSON:
                    menu.runHashMapJson();
                    break;
                default:
                    menu.in.close();
                    return;
            }
        }

    }
}
