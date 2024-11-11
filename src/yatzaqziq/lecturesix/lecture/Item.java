package yatzaqziq.lecturesix.lecture;

public class Item {
    private String name;
    private double price;
    private double discount;
    private String expireDate;
    private String supplier;

    public Item(String name, double price, double discount, String expireDate, String supplier) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.expireDate = expireDate;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String printData(){
        String message = "Data: \n" + "Brand: " + this.name + "\n " + "Price: " + this.price + "\n " + "Discount: " + this.discount + "\n "+ "Expire Date: " + this.expireDate;
        return message;
    }
}
