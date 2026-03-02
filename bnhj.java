public final class bnhj extends RuntimeException {
    public final int a;

    public bnhj() {
        super("connection failed: 410: server gone");
        this.a = 410;
    }

    public bnhj(String s) {
        super(s);
        this.a = 0;
    }

    public bnhj(String s, Throwable throwable0) {
        super(s, throwable0);
        this.a = 0;
    }
}

