public class Demo05 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(0, 0);
        System.out.println("Rectangle area after resize: " + areaAfterResize(r, 5, 4)); // 20

        Square s = new Square(0);
        System.out.println("Square area after resize: " + areaAfterResize(s, 4));       // 16
    }

    static int areaAfterResize(Rectangle r, int newWidth, int newHeight) {
        r.width = newWidth;
        r.height = newHeight;
        return r.area();
    }

    static int areaAfterResize(Square s, int newSide) {
        s.side = newSide;
        return s.area();
    }
}