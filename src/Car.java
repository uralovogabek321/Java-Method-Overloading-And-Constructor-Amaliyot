public class Car {
    public String color;
    public String model;
    public double price;
    public String type;

    public Car() {
    }

    public Car(String color, String model, double price, String type) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void carInformation() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

    static void main(String[] args) {
        Car bmw = new Car("blue", "bmw m3", 72.00, "automatic");
        bmw.setColor("red");
        bmw.setModel("bmw i3");
        bmw.setPrice(67.00);
        bmw.setType("mechanic");
        bmw.carInformation();
    }
}
