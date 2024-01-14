package Phone;

public class ScrinePhone extends PhoneAll{
    private float diagonal;
    public ScrinePhone(String brand, float price, float diagonal) {
        super(brand, price);
        this.diagonal = diagonal;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String showInfo(){
        return super.showInfo() + "\tScren size:" + String.valueOf(this.diagonal);
    }
}
