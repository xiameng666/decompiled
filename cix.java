final class cix extends ibsl implements ibtw {
    Object a;
    int b;
    final gra c;
    final ciy d;
    private Object e;

    public cix(gra gra0, ciy ciy0, ibrl ibrl0) {
        this.c = gra0;
        this.d = ciy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cix)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new cix(this.c, this.d, ibrl0);
        ibrl1.e = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        Object object2;
        Object object1 = ibrx.a;
        switch(this.b) {
            case 0: {
                ibnx.b(object0);
                icck0 = (icck)this.e;
                object2 = new ibva();
                object2.a = 1.0f;
                goto label_21;
            }
            case 1: {
                object2 = this.a;
                icck0 = (icck)this.e;
                ibnx.b(object0);
                break;
            }
            default: {
                object2 = this.a;
                icck0 = (icck)this.e;
                ibnx.b(object0);
                goto label_21;
            }
        }
        do {
            if(((ibva)object2).a == 0.0f) {
                icig icig0 = gud.a(new civ(icck0));
                ciw ciw0 = new ciw(null);
                this.e = icck0;
                this.a = object2;
                this.b = 2;
                if(icll.b(icig0, ciw0, this) != object1) {
                    goto label_21;
                }
                break;
            }
        label_21:
            ciu ciu0 = new ciu(this.c, this.d, ((ibva)object2), icck0);
            this.e = icck0;
            this.a = object2;
            this.b = 1;
        }
        while(ciq.a(ciu0, this) != object1);
        return object1;
    }
}

