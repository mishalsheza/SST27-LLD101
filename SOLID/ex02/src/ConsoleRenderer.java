public class ConsoleRenderer implements Renderer {

    @Override
    public void render(Frame frame) {
        // TODO Auto-generated method stub
        System.out.println("\u25B6 Playing " + frame.data.length + " bytes");
    }

}
