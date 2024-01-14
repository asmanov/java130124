import Phone.*;
import Store.Vitrina;

public class Main {
    public static void main(String[] args) {
        Vitrina vitrina = new Vitrina();
        vitrina.addPhone(new KeyPhone("Motorola", 900.1f, 12));
        vitrina.showAllPhone();
        vitrina.addPhone(new ScrinePhone("Samsung", 10000.00f, 6.7f));
        vitrina.showAllPhone();
        vitrina.addPhone(new ScrinePhone("Philips", 10000.00f, 6.7f), 1, 3);
        vitrina.addPhone(new ScrinePhone("Philips", 10000.00f, 6.7f), 1, 3);
        vitrina.showAllPhone();

        System.out.println(vitrina.vitr[0][0].showInfo());
    }
}