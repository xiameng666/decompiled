final class qns extends ibsl implements ibts {
    int a;
    final qnu b;
    final int c;
    final int d;
    final boolean e;
    final float f;
    final qoj g;
    final qkb h;
    final float i;
    final qoe j;

    public qns(qnu qnu0, int v, int v1, boolean z, float f, qoj qoj0, qkb qkb0, float f1, qoe qoe0, ibrl ibrl0) {
        this.b = qnu0;
        this.c = v;
        this.d = v1;
        this.e = z;
        this.f = f;
        this.g = qoj0;
        this.h = qkb0;
        this.i = f1;
        this.j = qoe0;
        super(1, ibrl0);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        return new qns(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ((ibrl)object0)).jI(ibom.a);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibru ibru0;
        Object object1 = ibrx.a;
        if(this.a == 0) {
            ibnx.b(object0);
            qnu qnu0 = this.b;
            int v = this.c;
            qnu0.k(v);
            int v1 = this.d;
            qnu0.a.b(Integer.valueOf(v1));
            qnu0.b.b(Boolean.valueOf(this.e));
            float f = this.f;
            qnu0.d.b(Float.valueOf(f));
            qnu0.c.b(this.g);
            qnu0.j(this.h);
            qnu0.m(this.i);
            qnu0.e.b(Boolean.valueOf(false));
            qnu.p(qnu0);
            if(this.h == null) {
                qnu0.l(false);
                return ibom.a;
            }
            if(Float.isInfinite(f)) {
                qnu0.m(qnu0.b());
                qnu0.l(false);
                qnu0.k(v1);
                return ibom.a;
            }
            qnu0.l(true);
            try {
                qoe qoe0 = this.j;
                switch(qoe0.ordinal()) {
                    case 0: {
                        ibru0 = ibru.a;
                        break;
                    }
                    case 1: {
                        ibru0 = icey.a;
                        break;
                    }
                    default: {
                        throw new ibnq();
                    }
                }
                qnr qnr0 = new qnr(qoe0, icei.c(this.u()), v1, v, qnu0, null);
                this.a = 1;
                if(icbd.a(ibru0, qnr0, this) == object1) {
                    return object1;
                }
            label_37:
                icei.f(this.u());
                goto label_42;
            }
            catch(Throwable throwable0) {
            }
            this.b.l(false);
            throw throwable0;
        }
        else {
            try {
                ibnx.b(object0);
            }
            catch(Throwable throwable0) {
                this.b.l(false);
                throw throwable0;
            }
        }
        goto label_37;
    label_42:
        this.b.l(false);
        return ibom.a;
    }
}

