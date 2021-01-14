package by.tms;

public class LevisPants implements Pants{
    public LevisPants(){}
    public void putOnPants(){
        System.out.println("Надел штаны Levis");
    }

    @Override
    public void takeOffPants() {
        System.out.println("Снял штаны Levis");

    }
}
