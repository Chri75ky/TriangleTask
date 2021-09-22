public class Triangle {
    // Attributes
    private int a;
    private int b;
    private int c;


    // Constructor
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Methods
    public String whatTypeOfTriangle() {
        if(a == b && b == c){
            return "This is an equilateral triangle.";
        }
        if((a == b) && (b != c) && c - (a + b) < 0){
            return "This is an isosceles triangle.";
        }
        if(a != b && b != c && a != c && c - (a + b) < 0) {
            return "This is a scalene triangle.";
        }if(c - (a + b) >= 0){
            return "Invalid";
        }else{
            return "invalid";
        }

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
