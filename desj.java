final class desj extends ibsl implements ibtw {
    int a;
    final devp b;
    final fzp c;
    final String d;
    final ibth e;
    final String f;
    final String g;
    final ibth h;

    public desj(devp devp0, fzp fzp0, String s, ibth ibth0, String s1, String s2, ibth ibth1, ibrl ibrl0) {
        this.b = devp0;
        this.c = fzp0;
        this.d = s;
        this.e = ibth0;
        this.f = s1;
        this.g = s2;
        this.h = ibth1;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((desj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new desj(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        desj desj0;
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                Boolean boolean0 = (Boolean)devq.a(this.b.a.f);
                if(boolean0 != null && boolean0.booleanValue()) {
                    this.a = 1;
                    if(fzp.d(this.c, this.d, null, 2, this, 6) == object1) {
                        return object1;
                    }
                }
                else {
                    desj0 = this;
                    desj0.e.a();
                    desj0.a = 2;
                    object0 = desj0.c.c(desj0.f, desj0.g, true, 3, desj0);
                    if(object0 == object1) {
                        return object1;
                    }
                label_17:
                    if(((gai)object0) == gai.b) {
                        desj0.h.a();
                    }
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                desj0 = this;
                goto label_17;
            }
        }
        return ibom.a;
    }
}

