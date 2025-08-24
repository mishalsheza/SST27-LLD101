public class Demo07 {
    public static void main(String[] args) {
        Printer p = new BasicPrinter();
        p.print("Hello");
        NewPrinter n = new NewPrinter();
        n.print("Hello");
        n.scan("hello scanner");
        n.fax("123");

    }
}
