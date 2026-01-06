public class TogriBurchakliUchburchak {
    public double side1;
    public double side2;

    public TogriBurchakliUchburchak() {
    }

    public TogriBurchakliUchburchak(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double calculator() {
        return 0.5 * side1 * side2;
    }

    public double calculatePerimeter(double side1, double side2) {
        return side1 + side2 + Math.sqrt(side1 * side1 + side2 * side2);
    }

    static void main(String[] args) {
        TogriBurchakliUchburchak togriBurchakliUchburchak = new TogriBurchakliUchburchak(3, 4);
        System.out.println(togriBurchakliUchburchak.calculator());
        System.out.println(togriBurchakliUchburchak.calculatePerimeter(3, 4));
    }
}