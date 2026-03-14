class Pen {
    String color;
    String type;

    public void printcolor() {
        System.out.println(this.color);
    }

    public void printtype() {
        System.out.println(this.type);
    }
}

public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Red";
        pen1.type = "gel";
        pen1.printcolor();
        pen1.printtype();
    }

}
