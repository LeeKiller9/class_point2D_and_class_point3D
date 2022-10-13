import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D my2D = new Point2D(11.5f, 23.98f);
        System.out.println(Arrays.toString(my2D.getXY()));
        System.out.println(my2D);
        System.out.println("---------");

        Point3D my3D = new Point3D(13.5f, 33.2f, 44.87f);
        System.out.println(Arrays.toString(my3D.getXYZ()));
        System.out.println(my3D);
    }
}