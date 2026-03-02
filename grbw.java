final class grbw extends ibsl implements ibtw {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final grbx f;
    final gfvb g;
    final grcl h;
    final ibtw i;
    private Object j;

    public grbw(grbx grbx0, gfvb gfvb0, grcl grcl0, ibtw ibtw0, ibrl ibrl0) {
        this.f = grbx0;
        this.g = gfvb0;
        this.h = grcl0;
        this.i = ibtw0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((grbw)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new grbw(this.f, this.g, this.h, this.i, ibrl0);
        ibrl1.j = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        iccs iccs0;
        Exception exception0;
        icta icta0;
        gfvb gfvb0;
        grcl grcl0;
        iccs iccs1;
        icta icta2;
        ibtw ibtw1;
        grcl grcl2;
        gfvb gfvb1;
        icck icck0;
        Object object1 = ibrx.a;
        switch(this.e) {
            case 0: {
                ibnx.b(object0);
                icck0 = (icck)this.j;
                gfvb1 = this.g;
                grcl grcl1 = this.h;
                ibtw ibtw0 = this.i;
                this.j = icck0;
                icta icta1 = this.f.b;
                this.a = icta1;
                this.b = gfvb1;
                this.c = grcl1;
                this.d = ibtw0;
                this.e = 1;
                if(icta1.b(this) != object1) {
                    grcl2 = grcl1;
                    ibtw1 = ibtw0;
                    icta2 = icta1;
                    goto label_32;
                }
                break;
            }
            case 1: {
                ibtw1 = (ibtw)this.d;
                grcl2 = (grcl)this.c;
                gfvb1 = (gfvb)this.b;
                icta2 = (icta)this.a;
                icck0 = (icck)this.j;
                ibnx.b(object0);
            label_32:
                try {
                    iccs1 = (iccs)gfvb1.c(grcl2, new grbu(icck0, ibtw1, grcl2));
                }
                finally {
                    icta2.d();
                }
                try {
                    this.j = iccs1;
                    this.a = null;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    this.e = 2;
                    object0 = iccs1.n(this);
                    if(object0 != object1) {
                        return (grcm)object0;
                    }
                    break;
                }
                catch(Exception exception1) {
                    goto label_50;
                }
                return (grcm)object0;
            }
            case 2: {
                iccs1 = (iccs)this.j;
                try {
                    ibnx.b(object0);
                    return (grcm)object0;
                }
                catch(Exception exception1) {
                label_50:
                    exception0 = exception1;
                    gfvb gfvb2 = this.g;
                    grcl grcl3 = this.h;
                    this.j = iccs1;
                    this.a = exception0;
                    icta icta3 = this.f.b;
                    this.b = icta3;
                    this.c = gfvb2;
                    this.d = grcl3;
                    this.e = 3;
                    if(icta3.b(this) != object1) {
                        iccs0 = iccs1;
                        gfvb0 = gfvb2;
                        grcl0 = grcl3;
                        icta0 = icta3;
                        goto label_65;
                    }
                    break;
                }
            label_65:
                try {
                    if(ibuq.m(gfvb0.d(grcl0), iccs0)) {
                        gfvb0.f(grcl0);
                    }
                }
                finally {
                    icta0.d();
                }
                throw exception0;
            }
            default: {
                grcl0 = (grcl)this.d;
                gfvb0 = (gfvb)this.c;
                icta0 = (icta)this.b;
                exception0 = (Exception)this.a;
                iccs0 = (iccs)this.j;
                ibnx.b(object0);
                goto label_65;
            }
        }
        return object1;
    }
}

