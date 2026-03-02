public enum gjut implements hfub {
    UNKNOWN(0),
    ARQC(1),
    TC(2),
    AAC(3),
    NO_CRYPTOGRAM(4);

    public final int f;

    private gjut(int v1) {
        this.f = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.f;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.f);
    }
}

