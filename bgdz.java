final class bgdz extends ibsl implements ibtw {
    Object a;
    int b;
    final bgeu c;

    public bgdz(bgeu bgeu0, ibrl ibrl0) {
        this.c = bgeu0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((bgdz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new bgdz(this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1;
        try {
            object1 = ibrx.a;
            switch(this.b) {
                case 0: {
                    goto label_4;
                }
                case 1: {
                    goto label_8;
                }
                case 2: {
                    goto label_17;
                }
                case 3: {
                    goto label_23;
                }
            }
        }
        catch(aztb aztb0) {
            goto label_26;
        }
        ibnx.b(object0);
        return ibom.a;
    label_4:
        ibnx.b(object0);
        this.b = 1;
        if(this.c.k.a(Boolean.valueOf(true), this) != object1) {
            goto label_9;
        label_8:
            ibnx.b(object0);
        label_9:
            evql evql0 = this.c.c.b.d();
            evql evql1 = this.c.c.e(evql0);
            evql evql2 = this.c.d.d();
            try {
                this.a = evql2;
                this.b = 2;
                if(ictn.b(evql1, this) != object1) {
                    Object object2 = evql2;
                    goto label_19;
                label_17:
                    object2 = this.a;
                    ibnx.b(object0);
                label_19:
                    this.a = null;
                    this.b = 3;
                    if(ictn.b(((evql)object2), this) == object1) {
                        return object1;
                    label_23:
                        ibnx.b(object0);
                    }
                    goto label_28;
                }
                return object1;
            }
            catch(aztb aztb0) {
            label_26:
                a.ae(bgeu.a.j(), "Couldn\'t refresh passwords or passkeys", aztb0);
                this.c.g.l(ibom.a);
            }
        label_28:
            this.a = null;
            this.b = 4;
            if(this.c.k.a(Boolean.valueOf(false), this) != object1) {
                return ibom.a;
            }
        }
        return object1;
    }
}

