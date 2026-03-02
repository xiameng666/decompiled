import java.util.Locale;

final class igeo extends iggj {
    private final igdz b;

    public igeo(igdz igdz0, igcy igcy0) {
        super(igcr.m, igcy0);
        this.b = igdz0;
    }

    @Override  // igfx
    public final int a(long v) {
        return this.b.R(v);
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return igeq.a(locale0).k;
    }

    @Override  // igfx
    public final int c() {
        return 7;
    }

    @Override  // iggj
    public final int e() {
        return 1;
    }

    @Override  // igfx
    public final String o(int v, Locale locale0) {
        return igeq.a(locale0).c[v];
    }

    @Override  // igfx
    protected final int oW(String s, Locale locale0) {
        Integer integer0 = (Integer)igeq.a(locale0).h.get(s);
        if(integer0 != null) {
            return (int)integer0;
        }
        throw new igdb(igcr.m, s);
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return igeq.a(locale0).b[v];
    }

    @Override  // igcp
    public final igcy y() {
        return this.b.d;
    }
}

