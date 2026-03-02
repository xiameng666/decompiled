final class ddyv extends ibsl implements ibtw {
    int a;
    final gra b;
    final chb c;
    final float d;

    public ddyv(gra gra0, chb chb0, float f, ibrl ibrl0) {
        this.b = gra0;
        this.c = chb0;
        this.d = f;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ddyv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ddyv(this.b, this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ddyv ddyv0;
        Object object1 = ibrx.a;
        int v = this.a;
        if(v == 0) {
            ibnx.b(object0);
            if(((Boolean)this.b.a()).booleanValue()) {
                ckh ckh0 = chm.b(0.0f, 80000.0f, null, 5);
                this.a = 1;
                ddyv0 = this;
                if(chb.k(this.c, new Float(this.d), ckh0, null, ddyv0, 12) == object1) {
                    return object1;
                }
            label_16:
                ckh ckh1 = chm.b(0.0f, 80000.0f, null, 5);
                ddyv0.a = 2;
                if(chb.k(ddyv0.c, new Float(-ddyv0.d), ckh1, null, ddyv0, 12) == object1) {
                    return object1;
                }
            label_19:
                ckh ckh2 = chm.b(0.2f, 4000.0f, null, 4);
                ddyv0.a = 3;
                if(chb.k(ddyv0.c, new Float(0.0f), ckh2, null, ddyv0, 12) == object1) {
                    return object1;
                }
            }
        }
        else {
            ibnx.b(object0);
            switch(v) {
                case 1: {
                    ddyv0 = this;
                    goto label_16;
                }
                case 2: {
                    ddyv0 = this;
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

