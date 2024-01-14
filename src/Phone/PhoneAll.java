package Phone;

public class PhoneAll {
    private String brand;
    private float price;

    public PhoneAll(String brand, float price){
        this.brand = brand;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public String showInfo(){
        return String.format("Brand: %s\tprice: %s", this.brand, String.valueOf(this.price));
    }
}
