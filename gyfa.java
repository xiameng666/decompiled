import j..util.Objects;

final class gyfa extends gyll {
    final gyfs a;

    public gyfa(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("StopBleUuidAndTokenAdvertiseState", arr_gyll);
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
    public final gyll b() {
        gyfs gyfs0 = this.a;
        if(gyfs0.h.c()) {
            return gyfs0.g.c() ? null : gyfs0.g;
        }
        return null;
    }

    @Override  // gyll
    public final boolean c() {
        batl.s(this.a.b);
        gyen gyen0 = this.a.b.d;
        return gyen0 == null || !gyen0.c;
    }

    @Override  // gyll
    public final boolean d() {
        batl.s(this.a.b);
        gyen gyen0 = this.a.b.d;
        if(gyen0 != null) {
            gyen0.b();
            return true;
        }
        return false;
    }
}

