package by.tms;

public class ZaraShoes implements Shoes{
    public ZaraShoes() {
    }

    @Override
    public void putOnShoes() {
        System.out.println("Надел ботинки Zara");
    }

    @Override
    public void takeOffShoes() {
        System.out.println("Снял ботинки Zara");
    }
}
