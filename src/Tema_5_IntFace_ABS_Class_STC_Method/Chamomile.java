package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Random;

public class Chamomile extends Flower{
    String[] arrayChamomileColor = new String[]{"Red","White","Burgundy","Purple"};
    String[] arrayBouquetChamomile;
    public void collectorBouquetRose(){};
    public void collectorBouquetTulip(){};
    @Override
    public void collectorBouquetChamomiles(){
        System.out.println("Это обычный метод class Chamomile");
    }

    Chamomile(){
        collectorBouquetChamomile();
    }

    @Override
    public void collectorBouquetChamomile(){
        for(int i=0; i<3; i++) {

            int randomNumColor = new Random().nextInt(4);
            String chamomileColor = arrayChamomileColor[randomNumColor];

            int randomNumCountry = new Random().nextInt(4);
            String manufactureCountry = arrayManufacturerCountry[randomNumCountry];

            switch (manufactureCountry){
                case "Russia" : collectorRu(randomNumColor, i, chamomileColor);  Flower.countFlowers++;break;
                case "Belarus": collectorBel(randomNumColor, i, chamomileColor); Flower.countFlowers++;break;
                case "China"  : collectorChn(randomNumColor, i, chamomileColor); Flower.countFlowers++;break;
                case "India"  : collectorInd(randomNumColor, i, chamomileColor); Flower.countFlowers++;break;
            }
        }
        System.out.println("Количество проданных цветов = "+Flower.countFlowers);
    }
    void collectorRu(int randomNumColor, int i, String chamomileColor){
        int keepTerm = arrayKeepTermRu[randomNumColor];
        int price = arrayPriceRu[randomNumColor];
        String flowerRu = "Цветы Ромашка: цвет - "+chamomileColor+", Страна - Россия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetChamomile = new String[3];
        arrayBouquetChamomile[i] = flowerRu;
        System.out.println(arrayBouquetChamomile[i]);
    }
    void collectorBel(int randomNumColor, int i, String chamomileColor){
        int keepTerm = arrayKeepTermBel[randomNumColor];
        int price = arrayPriceBel[randomNumColor];
        String flowerRu = "Цветы Ромашка: цвет - "+chamomileColor+", Страна - Беларусь, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetChamomile = new String[3];
        arrayBouquetChamomile[i] = flowerRu;
        System.out.println(arrayBouquetChamomile[i]);
    }
    void collectorChn(int randomNumColor, int i, String chamomileColor){
        int keepTerm = arrayKeepTermChn[randomNumColor];
        int price = arrayPriceChn[randomNumColor];
        String flowerRu = "Цветы Ромашка: цвет - "+chamomileColor+", Страна - Китай, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetChamomile = new String[3];
        arrayBouquetChamomile[i] = flowerRu;
        System.out.println(arrayBouquetChamomile[i]);
    }
    void collectorInd(int randomNumColor, int i, String chamomileColor){
        int keepTerm = arrayKeepTermInd[randomNumColor];
        int price = arrayPriceInd[randomNumColor];
        String flowerRu = "Цветы Ромашка: цвет - "+chamomileColor+", Страна - Индия, Срок хранения - "+keepTerm+", Цена - "+price+" руб";
        arrayBouquetChamomile = new String[3];
        arrayBouquetChamomile[i] = flowerRu;
        System.out.println(arrayBouquetChamomile[i]);
    }
}
