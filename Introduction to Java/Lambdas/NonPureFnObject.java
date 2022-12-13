package Lambdas;

public class NonPureFnObject {
    private int x = 0;

    public int subtract(int x) {
        this.x -= x;
        return this.x;
    }
}
