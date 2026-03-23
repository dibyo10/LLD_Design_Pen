public class Main {
    public static void main(String[] args) {
        
        Pen gelPen = new Pen(new GellRefill("BLUE"), new ClickMechanism());

        gelPen.start();
        gelPen.write("Hello from the Gel Pen!");
        
        gelPen.changeRefill(new BallRefill("RED"));
        gelPen.write("Now writing in Red Ballpoint.");
        gelPen.close();

        Pen fountainPen = new Pen(new InkRefill("BLACK"), new CapMechanism());

        fountainPen.start();
        fountainPen.write("Hello from the Fountain Pen!");
        fountainPen.close();
        
    }
}