import j..util.Objects;

final class gyfc extends gyll {
    final gyfs a;

    public gyfc(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("RevertedEnabled", arr_gyll);
    }

    @Override  // gyll
    public final long a() {
        if(this.e()) {
            batl.s(this.a.a);
            hiep hiep0 = this.a.a.a().h;
            if(hiep0 == null) {
                hiep0 = hiep.a;
            }
            return hiep0.e;
        }
        batl.s(this.a.a);
        hiep hiep1 = this.a.a.a().h;
        if(hiep1 == null) {
            hiep1 = hiep.a;
        }
        return hiep1.d;
    }

    @Override  // gyll
    public final boolean c() {
        gyfs gyfs0 = this.a;
        if(gyfs0.e.c() && !this.e()) {
            batl.s(gyfs0.b);
            return !gyfs0.b.m();
        }
        return true;
    }

    @Override  // gyll
    public final boolean d() {
        gyfs gyfs0 = this.a;
        batl.s(gyfs0.c);
        if(!cjpd.h(gyfs0.c, "bluetoothEnabled")) {
            return true;
        }
        this.e();
        batl.s(gyfs0.b);
        gyfs0.b.m();
        return this.e() ? true : gyfs0.b.g();
    }

    private final boolean e() {
        batl.s(this.a.c);
        return cjpd.i(this.a.c, "bluetoothEnabled", true);
    }
}

