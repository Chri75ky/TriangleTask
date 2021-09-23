import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a side of the triangle: ");
        int a = in.nextInt();
        System.out.println("Enter a side of the triangle: ");
        int b = in.nextInt();
        System.out.println("Enter a side of the triangle: ");
        int c = in.nextInt();

        Triangle t = new Triangle(a, b, c);
        System.out.println(t);
        System.out.println(t.whatTypeOfTriangle());

    }
}
