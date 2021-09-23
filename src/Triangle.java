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
        if(a <= 0 || b <= 0 || c <= 0){
            return "You already know this won't work, don't you?. INVALID.";
        }
        if(c >= a + b || a >= c + b || b >= a + c){
            return "Invalid";
        }
        if(a == b && b == c){
            return "This is an equilateral triangle.";
        }
        if((a == b) && (b != c) || (b == c) && (c != a) || (c == a) && (a != b)){
            return "This is an isosceles triangle.";
        }
        if(a != b && b != c && a != c) {
            return "This is a scalene triangle.";
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
