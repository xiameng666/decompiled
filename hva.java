public final class hva extends hfb implements hur, ijm {
    public hur a;
    public huv b;
    private hva c;
    private final Object d;

    public hva(hur hur0, huv huv0) {
        this.a = hur0;
        if(huv0 == null) {
            huv0 = new huv();
        }
        this.b = huv0;
        this.d = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    @Override  // hur
    public final long a(long v, long v1, int v2) {
        long v3 = this.a.a(v, v1, v2);
        hur hur0 = this.i();
        return hur0 == null ? hjz.d(v3, 0L) : hjz.d(v3, hur0.a(hjz.d(v, v3), hjz.c(v1, v3), v2));
    }

    @Override  // hur
    public final long b(long v, int v1) {
        hur hur0 = this.i();
        if(hur0 != null) {
            long v2 = hur0.b(v, v1);
            return hjz.d(v2, this.a.b(hjz.c(v, v2), v1));
        }
        return hjz.d(0L, this.a.b(hjz.c(v, 0L), v1));
    }

    @Override  // hur
    public final Object c(long v, long v1, ibrl ibrl0) {
        long v3;
        hux hux0;
        if((ibrl0 instanceof hux)) {
            hux0 = (hux)ibrl0;
            int v2 = hux0.e;
            if((v2 & 0x80000000) == 0) {
                hux0 = new hux(this, ibrl0);
            }
            else {
                hux0.e = v2 - 0x80000000;
            }
        }
        else {
            hux0 = new hux(this, ibrl0);
        }
        Object object0 = hux0.c;
        Object object1 = ibrx.a;
        switch(hux0.e) {
            case 0: {
                ibnx.b(object0);
                hur hur0 = this.a;
                hux0.a = v;
                hux0.b = v1;
                hux0.e = 1;
                object0 = hur0.c(v, v1, hux0);
                if(object0 == object1) {
                    return object1;
                }
                v3 = v1;
                goto label_27;
            }
            case 1: {
                long v4 = hux0.b;
                long v5 = hux0.a;
                ibnx.b(object0);
                v3 = v4;
                v = v5;
            label_27:
                long v6 = ((jls)object0).a;
                hur hur1 = this.B ? this.i() : this.c;
                if(hur1 != null) {
                    hux0.a = v6;
                    hux0.e = 2;
                    object0 = hur1.c(jls.d(v, v6), jls.c(v3, v6), hux0);
                    return object0 != object1 ? new jls(jls.d(v6, ((jls)object0).a)) : object1;
                }
                return new jls(jls.d(v6, 0L));
            }
            case 2: {
                long v7 = hux0.a;
                ibnx.b(object0);
                return new jls(jls.d(v7, ((jls)object0).a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // hur
    public final Object d(long v, ibrl ibrl0) {
        long v2;
        huy huy0;
        if((ibrl0 instanceof huy)) {
            huy0 = (huy)ibrl0;
            int v1 = huy0.d;
            if((v1 & 0x80000000) == 0) {
                huy0 = new huy(this, ibrl0);
            }
            else {
                huy0.d = v1 - 0x80000000;
            }
        }
        else {
            huy0 = new huy(this, ibrl0);
        }
        Object object0 = huy0.b;
        Object object1 = ibrx.a;
        switch(huy0.d) {
            case 0: {
                ibnx.b(object0);
                hur hur0 = this.i();
                if(hur0 == null) {
                    v2 = 0L;
                    goto label_26;
                }
                else {
                    huy0.a = v;
                    huy0.d = 1;
                    object0 = hur0.d(v, huy0);
                    if(object0 != object1) {
                        goto label_25;
                    }
                }
                return object1;
            }
            case 1: {
                v = huy0.a;
                ibnx.b(object0);
            label_25:
                v2 = ((jls)object0).a;
            label_26:
                hur hur1 = this.a;
                huy0.a = v2;
                huy0.d = 2;
                object0 = hur1.d(jls.c(v, v2), huy0);
                return object0 != object1 ? new jls(jls.d(v2, ((jls)object0).a)) : object1;
            }
            case 2: {
                long v3 = huy0.a;
                ibnx.b(object0);
                return new jls(jls.d(v3, ((jls)object0).a));
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }

    @Override  // ijm
    public final Object dK() {
        return this.d;
    }

    @Override  // hfb
    public final void dO() {
        this.h();
    }

    @Override  // hfb
    public final void dR() {
        ibvd ibvd0 = new ibvd();
        ijn.b(this, new hvb(ibvd0));
        hva hva0 = (hva)(((ijm)ibvd0.a));
        this.c = hva0;
        this.b.b = hva0;
        this.g();
    }

    public final hva e() {
        return this.B ? ((hva)ijn.a(this)) : null;
    }

    public final icck f() {
        hva hva0 = this.e();
        icck icck0 = hva0 == null ? null : hva0.f();
        if(icck0 != null && iccl.g(icck0)) {
            return icck0;
        }
        icck icck1 = this.b.d;
        if(icck1 != null) {
            return icck1;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final void g() {
        huv huv0 = this.b;
        if(huv0.a == this) {
            huv0.a = null;
        }
    }

    public final void h() {
        huv huv0 = this.b;
        huv0.a = this;
        huv0.b = null;
        this.c = null;
        huv0.c = new huz(this);
        huv0.d = this.J();
    }

    private final hur i() {
        return this.B ? this.e() : null;
    }
}

