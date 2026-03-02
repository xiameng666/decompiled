public enum fvct {
    NORTHERN("N", 0.0),
    SOUTHERN("M", 10000000.0);

    public final String c;
    public final double d;

    private fvct(String s1, double f) {
        this.c = s1;
        this.d = f;
    }

    @Override
    public final String toString() {
        return this.c;
    }
}

