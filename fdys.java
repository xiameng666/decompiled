final class fdys {
    public final int a;
    private int b;

    public fdys(int v) {
        this.a = v;
        this.b = 0;
    }

    final int a() {
        int v = this.b + 1;
        this.b = v;
        return v;
    }
}

