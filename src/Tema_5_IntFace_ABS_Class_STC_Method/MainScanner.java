package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Scanner;

public class MainScanner extends BaseConverter{
    double celsius;
    MainScanner(){
        this.celsius = scannerInput();
        convert();
    }
    public static double scannerInput(){
        System.out.println("Напиши любым числом температуру по Цельсию");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    @Override
    public void convert() {
        double kelvin = celsius + 273;
        double fahrenheit = (double) 9/5*celsius+32;
        System.out.println("Вы ввели по Цельсию = "+this.celsius+" это по Кельвину = "+kelvin);
        System.out.println("Вы ввели по Цельсию = "+this.celsius+" это по Фаренгейту = "+fahrenheit);
    }
}
