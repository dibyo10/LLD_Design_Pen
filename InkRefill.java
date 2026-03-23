public class InkRefill extends Refill {

    public InkRefill(String color) {
        super(color);
    }

    @Override
    public void write(String text) {
        System.out.println("Writing Using a " + getColor() + " INK Pen.");
        System.out.println("Content -> "+text);
    }
    
}
