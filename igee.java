import java.util.Locale;

final class igee extends igfx {
    private final String a;

    public igee() {
        super(igcr.b);
        this.a = "BE";
    }

    @Override  // igcp
    public final void B() {
    }

    @Override  // igfx
    public final int a(long v) {
        return 1;
    }

    @Override  // igfx
    public final int b(Locale locale0) {
        return this.a.length();
    }

    @Override  // igfx
    public final int c() {
        return 1;
    }

    @Override  // igfx
    public final int e() {
        return 1;
    }

    @Override  // igfx
    public final long j(long v) {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // igfx
    public final long k(long v) {
        return 0x8000000000000000L;
    }

    @Override  // igfx
    public final long l(long v, int v1) {
        iggd.e(this, v1, 1, 1);
        return v;
    }

    @Override  // igfx
    public final long m(long v, String s, Locale locale0) {
        if(!this.a.equals(s) && !"1".equals(s)) {
            throw new igdb(igcr.b, s);
        }
        return v;
    }

    @Override  // igfx
    public final String r(int v, Locale locale0) {
        return this.a;
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

