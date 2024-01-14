package Phone;

public class KeyPhone extends PhoneAll{
    private int key;
    public KeyPhone(String brand, float price, int key) {
        super(brand, price);
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    @Override
    public String showInfo(){
        return super.showInfo() + "\tNumber key:" + String.valueOf(this.key);
    }
}
