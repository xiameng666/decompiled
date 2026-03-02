import j..util.Objects;

final class bcru {
    final bcrv a;

    public bcru(bcrv bcrv0) {
        Objects.requireNonNull(bcrv0);
        this.a = bcrv0;
        super();
    }

    public final void a(String s) {
        bcrv.a.d("Phone call received: %s.", new Object[]{s});
        bcrv bcrv0 = this.a;
        bcrv0.g(gmfz.z);
        bcrv0.d.b(bcrv0.h);
        synchronized(bcrv0.e) {
            if(bcrv0.g != gmfx.a) {
                return;
            }
            if(bcrv0.l() != 4) {
                bcrv0.g = gmfx.av;
                return;
            }
        }
        bcrv0.e(s);
    }

    public final void b(gmfx gmfx0, String s) {
        synchronized(this.a.e) {
            this.a.g = gmfx0;
        }
        bcrv.a.f(s, new Object[0]);
        this.a.h();
    }
}

