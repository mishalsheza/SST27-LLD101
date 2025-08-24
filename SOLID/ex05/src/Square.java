
public class Square implements Shape {
    public int side;
    Square(int s){
         side = s; 
    }
    public int area() { return side * side; }
}