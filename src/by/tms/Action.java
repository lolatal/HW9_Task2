package by.tms;

public class Action {
    public static void main(String[] args) {
        ZaraJacket zaraJacket = new ZaraJacket();
        ZaraPants zaraPants = new ZaraPants();
        ZaraShoes zaraShoes = new ZaraShoes();
        HMJacket hmJacket = new HMJacket();
        HMPants hmPants = new HMPants();
        HMShoes hmShoes = new HMShoes();
        LevisJacket levisJacket = new LevisJacket();
        LevisPants levisPants = new LevisPants();
        LevisShoes levisShoes = new LevisShoes();
        Person person1 = new Person(zaraJacket, hmPants, levisShoes, "Jack");
        System.out.println(person1.getName());
        person1.gettingDressed();
        System.out.println(person1.getName());
        person1.gettingUndressed();
        System.out.println("---------------");
        Person person2 = new Person(hmJacket, zaraPants, levisShoes, "Mike");
        System.out.println(person2.getName());
        person2.gettingDressed();
        System.out.println(person2.getName());
        person2.gettingUndressed();
        System.out.println("---------------");
        Person person3 = new Person(levisJacket, levisPants, hmShoes, "Jacob");
        System.out.println(person3.getName());
        person3.gettingDressed();
        System.out.println(person3.getName());
        person3.gettingUndressed();

    }
}
