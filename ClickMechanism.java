public class ClickMechanism implements Mechanism{

    @Override
    public boolean start() {
        System.out.println("Clicked Down! Pen is ready to use.");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("Clicked up.");
        return false;
    }
    
}
