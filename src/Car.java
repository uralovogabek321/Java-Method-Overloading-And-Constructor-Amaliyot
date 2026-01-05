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

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public void carInformation() {
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
    }

    static void main(String[] args) {
        Car bmw = new Car("blue", "bmw m3", 72.00, "automatic");
        bmw.carInformation();
    }
}
