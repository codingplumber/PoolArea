public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12, 24);
        Cuboid cuboid = new Cuboid(12, 12, 12);

        System.out.println(rectangle.getArea());
        System.out.println(cuboid.getVolume());
    }
}
