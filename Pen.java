public class Pen {

    private Refill refill;
    private final Mechanism mechanism;
    private boolean isReady;

    public Pen(Refill refill , Mechanism mechanism){
        this.refill = refill;
        this.mechanism = mechanism;
        this.isReady = false;
    }

    public void start() {
        if (isReady) {
            System.out.println("Pen is already ready to use.");
            return;
        }
        this.isReady = mechanism.start();
    }

    public void close() {
        if (!isReady) {
            System.out.println("Pen is already closed.");
            return;
        }
        this.isReady = mechanism.close();
    }

    public void write(String text) {
        if (!isReady) {
            throw new IllegalStateException("ERROR: Cannot write! You must start() the pen first.");
        }
        if (refill == null || refill.getColor() == null) {
            System.out.println("Pen has no ink!");
            return;
        }
        refill.write(text);
    }
    
    public void changeRefill(Refill newRefill) {
        this.refill = newRefill;
        System.out.println("Old refill removed. Pen loaded with a new " + newRefill.getColor() + " refill.");
    }
    
}
