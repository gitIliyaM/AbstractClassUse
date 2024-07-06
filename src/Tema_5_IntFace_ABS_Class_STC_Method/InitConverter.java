package Tema_5_IntFace_ABS_Class_STC_Method;

public class InitConverter{
    public static void main(String[] args) {
        System.out.println("---------- Задание 1 ----------");
        MainScanner mainScanner = new MainScanner();
        mainScanner.celsius = MainScanner.scannerInput();
        mainScanner.convert();
    }
}
