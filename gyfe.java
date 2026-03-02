import j..util.Objects;

final class gyfe extends gyll {
    final gyfs a;

    public gyfe(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("Unmodified", arr_gyll);
    }

    @Override  // gyll
    public final long a() {
        batl.s(this.a.a);
        hiex hiex0 = this.a.a.a().e;
        if(hiex0 == null) {
            hiex0 = hiex.a;
        }
        return hiex0.k;
    }

    @Override  // gyll
    public final boolean c() {
        gyfs gyfs0 = this.a;
        if(gyfs0.m.c() && gyfs0.o.c() && gyfs0.p.c()) {
            batl.s(gyfs0.c);
            return cjpd.d(gyfs0.c).isEmpty();
        }
        return false;
    }

    @Override  // gyll
    public final boolean d() {
        batl.s(this.a.c);
        cjpa cjpa0 = this.a.c.c();
        cjpa0.d();
        return cjpd.g(cjpa0);
    }
}

