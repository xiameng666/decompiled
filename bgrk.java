public final class bgrk extends Exception {
    public final int a;

    public bgrk(int v) {
        super("Rejection: " + v);
        this.a = v;
    }
}

