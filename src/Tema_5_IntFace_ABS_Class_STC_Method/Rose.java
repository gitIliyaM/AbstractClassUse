package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Random;

public class Rose extends Flower{
    String[] arrayRoseColor = new String[]{"Red","White","Blue","Yellow"};
    String[] arrayBouquetRose;
    Rose(){
        collectorBouquetRose();
    }

    @Override
    public void collectorBouquetRose(){
        for(int i=0; i<3; i++) {

            int randomNumColor = new Random().nextInt(4);
            String roseColor = arrayRoseColor[randomNumColor];

            int randomNumCountry = new Random().nextInt(4);
            String manufactureCountry = arrayManufacturerCountry[randomNumCountry];

            switch (manufactureCountry){
                case "Russia" : collectorRu(randomNumColor, i, roseColor);  Flower.countFlowers++;break;
                case "Belarus": collectorBel(randomNumColor, i, roseColor); Flower.countFlowers++;break;
                case "China"  : collectorChn(randomNumColor, i, roseColor); Flower.countFlowers++;break;
                case "India"  : collectorInd(randomNumColor, i, roseColor); Flower.countFlowers++;break;
            }
        }
        System.out.println("Количество проданных цветов = "+Flower.countFlowers);
    }
    void collectorRu(int randomNumColor, int i, String roseColor){
        int keepTerm = arrayKeepTermRu[randomNumColor];
        int price = arrayPriceRu[randomNumColor];
        String flowerRu = "Цветы Розы: цвет - "+roseColor+", Страна - Россия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetRose = new String[3];
        arrayBouquetRose[i] = flowerRu;
        System.out.println(arrayBouquetRose[i]);
    }
    void collectorBel(int randomNumColor, int i, String roseColor){
        int keepTerm = arrayKeepTermBel[randomNumColor];
        int price = arrayPriceBel[randomNumColor];
        String flowerRu = "Цветы Розы: цвет - "+roseColor+", Страна - Беларусь, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetRose = new String[3];
        arrayBouquetRose[i] = flowerRu;
        System.out.println(arrayBouquetRose[i]);
    }
    void collectorChn(int randomNumColor, int i, String roseColor){
        int keepTerm = arrayKeepTermChn[randomNumColor];
        int price = arrayPriceChn[randomNumColor];
        String flowerRu = "Цветы Розы: цвет - "+roseColor+", Страна - Китай, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetRose = new String[3];
        arrayBouquetRose[i] = flowerRu;
        System.out.println(arrayBouquetRose[i]);
    }
    void collectorInd(int randomNumColor, int i, String roseColor){
        int keepTerm = arrayKeepTermInd[randomNumColor];
        int price = arrayPriceInd[randomNumColor];
        String flowerRu = "Цветы Розы: цвет - "+roseColor+", Страна - Индия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetRose = new String[3];
        arrayBouquetRose[i] = flowerRu;
        System.out.println(arrayBouquetRose[i]);
    }
    public void collectorBouquetTulip(){
    }
    public void collectorBouquetChamomile(){
    }
}
