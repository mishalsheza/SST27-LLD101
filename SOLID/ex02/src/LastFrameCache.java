public class LastFrameCache implements Cache{

    private Frame last;
    public void store(Frame frame) { this.last = frame; }
    public Frame getLast() { return last; }

    
}
