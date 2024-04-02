import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);
        double radius = inputt.nextDouble();
        double area;
        area = Math.PI*(Math.pow(radius, 2));
        System.out.println(area);
    }
}
