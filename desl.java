final class desl extends ibsl implements ibtw {
    int a;
    final devp b;
    final fzp c;
    final String d;
    final ibth e;
    final String f;
    final String g;
    final ibth h;

    public desl(devp devp0, fzp fzp0, String s, ibth ibth0, String s1, String s2, ibth ibth1, ibrl ibrl0) {
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
        return ((desl)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new desl(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        desl desl0;
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
                    desl0 = this;
                    desl0.e.a();
                    desl0.a = 2;
                    object0 = desl0.c.c(desl0.f, desl0.g, true, 3, desl0);
                    if(object0 == object1) {
                        return object1;
                    }
                label_17:
                    if(((gai)object0) == gai.b) {
                        desl0.h.a();
                    }
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                desl0 = this;
                goto label_17;
            }
        }
        return ibom.a;
    }
}

