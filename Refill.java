public abstract  class Refill{

    private final String color;

    public Refill(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public abstract void write(String text);


}