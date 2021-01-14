package by.tms;

public class ZaraJacket implements Jacket{
    public ZaraJacket() {
    }

    public void putOnJacket(){
        System.out.println("Надел куртку Zara");
    }

    @Override
    public void takeOffJacket() {
        System.out.println("Снял куртку Zara");
    }
}
