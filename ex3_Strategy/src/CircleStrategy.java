public class CircleStrategy implements Strategy{
    @Override
    public Shape createShape(double i, Point point) {
        return new Circle(i,point);
    }
}
