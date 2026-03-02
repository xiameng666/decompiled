import j..util.Objects;

final class gyff extends gyll {
    final gyfs a;

    public gyff(gyfs gyfs0, gyll[] arr_gyll) {
        Objects.requireNonNull(gyfs0);
        this.a = gyfs0;
        super("UserEnabledSettingSaved", arr_gyll);
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
        batl.s(this.a.c);
        return cjpd.h(this.a.c, "bluetoothEnabled");
    }

    @Override  // gyll
    public final boolean d() {
        batl.s(this.a.c);
        cjpa cjpa0 = this.a.c.c();
        batl.s(this.a.b);
        boolean z = true;
        switch(this.a.b.d()) {
            case 11: 
            case 12: {
                break;
            }
            default: {
                z = false;
            }
        }
        cjpa0.e("bluetoothEnabled", z);
        return gyfs.a(cjpa0, "save user enabled state " + z);
    }
}

