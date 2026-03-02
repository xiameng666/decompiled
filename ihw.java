final class ihw extends ibur implements ibth {
    final ihy a;
    final hfb b;
    final ihs c;
    final long d;
    final ifb e;
    final int f;
    final boolean g;
    final float h;
    final boolean i;

    public ihw(ihy ihy0, hfb hfb0, ihs ihs0, long v, ifb ifb0, int v1, boolean z, float f, boolean z1) {
        this.a = ihy0;
        this.b = hfb0;
        this.c = ihs0;
        this.d = v;
        this.e = ifb0;
        this.f = v1;
        this.g = z;
        this.h = f;
        this.i = z1;
        super(0);
    }

    @Override  // ibth
    public final Object a() {
        int v = this.c.a();
        hfb hfb0 = ihz.a(this.b, v);
        this.a.at(hfb0, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        return ibom.a;
    }
}

