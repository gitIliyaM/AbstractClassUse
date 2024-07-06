package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Random;

public class Tulip extends Flower{
    String[] arrayTulipColor = new String[]{"Red","White","Blue","Yellow"};
    String[] arrayBouquetTulip;
    Tulip(){
        collectorBouquetTulip();
    }
    public void collectorBouquetRose(){

    };
    @Override
    public void collectorBouquetTulip(){
        for(int i=0; i<3; i++) {

            int randomNumColor = new Random().nextInt(4);
            String tulipColor = arrayTulipColor[randomNumColor];

            int randomNumCountry = new Random().nextInt(4);
            String manufactureCountry = arrayManufacturerCountry[randomNumCountry];

            switch (manufactureCountry){
                case "Russia" : collectorRu(randomNumColor, i, tulipColor);  Flower.countFlowers++;break;
                case "Belarus": collectorBel(randomNumColor, i, tulipColor); Flower.countFlowers++;break;
                case "China"  : collectorChn(randomNumColor, i, tulipColor); Flower.countFlowers++;break;
                case "India"  : collectorInd(randomNumColor, i, tulipColor); Flower.countFlowers++;break;
            }
        }
        System.out.println("Количество проданных цветов = "+Flower.countFlowers);
    }
    void collectorRu(int randomNumColor, int i, String tulipColor){
        int keepTerm = arrayKeepTermRu[randomNumColor];
        int price = arrayPriceRu[randomNumColor];
        String flowerRu = "Цветы Тюльпан: цвет - "+tulipColor+", Страна - Россия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetTulip = new String[3];
        arrayBouquetTulip[i] = flowerRu;
        System.out.println(arrayBouquetTulip[i]);
    }
    void collectorBel(int randomNumColor, int i, String tulipColor){
        int keepTerm = arrayKeepTermBel[randomNumColor];
        int price = arrayPriceBel[randomNumColor];
        String flowerRu = "Цветы Тюльпан: цвет - "+tulipColor+", Страна - Беларусь, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetTulip = new String[3];
        arrayBouquetTulip[i] = flowerRu;
        System.out.println(arrayBouquetTulip[i]);
    }
    void collectorChn(int randomNumColor, int i, String tulipColor){
        int keepTerm = arrayKeepTermChn[randomNumColor];
        int price = arrayPriceChn[randomNumColor];
        String flowerRu = "Цветы Тюльпан: цвет - "+tulipColor+", Страна - Китай, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetTulip = new String[3];
        arrayBouquetTulip[i] = flowerRu;
        System.out.println(arrayBouquetTulip[i]);
    }
    void collectorInd(int randomNumColor, int i, String roseColor){
        int keepTerm = arrayKeepTermInd[randomNumColor];
        int price = arrayPriceInd[randomNumColor];
        String flowerRu = "Цветы Тюльпан: цвет - "+roseColor+", Страна - Индия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetTulip = new String[3];
        arrayBouquetTulip[i] = flowerRu;
        System.out.println(arrayBouquetTulip[i]);
    }
    public void collectorBouquetChamomile(){
    }
}
