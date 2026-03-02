import j..util.Objects;

final class gyfp extends gyll {
    final gyfq a;

    public gyfp(gyfq gyfq0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfq0);
        this.a = gyfq0;
        super("BleScanStopped", arr_gyll);
    }

    @Override  // gyll
    public final long a() {
        batl.s(this.a.d.a);
        hiex hiex0 = this.a.d.a.a().e;
        if(hiex0 == null) {
            hiex0 = hiex.a;
        }
        return hiex0.k;
    }

    @Override  // gyll
    public final boolean c() {
        return !this.a.c;
    }

    @Override  // gyll
    public final boolean d() {
        batl.s(this.a.d.b);
        batl.s(this.a.a);
        int v = this.a.d.b.r(this.a.a);
        this.a.c = v ^ 1;
        return v != 0;
    }
}

