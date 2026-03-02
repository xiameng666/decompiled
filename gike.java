public enum gike implements hfub {
    UNKNOWN(0),
    SYNC(1),
    API(2),
    INVALIDATION(3);

    public final int e;

    private gike(int v1) {
        this.e = v1;
    }

    @Override  // hfub
    public final int a() {
        return this.e;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.e);
    }
}

