import java.util.Random;

public class Kot {
    private Integer age, length, murch;
    private String name;

    private Random random = new Random(System.currentTimeMillis());

    Kot(String name) {

        this.name = name;
    }

    int number = random.nextInt(10);

    public String murrcount() {
        String result = "";
        for (int i = 0; i < number; i++) {
            result = "murr " + result;
        }
        return result;
    }

    public void murr() {
        //int count = random.nextInt(10);
        System.out.print(name + " says: " + murrcount());
    }
}
