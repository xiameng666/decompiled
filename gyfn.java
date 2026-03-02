import j..util.Objects;

final class gyfn extends gyll {
    final gyfs a;

    public gyfn(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("Discoverable", arr_gyll);
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
        batl.s(this.a.b);
        return this.a.b.c() == 23;
    }

    @Override  // gyll
    public final boolean d() {
        gyeq gyeq0 = this.a.b;
        batl.s(gyeq0);
        batl.s(this.a.a);
        hiep hiep0 = this.a.a.a().h;
        if(hiep0 == null) {
            hiep0 = hiep.a;
        }
        return gyeq0.p(23, ((int)hiep0.c));
    }
}

