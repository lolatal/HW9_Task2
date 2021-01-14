package by.tms;

public class HMPants implements Pants {
    public HMPants() {
    }

    public void putOnPants(){
        System.out.println("Надел штаны H&M");
    }

    @Override
    public void takeOffPants() {
        System.out.println("Снял штаны H&M");
    }
}
