package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Random;

public class Carnation extends Flower{
    static String[] arrayCarnationColor = new String[]{"Red","White","Pink","Yellow"};
    static String[] arrayBouquetCarnation;
    public void collectorBouquetRose(){
        System.out.println("Это абстрактный метод");
    }
    public void collectorBouquetTulip(){
    }
    public void collectorBouquetChamomile(){

    };
    public static void collectorBouquetCarnation(){
        for(int i=0; i<3; i++) {

            int randomNumColor = new Random().nextInt(4);
            String carnationColor = arrayCarnationColor[randomNumColor];

            int randomNumCountry = new Random().nextInt(4);
            String manufactureCountry = arrayManufacturerCountries[randomNumCountry];

            switch (manufactureCountry){
                case "Russia" : collectorRu(randomNumColor, i, carnationColor);  Flower.countFlowers++;break;
                case "Belarus": collectorBel(randomNumColor, i, carnationColor); Flower.countFlowers++;break;
                case "China"  : collectorChn(randomNumColor, i, carnationColor); Flower.countFlowers++;break;
                case "India"  : collectorInd(randomNumColor, i, carnationColor); Flower.countFlowers++;break;
            }
        }
        System.out.println("Количество проданных цветов = "+Flower.countFlowers);
    }
    static void collectorRu(int randomNumColor, int i, String carnationColor){
        int keepTerm = arrayKeepTermsRu[randomNumColor];
        int price = arrayPricesRu[randomNumColor];
        String flowerRu = "Цветы Гвоздика: цвет - "+carnationColor+", Страна - Россия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetCarnation = new String[3];
        arrayBouquetCarnation[i] = flowerRu;
        System.out.println(arrayBouquetCarnation[i]);
    }
    static void collectorBel(int randomNumColor, int i, String carnationColor){
        int keepTerm = arrayKeepTermsBel[randomNumColor];
        int price = arrayPricesBel[randomNumColor];
        String flowerRu = "Цветы Гвоздика: цвет - "+carnationColor+", Страна - Беларусь, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetCarnation = new String[3];
        arrayBouquetCarnation[i] = flowerRu;
        System.out.println(arrayBouquetCarnation[i]);
    }
    static void collectorChn(int randomNumColor, int i, String carnationColor){
        int keepTerm = arrayKeepTermsChn[randomNumColor];
        int price = arrayPricesChn[randomNumColor];
        String flowerRu = "Цветы Гвоздика: цвет - "+carnationColor+", Страна - Китай, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetCarnation = new String[3];
        arrayBouquetCarnation[i] = flowerRu;
        System.out.println(arrayBouquetCarnation[i]);
    }
    static void collectorInd(int randomNumColor, int i, String carnationColor){
        int keepTerm = arrayKeepTermsInd[randomNumColor];
        int price = arrayPricesInd[randomNumColor];
        String flowerRu = "Цветы Гвоздика: цвет - "+carnationColor+", Страна - Индия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetCarnation = new String[3];
        arrayBouquetCarnation[i] = flowerRu;
        System.out.println(arrayBouquetCarnation[i]);
    }
}
