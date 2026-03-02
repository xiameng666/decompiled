public final class igwi extends igvx {
    public final short e;

    public igwi(igvt igvt0, String s) {
        super(igvt0, s);
        this.e = (short)igvt0.c(16);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return (short)this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.valueOf(this.e);
    }
}

