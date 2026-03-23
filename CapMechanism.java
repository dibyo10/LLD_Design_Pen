public class CapMechanism implements Mechanism {

    @Override
    public boolean start() {
        System.out.println("Cap Removed! Pen is Ready to use.");
        return true;
    }

    @Override
    public boolean close() {
        System.out.println("Cap placed back on.");
        return false;
    }
    
}
