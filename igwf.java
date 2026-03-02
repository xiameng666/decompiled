class igwf extends igvx {
    public final long e;

    public igwf(igvt igvt0, String s, long v) {
        super(igvt0, s);
        this.e = igvt0.d(v);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return (long)this.e;
    }

    @Override  // igvx
    public String toString() {
        return String.valueOf(this.e);
    }
}

