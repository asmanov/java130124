package Store;
import Phone.PhoneAll;

public class Vitrina {
    public PhoneAll[][] vitr;
    public Vitrina(){
        vitr = new PhoneAll[2][6];
    }
    public void addPhone(PhoneAll item){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++){
                if (vitr[i][j] == null) {
                    vitr[i][j] = item;
                    return;
                }

            }
        }
        System.out.println("Свободных мест нет");
    }
    public void addPhone(PhoneAll item, int polka, int position){
        if (vitr[polka][position] == null){
            vitr[polka][position] = item;
        }
        else System.out.println("Место на полке занято");
    }
    public void takePhone(int polka, int position){
        if (vitr[polka][position] != null){
            System.out.println(vitr[polka][position].showInfo());
            vitr[polka][position] = null;
        }
        else System.out.println("Тута нет телефона!!!");
    }
    public void showAllPhone(){
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 6; j++){
                if (vitr[i][j] != null)
                System.out.print(vitr[i][j].getBrand() + " ");
                else System.out.print(" ***** ");
            }
            System.out.println();
        }
    }
}
