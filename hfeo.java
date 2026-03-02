public enum hfeo implements hfub {
    VALUE_ORIGIN_UNKNOWN(0),
    IN_MEMORY_CACHE(1),
    PERSISTENT_CACHE(2),
    CACHE_MISS(3);

    public final int e;

    private hfeo(int v1) {
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

