public final class cmb implements cid {
    private final int a;
    private final int b;
    private final cie c;

    public cmb() {
        this(0, 0, null, 7);
    }

    public cmb(int v, int v1, cie cie0) {
        this.a = v;
        this.b = v1;
        this.c = cie0;
    }

    public cmb(int v, int v1, cie cie0, int v2) {
        if((v2 & 4) != 0) {
            cie0 = cih.a;
        }
        if((v2 & 2) != 0) {
            v1 = 0;
        }
        if(1 == (v2 & 1)) {
            v = 300;
        }
        this(v, v1, cie0);
    }

    @Override  // chl
    public final cmx a(cmc cmc0) {
        return this.d();
    }

    @Override  // cid
    public final cnc b(cmc cmc0) {
        return this.d();
    }

    @Override  // cii
    public final cnd c(cmc cmc0) {
        return this.d();
    }

    public final cnn d() {
        return new cnn(this.a, this.b, this.c);
    }

    @Override
    public final boolean equals(Object object0) {
        return (object0 instanceof cmb) && ((cmb)object0).a == this.a && ((cmb)object0).b == this.b && ibuq.m(((cmb)object0).c, this.c);
    }

    @Override
    public final int hashCode() {
        return (this.a * 0x1F + this.c.hashCode()) * 0x1F + this.b;
    }
}

