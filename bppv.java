public final class bppv implements gfsi {
    public final gtaz a;

    public bppv(gtaz gtaz0) {
        this.a = gtaz0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        ((ggtj)((ggtj)((ggtj)bpqt.a.i()).s(((Throwable)object0))).ar(5093)).B("Error calculating EIDs for device %s.", (this.a.c == null ? gsyz.a : this.a.c).b);
        gsyz gsyz0 = this.a.c == null ? gsyz.a : this.a.c;
        int v = this.a.f;
        long v1 = this.a.e;
        int v2 = gtac.b(this.a.i) == 0 ? 1 : gtac.b(this.a.i);
        fquz fquz0 = new fquz(null);
        fquz0.b(gsyz0);
        fquz0.f(v);
        fquz0.a = gfqx.a;
        fquz0.e(false);
        fquz0.d(gtbr.a);
        fquz0.b = gfqx.a;
        fquz0.c(v1);
        fquz0.d = v2;
        fquz0.i(gszr.a);
        fquz0.g(false);
        fquz0.h(false);
        fquz0.c = gfqx.a;
        return fquz0.a();
    }
}

