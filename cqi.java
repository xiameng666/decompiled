final class cqi extends ibsl implements ibtw {
    int a;
    final dgg b;
    final dgj c;
    final boolean d;
    final cqq e;

    public cqi(dgg dgg0, dgj dgj0, boolean z, cqq cqq0, ibrl ibrl0) {
        this.b = dgg0;
        this.c = dgj0;
        this.d = z;
        this.e = cqq0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((cqi)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new cqi(this.b, this.c, this.d, this.e, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(iccv.c(crw.a, this) != object1) {
                    goto label_7;
                }
                break;
            }
            case 1: {
            label_7:
                this.a = 2;
                if(this.b.b(this.c, this) != object1) {
                label_9:
                    if(this.d) {
                        this.e.h = this.c;
                        return ibom.a;
                    }
                    this.e.f = this.c;
                    return ibom.a;
                }
                break;
            }
            default: {
                goto label_9;
            }
        }
        return object1;
    }
}

