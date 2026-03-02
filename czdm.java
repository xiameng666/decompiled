import j..util.Objects;

public final class czdm extends cuus {
    final czdu a;
    private final cuus b;

    public czdm(czdu czdu0, cuus cuus0) {
        Objects.requireNonNull(czdu0);
        this.a = czdu0;
        super();
        this.b = cuus0;
    }

    @Override  // cuus
    public final void b(String s, cuvf cuvf0) {
        if(cuvf0.d) {
            this.a.cA(s);
        }
        this.b.b(s, cuvf0);
    }

    @Override  // cuus
    public final void c(String s, cuvl cuvl0) {
        if(!cuvl0.a.e()) {
            this.a.cB(s);
        }
        this.b.c(s, cuvl0);
    }

    @Override  // cuus
    public final void d(String s) {
        this.a.cB(s);
        this.b.d(s);
    }

    @Override  // cuus
    public final byte[] e(String s) {
        return this.b.e(s);
    }

    @Override  // cuus
    public final void g(String s, cuuz cuuz0) {
        this.b.g(s, cuuz0);
    }
}

