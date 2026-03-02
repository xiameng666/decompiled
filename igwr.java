final class igwr extends igvx {
    public final byte e;

    public igwr(igvt igvt0, String s) {
        super(igvt0, s);
        this.d = s;
        igvt0.f();
        this.e = igvt0.a(1);
        this.c = igvt0.c;
    }

    @Override  // igvx
    public final Object b() {
        return (byte)this.e;
    }

    @Override  // igvx
    public final String toString() {
        return String.valueOf(this.e);
    }
}

