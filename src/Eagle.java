 public class Eagle extends Bird {

    private int speed;
    private String size;

    public Eagle(String name, int wingspan, FeatherC featherC, int speed, String size) {
        super(name, wingspan, featherC);
        this.size = size;
        this.speed = speed;
    }

    public Eagle(String name, int wingspan, FeatherC featherC, String size) {
        super(name, wingspan, featherC);
        this.size = size;

    }

    public int getSpeed() {
        return speed;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                "\nSpeed: " + speed +
                "\nSize: " + size;
    }

}


