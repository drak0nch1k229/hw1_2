public class Bird {

    private String name;
    private int wingspan;
    private FeatherC featherC;

    public String getName() {
        return name;
    }

    public int getWingspan() {
        return wingspan;
    }

    public FeatherC getFeatherC() {
        return featherC;
    }

    public Bird(String name, int wingspan, FeatherC featherC) {
        this.name = name;
        this.wingspan = wingspan;
        this.featherC = featherC;
    }

    public String getInfo() {
        return "Name; " + name +
                "\nWingspan: " + wingspan +
                "\nFeather Color: " + featherC;
    }
}


