public final class bnrw implements gfsi {
    public final long a;

    public bnrw(long v) {
        this.a = v;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        return new bnry(this.a, ((gtai)object0));
    }
}

