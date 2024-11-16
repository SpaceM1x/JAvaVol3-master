public class Vector {
    private double x;
    private double y;
    private double z;

// Задание С
    public Vector() {
        this(0, 0, 0);
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void increment() {
        this.x++;
        this.y++;
        this.z++;
    }


    public void decrement() {
        this.x--;
        this.y--;
        this.z--;
    }


    public double getCoordinate(int index) {
        switch (index) {
            case 0:
                return x;
            case 1:
                return y;
            case 2:
                return z;
            default:
                throw new IndexOutOfBoundsException("Invalid index. Use 0, 1, or 2.");
        }
    }


    public static double dotProduct(Vector v1, Vector v2) {
        return v1.x * v2.x + v1.y * v2.y + v1.z * v2.z;
    }


    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }


    public static double angleBetween(Vector v1, Vector v2) {
        double dot = dotProduct(v1, v2);
        double lengths = v1.length() * v2.length();
        if (lengths == 0) {
            throw new ArithmeticException("Cannot calculate angle with zero-length vector.");
        }
        return Math.acos(dot / lengths);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
