public final class lle {
    public final long a;
    public final long b;

    public lle(long v, long v1) {
        int v2 = Long.compare(v1, 0L);
        if(v2 == 0) {
            v = 0L;
        }
        this.a = v;
        if(v2 == 0) {
            v1 = 1L;
        }
        this.b = v1;
    }

    @Override
    public final String toString() {
        return this.a + "/" + this.b;
    }
}

