public class Parrot extends Bird{
    private String habitation;
    private String rarity;


    public Parrot(String name, int wingspan, FeatherC featherC, String rarity) {
        super(name, wingspan, featherC);
        this.rarity = rarity;
    }

    public Parrot(String name, int wingspan, FeatherC featherC, String habitation, String rarity) {
        super(name, wingspan, featherC);
        this.habitation = habitation;
        this.rarity = rarity;

    }

    public String getHabitation() {
        return habitation;
    }

    public String getRarity() {
        return rarity;
    }
    @Override
    public String getInfo(){
        return super.getInfo()+
                "\nRarity: " + rarity+
                "\nHabitation: " + habitation;
    }

}


