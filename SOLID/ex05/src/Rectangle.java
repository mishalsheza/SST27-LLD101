public class Rectangle {
    protected int width, height;

    Rectangle(int w, int h) {
        width = w;
        height = h;
    }
    int getWidth(){
        return width;
    }
    int getHeight(){
        return height;
    }
    public int area(){
        return width * height;
    }

}