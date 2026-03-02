import j..util.Objects;

final class gyfd extends gyll {
    final gyfs a;

    public gyfd(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("RemovedUserSettings", arr_gyll);
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
        cjpc cjpc0 = this.a.c;
        batl.s(cjpc0);
        return !cjpd.h(cjpc0, "deviceName") && !cjpd.h(cjpc0, "discoverableTimeout") && !cjpd.h(cjpc0, "scanMode");
    }

    @Override  // gyll
    public final boolean d() {
        batl.s(this.a.c);
        cjpa cjpa0 = this.a.c.c();
        cjpa0.j("deviceName");
        cjpa0.j("discoverableTimeout");
        cjpa0.j("scanMode");
        return gyfs.a(cjpa0, "reverted to user settings");
    }
}

