public class EmailNotifier implements Notifier {

    @Override
    public void send(String to, String body) {
        // TODO Auto-generated method stub
        System.out.println("[EMAIL to=" + to + "] " + body);
    }
    
}
