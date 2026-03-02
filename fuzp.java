public final class fuzp {
    public final int a;
    public final int b;

    public fuzp(int v, int v1) {
        this.b = v;
        this.a = v1;
    }

    @Override
    public final String toString() {
        return this.b == 1 ? "Status = NO_OP, next activity = " + this.a : "Status = TRANSITION, next activity = " + this.a;
    }
}

