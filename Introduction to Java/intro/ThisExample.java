package intro;

public class ThisExample {
    private int x, y;
    private int a, b;

    public ThisExample() {
        this(0, 0, 1, 1);
    }

    public ThisExample(int a, int b) {
        this(0, 0, a, b);
    }

    public ThisExample(int x, int y, int a, int b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
        System.out.println("Printing from the Third Constructor - x : " + x + " - y : " + y
                + " - a : " + a + " - b : " + b);
    }

    public static void main(String[] args) {
        ThisExample te = new ThisExample();
        ThisExample te2 = new ThisExample(2, 2);
        ThisExample te3 = new ThisExample(3, 3, 3, 3);
    }

}
