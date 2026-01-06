public class Point {
    public double x;
    public double y;
    public double z;

    public Point() {
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }


    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


    public void pointInformation() {
        System.out.println("Point: (" + x + ", " + y + ", " + z + ")");
    }


    public static void main(String[] args) {
        Point point = new Point(1.0, 2.0, 3.0);
        point.pointInformation();
    }
}
