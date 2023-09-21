
public class Main {

            public static void main(String[] args) {

                Parrot parrot = new Parrot("Blue Ara", 60, FeatherC.BLUE,
                        "Very rare", "Brazil");
                System.out.println(parrot.getInfo());
                System.out.println("------------------------------");
                Eagle eagle = new Eagle("Desert Eagle", 195, FeatherC.BROWN,
                        320, "Size 84cm");
                System.out.println(eagle.getInfo());

            }
        }
