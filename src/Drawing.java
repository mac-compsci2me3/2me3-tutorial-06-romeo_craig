public class Drawing {
    private static Drawing instance;

    private Drawing () {}
    
    public void drawShape(Shape shape) {
        System.out.println("Drawing a " + shape.getClass() + " with colour: " + shape.getColor()  + " and area " + shape.calculateArea());
    }

    public static Drawing getInstance(){
        if (instance == null){
            instance = new Drawing();
        }
        return instance;
    }
}