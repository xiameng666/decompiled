public final class fdsp extends Exception {
    public final int a;

    public fdsp(int v, String s) {
        super(s);
        this.a = v;
    }

    public fdsp(int v, String s, Throwable throwable0) {
        super(s, throwable0);
        this.a = v;
    }
}

