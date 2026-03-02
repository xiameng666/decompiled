public enum gjhb implements hfub {
    UNSET(0),
    SHOULD_NOT_SYNC(1),
    VISIBLE(2),
    AUTO_ADD(3),
    READ_ONLY(4);

    public final int f;

    private gjhb(int v1) {
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

