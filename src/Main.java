import Phone.*;
import Store.Vitrina;

public class Main {
    public static void main(String[] args) {
        Vitrina vitrina = new Vitrina();
        //добавляем телефон на свободное место
        vitrina.addPhone(new KeyPhone("Motorola", 900.1f, 12));
        vitrina.showAllPhone();
        //добавляем телефон на свободное место
        vitrina.addPhone(new ScrinePhone("Samsung", 10000.00f, 6.7f));
        vitrina.showAllPhone();
        //добавляем телефон на 2 полку 4 позицию
        vitrina.addPhone(new ScrinePhone("Philips", 10000.00f, 6.7f), 1, 3);
        //пытаемся поставить телефон на туже позицию
        vitrina.addPhone(new ScrinePhone("Philips", 10000.00f, 6.7f), 1, 3);
        vitrina.showAllPhone();
        //System.out.println(vitrina.vitr[0][0].showInfo());
        //Забираем телефон
        vitrina.takePhone(0, 1);
        vitrina.showAllPhone();
    }
}