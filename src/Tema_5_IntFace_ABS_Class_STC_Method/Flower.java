package Tema_5_IntFace_ABS_Class_STC_Method;

import java.util.Scanner;

public abstract class Flower {
    String[] arrayManufacturerCountry = new String[]{"Russia","Belarus","China","India"};
    static String[] arrayManufacturerCountries = new String[]{"Russia","Belarus","China","India"};
    int[] arrayKeepTermRu = new int[]{15,20,8,12},
          arrayKeepTermBel = new int[]{11,17,9,15},
          arrayKeepTermChn = new int[]{8,11,10,17},
          arrayKeepTermInd = new int[]{10,9,13,23},
              arrayPriceRu = new int[]{150,250,750,300},
              arrayPriceBel = new int[]{110,220,500,425},
              arrayPriceChn = new int[]{100,350,225,720},
              arrayPriceInd = new int[]{265,275,740,365};
    static int[] arrayKeepTermsRu = new int[]{15,20,8,12},
                arrayKeepTermsBel = new int[]{11,17,9,15},
                arrayKeepTermsChn = new int[]{8,11,10,17},
                arrayKeepTermsInd = new int[]{10,9,13,23},
                    arrayPricesRu = new int[]{150,250,750,300},
                    arrayPricesBel = new int[]{110,220,500,425},
                    arrayPricesChn = new int[]{100,350,225,720},
                    arrayPricesInd = new int[]{265,275,740,365};
    public static int countFlowers;

    public abstract void collectorBouquetRose();
    public abstract void collectorBouquetTulip();
    public abstract void collectorBouquetChamomile();
    public static void collectorBouquetCarnation(){
        System.out.println("Это статический метод абстрактного класса Flower");
    }
    public void collectorBouquetChamomiles(){
        System.out.println("это обычный метод класса Flower");
    }

}
