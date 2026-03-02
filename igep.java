import java.util.Locale;

final class igep extends igfx {
    private final igdz a;

    public igep(igdz igdz0) {
        super(igcr.b);
        this.a = igdz0;
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igfx
    public final int a(long v) {
        return this.a.ae(v) > 0 ? 1 : 0;
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return igeq.a(locale0).j;
    }

    @Override  // igfx
    public final int c() {
        return 1;
    }

    @Override  // igfx
    public final int e() {
        return 0;
    }

    @Override  // igfx
    public final long j(long v) {
        return this.a(v) == 0 ? this.a.ap(0L, 1) : 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // igfx
    public final long k(long v) {
        return this.a(v) == 1 ? this.a.ap(0L, 1) : 0x8000000000000000L;
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        iggd.e(this, v1, 0, 1);
        if(this.a(v) != v1) {
            int v2 = -this.a.ae(v);
            return this.a.ap(v, v2);
        }
        return v;
    }

    @Override  // igfx
    public final long m(long v, String s, Locale locale0) {
        Integer integer0 = (Integer)igeq.a(locale0).g.get(s);
        if(integer0 != null) {
            return this.l(v, integer0.intValue());
        }
        throw new igdb(igcr.b, s);
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return igeq.a(locale0).a[v];
    }

    @Override  // igfx
    public final igcy w() {
        return iggq.i(igda.a);
    }

    @Override  // igcp
    public final igcy y() {
        return null;
    }
}

