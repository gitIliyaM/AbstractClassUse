package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Random;

public class CalculationsFlowers {
    public static void main(String[] args) {
        System.out.println("---------- Задание 2 ----------");
        Rose rose = new Rose();
        System.out.println("Розы---------------------");

        Carnation.collectorBouquetCarnation();
        System.out.println("Гвоздика---------------------");

        Flower flower1 = new Carnation();
        flower1.collectorBouquetCarnation();

        System.out.println("Это статический метод абстрактного класса Flower---------------------");
        Tulip tulip = new Tulip();

        System.out.println("Тюльпан---------------------");
        Flower flower2 = new Chamomile();

        System.out.println("Ромашка---------------------");
        

    }
}
