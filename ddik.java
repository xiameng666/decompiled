final class ddik extends ibsl implements ibtw {
    int a;
    final gra b;
    final chb c;
    final float d;

    public ddik(gra gra0, chb chb0, float f, ibrl ibrl0) {
        this.b = gra0;
        this.c = chb0;
        this.d = f;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ddik)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ddik(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ddik ddik0;
        Object object1 = ibrx.a;
        int v = this.a;
        if(v == 0) {
            ibnx.b(object0);
            if(((Boolean)this.b.a()).booleanValue()) {
                ckh ckh0 = chm.b(0.0f, 80000.0f, null, 5);
                this.a = 1;
                ddik0 = this;
                if(chb.k(this.c, new Float(this.d), ckh0, null, ddik0, 12) == object1) {
                    return object1;
                }
            label_16:
                ckh ckh1 = chm.b(0.0f, 80000.0f, null, 5);
                ddik0.a = 2;
                if(chb.k(ddik0.c, new Float(-ddik0.d), ckh1, null, ddik0, 12) == object1) {
                    return object1;
                }
            label_19:
                ckh ckh2 = chm.b(0.2f, 4000.0f, null, 4);
                ddik0.a = 3;
                if(chb.k(ddik0.c, new Float(0.0f), ckh2, null, ddik0, 12) == object1) {
                    return object1;
                }
            }
        }
        else {
            ibnx.b(object0);
            switch(v) {
                case 1: {
                    ddik0 = this;
                    goto label_16;
                }
                case 2: {
                    ddik0 = this;
                    goto label_19;
                }
                default: {
                    return ibom.a;
                }
            }
        }
        return ibom.a;
    }
}

