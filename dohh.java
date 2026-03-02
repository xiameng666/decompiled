public final class dohh implements dohf {
    private final fsyk a;
    private final String b;
    private final gtlk c;
    private final String d;
    private final String e;

    public dohh(fsyk fsyk0) {
        ibuq.f(fsyk0, "closedLoopCard");
        super();
        this.a = fsyk0;
        String s = (fsyk0.e == null ? gtkg.a : fsyk0.e).e;
        ibuq.e(s, "getDisplayCardId(...)");
        this.b = s;
        gtkg gtkg0 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gtlj gtlj0 = gtkg0.E == null ? gtlj.a : gtkg0.E;
        gtlk gtlk0 = gtlk.b(gtlj0.b) == null ? gtlk.e : gtlk.b(gtlj0.b);
        ibuq.e(gtlk0, "getSurfacingState(...)");
        this.c = gtlk0;
        gtkg gtkg1 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gumi gumi0 = gtkg1.i == null ? gumi.a : gtkg1.i;
        gues gues0 = gumi0.l == null ? gues.a : gumi0.l;
        guer guer0 = gues0.d == null ? guer.a : gues0.d;
        String s1 = dspl.d((guer0.c == null ? gunw.a : guer0.c));
        ibuq.e(s1, "dereference(...)");
        this.d = s1;
        gtkg gtkg2 = fsyk0.e == null ? gtkg.a : fsyk0.e;
        gumi gumi1 = gtkg2.i == null ? gumi.a : gtkg2.i;
        gues gues1 = gumi1.l == null ? gues.a : gumi1.l;
        guer guer1 = gues1.d == null ? guer.a : gues1.d;
        this.e = dspl.d((guer1.d == null ? gunw.a : guer1.d));
    }

    @Override  // edxb
    public final int a(edxb edxb0) {
        edxa.b(edxb0);
        return 0;
    }

    @Override  // edxb
    public final int b() {
        return 1;
    }

    @Override  // edxb
    public final long c() {
        return 0x7FFFFFFFFFFFFFFFL;
    }

    @Override  // edxb
    public final String d() {
        return this.b;
    }

    @Override  // edxb
    public final boolean e() {
        return false;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return (object0 instanceof dohh) ? ibuq.m(this.a, ((dohh)object0).a) : false;
    }

    @Override  // dohf
    public final int f() {
        return 0x7F080B4C;  // drawable:quantum_gm_ic_directions_railway_vd_theme_24
    }

    @Override  // edxb
    public final boolean g(edxb edxb0) {
        return super.equals(edxb0) ? ibuq.m(this.b, ((dohh)edxb0).b) && ibuq.m(this.e, ((dohh)edxb0).e) && this.c == ((dohh)edxb0).c && ibuq.m(this.d, ((dohh)edxb0).d) : false;
    }

    @Override  // dohf
    public final String h() {
        return this.e;
    }

    @Override
    public final int hashCode() {
        fsyk fsyk0 = this.a;
        if(((ProtoLiteMessage)fsyk0).isImmutable()) {
            return ((ProtoLiteMessage)fsyk0).s();
        }
        int v = fsyk0.memoizedHashCode;
        if(v == 0) {
            v = ((ProtoLiteMessage)fsyk0).s();
            fsyk0.memoizedHashCode = v;
        }
        return v;
    }

    @Override  // dohf
    public final String i() {
        return this.d;
    }

    @Override
    public final String toString() {
        return "TicketCentricPrivacyControlsItem(closedLoopCard=" + this.a + ")";
    }
}

