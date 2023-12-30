public class ShapeMaker {
    private Square square;
    private Rectangle rectangle;
    private Circle circle;
    ShapeMaker(){
        square = new Square();
        rectangle = new Rectangle();
        circle = new Circle();
    }
    void drawSquare(){
        square.draw();
    }
    void drawRectangle(){
        rectangle.draw();
    }
    void drawCircle(){
        circle.draw();
    }
}
