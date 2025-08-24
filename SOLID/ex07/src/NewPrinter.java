public class NewPrinter implements Printer,Scanner,Fax {

    @Override
    public void print(String text) {
        // TODO Auto-generated method stub
        System.out.println("Print: "+text);
    }

    @Override
    public void scan(String dstPath) {
        // TODO Auto-generated method stub
        System.out.println("Scan to "+dstPath);
    }

    @Override
    public void fax(String number) {
        // TODO Auto-generated method stub
        System.out.println("Fax to "+number);
    }
    
}
