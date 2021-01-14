package by.tms;

public class Person implements Clothing{
    private Jacket jacket;
    private Pants pants;
    private Shoes shoes;
    private String name;

    public Person(Jacket jacket, Pants pants, Shoes shoes, String name){
        this.jacket=jacket;
        this.pants=pants;
        this.shoes=shoes;
        this.name=name;
    }
    public Person(){}


    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void gettingDressed (){
        jacket.putOnJacket();
        pants.putOnPants();
        shoes.putOnShoes();
    }
    public void gettingUndressed(){
        jacket.takeOffJacket();
        pants.takeOffPants();
        shoes.takeOffShoes();
    }
}
