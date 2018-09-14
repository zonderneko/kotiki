import java.util.Scanner;

public class Main {
    private int length;

    Main(int length) {
        this.length = length;
    }

    public static void main(String[] args) {
        System.out.println("hello, world");
        new Main(5);
        Kot vasilii = new Kot("Vasilii");
        Kot murzik = new Kot("Murzik");
        //vasilii.murr();
        //murzik.murr();
        System.out.println("Give cat a name:");
        Scanner kname = new Scanner(System.in);
        String k = kname.nextLine();
        Kot newkot = new Kot(k);
        newkot.murr();
    }
}
