public final class sqy extends RuntimeException {
    public final transient srg a;

    public sqy(String s, srg srg0) {
        super(s);
        this.a = srg0;
    }

    public sqy(srg srg0, Throwable throwable0) {
        super("Error running HMAC", throwable0);
        this.a = srg0;
    }
}

