
import menu.EnumMenu;
import menu.Menu;
import menu.Run;

public class App {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Run run = new Run();
        while (true) {
            menu.dsMenu();
            EnumMenu enumMenu = menu.chonMenu();
            switch (enumMenu) {
                case PERSON:
                    run.runPerson();
                    break;
                case ANIMAL:
                    run.runAnimal();
                    break;
                case CAR:
                    run.runCar();
                    break;
                case COMPUTER:
                    run.runComputer();
                    break;
                case MUSIC:
                    run.runMusic();
                    break;
                case PLANT:
                    run.runPlant();
                    break;

                case TAODSSINHVIEN:
                    run.runDSSinhVien();
                    break;

                case DSSV:
                    run.runDSSV();
                    break;

                case SOFTTANGTHEOTEN:
                    run.runSapXepTangTheoTen();
                    break;
                case SOFTTANGTHEOHOTEN:
                    run.runSapXepTangTheoHoTen();
                    break;
                case SOFTTANGTHEOTUOI:
                    run.runSapXepTangTheoTuoi();
                    break;
                case SOFTTANGTHEOTINCHI:
                    run.runSapXepTangTheoTinChi();
                    break;
                case SOFTTANGTHEOCHIEUCAO:
                    run.runSapXepTangTheoChieuCao();
                    break;
                case SOFTTANGTHEOCANNANG:
                    run.runSapXepTangTheoCanNang();
                    break;
                case SOFTTANGTHEONAMSINH:
                    run.runSapXepTangTheoNamSinh();
                    break;

                case SOFTGIAMTHEOTEN:
                    run.runSapXepGiamTheoTen();
                    break;
                case SOFTGIAMTHEOHOTEN:
                    run.runSapXepGiamTheoHoTen();
                    break;
                case SOFTGIAMTHEOTUOI:
                    run.runSapXepGiamTheoTuoi();
                    break;
                case SOFTGIAMTHEOTINCHI:
                    run.runSapXepGiamTheoTinChi();
                    break;
                case SOFTGIAMTHEOCHIEUCAO:
                    run.runSapXepGiamTheoChieuCao();
                    break;
                case SOFTGIAMTHEOCANNANG:
                    run.runSapXepGiamTheoCanNang();
                    break;
                case SOFTGIAMTHEONAMSINH:
                    run.runSapXepGiamTheoNamSinh();
                    break;

                case ADD1SV:
                    run.runAdd1SV();
                    break;

                case XOATEN:
                    run.runXoaSVtheoTen();
                    break;
                case XOAHOTEN:
                    run.runXoaSVtheoHoTen();
                    break;
                case XOALOP:
                    run.runXoaSVtheoLop();
                    break;
                case XOAKHOA:
                    run.runXoaSVtheoKhoa();
                    break;
                case XOANAMSINH:
                    run.runXoaSVtheoNamSinh();
                    break;

                case SUATEN:
                    run.runSuaTen();
                    break;
                case SUANAMSINH:
                    run.runSuaNamSinh();
                    break;
                case SUATINCHI:
                    run.runSuaTinChi();
                    break;

                case TIMTEN:
                    run.runTimTen();
                    break;
                case TIMTINCHI:
                    run.runTimTinChi();
                    break;
                case TIMNAMSINH:
                    run.runTimNamSinh();
                    break;

                case DSGIANGVIEN:
                    run.runDSGiangVien();
                    break;

                case DSSINHVIENCNTT:
                    run.runDSSVCNTT();
                    break;

                default:
                    menu.in.close();
                    return;
            }
        }
    }

}
