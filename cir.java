public final class cir implements chl {
    private final cid a;
    private final long b;
    private final int c;

    public cir(cid cid0, int v, long v1) {
        this.a = cid0;
        this.c = v;
        this.b = v1;
    }

    @Override  // chl
    public final cmx a(cmc cmc0) {
        return new cnh(this.a.b(cmc0), this.c, this.b);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof cir) && ibuq.m(((cir)object0).a, this.a) && ((cir)object0).c == this.c && ckl.a(((cir)object0).b, this.b);
    }

    @Override
    public final int hashCode() {
        cjp.a(this.c);
        return (this.a.hashCode() * 0x1F + this.c) * 0x1F + ckk.a(this.b);
    }
}

